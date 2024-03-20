package com.example.tutorial7.response;

import com.example.tutorial7.request.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class getResponse {
    boolean success;
    User user;
}
