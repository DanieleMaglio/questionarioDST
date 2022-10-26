package com.example.questionario.service;

import com.example.questionario.mapper.UserMapper;
import com.example.questionario.model.User;
import com.example.questionario.model.UserDTO;
import com.example.questionario.rest.UtenteApiDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.questionario.repository.UserRepository;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

@Service
public class UserService implements UtenteApiDelegate {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private UserMapper userMapper;

    @Override
    public ResponseEntity<Void> saveUser(UserDTO userDTO) {
        System.out.println(userDTO.getEmail());
        System.out.println(userMapper.convertUserDTOtoUser(userDTO).getEmail());
        userRepo.save(userMapper.convertUserDTOtoUser(userDTO));
        return ResponseEntity.ok(null);
    }

    public ResponseEntity<Void> deleteUser(UserDTO userDTO) {
        User tempUser = userMapper.convertUserDTOtoUser(userDTO);
        userRepo.deleteById(tempUser.getId());
        return ResponseEntity.ok(null);
    }

}
