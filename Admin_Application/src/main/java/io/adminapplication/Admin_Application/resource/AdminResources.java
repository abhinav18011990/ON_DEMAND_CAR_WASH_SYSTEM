package io.adminapplication.Admin_Application.resource;
import io.adminapplication.Admin_Application.model.*;
import io.adminapplication.Admin_Application.repository.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminResources {
        private final AdminRepository adminRepository = null;
        @PostMapping("/registeradmin")
        @ResponseStatus(HttpStatus.ACCEPTED)
        public AdminInfo registerAdmin(@RequestBody AdminInfo adminInfo){
                return adminRepository.save(adminInfo);
        }
        @GetMapping("/profile/{adminId}")
        @ResponseStatus(HttpStatus.OK)
        public List<AdminInfo> getprofile(@PathVariable("adminId") String adminId){
                return adminRepository.findAll();
        }
        @PutMapping("/update/{adminId}")
        @ResponseStatus(HttpStatus.CREATED)
        public AdminInfo updateProfile(@PathVariable("adminId") String adminId,@RequestBody AdminInfo adminInfo){
                adminInfo.setAdminId(adminId);
                return adminRepository.save(adminInfo);
        }
        @DeleteMapping("/delete/{adminId}")
        public String deleteProfile(@PathVariable("adminId") String adminId){
                adminRepository.deleteById(adminId);
                return "The profile is deleted by Id %s"+adminId;
        }
}
