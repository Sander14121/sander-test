package no.fintlabs.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class Controller {

    @GetMapping("/")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello");
    }

}
