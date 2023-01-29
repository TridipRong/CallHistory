# CallHistoryAnalyticsApplication

In this application, we can add call data .
- Hour of the day when the call volume is highest.
- Hour of the day when the calls are longest.
- Day of the week when the call volume is highest.
-Day of the week when the calls are longest. 

# ER Diagram
[![ERDiagram](https://github.com/TridipRong/CallHistory/blob/main/CallrData/er.png?raw=true)](https://github.com/TridipRong/CallHistory/blob/main/CallrData/er.png?raw=true)

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


# Backend

## AllController

#### POST : /addcall
```
{
    "duration": 142,
    "end_time": "2023-01-12 04:20:06",
    "mobile_number": "9083394594",
    "start_time": "2023-01-12 04:01:05",
    "caller_id": ""
}
```


#### Get : /longestCallOfDay
```
Hour of the day when the calls are longest is  11 PM-1AM
```

#### Get : /highestCallVolumeOfDay
```
Hour of the day when the call volume is highest is  12 PM-1PM
```

#### Get : /highestCallVolumeOfWeek
```
Day of the week when the call volume is highest is Wednesday
```

#### Get : /longestcallOfWeek
```
Day of the week when the call volume is highest is Wednesday
```

