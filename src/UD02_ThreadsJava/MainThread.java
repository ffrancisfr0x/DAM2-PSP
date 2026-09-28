package UD02_ThreadsJava;

class MiHilo extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
        }
    }
}

public class MainThread {

    public static void main(String[] args) {
        MiHilo hilo = new MiHilo();
        hilo.start();

        System.out.println("Main terminado");
    }
}