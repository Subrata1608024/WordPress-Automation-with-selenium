Create an Automation test suite (Based on below mentioned scenarios) and share the GitHub public repo link (Including README.md that describes everything on how to run the test suite & requirements) – You can use your preferred programming language.

Scenarios:

1. Log in to your WordPress site.

2. Check whether the “WP Dark Mode” Plugin is Active or not.

3. If Active, navigate to the WP Dark Mode & continue. Otherwise, Install the Plugin and Activate it.

4. Enable Admin Dashboard Dark Mode from Controls -> Admin Panel Dark Mode

5. Validate whether the Darkmode is working or not on the Admin Dashboard.

6. Navigate to the WP Dark Mode.

7. From Customization-> Switch Settings - Change the “Floating Switch Style” from the default selections (Select any one from the available options, except the default selected one).

8. From Customization-> Switch Settings -> Switch Customization - Select Custom Switch size & Scale it to 220.

9. From Customization-> Switch Settings - Change the Floating Switch Position (Left Bottom).



Project description: The frameworks that are used to execute this test scenario are given below.
Here in this project, the architecture that I have used is POM (Page Object Model) framework. In this project, I have made four packages (pages, testcases, util).

Page package: In page package, six java classes are made. Abstract methods are made in page class and then the abstract methods are implemented in BasePage class. Afterwards operation of web element (locator & selector) is executed in other 4 pages.

Testcases package: In this package, two java class are made to execute test cases where in BaseTest class multiple browser operation are executed. In scenarioTest class, all test scenarios are tested.

Util package: In this packages, final variable values are set.

Resources: It covers all login information (Website URL, Username, Password) and TestNG xml file to execute all test cases.


Pages:

Technology/Tools/Frameworks
1. Java
2. POM
3. TestNG
4. Gradle
5. IntelliJ IDEA
9. Selenium Webdriver
10. Web driver manager


10. Disable Keyboard Shortcut from the Accessibility Settings.


* Save the settings every time after changing it.
