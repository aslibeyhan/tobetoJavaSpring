package com.tobeto.spring.b.services.dtos.responses.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetUserResponse {
    private  int id;
    private String first_name;
    private String last_name ;
    private String email;
    private String  phone;
}
