/**
 * LOGBack: the reliable, fast and flexible logging library for Java.
 * 
 * Copyright (C) 1999-2006, QOS.ch
 * 
 * This library is free software, you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation.
 */
package ch.qos.logback.core.rolling;

import ch.qos.logback.core.rolling.helper.Compress;
import ch.qos.logback.core.rolling.helper.FileNamePattern;
import ch.qos.logback.core.spi.ContextAwareBase;



/**
 * Implements methods common to most, it not all, rolling
 * policies. Currently such methods are limited to a compression mode
 * getter/setter.
 *
 * @author Ceki G&uuml;lc&uuml;
 */
public abstract class RollingPolicyBase extends ContextAwareBase implements RollingPolicy {
  protected int compressionMode = Compress.NONE;
  protected FileNamePattern fileNamePattern;
  protected String fileNamePatternStr;
  /*
   * It would have been nice to merge 'activeFileName' into filename of
   * FileAppender. Unfortunately, a child component must be self contained
   * as it is started before its parent.
   */
  protected String activeFileName = null;

  private boolean started;
  
  /**
   * Given the FileNamePattern string, this method determines the compression
   * mode depending on last letters of the fileNamePatternStr. Patterns
   * ending with .gz imply GZIP compression, endings with '.zip' imply
   * ZIP compression. Otherwise and by default, there is no compression.
   *
   */
  protected void determineCompressionMode() {
     if (fileNamePatternStr.endsWith(".gz")) {
      addInfo("Will use gz compression");
      compressionMode = Compress.GZ;
    } else if (fileNamePatternStr.endsWith(".zip")) {
      addInfo("Will use zip compression");
      compressionMode = Compress.ZIP;
    } else {
      addInfo("No compression will be used");
      compressionMode = Compress.NONE;
    }
  }

  public void setFileNamePattern(String fnp) {
    fileNamePatternStr = fnp;
  }

  public String getFileNamePattern() {
    return fileNamePatternStr;
  }

  /**
   * ActiveFileName can be left unset, i.e. as null.
   * @see #getActiveFileName
   */
  public void setActiveFileName(String afn) {
    activeFileName = afn;
  }

  
  public boolean isStarted() {
    return started;
  }

  public void start() {
    started = true;
  }
  
  public void stop() {
    started = false;
  }

  public String getActiveFileName() {
    return activeFileName;
  }
  
}
