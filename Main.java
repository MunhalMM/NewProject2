package com.telran.project;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setName("Toyota");
        car1.setProducingCountry("Japan");
        car1.setYearOfIssue(2015);
        car1.setSpeed(220);

        Car car2 = new Car();
        car2.setName("BMW");
        car2.setProducingCountry("Germany");
        car2.setYearOfIssue(2022);
        car2.setSpeed(380);

        Car car3 = new Car();
        car3.setName("Alfa Romeo");
        car3.setProducingCountry("Italy");
        car3.setYearOfIssue(2017);
        car3.setSpeed(260);

        Car car4 = new Car();
        car4.setName("LADA");
        car4.setProducingCountry("Russia");
        car4.setYearOfIssue(2019);
        car4.setSpeed(200);

        Car car5 = new Car();
        car5.setName("Rolls Roys");
        car5.setProducingCountry("England");
        car5.setYearOfIssue(2022);
        car5.setSpeed(320);

        Car car6 = new Car(car1);

        Car car7 = new Car(car2);

        Car.changeDateOfCars(car1,car4);

        Car[] allInformationAboutCar = {car1, car2, car3, car4, car5, car6, car7};
        checkAllCars(allInformationAboutCar);


    }

    public static void checkAllCars(Car[] dataOfAllCar) {
        for (Car allCar : dataOfAllCar) {
            System.out.println("Car name is : " + allCar.getName() + " | Car producing country is : " + allCar.getProducingCountry()
                    + " | Car year of issue is : " + allCar.getYearOfIssue() + " | Car maximal speed is : " + allCar.getSpeed() + " km/h");
        }
    }
}
