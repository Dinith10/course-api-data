package courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

//   List<Topic> topics = new ArrayList<>( Arrays.asList(
//
//               new Topic("spring2", "Spring Framework", "Spring Framework Description"),
//               new Topic("java", "Core Java", "Core Java Description"),
//               new Topic("javascript", "JavaScript", "JavaScript Description")
//
//        ));



   public List<Course> getAllCourses(){

    List topics = new ArrayList();
         courseRepository.findAll().forEach(topics::add);

         return topics;

   }

   public Optional<Course> getCourse(String id ) {

//
//      return   topics.stream().filter( t -> t.getId().equals(id)).findFirst().get();


       return courseRepository.findById(id);

   }



    public void addCourse(Course Course) {


    courseRepository.save(Course);








    }

    public void updateCourse(Course course, String id) {

//        for( int i = 0; i < topics.size(); i++ ){
//
//
//            Topic t = topics.get(i);
//            if( t.getId().equals(id)){
//
//            topics.set( i, topic );
//
//            }
//        }

        courseRepository.save(course);

    }

    public void DeleteCourse(String id) {

//        for( int i = 0; i < topics.size(); i++ ){
//
//
//            Topic t = topics.get(i);
//            if( t.getId().equals(id)){
//
//                topics.remove(i);
//
//            }


        courseRepository.deleteById(id);


        }



    }

