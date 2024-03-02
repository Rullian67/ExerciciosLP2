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
public class Porta {
    
    private boolean aberta;
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;

    // Construtor
    public Porta() {
        this.aberta = false; 
        this.cor = "Branca"; 
        this.dimensaoX = 1.0; 
        this.dimensaoY = 2.0;
        this.dimensaoZ = 0.1;
    }

    // Métodos
    public void abre() {
        this.aberta = true;
    }

    public void fecha() {
        this.aberta = false;
    }

    public void pinta(String s) {
        this.cor = s;
    }

    public boolean estaAberta() {
        return this.aberta;
    }

     public String getCor() {
        return this.cor;
    }
     
    public void alteraDimensoes(double x, double y, double z) {
        this.dimensaoX = x;
        this.dimensaoY = y;
        this.dimensaoZ = z;
    }

    public void mostraInformacoes() {
        System.out.println("Cor: " + cor);
        System.out.println("Dimensões: " + dimensaoX + " x " + dimensaoY + " x " + dimensaoZ);
        System.out.println("Está aberta? " + estaAberta());
    }
}
