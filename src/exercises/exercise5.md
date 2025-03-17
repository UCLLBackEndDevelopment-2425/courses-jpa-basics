# Exercise 5

Make sure that the GET endpoint http://localhost:8080/course/searchandorder/{titlecontaining} returns courses with title containing the string in the path variable (case insensitive) and ordered by semester stored in your H2 DB using a JPA repository.

For example http://localhost:8080/course/searchandorder/develop should return
- 200 OK
- The following JSON in the body of the response:
```javascript
[
    {
        "title": "Front-End Development",
        "credits": 6,
        "semester": 1
    },
    {
        "title": "Back-End Development",
        "credits": 6,
        "semester": 2
    },
    {
        "title": "Full-Stack Development",
        "credits": 6,
        "semester": 3
    }
];
```

And for example http://localhost:8080/course/searchandorder/-end should return
- 200 OK
- The following JSON in the body of the response:
```javascript
[
    {
        "title": "Front-End Development",
        "credits": 6,
        "semester": 1
    },
    {
        "title": "Back-End Development",
        "credits": 6,
        "semester": 2
    }
];
```
