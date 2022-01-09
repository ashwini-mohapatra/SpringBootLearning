package in.ashwinimohapatra.learning.topic;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class TopicController {
    
@Autowired    
private TopicServices topicServices;

    @RequestMapping("/topics")
    public List<Topics> getAllTopics() {
        return topicServices.getAlltopics();
    }
    
    @RequestMapping(value = "/topic/{id}")
    public Topics getATopic(@PathVariable String id){
        return topicServices.getTopic(id);
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public void addTopic(@RequestBody Topics top){
        topicServices.addTopic(top);
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public void updateTopic(@RequestBody Topics top){
        topicServices.updateTopics(top);
    }
    //Not working
    // @RequestMapping(value = "/delete", method = RequestMethod.POST)
    // public void deleteTopic(@RequestBody Topics top){
    //     topicServices.deleteTopics(top);
    // }
    @RequestMapping(value = "/delete/{id}")
    public void deleteTopicByid(@PathVariable String id){
        topicServices.deleteTopicsById(id);
    }

}
