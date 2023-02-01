package _17_ObjectsAndClasses_More_Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _02_RawData {
    public static class Car {

        //Define a class Car that holds information about model, engine, cargo and a collection of exactly 4 tires

            private String model;
            private int speed;
            private int power;
            private int weight;
            private String type;
            private double tire1Pressure;
            private int tire1age;
            private double tire2Pressure;
            private int tire2age;
            private double tire3Pressure;
        private int tire3age;
        private double tir4Pressure;
        private int tire4age;


        public String getModel() {
            return model;
        }

        public int getPower() {
            return power;
        }

        public String getType() {
            return type;
        }

        public double getTire1Pressure() {
            return tire1Pressure;
        }

        public double getTire2Pressure() {
            return tire2Pressure;
        }

        public double getTire3Pressure() {
            return tire3Pressure;
        }

        public double getTir4Pressure() {
            return tir4Pressure;
        }


        public Car(String model, int speed, int power, int weight, String type, double tire1Pressure, int tire1age, double tire2Pressure, int tire2age, double tire3Pressure, int tire3age, double tir4Pressure, int tire4age) {
            this.model = model;
            this.speed = speed;
            this.power = power;
            this.weight = weight;
            this.type = type;
            this.tire1Pressure = tire1Pressure;
            this.tire1age = tire1age;
            this.tire2Pressure = tire2Pressure;
            this.tire2age = tire2age;
            this.tire3Pressure = tire3Pressure;
            this.tire3age = tire3age;
            this.tir4Pressure = tir4Pressure;
            this.tire4age = tire4age;
        }




    }

    // Input:
    //2
    //ChevroletAstro 200 180 1000 fragile 1.3 1 1.5 2 1.4 2 1.7 4
    //Citroen2CV 190 165 1200 fragile 0.9 3 0.85 2 0.95 2 1.1 1
    //fragile
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Car> listOfCars= new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String input=scanner.nextLine();
            String [] tokens= input.split(" ");

            String model= tokens[0];
            int speed= Integer.parseInt(tokens[1]);
            int power= Integer.parseInt(tokens[2]);
            int weight= Integer.parseInt(tokens[3]);
            String type= tokens[4];
            double tire1Pressure=Double.parseDouble(tokens[5]);
            int tire1age= Integer.parseInt(tokens[6]);
            double tire2Pressure=Double.parseDouble(tokens[7]);
            int tire2age= Integer.parseInt(tokens[8]);
            double tire3Pressure=Double.parseDouble(tokens[9]);
            int tire3age= Integer.parseInt(tokens[10]);
            double tir4ePressure=Double.parseDouble(tokens[11]);
            int tire4age= Integer.parseInt(tokens[12]);

            Car currentCar = new Car(model,speed, power, weight, type, tire1Pressure, tire1age, tire2Pressure,tire2age, tire3Pressure, tire3age, tir4ePressure, tire4age);
            listOfCars.add(currentCar);
        }
        // After the N lines you will receive a single line with one of 2 commands "fragile" or "flamable"
        String command= scanner.nextLine();

        //if the command is "fragile" print all cars whose Cargo Type is "fragile" with a
        // tire whose pressure is  < 1
        if(command.equals("fragile")){
            for(Car car : listOfCars){
                boolean isPressureUnder1= pressureUnder1(car.getTire1Pressure(), car.getTire2Pressure(), car.getTire3Pressure(), car.getTir4Pressure());
                if(car.getType().equals("fragile") && isPressureUnder1){
                    System.out.println(car.getModel());
                }

            }

        }

        //if the command is "flamable" print all cars whose Cargo Type is "flamable" and have Engine Power > 250.
        else if (command.equals("flamable")){
            for(Car car : listOfCars){
                boolean isEnginePowerOver250= EnginePowerOver250(car.getPower());
                if(car.getType().equals("flamable") && isEnginePowerOver250){
                    System.out.println(car.getModel());
                }

            }


        }



    }

    private static boolean EnginePowerOver250(int power) {
        if (power>250){
            return true;
        }
        return false;
    }

    private static boolean pressureUnder1(double tire1Pressure, double tire2Pressure, double tire3Pressure, double tire4Pressure) {
        if((tire1Pressure + tire2Pressure + tire3Pressure + tire4Pressure)/4<1 ){
            return true;
        }
        return false;
    }
}
