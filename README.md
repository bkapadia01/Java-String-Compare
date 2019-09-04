# Java-String-Compare

## Objective:
This is a Java application to check the Differences between two sentences. Ignoring any punctuations, Upper/Lower Cases, and any extra blank spaces.
The application requires the user to input to sentences. The two sentences will be compared and the difference in the **second sentence** will be returned.

#### Example:
Sentence 1: `Entry 1 : this is the first sentence."`

Sentence 2: `entry 2 - This is the second sentence!"`

Return: `2, second`
This is because - between the 2 sentences all the words are the same except for the words *2* and *sentence* 

## Instructions to run the app
Enviroment Requirements:

MacOS

Apache Maven 3.6.1 

Java version: 11.0.2

Homebrew 2.1.11


set Java path: `export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-11.0.2.jdk/Contents/Home`

Maven: `brew install maven`

Confirm packages are installed and your environment is setup:

Clone this repository.

cd to `my-app/`

run `mvn package`- *the app should build the application and run all the tests*

**To run the application:** `java -cp target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App` 

**To run test:** `mvn test`

## Running application without Maven
cd to root project folder `Kira_codetest/`

To build application `javac getDifferences.java`

To run application `java getDifferences `

