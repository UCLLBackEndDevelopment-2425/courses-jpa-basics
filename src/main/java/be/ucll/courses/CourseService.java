package be.ucll.courses;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    private CourseRepository repository;

    public CourseService(CourseRepository repository) {
        this.repository=repository;
    }

    public List<Course> getAll() {
        return repository.getAll();
    }

}
