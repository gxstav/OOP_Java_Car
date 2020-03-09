package Vehicle;

import Person.Person;

public class Vehicle {
    private Person driver;
    private double velocity = 0.00;
    private int[] relation = { -30, 40, 80, 120, 140, 180, 200 };
    private Object gear = new Gear(relation);

    public Vehicle(int[] gear_rel) {
        if (gear_rel != null) {
            this.relation = gear_rel;
        }
    }

    public String speed() {
        return this.velocity + "/" + ((Gear) this.gear).gearLimit() + " Kph" + " (" + gear() + ") ";
    }

    public String gear() {
        int gear = ((Gear) this.gear).showGear();
        String result;
        switch (gear) {
            case -1:
                result = "Reverse gear";
                break;
            case 0:
                result = "Neutral gear";
                break;
            case 1:
                result = gear + "st gear";
                break;
            case 2:
                result = gear + "nd gear";
                break;
            case 3:
                result = gear + "rd gear";
                break;
            default:
                result = gear + "th gear";
                break;
        }
        return result;
    }

    public void increaseUntil(double val) {
        while (this.velocity < (double) val) {
            accelerate();
        }
    }

    public void decreaseUntil(double val) {
        while (this.velocity > (double) val) {
            decelerate();
        }
    }

    public void accelerate() {
        if (this.velocity >= ((Gear) this.gear).gearLimit()) {
            this.gearUp();
        } else if (this.velocity < ((Gear) this.gear).gearLimit()) {
            this.velocity++;
        }
    }

    public void decelerate() {
        if (this.velocity <= 0 && ((Gear) this.gear).showGear() > 0) {
            this.accelerate();
        }
        this.velocity--;
    }

    public void gearUp() {
        ((Gear) this.gear).gearUp();
    }

    public void gearDown() {
        ((Gear) this.gear).gearDown();
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }

    public Person driver() {
        return this.driver;
    }
}
