package no.appforge.apps.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rolfhsp on 11.05.18.
 */
@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/greeting")
    public String getGreeting() {
        return "Hello, World!";
    }

}
