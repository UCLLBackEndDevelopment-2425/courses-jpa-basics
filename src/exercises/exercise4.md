# Exercise 4

Make sure that the GET endpoint http://localhost:8080/course/semester/{semester} returns courses in the asked semester stored in your H2 DB using a JPA repository.

For example http://localhost:8080/course/semester/3 should return:
- 200 OK
- The following JSON in the body of the response:
```javascript
[
    [
        {
            "title": "Workplace Project Junior",
            "credits": 6,
            "semester": 3
        },
        {
            "title": "Full-Stack Development",
            "credits": 6,
            "semester": 3
        }
    ]
];
```
