package com.Task.Task.Service;

import com.Task.Task.Repository.UserRepository;
import com.Task.Task.modele.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public String enregistrerUser(User user) {
        userRepository.save(user);
        return "user enregistrer";
    }

    @Override
    public List<User> lire(){
        return userRepository.findAll();
    }

    @Override
    public User lire(Long id){
        return userRepository.findById(id).get();
    }

    @Override
    public User modifier(User user){
        return userRepository.save(user);
    }

    @Override
    public String supprimer(Long id){
         userRepository.deleteById(id);
         return "User Was deleted succesfully!";
    }

}
