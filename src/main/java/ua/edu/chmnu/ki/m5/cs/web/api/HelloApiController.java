package ua.edu.chmnu.ki.m5.cs.web.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApiController implements HelloApi {

    @GetMapping("/ping")
    @Override
    public String ping(@RequestParam(required = false) String payload) {
        if (payload == null || payload.isEmpty()) {
            return "PONG";
        }

        return "Echo: " + payload;
    }
}
