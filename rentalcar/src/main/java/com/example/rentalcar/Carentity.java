package com.example.rentalcar;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
class Carentity {

    @Id
    private String carId;
    private String carModel;
    private String carNo;
    private String Status;

    public String getCarId() {
        return this.carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarModel() {
        return this.carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarNo() {
        return this.carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getStatus() {
        return this.Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
}
