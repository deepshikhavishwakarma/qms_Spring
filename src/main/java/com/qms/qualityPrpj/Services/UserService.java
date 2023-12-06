package com.qms.qualityPrpj.Services;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qms.qualityPrpj.Entity.User;
import com.qms.qualityPrpj.Repository.UserRepository;

@Service
public class UserService {
     @Autowired
     private UserRepository userRepository;
     
     public User saveUser(User user) {
        return userRepository.save(user);
    }
    public User validateUser(User user){   //read
        User valid = userRepository.findAllById(user.getEmployeeId());   //custom function
        if(Objects.equals(valid.getPassword(), user.getPassword())){
            return valid;
        }else {
            return null;
            
        }
    }
}
