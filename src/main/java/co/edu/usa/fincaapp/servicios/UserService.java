package co.edu.usa.fincaapp.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.usa.fincaapp.Repositorios.UserRepository;
import co.edu.usa.fincaapp.entidades.User;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getUsers(){
        return userRepository.getUsers();
    }

    public User getUser(Long id){
        return userRepository.getUserById(id).get();
    }

    public User saveUser(User user){
        return userRepository.saveUser(user);
    }

    public void deleteAll(){
        userRepository.deleteAll();
    }

}
