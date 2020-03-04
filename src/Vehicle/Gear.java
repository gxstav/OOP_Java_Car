package Vehicle;

public class Gear {
    public int position = 0;
    public double cap = 0;

    public void gearUp() {
        if (this.position == 6) this.position = 6;
        else if (this.position < 0) this.position = 0;
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

    private void capping(int pos) {
        switch (pos) {
            case -1:
                this.cap = -30;
                break;
            
            case 1:
                this.cap = 42;
                break;

            case 2:
                this.cap = 59;
                break;

            case 3:
                this.cap = 73;
                break;
            
            case 4:
                this.cap = 95;
                break;

            case 5:
                this.cap = 121;
                break;
            
            case 6:
                this.cap = 144;
                break;

            default:
                this.cap = 0;
                break;
        }
    }

    public double gearLimit() {
        return this.cap;
    }
}