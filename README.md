Some basic thinks to know about how it works:

*Run UI test from tests\ApplyForUXDesignerRoleTest
*Configure locator and method if needed from POM(pages)
*Configure Url and browser in the configuration.properties file
*Before and after annotations and driver initializations for UI testing in the TestBase

*Run loading testing from load.xml file
*Configure number of concurrent users from Test\LoadTestFactory
*Before after annotations and driver initializations for load testing in the test\LoadTestScenario
*Configure Url and browser in the tests\LoadTestScenario class
-right click and click run

*To be able to see the simple HTML report;
-go to test-output\html\index.html 
-right click then go to open in 

NOTE THAT:
Because captcha not being able to automate 
submit button for UX Designer application form does not become active.
So, automation is workin till captcha button.