package org.example.controller;

import org.example.services.AparelhoTelefonico;
import org.example.services.NavegadorInternet;
import org.example.services.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação dos métodos da interface ReprodutorMusical
    public void reproduzirMusica() {
        System.out.println("Reproduzindo música...");
    }

    public void pausarMusica() {
        System.out.println("Pausando música...");
    }

    public void avancarFaixa() {
        System.out.println("Avançando para a próxima faixa...");
    }

    public void retrocederFaixa() {
        System.out.println("Retrocedendo para a faixa anterior...");
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero + "...");
    }

    public void receberChamada(String numero) {
        System.out.println("Recebendo chamada de " + numero + "...");
    }

    public void encerrarChamada() {
        System.out.println("Chamada encerrada...");
    }

    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
    }

    public void receberMensagem(String numero, String mensagem) {
        System.out.println("Mensagem recebida de " + numero + ": " + mensagem);
    }

    // Implementação dos métodos da interface NavegadorInternet
    public void abrirURL(String url) {
        System.out.println("Abrindo URL: " + url);
    }

    public void fecharNavegador() {
        System.out.println("Fechando navegador...");
    }

    public void navegarAtras() {
        System.out.println("Navegando para a página anterior...");
    }

    public void navegarAdiante() {
        System.out.println("Navegando para a próxima página...");
    }
}
