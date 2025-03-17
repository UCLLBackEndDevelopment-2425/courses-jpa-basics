# Exercise 2

Make sure that the GET endpoint http://localhost:8080/course returns all the courses stored in your H2 DB using a JPA repository.

The result should be:
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
        "title": "Workplace Project Junior",
        "credits": 6,
        "semester": 3
    },
    {
        "title": "Full-Stack Development",
        "credits": 6,
        "semester": 3
    },
    {
        "title": "Workplace Project Senior",
        "credits": 6,
        "semester": 5
    },
    {
        "title": "Front-End Development",
        "credits": 6,
        "semester": 1
    }
];
```
