package io.aithal.hellospringboot;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public String home ( ) {
        return "{\"message\": \"Hello World\"}";
    }

    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public String hello ( @RequestParam(value = "name", defaultValue = "Stranger") String name ) {
        return "{\"message\": \"Hello " + name + "\"}";
    }
}
