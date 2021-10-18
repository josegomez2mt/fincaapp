package co.edu.usa.fincaapp.servicios;

import java.util.List;
import java.util.Optional;

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

    public Optional<User> getUser(Long id){
        return userRepository.getUserById(id);
    }

    public User saveUser(User user){
        return userRepository.saveUser(user);
    }

    public void deleteAll(){
        userRepository.deleteAll();
    }

    public void delete(Long id){
        Optional<User> oUser = getUser(id);
        if (!oUser.isEmpty()){
            userRepository.deleteUser(oUser.get());                        
        }        
    }

}
