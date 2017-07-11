package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class AulasTeoricas
{
    private List<Sala> salas;

    // Construtor
    // Gera 10 salas com capacidade de ate 100 lugares e projetores aleatoriamente
    AulasTeoricas()
    {
        salas = new ArrayList<>();

        Random randomGenerator = new Random();

        for (int i = 0; i < 10; i++)
        {
            salas.add(new Sala(i, randomGenerator.nextInt(100), randomGenerator.nextBoolean()));
        }
    }

    // Verifica se existe pelo menos uma sala que atenda aos requisitos
    // Nao importa se a sala esta reservada ou nao
    boolean existeSalaQueComporta(boolean requerProjetor, int requerTamanho)
    {
        for (Sala sala : salas)
        {
            if ((sala.getProjetor() == requerProjetor) && (sala.getTamanho() >= requerTamanho))
            {
                return true;
            }
        }

        return false;
    }

    // Verifica se existe uma sala livre que atenda aos requisitos para ser reservada
    // Retorna a sala a ser reservada
    private Sala existeSalaAdequada(boolean requerProjetor, int requerTamanho)
    {
        for (Sala sala : salas)
        {
            if (!sala.isOcupada() && (sala.getProjetor() == requerProjetor) && (sala.getTamanho() >= requerTamanho))
            {
                return sala;
            }
        }

        return null;
    }

    // Reserva uma sala para pontoDeAcesso de acordo com os requisitos
    // Utiliza o metodo existeSalaAdequada para procurar a sala a ser reservada
    synchronized int reservar(String pontoDeAcesso, boolean requerProjetor, int requerTamanho) throws InterruptedException
    {
        Sala sala = existeSalaAdequada(requerProjetor, requerTamanho);

        // Enquanto nao houver sala para ser reservada, a Thread espera
        while (sala == null)
        {
            System.out.println("Nao foi possivel reservar uma sala para " + pontoDeAcesso);
            wait();
            sala = existeSalaAdequada(requerProjetor, requerTamanho);
        }
        // Existe uma sala que pode ser reservada

        // Realiza a reserva
        sala.reserva(pontoDeAcesso);
        System.out.println("Sala " + sala.getIdentificador() + " reservada para " + pontoDeAcesso);
        notify();
        return sala.getIdentificador();
    }

    // Libera a sala de identificador id
    // Percorre a lista de salas e busca pelo identificador
    // Nao verifica se a sala esta de fato reservada, pois se nao estiver o estado continua o mesmo
    synchronized void liberar(int id)
    {
        for (Sala sala : salas)
        {
            if (sala.getIdentificador() == id)
            {
                sala.libera();
                System.out.println("Sala " + sala.getIdentificador() + " liberada");
                notify();
                return;
            }
        }

        System.out.println("Nao foi possivel encontrar a sala " + id);
    }

    // Metodo toString() para facilitar impressoes na tela
    @Override
    public String toString()
    {
        StringBuilder retorno = new StringBuilder();

        for (Sala sala : salas)
        {
            retorno.append(sala).append("\n");
        }

        return retorno.toString();
    }
}
