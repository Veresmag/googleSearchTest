<ol>
<li>The project for checking the first two search pages in Google. On the search should produce ten requests on each page.
<li>The project contains the Pages folder and the Tests folder, and the xml file for testing in two browsers.
<li>In the page folder there is a basic Page from which the others will be inherited. They describe the elements and actions on the page.
<li>In the Test folder is the base page for the legacy. And also the page with the main test. With which commands all actions are started.
<li>To run the tests, add the following to pom.xml:
<ul> For the work of Seleniuma
<Dependency>
<Group_idigroup> org.seleniumhq.selenium </ group_idigroup>
<Artefact> selenium Java </ artifact>
<Version> 3.11.0 </ version>
</ Dependency>
<ul> To run tests
<Dependency>
<Group_idigroup> org.testng </ group_id>
<Artifact> TestNG </ artifact>
<Version> 6.14.3 </ version>
<Sphere> Test </ Sphere>
</ Dependency>
<ul> For the browser manager
<Dependency>
<GroupID> io.github.bonigarcia </ group_id>
<Artifact> webdrivermanager </ artifact>
<Version> 2.2.1 </ version>
</ Dependency>
</ol>