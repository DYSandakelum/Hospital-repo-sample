package com.hospital.Hospital.controller.request;

public class DoctorRequest {

    private Long DoctorId;
    private String Name;

    public Long getDoctorId() {
        return DoctorId;
    }

    public void setDoctorId(Long doctorId) {
        DoctorId = doctorId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
