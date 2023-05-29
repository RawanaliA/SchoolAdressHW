package com.example.schoolmanagementsoftwarehw.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AdressDto{


    private Integer Teacher_id;

    private String area;
    private String street;
    private Integer buildingNumber;
}
