package com.joshguna.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

//    @NotNull        -> anything accepts, except null
//    @NotEmpty       -> anything accepts, except null and empty string
//    @NotBlank       -> anything accepts, except null, empty and blank space

    @NotBlank
    @Size(max = 20, min = 2)
    private String firstName;

    @NotBlank
    @Size(max = 20, min = 2)
    private String lastName;

    //to show that it's a date, putting yyyy is important
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;

}
