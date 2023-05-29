package com.example.schoolmanagementsoftwarehw.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

//area , street , buildingNumber ( Add all required validation )
@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table
public class Address {
    @Id
    private Integer id;
    @NotEmpty
    @Column(columnDefinition = "varchar(20 )not null")
    private String area;
    @NotEmpty
    @Column(columnDefinition = "varchar(20 )not null")
    private String street;
    @NotEmpty
    @Column(columnDefinition = "varchar(20 )not null")
    private Integer buildingNumber;
    @OneToOne
    @MapsId
    @JsonIgnore
    private Teacher teacher;


}
