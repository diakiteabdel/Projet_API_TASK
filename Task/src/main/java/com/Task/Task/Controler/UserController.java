package com.Task.Task.Controler;

import com.Task.Task.Service.UserService;
import com.Task.Task.modele.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api")

public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/enregistrer")
    private String create(@RequestBody  User user){
        return userService.enregistrerUser(user);
    }

    @GetMapping("/afficher")
    private List<User> lire(){
        return userService.lire();
    }

       @GetMapping("/afficher/{id}")
      private User lire(@PathVariable Long id){
      return userService.lire(id);
     }

     @PutMapping("/modifier/{id}")
    private User update(@RequestBody User user){
        return userService.modifier(user);
     }

     @DeleteMapping("/supprimer/{id}")
    private String delete(@PathVariable Long id, @RequestBody User user){
        return userService.supprimer(id);
     }
}
