package ua.testing.demo_jpa.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRegistrationDTO {

    private String firstName;
    private String lastName;
    private String firstNameEN;
    private String lastNameEN;
    private String email;
    private String password;
    private String confirmPassword;
}
