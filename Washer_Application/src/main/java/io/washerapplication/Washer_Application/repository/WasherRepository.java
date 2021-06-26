package io.washerapplication.Washer_Application.repository;

import io.washerapplication.Washer_Application.model.*;
import org.springframework.data.mongodb.repository.*;

public interface WasherRepository extends MongoRepository<Washer,String> {
}
