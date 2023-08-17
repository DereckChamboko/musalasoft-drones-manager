# Musalasoft Drone manager


[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

Drone manager is a rest service  that manages medicine delivery drones,
Springboot-powered.

## Postman Collection
https://api.postman.com/collections/11357889-5fab7442-d572-43be-9c04-cbc8f532aa94?access_key=PMAT-01H4EQH8Q9VD10Y4XA0B1W6BTR
<br/><br/></i>📝To import the collection, open postman and from the top menu select File-> Import and then paste the above link</i>

## EndPoints

Medication 🏥
- Add medication
  `POST: localhost:8080/medication/addnew`
  body

```
{
    "name":"panado!",
    "weight":2000,
    "code":"!code_01",
    "image":"https://pichere.com"
}

```

- Get medication by ID
  `GET: localhost:8080/medication/id/{id}`
- GET all medications
  `GET: localhost:8080/drone/addnew`

Drone 🛸
- Get Find all available drones
   `GET: localhost:8080/drone/available`
- Get Check drone loaded items by drone ID
   `GET: localhost:8080/drone/checkLoaded/id/11`
- Get Check drone loaded items by drone Serial number
   `GET: localhost:8080/drone/checkLoaded/serialNumber/msd_001`
- Post Load drone
  `POST: localhost:8080/drone/load`
  ```
  {
    "medicationId":6,
    "quantity":1,
    "drone":3

  }
    ```
- Post Add new drone
  `POST: localhost:8080/drone/addNew`
  ```
  {

    "serialNumber":"dronesn0031234567890dronesn0031234567890dronesn0031234567890dronesn0031234567890dronesn0031234567890",
    "droneModelId":4,
    "batteryCapacity":10,
    "droneStateId":1,
    "active":true
  }
  ```
- Get check drone battery percentage by drone ID
   `GET: localhost:8080/drone/checkBattery/id/1`
- Get check drone battery percentage by drone serial number
 `GET: localhost:8080/drone/checkBattery/serialNumber/msd_001`


