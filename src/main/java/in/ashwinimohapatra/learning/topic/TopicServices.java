package in.ashwinimohapatra.learning.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicServices {

    private List<Topics> topics = new ArrayList<>(Arrays.asList(
        new Topics("id", "name", "description"),
        new Topics("1", "Item 1", "Test1"),
        new Topics("2", "Item 2", "Test2"),
        new Topics("3", "Item 3", "Test3")
    ));
    public List<Topics> getAlltopics() {
        return topics;
    }
    public Topics getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }
    public void addTopic(Topics topics1){
        topics.add(topics1);
    }

    public void updateTopics(Topics topics){
        for(int i=0;i<this.topics.size();i++){
            Topics t=this.topics.get(i);
            if(t.getId().equals(topics.id)){
                this.topics.set(Integer.parseInt(t.id), topics);
                return;
            }
        }
    }

    public void deleteTopics(Topics topics){
        this.topics.remove(topics);
    }
    
    public void deleteTopicsById(String id){
        topics.removeIf(t -> t.getId().equals(id));
    }
}

