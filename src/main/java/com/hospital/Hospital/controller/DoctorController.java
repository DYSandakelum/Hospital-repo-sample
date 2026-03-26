package com.hospital.Hospital.controller;

import com.hospital.Hospital.controller.request.DoctorRequest;
import com.hospital.Hospital.controller.response.DoctorResponse;
import com.hospital.Hospital.model.Doctor;
import com.hospital.Hospital.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping("/doctors")
    public void create (@RequestBody DoctorRequest doctorRequest){
        doctorService.create(doctorRequest);
    }

    @GetMapping("/doctors")
    public List<DoctorResponse> getAll(){

        List<Doctor> doctorList = doctorService.getAll();
        List<DoctorResponse> responseList = new ArrayList<>();

        for (Doctor doctor : doctorList){
            DoctorResponse doctorResponse = new DoctorResponse();

            doctorResponse.setDoctorId(doctor.getDoctorId());
            doctorResponse.setName(doctor.getName());

            responseList.add(doctorResponse);
        }

        return responseList;
    }

    @GetMapping("/doctors/{doctor-id}")
    public DoctorResponse getById(@PathVariable ("doctor-id") Long doctorId){

        Doctor doctor= doctorService.getById(doctorId);
        DoctorResponse response = new DoctorResponse();

        response.setDoctorId(doctor.getDoctorId());
        response.setName(doctor.getName());


        return response;

    }

    @PutMapping("/doctors/{doctor-id}")
    public DoctorResponse updateById (@PathVariable("doctor-id") Long doctorId , @RequestBody DoctorRequest doctorRequest){
        Doctor doctor = doctorService.updateById(doctorId,doctorRequest);
        DoctorResponse response = new DoctorResponse();

        response.setDoctorId(doctor.getDoctorId());
        response.setName(doctor.getName());

        return response;

    }

    
}


