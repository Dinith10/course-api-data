package mainPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    TopicRepository topicRepository;

//   List<Topic> topics = new ArrayList<>( Arrays.asList(
//
//               new Topic("spring2", "Spring Framework", "Spring Framework Description"),
//               new Topic("java", "Core Java", "Core Java Description"),
//               new Topic("javascript", "JavaScript", "JavaScript Description")
//
//        ));



   public List<Topic> getAllTopics(){

    List topics = new ArrayList();
         topicRepository.findAll().forEach(topics::add);

         return topics;

   }

   public Optional<Topic> getTopic(String id ) {

//
//      return   topics.stream().filter( t -> t.getId().equals(id)).findFirst().get();


       return topicRepository.findById(id);

   }



    public void addTopic(Topic topic) {


    topicRepository.save(topic);








    }

    public void updateTopic(Topic topic, String id) {

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

        topicRepository.save(topic);

    }

    public void DeleteTopic(String id) {

//        for( int i = 0; i < topics.size(); i++ ){
//
//
//            Topic t = topics.get(i);
//            if( t.getId().equals(id)){
//
//                topics.remove(i);
//
//            }


        topicRepository.deleteById(id);


        }



    }

