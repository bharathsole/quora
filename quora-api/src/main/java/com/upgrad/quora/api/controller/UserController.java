package com.upgrad.quora.api.controller;

import com.upgrad.quora.api.model.SigninResponse;
import com.upgrad.quora.api.model.SignupUserRequest;
import com.upgrad.quora.api.model.SignupUserResponse;
import com.upgrad.quora.service.business.SignUpUserService;
import com.upgrad.quora.service.entity.UserEntity;
import com.upgrad.quora.service.exception.SignUpRestrictedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;

@RestController("/")
public class UserController {

    @Autowired
    private SignUpUserService signUPUserService;

    @PostMapping(name = "/user/signup", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<SignupUserResponse> signup(SignupUserRequest signupUserRequest) throws SignUpRestrictedException {

        UserEntity userEntity = new UserEntity();
        userEntity.setAboutme(signupUserRequest.getAboutMe());
        userEntity.setContactnumber(signupUserRequest.getContactNumber());
        userEntity.setCountry(signupUserRequest.getCountry());
        userEntity.setDob(signupUserRequest.getDob());
        userEntity.setEmail(signupUserRequest.getEmailAddress());
        userEntity.setLastname(signupUserRequest.getLastName());
        userEntity.setFirstname(signupUserRequest.getFirstName());
        userEntity.setPassword(signupUserRequest.getPassword());
        userEntity.setUsername(signupUserRequest.getUserName());
        // role should be nonadmin  by default
        userEntity.setRole("nonadmin");

        UserEntity createdUser = signUPUserService.signupUser(userEntity);

        SignupUserResponse signupUserResponse = new SignupUserResponse();
        signupUserResponse.id(createdUser.getUuid()).status("USER SUCCESSFULLY REGISTERED");

        return new ResponseEntity<>(signupUserResponse, HttpStatus.CREATED) ;

    }

    @PostMapping(name = "/user/signin",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<SigninResponse> signup(@RequestHeader("authorization") final String token)  {
        String encryptedUsernamePass = token.split("Basic")[1];
        String  decryptedUsernamePass  = Base64.getDecoder().decode(encryptedUsernamePass).toString();


        UserEntity createdUser = userService.signupUser(userEntity);

        SignupUserResponse signupUserResponse = new SignupUserResponse();
        signupUserResponse.id(createdUser.getUuid()).status("USER SUCCESSFULLY REGISTERED");

        return new ResponseEntity<>(signupUserResponse, HttpStatus.CREATED) ;

    }

}