package io.washerapplication.Washer_Application.resource;

import io.washerapplication.Washer_Application.model.*;
import io.washerapplication.Washer_Application.repository.*;
import lombok.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/washer")
@RequiredArgsConstructor
public class WasherResource {
       private final WasherRepository washerRepository = null;
       @GetMapping("profile/{washerId}")
       @ResponseStatus(HttpStatus.OK)
       public List<Washer> getProfile(@PathVariable("washerId") String washerId){
              return washerRepository.findAll();
       }
       @PostMapping("/register")
       @ResponseStatus(HttpStatus.CREATED)
       public Washer register(@RequestBody Washer washer){
              return washerRepository.save(washer);
       }
       @PutMapping("/update/{washerId}")
       @ResponseStatus(HttpStatus.ACCEPTED)
       public Washer updateProfile(@RequestBody Washer washer,@PathVariable("washerId") String userId){
               washer.setWasherId(userId);
               return washerRepository.save(washer);
       }
       @DeleteMapping("/delete/{washerId")
       public String deleteProfile(@PathVariable("washerId") String washerId){
              washerRepository.deleteById(washerId);
              return "The profile is deleted by Id %s"+washerId;
       }
}