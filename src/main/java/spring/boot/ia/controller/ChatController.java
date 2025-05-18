package spring.boot.ia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.ia.dto.ChatResponse;
import spring.boot.ia.service.ChatService;

@CrossOrigin("*")
@RestController
public class ChatController {

    @Autowired
    private ChatService simpleChatService;

    @PostMapping("/chat")
    public ChatResponse chat(@RequestBody String message){
        return new ChatResponse(simpleChatService.chat(message));
    }

}
