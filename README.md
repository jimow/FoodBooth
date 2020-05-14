# Wildlife-Tracker

## Description
This is an application to track wildlife in the forest for a case study on whether the forest authority should allow deforestation or not. This application allows rangers to track wildlife sightings in the area.

## Author
 *Billy Ayiera*
 
## Functionality

 | Input | Description| Output |
 |:---    | ---: | ---: |
 | Add animal | click on the add animal button | animal added to list. |   
 | Add sighting | click on add sighting button  | new sighting is added  |
 | View animals/ sightings | click on link on the navigation bar | all recorded animals and sightings are seen |
 


## Pre-requisites
1.You need to have java installed. You can use [sdkman](https://sdkman.io/).
Follow the instructions on the _sdkman_ installation process. Then install java:
 ```bash
sdk install java
 ```

2.Gradle
This is a build tool for the java app, you can install it through sdkman:
```bash
sdk install gradle
```
## Setup
1. You will need Internet connection.

2. Get to this Wildlife-Tracker repo on github.

3. From there you can access the Wildlife-Tracker.

4. **Clone** the project.

5. Get into **project folder** (cd into project).

6. If you have all the **Pre-requisites** you can run the application.
 ``` bash
gradle run
 ```

### Database;
1. Install postgres. Once ready, type *psql* on the terminal. Create User with password, Make sure to edit the DB.java file with the credentials created in order to connect to your database.
2. Create tables to store animals and sightings details: user# CREATE DATABASE wildlife_tracker;
3. Navigate to wildlife_tracker database, then wildlife_tracker# CREATE TABLE animals ( animal_id int, animal_name string);
4. Create  sightings table: wildlife_tracker# CREATE TABLE sightings ( animal string, location string, ranger_name string );
5. Connect to database: \c wildlife_tracker

## Technologies used
- Java 
- Intellij IDEA
- Maven
- Heroku CLI
- Bootstrap.
- Cascading Style Sheets.
- Handlebars.

## Contributions and support.
In case of any issues, bugs, or you would like to contribute or support, contact me via: 
- Email **ayierabilly1@gmail.com**
