package com.casestudy.User_Application.repository;

import com.casestudy.User_Application.model.*;
import org.springframework.data.mongodb.repository.*;

import java.util.*;
public interface UserRepository extends MongoRepository<Users,String> {
}
