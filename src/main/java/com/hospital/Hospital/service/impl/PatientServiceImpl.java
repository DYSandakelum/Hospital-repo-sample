package com.hospital.Hospital.service.impl;

import com.hospital.Hospital.controller.request.PatientRequest;
import com.hospital.Hospital.controller.response.PatientResponse;
import com.hospital.Hospital.model.Patient;
import com.hospital.Hospital.repository.PatientRepository;
import com.hospital.Hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public void create(PatientRequest patientRequest) {

        Patient patient = new Patient();
        patient.setName(patientRequest.getName());
        patient.setAge(patientRequest.getAge());
        patientRepository.create(patient);


    }

    @Override
    public List<Patient> findAll() {
        return patientRepository.findAll();
    }

}


