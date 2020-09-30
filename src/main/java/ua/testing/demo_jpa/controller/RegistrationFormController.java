package ua.testing.demo_jpa.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ua.testing.demo_jpa.dto.UserRegistrationDTO;
import ua.testing.demo_jpa.service.UserService;

@Slf4j
@RestController
@RequestMapping(value = "/")
public class RegistrationFormController {
    private UserService userService;

    @Autowired
    public RegistrationFormController (UserService userService){
        this.userService=userService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping (value = "/registration", method = RequestMethod.POST)
    public void registration(UserRegistrationDTO userRegistrationDTO){
        userService.saveNewUser(userRegistrationDTO);
    }
}
