package miniGeneral;

public class Tank {

    int x, y, dir;
    int fuel;

    public Tank() {
        this.x = 0;
        this.y = 0;
        this.fuel = 100;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
        this.fuel = 100;
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
    }

    void printPosition() {
        System.out.println("The Tank is at " + x +", " + y + " now.");
    }

    void turnLeft() {
        dir--;
        if (dir == -1) {
            dir = 3;
        }
    }
    void turnRight() {
        dir++;
        if (dir == 4) {
            dir = 0;
        }
    }
    void goForward(int i) {
            if (fuel < i){
                i = fuel;
            }
            fuel = fuel - i;
            if (dir == 0) {
                if (fuel > i) {
                    x = x + i;
                } else {
                    x = x + fuel;
                }
                fuel = fuel - i;
            } else if (dir == 1) {
                if (fuel > i) {
                    y = y + i;
                    fuel = fuel - y;
                } else if (fuel < i) {
                    y = y + fuel;
                    fuel = fuel - i;
                }
            } else if (dir == 2) {
                if (fuel > i) {
                    x = x - i;
                    fuel = fuel - i;
                } else if (fuel < i) {
                    x = x - fuel;
                    fuel = fuel - i;
                }
            } else {
                if (fuel > i) {
                    y = y - i;
                    fuel = fuel - y;
                } else if (fuel < i) {
                    y = y - fuel;
                    fuel = fuel - i;
                }
            }

    }
    void goBackward(int i) {
        goForward(-i);
    }


}

