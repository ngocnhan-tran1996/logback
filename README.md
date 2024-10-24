
# About logback

Thank you for your interest in logback, the reliable, generic, fast
and flexible logging library for Java.

The Logback documentation can be found on the [project
web-site](https://logback.qos.ch/documentation.html) as well as under
the docs/ folder of the logback distribution.

## On the 1.5.x series

The 1.5.x series is a direct descendant of and a drop-in replacement
for the 1.4.x series. It differs from the 1.4.x series by the
relocation of the logback-access module which was moved to its [own
separate github repository](https://github.com/qos-ch/logback-access).

Here is a summary of 1.5.x dependencies:

|Logback version   |github branch   |SLF4J version  | JDK at runtime | JDK during build | Enterprise Edition (optional)|
|:---------------:|:--------:|:---------:|:-------:|:--------:|------------------------------|
| 1.5.x            | master         | 2.0.x         | 11             | 21            | Jakarta EE (jakarta.* namespace)|



## INACTIVE - 1.3.x supports Java EE, while version 1.4.x supports Jakarta EE.
The two versions are feature identical. However, They are no longer actively maintained.

Both 1.3.x and 1.4.x series require SLF4J 2.0.x or later.

The 1.3.x series requires Java 8 at runtime. If you wish to build
logback from source, you will need Java 9. 

The 1.4.x series requires Java 11 at build time and at runtime.

# Building logback

Version 1.5.x requires Java 21 to compile and build.

More details on building logback is documented at:

  https://logback.qos.ch/setup.html#ide

# In case of problems

In case of problems please do not hesitate to post an e-mail message
on the logback-user@qos.ch mailing list. You may also post message on the 
[github discussions](https://github.com/qos-ch/logback/discussions) forum. 
However, please do not directly e-mail logback developers. 
The answer to your question might be useful to other users. Moreover, 
there are many knowledgeable users on the logback-user mailing lists 
who can quickly answer your questions.

# Urgent issues

For urgent issues do not hesitate to [champion a
release](https://github.com/sponsors/qos-ch/sponsorships?tier_id=77436).
In principle, most championed issues are solved within 3 business days
followed up by a release.

# Pull requests

If you are interested in improving logback, that is great! The logback 
community looks forward to your contribution. Please follow this process:

1. Fork qos-ch/logback. Ideally, create a new branch from your fork for
   your contribution to make it easier to merge your changes back.

2. Make the effort to explain the aim of your proposed change.

3. Make your changes on the branch you hopefully created in Step 2. Be
   sure that your code passes existing unit tests.

4. Please add unit tests for your work if appropriate. It usually is.

5. Push your changes to your fork/branch in GitHub. Don't push it to
   your master! If you do it will make it harder to submit new changes
   later.

6. Submit a pull request to logback from your commit page on GitHub.

7. Do not forget to explain your proposed changes.

<!--
# Continuous integration build status

| Branch | Last results |
| ------ | -------------|
| master | ![CI master](https://github.com/qos-ch/logback/actions/workflows/main.yml/badge.svg) |
-->


