package org.example.services;

public interface AparelhoTelefonico {
    void fazerChamada(String numero);
    void receberChamada(String numero);
    void encerrarChamada();
    void enviarMensagem(String numero, String mensagem);
    void receberMensagem(String numero, String mensagem);
}

