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

public class TesteCasa {

    public static void main(String[] args) {

        Casa minhaCasa = new Casa("");

        minhaCasa.abrePorta(1);
        minhaCasa.abrePorta(2);
        minhaCasa.fechaPorta(3);

        minhaCasa.pinta("Verde");

        minhaCasa.mostraInformacoes();
    }
}

