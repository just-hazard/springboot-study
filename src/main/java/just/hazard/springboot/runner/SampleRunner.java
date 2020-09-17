package just.hazard.springboot.runner;

import just.hazard.springboot.properties.HazardProperties;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

    final HazardProperties hazardProperties;

    public SampleRunner(HazardProperties hazardProperties) {
        this.hazardProperties = hazardProperties;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("name : " + hazardProperties.getName());
        System.out.println("age : " + hazardProperties.getAge());
    }
}
