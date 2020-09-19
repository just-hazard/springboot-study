package just.hazard.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

    @GetMapping("/security")
    public String security() {
        return "security";
    }

    @GetMapping("/securitytwo")
    public String securitytwo() {
        return "securityTwo";
    }
}
