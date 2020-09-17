package just.hazard.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/hello")
    public String hello() {

        logger.info("hazard");
        System.out.println("justhis");
        return "hello seop";
    }
}
