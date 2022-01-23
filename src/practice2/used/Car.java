package practice2.used;

public class Car {
    private String carModel;

    public Car(String carModel) {
        this.carModel = carModel;
    }

    class Engine {
        private boolean isWorking = false;
        private int horsepower;

        public Engine(int horsepower) {
            this.horsepower = horsepower;
        }

        public String startStopEngine() {
            if (!isWorking) {
                this.isWorking = true;
                return "engine was started";
            } else {
                this.isWorking = false;
               return "engine was stopped";
            }
        }
    }
}
