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

public class Casa {
    private String cor;
    private Porta porta1;
    private Porta porta2;
    private Porta porta3;

    // Construtor
    public Casa(String cor) {
        this.cor = cor;
        this.porta1 = new Porta();
        this.porta2 = new Porta();
        this.porta3 = new Porta();
    }

    // Métodos
    public void pinta(String s) {
        this.cor = s;
    }

    public void abrePorta(int numero) {
        switch (numero) {
            case 1:
                porta1.abre();
                break;
            case 2:
                porta2.abre();
                break;
            case 3:
                porta3.abre();
                break;
            default:
                System.out.println("Porta inválida!");
        }
    }

    public void fechaPorta(int numero) {
        switch (numero) {
            case 1:
                porta1.fecha();
                break;
            case 2:
                porta2.fecha();
                break;
            case 3:
                porta3.fecha();
                break;
            default:
                System.out.println("Porta inválida!");
        }
    }

    public int quantasPortasEstaoAbertas() {
        int cont = 0;
        if (porta1.estaAberta()) cont++;
        if (porta2.estaAberta()) cont++;
        if (porta3.estaAberta()) cont++;
        return cont;
    }

    public void mostraInformacoes() {
        System.out.println("Cor da casa: " + cor);
        System.out.println("Número de portas abertas: " + quantasPortasEstaoAbertas());
        System.out.println("Cor da Porta 1: " + porta1.getCor());
        System.out.println("Cor da Porta 2: " + porta2.getCor());
        System.out.println("Cor da Porta 3: " + porta3.getCor());
    }
}

