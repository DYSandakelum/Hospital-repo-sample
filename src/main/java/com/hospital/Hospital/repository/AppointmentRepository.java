package com.hospital.Hospital.repository;

import com.hospital.Hospital.model.Appointment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AppointmentRepository {

    List<Appointment> appointmentList = new ArrayList<>();

    public void createAppointment(Appointment appointment){

        appointmentList.add(appointment);
    }

    public List<Appointment> findAllAppointment() {

        return appointmentList;
    }

}
