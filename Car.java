package com.telran.project;

public class Car {
    private String name;
    private String producingCountry;
    private int speed;
    private int yearOfIssue;

    public Car() {
        //
    }

    public Car(Car car) {
        this.name = car.name;
        this.producingCountry = car.producingCountry;
        this.speed = car.speed;
        this.yearOfIssue = car.yearOfIssue;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        if (name == null || name.equals("")) {
            System.out.println("Check the names of all vehicles and enter the correct name for car !!!");
            System.exit(0);
        }
        this.name = name;
    }

    public String getProducingCountry() {
        return producingCountry;
    }

    public void setProducingCountry(String producingCountry) {
        if (producingCountry == null || producingCountry.equals("")) {
            System.out.println("Enter the correct producing country for " + name + " !!!");
            System.exit(0);
        }
        this.producingCountry = producingCountry;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            System.out.println("Enter the correct speed for " + name + " !!!");
            System.exit(0);
        }
        this.speed = maxSpeed;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        if (yearOfIssue < 2000) {
            System.out.println("Enter the correct year of issue for " + name + " !!!");
            System.exit(0);
        }
        this.yearOfIssue = yearOfIssue;
    }

    public static void changeDateOfCars(Car carOne, Car carTwo) {
        int changeOfSpeed = carTwo.speed;
        carTwo.speed = carOne.speed;
        carOne.speed = changeOfSpeed;
        int changeOfIssueYear = carTwo.yearOfIssue;
        carTwo.yearOfIssue = carOne.yearOfIssue;
        carOne.yearOfIssue = changeOfIssueYear;
        String changeOfProducingCountry = carTwo.producingCountry;
        carTwo.producingCountry = carOne.producingCountry;
        carOne.producingCountry = changeOfProducingCountry;
    }
}


