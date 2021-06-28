package io.aithal.hellospringboot;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> home ( ) {
        Map<String, String> res = new HashMap<> ();
        res.put ( "message", "Hello World" );
        return res;
    }

    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> hello ( @RequestParam(value = "name", defaultValue = "Stranger") String name ) {
        Map<String, String> res = new HashMap<> ();
        res.put ( "message", "Hello " + name );
        return res;
    }
}
