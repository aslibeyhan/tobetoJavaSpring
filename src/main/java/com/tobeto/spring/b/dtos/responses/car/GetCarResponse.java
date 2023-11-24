package com.tobeto.spring.b.dtos.responses.car;

import com.tobeto.spring.b.entities.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetCarResponse {
    private int id;
    private String plate;
    private double daily_price;
    private Model model;
}