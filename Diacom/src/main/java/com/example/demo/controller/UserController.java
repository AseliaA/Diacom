package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RestController
@RequestMapping(UserController.URL_USER)
public class UserController {

    public static final String URL_USER = "diacom/user/"; /*start url for all requests
     in class Student*/

   // @Autowired
    private UserService userService;

    @PostMapping(path="/saveUser" ,
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public User saveUser(@RequestBody User user) {
        return this.userService.addUser(user);
    }

    @DeleteMapping(path = "/deleteUser",
    produces ={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
        public User deleteUser(@PathVariable Long id){
            this.userService.deleteUserById(id);
            return null;
    }
}
