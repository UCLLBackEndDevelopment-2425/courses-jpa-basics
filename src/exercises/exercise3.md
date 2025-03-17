# Exercise 3

Make sure that the GET endpoint http://localhost:8080/course/id/{id} returns all information of the course with id stored in your H2 DB using a JPA repository.

For example http://localhost:8080/course/id/2 should return:
- 200 OK
- The following JSON in the body of the response:
```javascript
[
    {
        "title": "Workplace Project Junior",
        "credits": 6,
        "semester": 3
    }
];
```

