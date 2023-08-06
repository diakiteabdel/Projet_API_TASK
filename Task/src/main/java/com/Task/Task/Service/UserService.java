package com.Task.Task.Service;

import com.Task.Task.modele.User;

import java.util.List;
import java.util.Optional;


public interface UserService {

    String enregistrerUser(User user);

    List<User> lire();

    User lire(Long id);

    User modifier(User user);

    String supprimer(Long id);
}
