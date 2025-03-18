package com.onlyflan.onlyflan_api.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class User {

    private static final String STRONG_PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()\\-_=+\\[{\\]}\\\\|;:'\",<.>/?]).{8,24}$";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column(nullable = false)
    protected boolean isAdmin =false;

    protected String firstname;
    protected String lastname;

    @NotBlank
    protected String phone;

    protected LocalDate creationDate;

    @Column(unique = true, nullable = false)
    @NotNull
    @NotBlank(message = "Email is mandatory")
    protected String email;

    @NotBlank
    @NotNull
    @Size(min = 8, max = 24, message = "Password must be between 8 and 24 characters long")
    @Pattern(regexp = STRONG_PASSWORD_REGEX, message = "Password must contain at least one uppercase letter, one lowercase letter, one number and one special character")
    @Column(nullable = false)
    protected String password;



}
