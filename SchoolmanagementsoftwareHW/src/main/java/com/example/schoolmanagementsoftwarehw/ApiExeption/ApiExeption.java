package com.example.schoolmanagementsoftwarehw.ApiExeption;

import lombok.AllArgsConstructor;
import lombok.Data;


public class ApiExeption extends RuntimeException{
      public ApiExeption(String massage){
          super(massage);
      }
}
