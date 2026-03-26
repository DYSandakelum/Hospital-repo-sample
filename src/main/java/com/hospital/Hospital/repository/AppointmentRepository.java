package com.hospital.Hospital.repository;

import com.hospital.Hospital.controller.request.AppointmentRequest;
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

    public Appointment findById(Long appointmentId) {
        for (Appointment appointment : appointmentList) {

            if (appointment.getId().equals(appointmentId)) {
                return appointment;
            }
        }
        return null;
    }

    public void updateById(Long appointmentId, AppointmentRequest request) {
        for (Appointment appointment : appointmentList) {

            if (appointment.getId().equals(appointmentId)) {

                appointment.setId(request.getId());
                appointment.setDate(request.getDate());
                appointment.setDoctorName(request.getDoctorName());
                appointment.setPatientName(request.getPatientName());

            }
        }

    }

}
