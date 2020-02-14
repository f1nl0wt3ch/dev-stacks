# Dev Stacks Learning Platform

## Content
- Demostration Full Stack Web using Spring Boot and React

## Started date
- 14.02.2020

## Release
- 23.02.2020

## Configuration
- **mkdir devstacks && cd devstacks** create a folder with given name "devstacks" and then navigate it
- **mkdir client && cd ./client && npx react-create-app** create client app using React
- **spring shell** open spring shell
- **init --list** list all dependencies and documentation about spring shell
- **init --build=maven --packaging=war --java-version=1.8 --dependencies=web,data-jpa,data-rest,devtools,postgresql,security server.zip** initialize a spring project with dependencies
- **unzip server.zip** unzip package
- **cd server && mvn install** navigate to root folder of spring project and install dependencies. Or run **cd server && mvn dependency:resolve** if you just need install dependencies without doing anything
- **mvn eclipse:eclipse** if you could not import project to eclipse
- **mvn dependency:get -Dartifact=groupId:artifactId:version** download a single dependency

## Connect database via Heroku CLI
- **brew doctor && brew update && brew install libpq** install psql on Mac
- **brew link --force libpq** add symlink psql (and other libpq tools) into /usr/local/bin
- **heroku pg:psql postgresql-perpendicular-69500 --app app-name** connect to database

## Demo

## Author
- Dinh Duc Thinh
- Student at **Haaga Helia University**
- Software Engineer at **Capgemini Finland**

## Copyright
- © www.tikkidinh.com