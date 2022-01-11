package in.ashwinimohapatra.learning.realtime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RealServices {

    @Autowired
    private RealRepository realRepository;

    public List<Real> getAllReal() {
        List<Real> real=new ArrayList<>();
        realRepository.findAll().forEach(real::add);
        return real;
    }
    public Optional<Real> getReal(String id){
        return realRepository.findById(id);
    }
    public void addReal(Real topics1){
        realRepository.save(topics1);
    }

    public void updateReal(Real topics){
        realRepository.save(topics);
        // for(int i=0;i<this.topics.size();i++){
        //     Real t=this.topics.get(i);
        //     if(t.getId().equals(topics.id)){
        //         this.topics.set(Integer.parseInt(t.id), topics);
        //         return;
        //     }
        // }
    }

    public void deleteReal(Real topics){
        realRepository.delete(topics);
    }
    
    public void deleteRealById(String id){
        realRepository.deleteById(id);
    }
}

