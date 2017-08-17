# RESTService.Contacts
[![Build Status](https://travis-ci.org/VictorSamilenko/RESTService.Contacts.svg?branch=master)](https://travis-ci.org/VictorSamilenko/RESTService.Contacts)

#### Prerequisites
- Java 8
- Maven > 3.0

#### Test data
1. Execute `create_db.sql` for creating database structure
2. Execute `test_data.sql` for filling the table with test data

#### From terminal
Go on the project's root folder, then type:

    $ mvn spring-boot:run

#### From Intellij IDEA 

Import as *Existing Maven Project* and run it as *Spring Boot App*

### Usage

- Run the application and go on http://localhost:8080/contacts?nameFilter=[some-regular-expression]

...
