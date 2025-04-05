//Gabriel Rodrigues da Silva
package pacote2;

/*
2 – Em outro projeto ou pacote, alterar as duas classes criadas para que o 
código do produto não seja informado e sim criado de forma automática utilizando
o conceito de variáveis/atributos de classe. 
*/
public class Produtos {
    private static int codigo = 000;
    //Como a variável de classe altera o código de todos os produtos, é preciso
    //salvar o código de cada instância para todas não fiquem com o mesmo código,
    //então eu criei a variável 'codigoProduto', que vai realizar esse papel.
    private int codigoProduto;
    String nomeProduto;
    int quantidade;
    String tipo;
    double valorProduto;
    
    //4 Construtores diferentes
        
        //Apenas o código
        Produtos()
        {
            Produtos.codigo++;
            this.codigoProduto = Produtos.codigo;
        }
        //
        
        //Código e nome do produto
        Produtos(String nomeProduto)
        {
            Produtos.codigo++;
            this.codigoProduto = Produtos.codigo;
            this.nomeProduto = nomeProduto;
        }
        //
        
        //Código, nome do produto e quantidade
        Produtos(String nomeProduto, int quantidade)
        {
            Produtos.codigo++;
            this.codigoProduto = Produtos.codigo;
            this.nomeProduto = nomeProduto;
            this.quantidade = quantidade;
        }
        //
        
        //Com todos os campos
        Produtos(String nomeProduto, int quantidade, String tipo, double valorProduto)
        {
            Produtos.codigo++;
            this.codigoProduto = Produtos.codigo;
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


