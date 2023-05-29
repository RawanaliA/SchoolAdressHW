package com.example.schoolmanagementsoftwarehw.Repoistory;

import com.example.schoolmanagementsoftwarehw.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdressRepository extends JpaRepository<Address,Integer> {
Address getAddressById(Integer id);
}
