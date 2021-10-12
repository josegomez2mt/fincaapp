package co.edu.usa.fincaapp.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.usa.fincaapp.Repositorios.MessageRepository;
import co.edu.usa.fincaapp.entidades.Message;

@Service
public class MessageService {
    @Autowired
    MessageRepository messageRepository;

    public List<Message> getMessages(){
        return messageRepository.getMessages();
    }

    public Message getMessage(Long idMessage){
        return messageRepository.getMessageById(idMessage).get();
    }

    public Message saveMessage(Message message){
        return messageRepository.saveMessage(message);
    }
}
