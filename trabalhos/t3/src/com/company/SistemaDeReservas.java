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

        ReservaThread thread2 = new ReservaThread("SECOMP", ats);
        System.out.println(thread2);

        // Executa as Threads
        new Thread(thread1).start();
        new Thread(thread2).start();
    }
}
