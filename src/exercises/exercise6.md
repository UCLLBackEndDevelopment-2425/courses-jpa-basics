# Exercise 6

Make sure that the GET endpoint http://localhost:8080/course/search?betweensemester={semester1}&semester={semester2} returns courses with title containing the string in the path variable (case insensitive) and ordered by semester stored in your H2 DB using a JPA repository.

For example http://localhost:8080/course/search?betweensemester=1&semester=2 should return:
- 200 OK
- The following JSON in the body of the response:
```javascript
[
    {
        "title": "Back-End Development",
        "credits": 6,
        "semester": 2
    },
    {
        "title": "Front-End Development",
        "credits": 6,
        "semester": 1
    }
];
```

And for example http://localhost:8080/course/search?betweensemester=4&semester=6 should return:
- 200 OK
- The following JSON in the body of the response:
```javascript
[
    {
        "title": "Workplace Project Senior",
        "credits": 6,
        "semester": 5
    }];
```
