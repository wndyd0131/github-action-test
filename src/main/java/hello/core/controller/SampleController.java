package hello.core.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class SampleController {
    @RequestMapping("/sample")
    public String sample() {
        System.out.println("Hi");
        return "Sample!!~!";
    }

//    @GetMapping("/sample/{userId}")
//    public String getUserId(@PathVariable String userId) {
//        log.info("userId = {}", userId);
//        return userId;
//    }
}
