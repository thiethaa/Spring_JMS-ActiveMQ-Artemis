package artemismq_springbootjms.artemismq_springbootjms.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class MessageReceiveService {

    Logger log = LoggerFactory.getLogger(MessageReceiveService.class);

    @JmsListener(destination = "${jms.queue}")
    public void receiveMessage(String message){
        log.info("Received Message : "+ message);
    }
}
