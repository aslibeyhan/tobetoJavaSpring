package com.tobeto.spring.b.services.dtos.requests.payment;

import com.tobeto.spring.b.entities.RentalDetail;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddPaymentRequest {

    private  int total_price;
    private  int payment_method;


}
