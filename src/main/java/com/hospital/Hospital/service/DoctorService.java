package com.hospital.Hospital.service;

import com.hospital.Hospital.controller.request.DoctorRequest;
import com.hospital.Hospital.model.Doctor;

import java.util.List;

public interface DoctorService {

    void create(DoctorRequest doctorRequest);

    List<Doctor> getAll();

    Doctor getById(Long DoctorId);

}
