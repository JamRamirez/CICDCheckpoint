package org.example;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Jam Ramirez CI/CD Checkpoint");
    }

    public double add (double a, double b){
        return a + b;
    }

    public double substraction (double a, double b){
        return  a - b;
    }

    public double multiplication (double a, double b){
        return a * b;
    }

    public double division(double a, double b){
        if (b != 0){
            return  a / b;
        }
        return -1;
    }
}
