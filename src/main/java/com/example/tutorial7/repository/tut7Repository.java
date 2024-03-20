package com.example.tutorial7.repository;

import com.example.tutorial7.request.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tut7Repository extends MongoRepository<User, String> {
}
