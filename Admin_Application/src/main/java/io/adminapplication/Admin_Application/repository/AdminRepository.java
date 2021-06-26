package io.adminapplication.Admin_Application.repository;

import io.adminapplication.Admin_Application.model.*;
import org.springframework.data.mongodb.repository.*;

public interface AdminRepository extends MongoRepository<AdminInfo,String> {

}
