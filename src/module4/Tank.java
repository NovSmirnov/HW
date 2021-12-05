package module4;

public class Tank {

    int x;
    int y;
    String towards = "forward";
    int fuel;

    public Tank() {
        this(0, 0, 100);
    }

    public Tank(int x, int y) {
        this(x, y, 100);
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;

    }


    public void goForward(int i) {
//        i = Math.abs(i);
        if (fuel >= i) {
            switch (this.towards) {
                case "forward":
                    this.x += i;
                    break;
                case "right":
                    this.y += i;
                    break;
                case "backward":
                    this.x -= i;
                    break;
                case "left":
                    this.y -= i;
                    break;
            }
            this.fuel -= i;
        } else {
            switch (this.towards) {
                case "forward":
                    this.x += this.fuel;
                    break;
                case "right":
                    this.y += this.fuel;
                    break;
                case "backward":
                    this.x -= this.fuel;
                    break;
                case "left":
                    this.y -= this.fuel;
                    break;
            }
            this.fuel = 0;

        }

    }

    public void printPosition() {
        System.out.println("The Tank is at " + x + ", " + y + " now.");
    }

    public void goBackward(int i) {
        int b = Math.abs(i);
        if (fuel >= b) {
            switch (this.towards) {
                case "forward":
                    this.x -= i;
                    break;
                case "right":
                    this.y -= i;
                    break;
                case "backward":
                    this.x += i;
                    break;
                case "left":
                    this.y += i;
                    break;
            }
            this.fuel -= i;
        } else {
            if (i < 0) {
                this.fuel = -this.fuel;
            }
            switch (this.towards) {
                case "forward":
                    this.x -= this.fuel;
                    break;
                case "right":
                    this.y -= this.fuel;
                    break;
                case "backward":
                    this.x += this.fuel;
                    break;
                case "left":
                    this.y += this.fuel;
                    break;
            }
            this.fuel = 0;
        }



    }

    public void turnRight() {
        switch (this.towards) {
            case "forward":
                this.towards = "right";
                break;
            case "right":
                this.towards = "backward";
                break;
            case "backward":
                this.towards = "left";
                break;
            case "left":
                this.towards = "forward";
                break;
        }
    }

    public void turnLeft() {
        switch (this.towards) {
            case "forward":
                this.towards = "left";
                break;
            case "left":
                this.towards = "backward";
                break;
            case "backward":
                this.towards = "right";
                break;
            case "right":
                this.towards = "forward";
                break;
        }

    }

}
