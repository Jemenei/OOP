package Problem3;

public class Temperature {
    private double temp;
    private char scale;

    public Temperature() {
        this.temp = 0;
        this.scale = 'C';
    }

    public Temperature(double temp) {
        this.temp = temp;
        this.scale = 'C';
    }

    public Temperature(double temp, char scale) {
        this.temp = temp;
        this.scale = scale;
    }

    public Temperature(char scale) {
        this.temp = 0;
        this.scale = scale;
    }

    public double getCelsius() {
        if (scale == 'C') {
            return (temp - 32) * (5/9);
        } else {
            return temp;
        }
    }

    public double getFahrenheit() {
        if (scale == 'F') {
            return (temp) * (5 / 9) + 32;
        }
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setTempAndScale(double temp, char scale) {
        this.temp = temp;
        this.scale = scale;
    }

    public char getScale() {
        return this.scale;
    }
}
