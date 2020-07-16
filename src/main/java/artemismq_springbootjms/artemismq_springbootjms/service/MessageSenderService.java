package artemismq_springbootjms.artemismq_springbootjms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageSenderService {

    @Autowired
    JmsTemplate jmsTemplate;

    @Value("${jms.queue}")
    private String myQueue;

    public void sendMessage(String message){
        jmsTemplate.convertAndSend(myQueue,message);
    }
}
