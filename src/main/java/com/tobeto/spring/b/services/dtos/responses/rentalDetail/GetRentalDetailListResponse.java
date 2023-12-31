package com.tobeto.spring.b.services.dtos.responses.rentalDetail;

import com.tobeto.spring.b.entities.Rental;
import com.tobeto.spring.b.services.dtos.responses.rental.GetRentalListResponse;
import com.tobeto.spring.b.services.dtos.responses.rental.GetRentalResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetRentalDetailListResponse {
    private int id;
    private String start_date;
    private String end_date;
    private int total_cost;
    private GetRentalResponse rentalResponse;

}
