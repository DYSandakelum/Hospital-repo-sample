package com.hospital.Hospital.service;

import com.hospital.Hospital.controller.request.PatientRequest;
import com.hospital.Hospital.controller.response.PatientResponse;
import com.hospital.Hospital.model.Patient;

import java.util.List;

public interface PatientService {

    void create(PatientRequest patientRequest);
    List<Patient> findAll();

}
