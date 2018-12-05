# SP Automation Challenge from 12/04

The pupose of this project is to create a quick automation challenge for a few specific given scenarios

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 

### Prerequisites

Clone repository to your local folder
```
https://github.com/jlomeli/automation_challenge.git
```
Download selenium driver for Chrome browser and make a note of the path, you'll need to update the location of the chormedriver specific to your local environment
```
http://chromedriver.chromium.org/downloads
```

## Running the tests

In order to run the test cases on this challenge follow these steps
* Open up the project
* Right-click on the the test file
* Select Run As -> TestNG Test

There are 2 test clases on the project under /src/test/java/com/selenium/tests folder:
```
AddToCartTest.java
AddToCartSimplified.java
```
The first one, AddTOCartTest, is the class created during the innterview. This test had some issues finding and interacting with the WebElements but those have been fixed. In addition, this Test class uses a POM framework which was NOT asked to do during the interview causing a bit of delay on completing the requested challenge.

The second test class is a more simplified and streamlined test class that wouldn't have required that much time to complete but would have provided the same result. This probably was the better approach to take during the interview to demo the requested challenge. having said that, the approach used during the interview is a much more refined, manageable, maintenable and easy to read and use than this second test class added to the project.

Currenntly both Test classes fullfil the goal of the challenge.

### Scenarios covered by this project

The followingare the scenarios developed for this challenge

* Navigate to https://teechips.com
* Search for ‘cats’
* Select the first result from the query
* Select the Hoddie Sweatshirt item
* Select the Pink Color
* Select the Large size
* Select 2 as quantity
* Add to Cart

## Built With

* [Java](https://www.java.com/en/download/) - Programming language
* [Selenium](https://www.seleniumhq.org/) - Automation framework
* [TestNG](https://testng.org/doc/index.html) - Testing validation framework

## Authors

* **Jesus Lomeli** 
on_challenge
