package com.casestudy.User_Application.resource;
import com.casestudy.User_Application.model.*;
import com.casestudy.User_Application.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import java.util.concurrent.*;

@RestController
@RequestMapping("/userprofile")
public class UserResource {
       @Autowired
       private UserRepository userRepository;
       ConcurrentHashMap<String,Users> userDetails=new ConcurrentHashMap<>();
       @PostMapping("/register")
       @ResponseStatus(HttpStatus.CREATED)
       public Users registerUser(@RequestBody Users users){
              return userRepository.save(users);
       }
       @GetMapping("/profile/{userId}")
       @ResponseStatus(HttpStatus.OK)
       public Optional<Users> getUserById(@PathVariable("userId") String userId){
              return userRepository.findById(userId);
       }
       @PutMapping("/update/{userId}")
       @ResponseStatus(HttpStatus.ACCEPTED)
       public Users updateUser(@RequestBody Users users,@PathVariable("userId") String userId){
              users.setUserId(userId);
              userRepository.save(users);
              return users;
       }
       @DeleteMapping("/delete/{userid}")
       public String deleteById(@PathVariable("userid") String userId){
              userRepository.deleteById(userId);
              return "deleted by id"+userId;
       }

}
