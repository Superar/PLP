package com.company;

import java.util.Random;

public class ReservaThread implements Runnable
{
    private String pontoDeAcesso;
    private AulasTeoricas salas;
    private Random randomGenerator;
    private int numeroDeOperacoes;

    // Construtor
    ReservaThread(String nome, AulasTeoricas ats)
    {
        pontoDeAcesso = nome;

        // Cada Thread possui um numero aleatorio de ate 10 operacoes
        randomGenerator = new Random();
        numeroDeOperacoes = randomGenerator.nextInt(9) + 1;

        // Dado compartilhado
        salas = ats;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < numeroDeOperacoes; i++)
        {
            try
            {
                // Numero de lugares requeridos e presenca de Projetor sao gerados aleatoriamente
                int numeroDeLugares = randomGenerator.nextInt(80);
                boolean precisaDeProjetor = randomGenerator.nextBoolean();

                // Deve existir pelo menos uma sala que comporte os requisitos da reserva
                // Caso contrario a Thread ficara presa na chamada wait(), pois nao havera em momento algum uma sala para ela
                while (!salas.existeSalaQueComporta(precisaDeProjetor, numeroDeLugares))
                {
                    numeroDeLugares = randomGenerator.nextInt(80);
                    precisaDeProjetor = randomGenerator.nextBoolean();
                }

                // Realiza a reserva da sala
                int salaId = salas.reservar(pontoDeAcesso, precisaDeProjetor, numeroDeLugares);
                // Espera ate 1 segundo para liberar a sala
                Thread.sleep((int) (Math.random() * 1000));
                // Libera a sala
                salas.liberar(salaId);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    // Metodo toString() para facilitar impressoes na tela
    @Override
    public String toString()
    {
        return "Thread de " + pontoDeAcesso + "; " +
                numeroDeOperacoes + " operacoes" + "\n";
    }
}
