## selenide-demo

This is a demo project which purpose is to demonstrate the usage of Selenide wrapper, Page Object pattern and usage of the Faker library which generates random test data. Demo website: quandoo.de.

## Tests

Project has a test class SignUpTest which contains the following tests:
* negative test checking that sign up is not performed if the Terms and Conditions checkbox is not ticked.

Project has a test class LoginTest which contains the following tests:
* positive test checking successful login functionality

Project has a test class RestaurantEnquiryTest which contains the following tests:
* negative test which ensures that there is no ability to send enquiry without ticking Terms checkbox.

Project has a test class End2EndTests which contains the following tests:
* positive test checking edited user's name in the existing reservation
## Prerequisites Software/Tools

1. Java Development Kit (Java 11)
2. Java Runtime Environment
3. Maven [ http://maven.apache.org/ ]
4. Git [ http://git-scm.com/downloads ]
5. JUnit Jupiter
6. Faker

## Installation and Test Run

Clone repository and perform the following command:

`mvn test`

## Contributors

Natalia Zhamsaranova zhamsaranova.nata@gmail.com