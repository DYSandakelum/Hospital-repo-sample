package com.hospital.Hospital.service.impl;

import com.hospital.Hospital.controller.request.AppointmentRequest;
import com.hospital.Hospital.model.Appointment;
import com.hospital.Hospital.repository.AppointmentRepository;
import com.hospital.Hospital.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public void createAppointment(AppointmentRequest appointmentRequest) {

        Appointment appointment = new Appointment();

        appointment.setId(appointmentRequest.getId());
        appointment.setDate(appointmentRequest.getDate());
        appointment.setDoctorName(appointmentRequest.getDoctorName());
        appointment.setPatientName(appointmentRequest.getPatientName());

        appointmentRepository.createAppointment(appointment);

    }

    @Override
    public List<Appointment> findAll() {
        return appointmentRepository.findAllAppointment();
    }
}
