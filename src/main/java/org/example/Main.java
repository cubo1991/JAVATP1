package org.example;
import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void print(String message) {
        System.out.print(message);
    }
    public static void printint(Integer number) { System.out.println(number); }
    public static <T> void println(T data) { System.out.println(data); }
    public static void printfloat(float number) {
        System.out.println(number);
    }
    public static void newLine() {System.out.print('\n');}
    public static void saludar(){
        String name = "Tomas";
        println("Hola, " + name);
    }
    public static void saludarJOption() {
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        JOptionPane.showMessageDialog(null, "Hola, " + nombre + "!");
    }
    public static void saludarScanner() {
        print("Introduce tu nombre");
        newLine();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        print("Hola, " + name + "!");
    }
    public static void sumar(float a, float b) {
        printfloat(a+b);
    }
    public static void restar(float a, float b) {
        printfloat(a-b);
    }
    public static void multiplicar(float a, float b) {
        printfloat(a*b);
    }
    public static void dividir(float a, float b) {
        printfloat(a/b);
    }
    public static void modulo(float a, float b) {
        printfloat(a%b);
    }
    public static void max(float a, float b) {
        float max = Math.max(a, b);
        printfloat(max);
    }
    public static void mayorMenor(int a, int b) {
        if (a>b) {
            printint(a);
        } else if (a==b) {
            print("Ambos enteros son iguales");
        } else {
            printint(b);
        }
    }
    public static void esPar(Integer a){
        if (a == 0) {
            print("El numero es 0");
        } else if (a%2==0) {
            print("El numero " + a.toString() + " es par");
        } else {
            print("El numero " + a.toString() + " es impar");
        }
    }
    public static void calcularPrecio() {
        double IVA = 0.21;
        print("Ingresa el precio del producto");
        newLine();
        Scanner sc = new Scanner(System.in);
        String priceString = sc.nextLine();
        double price = Double.parseDouble(priceString);
        double finalPrice = price + price * IVA;
        print("El precio final es " + finalPrice + "!");
    }
    public static void deUnoACien(){
        int x = 0;
        while (x < 100) {
            x++;
            println(x);
        }
    }
    public static void deUnoACienFor(){
        for (int i = 1; i <= 100; i++) {
            println(i);
        }
    };
    public static void deUnoACienDivisiblesEntre2y3(){
        int x = 0;
        while (x < 100) {
            x++;
            if (x % 2 == 0 || x % 3 == 0) {
                println(x);
            }
        }
    }
    public static void mostrarCeroYPositivos(){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        do {
            print("Ingresa un numero: ");
            newLine();
            num = Integer.parseInt(sc.nextLine()) ;
            println(num);
        } while (num < 0);
    }
    public static void logIn(){
        Scanner sc = new Scanner(System.in);
        String password = "asd";
        println("Bienvenido a facebook");

        int tries = 3;
        do {
            println("Por favor, ingrese su contraseña");
            String pass = sc.nextLine() ;
            if (pass.equals(password)) {
                println("Acceso correcto");
                tries = 0;
            }
            tries--;
            if (tries == 0 ) {
                println("Acceso Denegado");
            }
        } while (tries > 0);
    }
    public static void diaLaboral(){
        println("Ingrese un numero del 1 al 7");
        Scanner sc = new Scanner(System.in);
        int day = Integer.parseInt(sc.nextLine());
        switch (day) {
            case 1: println("Lunes, Dia Laboral");
                break;
            case 2: println("Martes, Dia Laboral");
                break;
            case 3: println("Miercoles, Dia Laboral");
                break;
            case 4: println("Jueves, Dia Laboral");
                break;
            case 5: println("Viernes, Dia Laboral");
                break;
            case 6: println("Sábado, Dia NO Laboral");
                break;
            case 7: println("Domingo, Dia NO Laboral");
                break;
            default: println("El numero ingresado no corresponde a un dia de la semana (1 - 7)");
        }
    }
    public static void esPrimo() {
        println("Ingrese un número");
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int count = 0;
        if (a <= 1 ) {
            println("El numero " + a + " es NO primo");
        } else {
            for (int i=1; i<=a; i++) {
                if(a%i==0) {
                    count++;
//                    println("El numero " + a + " es divisible por " + i);
                }
            }
            if (count <= 2) {
                println("El numero " + a + " SI es primo ya que es divisible por " + count + " numeros" );
            } else {
                println("El numero " + a + " NO es primo ya que es divisible por " + count + " numeros");
            }
        }
    }
    public static void juego() {
        int x = new Double(Math.random() * 100).intValue();
        int num = 0;
        int count = 0;
        do {
            println("Ingrese un número entre 0 y 100.");
            Scanner sc = new Scanner(System.in);
            num = Integer.parseInt(sc.nextLine());
            count++;
            if ( x > num ) {
                println(num + " es muy bajo!");
            } else if (x < num ) {
                println(num + " es muy alto!");
            }
        } while (x != num);
        println("El numero " + num + " y " + x + " coinciden!");
        println("Cantidad de intentos: " + count);

    }
    public static void test(){
        newLine();
        println("Ingrese un número entre 1 y 14. Ingrese el numero 0 para salir");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        if (number == 0) {
            sc.close();
        } else if (number > 14 || number < 0) {
            println("Error: EL numero ingresado debe ser entre 1 y 14");
            test();
        } else {
            println("Ejercicio: " + number);
            switch (number) {
                case 1:
                    saludar();
                    test();
                case 2:
                    println("Ingrese 1 para ver JOption o 2 para ver Scanner");
                    Scanner sc2 = new Scanner(System.in);
                    int ejer2 = Integer.parseInt(sc2.nextLine());
                    if (ejer2 == 1) {
                        saludarJOption();
                        test();
                    } else if (ejer2 == 2) {
                        saludarScanner();
                        test();
                    } else {
                        test();
                    }
                    test();
                case 3:
                    println("Ingrese el primer numero");
                    Scanner sc1 = new Scanner(System.in);
                    int num1 = Integer.parseInt(sc1.nextLine());
                    println("Ingrese el segundo numero");
                    Scanner sc22 = new Scanner(System.in);
                    int num2 = Integer.parseInt(sc22.nextLine());
                    println("La suma de " + num1 + " y " + num2 + " es = ");
                    sumar(num1, num2);
                    println("La resta de " + num1 + " y " + num2 + " es = ");
                    restar(num1,num2);
                    println("La multiplicacion de " + num1 + " y " + num2 + " es = ");
                    multiplicar(num1,num2);
                    println("La division de " + num1 + " y " + num2 + " es = ");
                    dividir(num1, num2);
                    println("El modulo de " + num1 + " y " + num2 + " es = ");
                    modulo(num1,num2);
                    test();
                case 4:
                    mayorMenor(12,12);
                    test();
                case 5:
                    esPar(3);
                    test();
                case 6:
                    calcularPrecio();
                    test();
                case 7:
                    deUnoACien();
                    test();
                case 8:
                    deUnoACienFor();
                    test();
                case 9:
                    deUnoACienDivisiblesEntre2y3();
                    test();
                case 10:
                    mostrarCeroYPositivos();
                    test();
                case 11:
                    logIn();
                    test();
                case 12:
                    diaLaboral();
                    test();
                case 13:
                    esPrimo();
                    test();
                case 14:
                    juego();
                    test();
                default: test();
            }
        }
    }

    public static void main(String[] args) {
        test();
//        print("Hola Mundo");
//        saludarJOption();
//        saludarScanner();
//        sumar(2,3);
//        restar(4,7);
//        multiplicar(2,10);
//        dividir(10, 5);
//        modulo(9,2);
//        max(2,2);
//        mayorMenor(12,12);
//        esPar(0);
//        calcularPrecio();
//        deUnoACien();
//        deUnoACienFor();
//        deUnoACienDivisiblesEntre2y3();
//        mostrarCeroYPositivos();
//        logIn();
//        diaLaboral();
//        esPrimo(6);
//        juego();
    }

}