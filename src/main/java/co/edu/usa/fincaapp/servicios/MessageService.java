package co.edu.usa.fincaapp.servicios;

import java.util.List;
import java.util.Optional;

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

    public Optional<Message> getMessage(Long idMessage){
        return messageRepository.getMessageById(idMessage);
    }

    public Message saveMessage(Message message){
        return messageRepository.saveMessage(message);
    }

    public void deleteAll(){
        messageRepository.deleteAll();
    }

    public void delete(Long id){
        Optional<Message> oMessage = getMessage(id);
        if (!oMessage.isEmpty()){
            messageRepository.deleteMessage(oMessage.get());                        
        }        
    }
}
