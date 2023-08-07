package org.example.dto;

import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateUserRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String username;

    @NotBlank
    private String password;

    private String email;

    @Min(18)
    private int age;


}
