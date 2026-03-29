package pkg;

public class Termometro {
    private double celsius;

    public Termometro(double celsius) {
        this.celsius = celsius;
        System.out.println("A temperatura em Celsisus é: " + this.celsius + "°C");
    }
    
    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        return (celsius * 1.8) + 32;
    }

    public void setFahrenheit(double f) {
        this.celsius = (f - 32) / 1.8;
        System.out.println("A temperatura em Celsisus é: " + this.celsius + "°C");
    }
}
