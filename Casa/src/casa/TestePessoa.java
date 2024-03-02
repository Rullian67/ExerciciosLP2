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
public class TestePessoa {
    
    public static void main(String[] args) {
       
       Pessoa pes = new Pessoa();
       
       pes.setNome("Rullian");
       pes.setIdade(22);
       
        pes.fazAniversario();
        pes.fazAniversario();
        pes.mostraInformacoes();
    }
}