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
public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String datadeentrada;
    private String rg;
    private boolean ativo;
    
    void mostra(){
        System.out.println("Nome:"+ this.nome);
         System.out.println("Departamento: " + this.departamento);
        System.out.println("Salário: " + this.salario);
        System.out.println("Data de Entrada: " + this.datadeentrada);
        System.out.println("RG: " + this.rg);
        System.out.println("Status: " + (this.ativo ? "Ativo" : "Inativo"));
    }
     public Funcionario() {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.datadeentrada = datadeentrada;
        this.rg = rg;
        this.ativo = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDatadeentrada() {
        return datadeentrada;
    }

    public void setDatadeentrada(String datadeentrada) {
        this.datadeentrada = datadeentrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
     public void bonifica(double aumento) {
        if (ativo) {
            this.salario += aumento;
            System.out.println("Bonificação aplicada. Novo salário: " + this.salario);   
        } else {
            System.out.println("Funcionário não está ativo. Bonificação não aplicada.");
        
        }
    }


    public void demite(boolean ativo) {
       if(this.ativo = false){
        System.out.println("Funcionário não trabalha mais aqui");
    }else{
            System.out.println("Funcionario ativo");
            }

    }
    
}
