package be.ucll.courses;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    private CourseService service;

    public CourseController(CourseService service){
        this.service=service;
    }

    @GetMapping
    public List<Course> getAll() {
        return service.getAll();
    }

}
