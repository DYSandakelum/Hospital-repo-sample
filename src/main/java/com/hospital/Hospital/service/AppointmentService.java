package com.hospital.Hospital.service;

import com.hospital.Hospital.controller.request.AppointmentRequest;
import com.hospital.Hospital.model.Appointment;

import java.util.List;

public interface AppointmentService {

    void createAppointment(AppointmentRequest appointmentRequest);

    List<Appointment> findAll();


}
