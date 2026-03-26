package com.hospital.Hospital.repository;

import com.hospital.Hospital.model.Patient;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PatientRepository {

    List<Patient> patientList = new ArrayList<>();

    public void create(Patient patient){
        patientList.add(patient);
    }



    public PatientRepository(List<Patient> patientList){
        this.patientList = patientList;
    }
    public List<Patient> findAll() {
        return patientList;
    }

}
