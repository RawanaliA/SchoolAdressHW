package com.example.schoolmanagementsoftwarehw.Service;

import com.example.schoolmanagementsoftwarehw.ApiExeption.ApiExeption;
import com.example.schoolmanagementsoftwarehw.DTO.AdressDto;
import com.example.schoolmanagementsoftwarehw.Model.Address;
import com.example.schoolmanagementsoftwarehw.Model.Teacher;
import com.example.schoolmanagementsoftwarehw.Repoistory.AdressRepository;
import com.example.schoolmanagementsoftwarehw.Repoistory.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdressService {
    private  final TeacherRepository teacherRepository;
    private  final AdressRepository adressRepository;

    public List<Address> getAllTeachers(){
        return adressRepository.findAll();
    }
    public void addAddress(AdressDto dto) {
        Teacher teacher = teacherRepository.findTeacherById(dto.getTeacher_id());

        if (teacher == null) {
            throw new ApiExeption("Can not add Address ,Address not found");
        }
        Address address=new Address(null, dto.getArea(), dto.getStreet(), dto.getBuildingNumber(),teacher);
        adressRepository.save(address);

    }
    public void updateAdress(AdressDto dto){
        Teacher teacher = teacherRepository.findTeacherById(dto.getTeacher_id());
        if (teacher == null) {
            throw new ApiExeption("Can not add Address ,Address not found");
        }
        Address address=adressRepository.getAddressById(dto.getTeacher_id());

        address.setArea(dto.getArea());
        address.setStreet(dto.getStreet());
        address.setBuildingNumber(teacher.getSalary());
        adressRepository.save(address);
    }
}
