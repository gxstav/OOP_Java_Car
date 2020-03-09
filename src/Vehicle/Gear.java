package Vehicle;

public class Gear {
    public int position = 0;
    public double cap = 0;
    int[] pos;

    public Gear(int[] pos) {
        this.pos = pos;
    };

    public void gearUp() {
        if (this.position == 6)
            this.position = 6;
        else if (this.position < 0)
            this.position = 0;
        else
            this.position++;

        capping(this.position);
    }

    public void gearDown() {
        if (this.position <= 0)
            this.position = -1;
        else
            this.position--;

        capping(this.position);
    }

    public int showGear() {
        return this.position;
    }

    private void capping(int gear) {
        if (gear == -1)
            this.cap = this.pos[0];
        if (gear == 1)
            this.cap = this.pos[1];
        if (this.pos.length > 2 && gear == 2)
            this.cap = this.pos[2];
        if (this.pos.length > 3 && gear == 3)
            this.cap = this.pos[3];
        if (this.pos.length > 4 && gear == 4)
            this.cap = this.pos[4];
        if (this.pos.length > 5 && gear == 5)
            this.cap = this.pos[5];
        if (this.pos.length > 6 && gear == 6)
            this.cap = this.pos[6];
        if (this.pos.length > 7 && gear == 7)
            this.cap = this.pos[7];
        else
            this.cap = 0;
    }

    public double gearLimit() {
        return this.cap;
    }
}