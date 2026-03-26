package com.hospital.Hospital.service.impl;

import com.hospital.Hospital.controller.request.DoctorRequest;
import com.hospital.Hospital.model.Doctor;
import com.hospital.Hospital.repository.DoctorRepository;
import com.hospital.Hospital.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public void create(DoctorRequest doctorRequest) {

        Doctor doctor = new Doctor();

        doctor.setDoctorId(doctorRequest.getDoctorId());
        doctor.setName(doctorRequest.getName());

        doctorRepository.createDoctor(doctor);

    }

    @Override
    public List<Doctor> getAll() {
        return doctorRepository.findAllDoctors();
    }

    @Override
    public Doctor getById(Long DoctorId) {
        return doctorRepository.findDoctorById(DoctorId);
    }
}
