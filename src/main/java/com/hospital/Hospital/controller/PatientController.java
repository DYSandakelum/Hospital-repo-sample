package com.hospital.Hospital.controller;

import com.hospital.Hospital.controller.request.PatientRequest;
import com.hospital.Hospital.controller.response.PatientResponse;
import com.hospital.Hospital.model.Patient;
import com.hospital.Hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/patients")
    public void create(@RequestBody PatientRequest  patientRequest){

        patientService.create(patientRequest);


    }

    @GetMapping("/patients")
    public List<PatientResponse> getPatientList(){

        List<Patient>  patientList = patientService.findAll();
        List<PatientResponse> patientResponseList = new ArrayList<>();
        for (Patient patient : patientList) {
            PatientResponse patientResponse = new PatientResponse();
            patientResponse.setId(patient.getId());
            patientResponse.setName(patient.getName());
            patientResponseList.add(patientResponse);

        }

        return patientResponseList;
    }


}
