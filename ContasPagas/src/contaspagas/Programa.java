/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contaspagas;
import java.util.Set;

/**
 *
 * @author rulli
 */

public class Programa {
    public static void main(String[] args) {
       
        Produto produto1 = new Produto();
        produto1.setDescricaoProduto("Notebook");
        produto1.setValorProduto(3550.0);

        Produto produto2 = new Produto();
        produto2.setDescricaoProduto("Celular");
        produto2.setValorProduto(1075.0);

       
        Cliente cliente1 = new Cliente();
        cliente1.setNomeCliente("Rullian");
        cliente1.setCpf(334344415);

        Cliente cliente2 = new Cliente();
        cliente2.setNomeCliente("João");
        cliente2.setCpf(222222222);

       
        Conta conta1 = new Conta();
        conta1.setIdConta(1);
        conta1.setDataVencimento("01/05/2023");
        conta1.setDataPagamento("19/01/2023");
        conta1.setPro(produto1);
        conta1.setCli(cliente1);

        Conta conta2 = new Conta();
        conta2.setIdConta(2);
        conta2.setDataVencimento("03/06/2023");
        conta2.setDataPagamento("25/01/2023");
        conta2.setPro(produto2);
        conta2.setCli(cliente2);

    
        conta1.visualizarConta();
        System.out.println();
        conta2.visualizarConta();
    }
}

