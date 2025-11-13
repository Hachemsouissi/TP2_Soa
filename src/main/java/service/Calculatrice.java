package service;

import jakarta.jws.WebService;

@WebService(endpointInterface = "service.ICalculatrice")
public class Calculatrice implements ICalculatrice {

    @Override
    public double somme(double a, double b) {
        System.out.println("Appel de la méthode somme avec " + a + " et " + b);
        return a + b;
    }

    @Override
    public double soustraction(double a, double b) {
        System.out.println("Appel de la méthode soustraction avec " + a + " et " + b);
        return a - b;
    }

    @Override
    public double multiplication(double a, double b) {
        System.out.println("Appel de la méthode multiplication avec " + a + " et " + b);
        return a * b;
    }

    @Override
    public double division(double a, double b) {
        System.out.println("Appel de la méthode division avec " + a + " et " + b);
        if (b == 0) {
            throw new IllegalArgumentException("Le diviseur ne peut pas être zéro !");
        }
        return a / b;
    }
}