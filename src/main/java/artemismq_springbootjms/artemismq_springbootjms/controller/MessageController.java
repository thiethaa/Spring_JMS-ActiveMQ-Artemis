package artemismq_springbootjms.artemismq_springbootjms.controller;

import artemismq_springbootjms.artemismq_springbootjms.service.MessageSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    MessageSenderService messageSenderService;

    @PostMapping("/sendMsg")
    public ResponseEntity<String> send(@RequestBody String message){
        messageSenderService.sendMessage(message);
        return new ResponseEntity<>("Message send: "+message, HttpStatus.OK);
    }
}