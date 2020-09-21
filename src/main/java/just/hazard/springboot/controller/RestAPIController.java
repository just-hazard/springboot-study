package just.hazard.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIController {

    @GetMapping("async")
    public String async() throws InterruptedException {
        Thread.sleep(5000l);
        return "async";
    }

    @GetMapping("synchronous")
    public String synchronous() throws InterruptedException {
        Thread.sleep(3000l);
        return "synchronous";
    }

}
