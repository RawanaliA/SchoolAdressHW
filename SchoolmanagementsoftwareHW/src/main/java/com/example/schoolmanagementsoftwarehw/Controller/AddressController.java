package com.example.schoolmanagementsoftwarehw.Controller;

import com.example.schoolmanagementsoftwarehw.DTO.AdressDto;
import com.example.schoolmanagementsoftwarehw.Model.Address;
import com.example.schoolmanagementsoftwarehw.Service.AdressService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/address")
@RequiredArgsConstructor
public class AddressController {
    private final AdressService adressService ;
    @GetMapping("/get")
    public ResponseEntity getAddressToTeacher(){
        List<Address> AllDeOfService=adressService.getAllTeachers();
        return ResponseEntity.status(200).body(AllDeOfService);


    }
    @PostMapping("/add")
    public ResponseEntity addAddressToTeacher(@RequestBody AdressDto dto){
        adressService.addAddress(dto);
        return ResponseEntity.status(200).body("add Sucssfuly");
}
@PutMapping("/update")
    public ResponseEntity updateAddressToTeacher(@Valid @RequestBody AdressDto dto){
        adressService.updateAdress(dto);
        return ResponseEntity.status(200).body("add Sucssfuly");
    }
}
