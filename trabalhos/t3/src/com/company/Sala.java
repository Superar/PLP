package com.company;

public class Sala
{
    private int identificador;
    private int tamanho;
    private boolean projetor;
    private String reserva;
    private boolean ocupada;

    // Construtor
    Sala(int id, int tam, boolean proj)
    {
        identificador = id;
        tamanho = tam;
        projetor = proj;
        reserva = null;
        ocupada = false;
    }

    boolean isOcupada()
    {
        return ocupada;
    }

    boolean getProjetor()
    {
        return projetor;
    }

    int getTamanho()
    {
        return tamanho;
    }

    int getIdentificador()
    {
        return identificador;
    }

    void reserva(String pontoDeAcesso)
    {
        if (!ocupada)
        {
            reserva = pontoDeAcesso;
            ocupada = true;
        }
    }

    void libera()
    {
        if (ocupada)
        {
            reserva = null;
            ocupada = false;
        }
    }

    // Metodo toString() para facilitar impressoes na tela
    @Override
    public String toString()
    {
        return "Sala: " + identificador + "; " +
                "Tamanho: " + tamanho;
    }
}
