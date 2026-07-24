package org.xian1.cicd.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @GetMapping("/message")
    public  String getMessage(){
        return "this is message from cicd";
    }
}
