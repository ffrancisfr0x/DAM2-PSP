package UD02_ThreadsJava;

class MiTarea implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable: " + i);
        }
    }
}

public class MainRunnable {

    public static void main(String[] args) {

        MiTarea tarea = new MiTarea();

        Thread hilo = new Thread(tarea);

        hilo.start();

        System.out.println("Main terminado");
    }
}