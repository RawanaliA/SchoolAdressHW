package com.example.schoolmanagementsoftwarehw.Model;
//area , street , buildingNumber ( Add all required validation )
// ( Add all required validation )
 import jakarta.persistence.*;
 import jakarta.validation.constraints.Email;
 import jakarta.validation.constraints.NotEmpty;
 import jakarta.validation.constraints.NotNull;
 import lombok.AllArgsConstructor;
 import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition = "varchar(20 )not null")
    public String name;
    private Integer age;
    @NotEmpty
    @Email(message = "")
    @Column(columnDefinition = "varchar(20 )not null")
    private String email;
    @NotNull
    private Integer salary;

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "teacher")
     @PrimaryKeyJoinColumn
    private Address address;



}
