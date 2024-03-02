/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contaspagas;

/**
 *
 * @author rulli
 */
public class Conta {
    
    private int idConta;
    private String dataVencimento;
    private String dataPagamento;
    private Produto pro;
    private Cliente cli;

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Produto getPro() {
        return pro;
    }

    public void setPro(Produto pro) {
        this.pro = pro;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }
    
     public void visualizarConta() {
        System.out.println("Identificador da Conta: " + idConta);
        System.out.println("Nome do Produto: " + pro.getDescricaoProduto());
        System.out.println("Nome do Cliente: " + cli.getNomeCliente());
        System.out.println("CPF do Cliente: " + cli.getCpf());
        System.out.println("Valor do Produto: " + pro.getValorProduto());
        System.out.println("Data do Vencimento: " + dataVencimento);
        System.out.println("Data do Pagamento: " + dataPagamento);
    }
}
