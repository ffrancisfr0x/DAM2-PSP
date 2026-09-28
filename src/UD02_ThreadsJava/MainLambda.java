package UD02_ThreadsJava;

public class MainLambda {

    public static void main(String[] args) {

        Thread hilo = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {
                System.out.println("Lambda: " + i);
            }

        });

        hilo.start();

        System.out.println("Main terminado");
    }
}