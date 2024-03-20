package com.example.tutorial7.response;

import com.example.tutorial7.request.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class getAllResponse {
    String message;
    boolean success;
    List<User> Users;
}
