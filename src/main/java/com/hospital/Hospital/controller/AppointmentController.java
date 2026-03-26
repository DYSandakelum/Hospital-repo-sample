package com.hospital.Hospital.controller;

import com.hospital.Hospital.controller.request.AppointmentRequest;
import com.hospital.Hospital.controller.response.AppointmentResponse;
import com.hospital.Hospital.model.Appointment;
import com.hospital.Hospital.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @PostMapping("/appointments")
    public void createAppointment(@RequestBody AppointmentRequest appointmentRequest){

        appointmentService.createAppointment(appointmentRequest);

    }

    @GetMapping("/appointments")
    public List<AppointmentResponse> getAll(){

        List<Appointment> appointmentList = appointmentService.findAll();

        List<AppointmentResponse> appointmentResponseList = new ArrayList<>();

        for (Appointment appointment : appointmentList){
            AppointmentResponse appointmentResponse = new AppointmentResponse();

            appointmentResponse.setId(appointment.getId());
            appointmentResponse.setDate(appointment.getDate());
            appointmentResponse.setDoctorName(appointment.getDoctorName());
            appointmentResponse.setPatientName(appointment.getPatientName());

            appointmentResponseList.add(appointmentResponse);
        }

        return appointmentResponseList;

    }

    @GetMapping("/appointments/{appointment-id}")
    public AppointmentResponse getById(@PathVariable("appointment-id") Long appointmentId ){

        Appointment appointment = appointmentService.findById(appointmentId);

        AppointmentResponse appointmentResponse = new AppointmentResponse();

        appointmentResponse.setId(appointment.getId());
        appointmentResponse.setDate(appointment.getDate());
        appointmentResponse.setDoctorName(appointment.getDoctorName());
        appointmentResponse.setPatientName(appointment.getPatientName());

        return appointmentResponse;
    }

    @PutMapping("/appointments/{appointment-id}")
    public void updateById(@PathVariable("appointment-id") Long appointmentId, @RequestBody AppointmentRequest request){

        appointmentService.updateById(appointmentId, request);

    }

}
