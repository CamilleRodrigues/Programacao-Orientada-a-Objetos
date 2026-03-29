package pkg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a temperatura inicial (em Celsius): ");
        double temperatura = teclado.nextDouble();
        
        Termometro termometro = new Termometro(temperatura);
        
        System.out.println("A temperatura em Fahrenheit é: " + termometro.getFahrenheit() + "°F");
        
        System.out.print("\nDigite uma nova temperatura, em Fahrenheit, para converter para Celsius: ");
        double novaTemperatura = teclado.nextDouble();
        termometro.setFahrenheit(novaTemperatura);
        
        System.out.println("Agora o termômetro marca: " + termometro.getCelsius() + "°C");
        
        teclado.close();
    }
}
