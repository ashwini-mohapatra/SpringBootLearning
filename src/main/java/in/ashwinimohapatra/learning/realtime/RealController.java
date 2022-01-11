package in.ashwinimohapatra.learning.realtime;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class RealController {
    
@Autowired    
private RealServices realServices;

    @RequestMapping("/reals")
    public List<Real> getAllReal() {
        return realServices.getAllReal();
    }
    
    @RequestMapping(value = "/real/{id}")
    public Optional<Real> getAReal(@PathVariable String id){
        return realServices.getReal(id);
    }

    @RequestMapping(value = "/addreal",method = RequestMethod.POST)
    public void addReal(@RequestBody Real top){
        realServices.addReal(top);
    }
    @RequestMapping(value = "/updatereal", method = RequestMethod.POST)
    public void updateReal(@RequestBody Real top){
        realServices.updateReal(top);
    }
    @RequestMapping(value = "/deletereal", method = RequestMethod.POST)
    public void deleteReal(@RequestBody Real top){
        realServices.deleteReal(top);
    }
    @RequestMapping(value = "/deletereal/{id}")
    public void deleteRealByid(@PathVariable String id){
        realServices.deleteRealById(id);
    }

}
