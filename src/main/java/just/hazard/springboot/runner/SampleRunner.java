package just.hazard.springboot.runner;

import just.hazard.springboot.entity.Member;
import just.hazard.springboot.properties.HazardProperties;
import just.hazard.springboot.service.UserService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

    final HazardProperties hazardProperties;

    final UserService userService;

    public SampleRunner(HazardProperties hazardProperties, UserService userService) {
        this.hazardProperties = hazardProperties;
        this.userService = userService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("name : " + hazardProperties.getName());
        System.out.println("age : " + hazardProperties.getAge());

        Member member = new Member();

        member.setUsername("hazard");
        member.setPassword("1234");

        userService.createUser(member);
    }
}
