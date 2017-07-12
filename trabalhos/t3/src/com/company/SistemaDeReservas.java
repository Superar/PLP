package com.company;

public class SistemaDeReservas
{

    public static void main(String[] args) throws InterruptedException
    {
        // Cria e imprime as salas criadas
        AulasTeoricas ats = new AulasTeoricas();
        System.out.println("Salas criadas");
        System.out.println(ats);

        // Cria e imprime as Threads
        ReservaThread thread1 = new ReservaThread("Nicanor", ats);
        System.out.println(thread1);

        ReservaThread thread2 = new ReservaThread("Vania", ats);
        System.out.println(thread2);

        ReservaThread thread3 = new ReservaThread("Heloisa", ats);
        System.out.println(thread3);

        ReservaThread thread4 = new ReservaThread("Valter", ats);
        System.out.println(thread1);

        ReservaThread thread5 = new ReservaThread("Helena", ats);
        System.out.println(thread2);

        ReservaThread thread6 = new ReservaThread("Helio", ats);
        System.out.println(thread3);

        // Executa as Threads
        new Thread(thread1).start();
        new Thread(thread2).start();
        new Thread(thread3).start();
        new Thread(thread4).start();
        new Thread(thread5).start();
        new Thread(thread6).start();
    }
}
