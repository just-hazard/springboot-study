package just.hazard.springboot.controller;

import just.hazard.springboot.entity.Member;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public String user() {
        return "user";
    }

    @PostMapping("/user")
    @ResponseStatus(HttpStatus.CREATED)
    public Member create()  {
        Member user = new Member();
        user.setId(1l);
        user.setUsername("hazard");
        user.setPassword("1234");

        return user;
    }

}
