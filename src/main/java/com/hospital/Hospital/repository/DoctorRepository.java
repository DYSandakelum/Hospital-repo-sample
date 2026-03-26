package com.hospital.Hospital.repository;

import com.hospital.Hospital.controller.request.DoctorRequest;
import com.hospital.Hospital.model.Doctor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DoctorRepository {

    List<Doctor> doctorList = new ArrayList<>();

    public void createDoctor(Doctor doctor){
        doctorList.add(doctor);
    }

    public List<Doctor> findAllDoctors() {
        return doctorList;
    }

    public Doctor findDoctorById(Long doctorId) {
        for (Doctor doctor : doctorList) {

            if (doctor.getDoctorId() == doctorId) {
                return doctor;
            }
        }
        return null;
    }

    public Doctor updateDoctor(Long driverId, DoctorRequest request) {
        for (Doctor doctor : doctorList) {

            if (doctor.getDoctorId().equals(driverId)) {

                doctor.setName(request.getName());


                return doctor;
            }
        }

        return null;
    }
}
