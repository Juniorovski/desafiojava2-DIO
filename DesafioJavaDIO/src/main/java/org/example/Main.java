package org.example;

import org.example.controller.iPhone;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private iPhone iphone;
    public static void main(String[] args) {
        iPhone iphone =new iPhone();
        System.out.println("*************INICIANDO FUNCÃO NAVEGAR NA INTERNET************");
        iphone.abrirURL("www.google.com");
        iphone.navegarAdiante();
        iphone.navegarAtras();
        iphone.fecharNavegador();
        System.out.println("************************************************************");


        System.out.println("*************INICIANDO FUNCÃO TELEFONICA************");
        iphone.enviarMensagem("81917161","Olá meu chapa!");
        iphone.receberMensagem("92827262","Olá, amigo!");
        iphone.fazerChamada("92827262");
        iphone.receberChamada("81917161");
        iphone.encerrarChamada();
        System.out.println("************************************************************");

        System.out.println("*************INICIANDO FUNCÃO REPRODUTOR MUSICAL************");
        iphone.reproduzirMusica();
        iphone.avancarFaixa();
        iphone.retrocederFaixa();
        iphone.pausarMusica();
    }
}