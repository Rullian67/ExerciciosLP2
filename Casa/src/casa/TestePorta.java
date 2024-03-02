/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

/**
 *
 * @author rulli
 */
public class TestePorta {

    public static void main(String[] args) {

        Porta minhaPorta = new Porta();

        minhaPorta.abre();
        minhaPorta.pinta("Azul");
        minhaPorta.alteraDimensoes(0.9, 2.1, 0.15);
        minhaPorta.mostraInformacoes();

        minhaPorta.fecha();
        minhaPorta.pinta("Vermelho");
        minhaPorta.mostraInformacoes();
    }
}

