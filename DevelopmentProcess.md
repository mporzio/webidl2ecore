# Project Owner : #
> Pierre-Alain BOURDIL

# Milestone : #
  * M1 : First WebIDL Grammar, Scoping and Validation  and Linking  and Value conversion (SVLVC) requirement defined, published
  * M2 : implementation for SVLVC for WebIDL core requirement
  * M3 : implementation for SVLVC for Java binding, Java mapping implemented (using ATL transfo  WebIDL 2 JAVA).
  * M4 : implementation for SVLVC for  ECMA binding, ECMA mapping implemented
  * M5 : Eclipse plugin packaged, Eclipse bundle packaged.
  * M6 : Standalone package

# Configuration Management : #
> Distributed configuration management system with Mercurial.


> One development branch and one maintenance branch. Before M2, there’s only one branch, the dev one. To ensure as much as stability as possible, the maintenance branch is only updated with critical bugs fixes. Temporary branches may be created for code review purpose. More branches may be created from M5 to handle different packaging solutions ( Eclipse plugin, Eclipse bundle, Standalone), only if really needed.


> Commit are under the responsibility of committers. Contributions are welcome and only need to be reviewed by a committer before integration in the targeted branches.


> In case of absolute necessity or unanticipated case, project leader may create other branches : as less as branches as possible to avoid configuration management overload.

# Release cycle : #
> Each time a new release is delivered, its sources codes became the maintenance branch. For each milestone there’s a release. For each major revision of the webidl specification, there will be an intermediate release.


> Bugs and feature requests are planned then delivered within an intermediate or milestone release.


> Numbering : **webidl2ecore-subproduct-M.m.i(.status)** with

  * Subproduct : one of the bundle, plugin or standalone
  * M : number, major only changed if backward incompatibility or major architectural changes, starts at one
  * m  : number, milestone .
  * i    : number, intermediate release (new webidl version with no backward incompatibility, bug and feature request, …)
  * status : string : one of the following : alpha, beta, stable. If ommited, stable release

# Q&A : #
> Each patch is expected to be delivered along with its test case. Patchs are expected to be well documented, following the project documentation guidelines. Each patch is expected to be reviewed before integration within development branches.

# Testing, Tracability : #
> Each requirement of the webidl specification must be checked, using the language validator, to ensure specification conformance.

> Requirement are identified in the RequirementsWebIDL wiki page, with an integer that serves as unique key. Every time a requirement is referenced, it is preceded by a requirement reference, of the form **REQ\_TYPE\_ID**, with :

  * TYPE is one of the following:
    * CORE
    * JAVABINDING
    * ECMABINDING
  * ID is the identifier that precedes the requirement in the RequirementsWebIdl wiki page

> Each implemented requirement must be tested using the test project. Testing Xtext is JUnit like, hence for each requirement there MUST exists a test case that covers this requirement.


# Become a committer : #
> Pick a not started defect or enhancement, clone the project, talk with other project members about how you plan to fix it, fix it, and submit your patch for reviewing ( see the Doc page about howto ask for code review), this make you a contributor. If this patch is significant, or if you’ve done multiple patch, project owner will give you committer right.