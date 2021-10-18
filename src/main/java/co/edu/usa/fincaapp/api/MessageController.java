package co.edu.usa.fincaapp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.edu.usa.fincaapp.entidades.Message;
import co.edu.usa.fincaapp.servicios.MessageService;

@RestController
@RequestMapping("api/Message")
@CrossOrigin(origins = "*")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @GetMapping("/all")
    public List<Message> getMessages(){
        return messageService.getMessages();
    }

    @PostMapping("/save")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Message saveMessage(@RequestBody Message message){
        Message messageSave = messageService.saveMessage(message);
        return messageSave;
    }

    @DeleteMapping("/deleteAll")
    public void deleteAllMessage(){
        messageService.deleteAll();
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Long> deletePost(@PathVariable Long id) {
        messageService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
