# Automation app project for the cinemark testing environment using Appium with Serenity-BDD, Cucumber y screenplay pattern

## How to use

This is a GitHub repository. You can download in .zip format or clone it using the command:
```
git clone https://github.com/cesaragudeloh/cinemark-app-automation.git
```

### Requirements
To execute this project, you'll need:

```
Java JDK 11 or later
Gradle versión 7.x or later
Appium versión 1.22 or later
A smartphone with Android (or an emulador)
```

### Execution instructions

Clone the github repository:
git clone https://github.com/cesaragudeloh/cinemark-web-automation.git

Configure your  serenity.properties. The properties must match with your device.
$(Repository.Name)/OnlineStore/serenity.properties

Connect your smartphone or start an emulate device. Then Start appium server.

Execute the runner file $(Repository.Name)/OnlineStore/**/runners/BuyTicketRunner.java, using the command: 
```
gradlew clean test aggregate (if you use a gradle wrapper installed on the project)      
```
**gradlew** This is the Gradle Wrapper, a script that comes with your Gradle project. It ensures that the correct Gradle version is used to build your project, even if you don't have Gradle installed locally.

**clean:** This is a Gradle task that cleans your project's build directory, removing any compiled classes, generated files, and previous build artifacts. This helps to ensure a fresh start for the next build.
test: This is another Gradle task that executes all the unit tests in your project. This helps to ensure the correctness of your code.

**aggregate:** This is likely referring to a task that aggregates test reports from different subprojects or modules in your project into a single, combined report. However, this is not a standard Gradle task, and it's possible that it's a custom task defined in your project's build script. 

When executing the tests, the tests execution report will remain in the following directory:

•	$(Repository.Name)/OnlineStore/target/site/serenity