# CallHistoryAnalyticsApplication

In this application, we can add call data .
- Hour of the day when the call volume is highest.
- Hour of the day when the calls are longest.
- Day of the week when the call volume is highest.
-Day of the week when the calls are longest. 

# ER Diagram
[![ERDiagram](https://github.com/TridipRong/CallHistory/blob/main/CallrData/image/er.png?raw=true)](https://github.com/TridipRong/CallHistory/blob/main/CallrData/image/er.png?raw=true)

# Functionalities
-   Add call data
- Hour of the day when the call volume is highest.
- Hour of the day when the calls are longest.
- Day of the week when the call volume is highest.
-Day of the week when the calls are longest. 

## Backend Work
-  Proper Exception Handling, and Input Validation
-  Data Stored in the database(mySQL)

## Installation and Run
-   Before running the API server, we should update the database config inside the application.properties file.
-   Update the port number, username and password as per your local database config.
```
server.port=8181
spring.datasource.url=jdbc:mysql://localhost:3306/calldataDB
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=Tridip123@
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.mvc.pathmatch.matching-strategy = ANT_PATH_MATCHER
```

# Tech Stacks

-   Java Core
-   Spring Data JPA
-   Spring Boot
-   Hibernate
-   MySQL



## AllController

#### POST : /addcall
```
 {
        "Start_Time": "24-12-2021 06:00:01",
        "end_time": "24-12-2021 06:05:03",
        "id": "",
        "duration": "",
        "mobile": "7634238789"
    }
```
[![ERDiagram](https://github.com/TridipRong/CallHistory/blob/main/CallrData/image/Screenshot%20(365).png?raw=true)](https://github.com/TridipRong/CallHistory/blob/main/CallrData/image/er.png?raw=true)


#### Get : /longestCallOfDay
```
Hour of the day when the calls are longest is  11 PM-1AM
```
[![ERDiagram](https://github.com/TridipRong/CallHistory/blob/main/CallrData/image/Screenshot%20(362).png?raw=true)](https://github.com/TridipRong/CallHistory/blob/main/CallrData/image/Screenshot%20(362).png?raw=true)

#### Get : /highestCallVolumeOfDay
```
Hour of the day when the call volume is highest is  12 PM-1PM
```
[![ERDiagram](https://github.com/TridipRong/CallHistory/blob/main/CallrData/image/Screenshot%20(361).png?raw=true)](https://github.com/TridipRong/CallHistory/blob/main/CallrData/image/Screenshot%20(361).png?raw=true)


#### Get : /highestCallVolumeOfWeek
```
Day of the week when the call volume is highest is Wednesday
```
[![ERDiagram](https://github.com/TridipRong/CallHistory/blob/main/CallrData/image/Screenshot%20(363).png?raw=true)](https://github.com/TridipRong/CallHistory/blob/main/CallrData/image/Screenshot%20(363).png?raw=true)

#### Get : /longestcallOfWeek
```
Day of the week when the call volume is highest is Wednesday
```
[![ERDiagram](https://github.com/TridipRong/CallHistory/blob/main/CallrData/image/Screenshot%20(364).png?raw=true)](https://github.com/TridipRong/CallHistory/blob/main/CallrData/image/Screenshot%20(364).png?raw=true)

