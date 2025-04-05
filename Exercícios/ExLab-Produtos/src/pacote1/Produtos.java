//Gabriel Rodrigues da Silva
package pacote1;

/*
1 - Criar uma classe Produto, que mantém o estoque de produtos de uma loja, sendo 
que cada produto tem as seguintes características: código, nome do produto, 
quantidade, tipo, valor do produto.
*/

public class Produtos {
    int codigo;
    String nomeProduto;
    int quantidade;
    String tipo;
    double valorProduto;
    
    //4 Construtores diferentes
        
        //Apenas o código
        Produtos(int codigo)
        {
            this.codigo = codigo;
        }
        //
        
        //Código e nome do produto
        Produtos(int codigo, String nomeProduto)
        {
            this.codigo = codigo;
            this.nomeProduto = nomeProduto;
        }
        //
        
        //Código, nome do produto e quantidade
        Produtos(int codigo, String nomeProduto, int quantidade)
        {
            this.codigo = codigo;
            this.nomeProduto = nomeProduto;
            this.quantidade = quantidade;
        }
        //
        
        //Com todos os campos
        Produtos(int codigo, String nomeProduto, int quantidade, String tipo, double valorProduto)
        {
            this.codigo = codigo;
            this.nomeProduto = nomeProduto;
            this.quantidade = quantidade;
            this.tipo = tipo;
            this.valorProduto = valorProduto;
        }
        //
    //  
        
    //Operações da classe:
    void vender(int quantidadeVendida)
    {
        if(quantidadeVendida > this.quantidade)
            System.out.println("Não há estoque suficiente para  venda.");
        else
        {
            System.out.printf("Valor total da venda: %.2f",
                    quantidadeVendida * this.valorProduto);
            
            this.quantidade -= quantidadeVendida;
        }
    }
    
    void comprar(int quantidadeComprada, double novoValorProduto) //Com alteração de valor
    {
        this.quantidade += quantidadeComprada;
        this.valorProduto = novoValorProduto;
    }
    
    void comprar(int quantidadeComprada) //Sem alteração de valor
    {
        this.quantidade += quantidadeComprada;
    }
    
    public String toString()
    {
     return "Contato{" +
                "Codigo='" + codigo + '\'' +
                ", Nome='" + nomeProduto + '\'' +
                ", Quantidade='" + quantidade + '\'' +
                ", Tipo='" + tipo + '\'' +
                ", Valor='" + valorProduto + '\'' +
                '}';    
    }
    
    void inserir(String nomeProduto, int quantidade, String tipo, double valorProduto)
    {
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valorProduto = valorProduto;
    }
    
    
    boolean igual(Produtos produto)
    {
        boolean a = this.nomeProduto.equals(produto.nomeProduto);
        boolean b = this.tipo.equals(produto.tipo);
        
        if (a && b)
            return true;
        else
            return false;
       
        
    }
    //
}       


