package com.hillel.lesson_05.transport;

public class Car extends GroundTransport {
    private String carNumber;
    private String type;

    public Car(String name) {
        super(name);
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
}
