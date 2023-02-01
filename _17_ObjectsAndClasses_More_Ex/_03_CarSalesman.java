package _17_ObjectsAndClasses_More_Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_CarSalesman {
    // Define two classes Car and Engine. A Car has a model, engine, weight and color.
    //A Car’s weight and color and its Engine’s displacements and efficiency are optional.

    static class Car {
        String model;
        String engine;
        int weight;
        String color;

        public String getModel() {
            return model;
        }

        public String getEngine() {
            return engine;
        }

        public int getWeight() {
            return weight;
        }

        public String getColor() {
            return color;
        }




        public Car(String model, String engine) {
            this.model = model;
            this.engine = engine;
        }

        public void setWeightAndColor(String[] tokensCar, List<Car> listOfCars) {
            if (tokensCar.length == 4) {
                this.weight = Integer.parseInt(tokensCar[2]);
                this.color = tokensCar[3];
            } else if (tokensCar.length == 3) {
                if (tokensCar[2].getClass().equals(String.class)) {
                    this.color = tokensCar[2];
                } else if (tokensCar[2].getClass().equals(Integer.class))
                    this.weight = Integer.parseInt(tokensCar[2]);

            }
        }

    }

    // An Engine has model, power, displacement and efficiency.
    static class Engine {
        String model;
        int power;
        int displacement;
        String efficiency;


        public String getModel() {
            return model;
        }

        public int getPower() {
            return power;
        }

        public int getDisplacement() {
            return displacement;
        }

        public String getEfficiency() {
            return efficiency;
        }


        public Engine(String model, int power) {
            this.model = model;
            this.power = power;
        }


        public void setDisplacementAndEfficiency(String[] tokensEngine, List<Engine> listOfEngines) {
            if (tokensEngine.length == 4) {
                this.displacement = Integer.parseInt(tokensEngine[2]);
                this.efficiency = tokensEngine[3];
            } else if (tokensEngine.length == 3) {
                if (Character.isDigit(tokensEngine[2].charAt(0))) {
                    this.displacement = Integer.parseInt(tokensEngine[2]);

                } else {
                    this.efficiency = tokensEngine[2];
                }


            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        // on each of the next N lines you will receive information about an Engine in the following format
        // "<Model> <Power> <Displacement> <Efficiency>"

        List<Engine> listOfEngines = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String inputEngine = scanner.nextLine();
            String[] tokensEngine = inputEngine.split(" ");
            String model = tokensEngine[0];
            int power = Integer.parseInt(tokensEngine[1]);
            Engine currentEngine = new Engine(model, power);
            currentEngine.setDisplacementAndEfficiency(tokensEngine, listOfEngines);
            listOfEngines.add(currentEngine);

        }

        int m = Integer.parseInt(scanner.nextLine());
        // M – specifying the number of Cars that will follow, on each of the next M lines information about a
        // Car will follow in the following format "<Model> <Engine> <Weight> <Color>", where the engine in the
        // format will be the model of an existing Engine.

        List<Car> listOfCars = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String inputCar = scanner.nextLine();
            String[] tokensCar = inputCar.split(" ");
            String model = tokensCar[0];
            String engine = tokensCar[1]; // the engine in the format will be the model of an existing Engine.
            Car currentCar = new Car(model, engine);
            currentCar.setWeightAndColor(tokensCar, listOfCars);
            listOfCars.add(currentCar);
        }
        for(Car currentCar: listOfCars){
            for(Engine currentEngine: listOfEngines){
            if(currentCar.getEngine().equals(currentEngine.getModel())){
                System.out.printf("%s:%n  %s:%n    Power: %d%n", currentCar.getModel(), currentCar.getEngine(), currentEngine.getPower());
                if (currentEngine.getDisplacement()==0){
                    System.out.println("    Displacement: n/a");
                }
                else if(currentEngine.getDisplacement()!=0){
                    System.out.printf("    Displacement: %d%n", currentEngine.getDisplacement());
                }
                if (currentEngine.getEfficiency()==null){
                    System.out.println("    Efficiency: n/a");
                }
                else if(currentEngine.getEfficiency()!=null){
                    System.out.printf("    Efficiency: %s%n", currentEngine.getEfficiency());
                }
                if (currentCar.getWeight()==0){
                    System.out.println("  Weight: n/a");
                }
                else if(currentCar.getWeight()!=0){
                    System.out.printf("  Weight: %d%n", currentCar.getWeight());
                }
                if (currentCar.getColor()==null){
                    System.out.println("  Color: n/a");
                }
                else if(currentCar.getColor()!=null){
                    System.out.printf("  Color: %s%n", currentCar.getColor());
                }


            }
        }
        }

    }
}
