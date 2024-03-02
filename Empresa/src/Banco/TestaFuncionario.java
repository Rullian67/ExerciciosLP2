/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author rulli
 */
public class TestaFuncionario {
    
       public static void main(String[] args) {
           
        Funcionario f1 = new Funcionario();
        
        
        f1.setNome("Rullian");
        f1.setSalario(1000);
        f1.bonifica(100);
        f1.demite(true);
        f1.setRg("1723456");
        f1.setDatadeentrada("11/02/2024");
        f1.setDepartamento("Auxiar de produçao");
        
         f1.mostra();
         
           //System.out.println("Digite seu nome: "+ f1.getNome());
           //System.out.println("Seu salário: "+ f1.getSalario());
           //System.out.println("Diugite seu rg: "+ f1.getRg());
           //System.out.println("Qual seu departamento: "+ f1.getDepartamento());
           //System.out.println("Sua data de entrada"+ f1.getDatadeentrada());
    }
}