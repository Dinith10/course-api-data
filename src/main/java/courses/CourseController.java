package courses;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {




    @Autowired
    private CourseService courseService;



    @RequestMapping(value = "/courses")
    public List<Course> getAllCourses(){



        return courseService.getAllCourses();



    }



    @RequestMapping( value = "/courses/{ides}" )
    public Optional<Course> getCourse(@PathVariable(value = "ides") String id ){


        return courseService.getCourse(id);

    }

    @RequestMapping(method = RequestMethod.POST, value = "/courses")
    public void addCourse( @RequestBody Course course){

        courseService.addCourse(course);




    }

    @RequestMapping( method = RequestMethod.PUT, value = "/courses/{id}" )
    public void updateCourse( @RequestBody Course course, @PathVariable ("id") String id ){

        courseService.updateCourse( course, id );

    }




    @RequestMapping( method = RequestMethod.DELETE, value = "/topics/{id}" )
    public void DeleteCourse( @PathVariable( value = "id" ) String id ){

        courseService.DeleteCourse( id );


    }


}
