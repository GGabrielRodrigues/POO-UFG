//Gabriel Rodrigues da Silva
package pacote1;

public class TestaClasse {
    public static void main(String[] args) {
        //Criação dos objetos
        Produtos produtoUm = new Produtos(001); //Obj com o primeiro construtor
        Produtos produtoDois = new Produtos(002, "Tomate"); //Obj com o segundo construtor
        Produtos produtoTres = new Produtos(003,"Jilo", 5); //Obj com o terceiro construtor
        Produtos produtoQuatro = new Produtos(004, "Jurubeba", 12, "Alimento", 13.98); //Obj com o quarto construtor
        //
        
        //Impressão dos dados do objeto em seu estado inicial
        System.out.printf("--------------------------\nObjetos no seu estado inicial:\n");
        System.out.println(produtoUm);
        System.out.println(produtoDois);
        System.out.println(produtoTres);
        System.out.println(produtoQuatro);
        System.out.println("--------------------------");
        //
        
        System.out.println("");
        
        //Aplicação dos métodos
            //produtoUm (primeiro construtor)
                //Adicionando os dados faltantes do objeto 1 com inserir() e mostrando o resultado
                produtoUm.inserir("Abobrinha", 4, "Alimento", 6.99); //Uso da função "inserir()"
                System.out.println("--------------------------");
                System.out.println("produtoUm + 'inserir()':");
                System.out.println(produtoUm);
                System.out.println("--------------------------");
                //                
                System.out.println("");               
                //vender()
                System.out.println("--------------------------");
                System.out.println("produtoUm + 'vender(2)':");
                produtoUm.vender(2); //vendi duas abobrinhas
                System.out.printf("\nQuantidade pos-venda: %d", produtoUm.quantidade);
                System.out.println("\n--------------------------");
                //               
                System.out.println("");               
                //comprar()
                System.out.println("--------------------------");
                System.out.println("produtoUm + 'comprar(5)':");
                produtoUm.comprar(5); //comprei cinco abobrinhas
                System.out.printf("Quantidade pos-compra: %d", produtoUm.quantidade);
                System.out.println("\n--------------------------");
                //                
                System.out.println("");            
                //igual()
                System.out.println("--------------------------");
                System.out.println("produtoUm + 'igual(produtoDois)':");
                 if (produtoUm.igual(produtoDois)) //comparando com produtoDois
                     System.out.println("Sao iguais");
                 else
                    System.out.println("Nao sao iguais");
                 System.out.println("--------------------------");
                //
                
                System.out.println("PROXIMO PRODUTO");
                
                //Prenchendo os campos faltantes
                produtoDois.quantidade = 23;
                produtoDois.tipo = "Alimento";
                produtoDois.valorProduto = 12.87;
                //
                
                //comprar()
                System.out.println("--------------------------");
                System.out.println("produtoDois + 'comprar(12)':");
                produtoDois.comprar(12); //comprei doze tomates
                System.out.printf("Quantidade pos-compra: %d", produtoDois.quantidade);
                System.out.println("\n--------------------------");
                //
                System.out.println("");
                //vender()
                System.out.println("--------------------------");
                System.out.println("produtoDois + 'vender(3)':");
                produtoDois.vender(3); //vendi três tomates
                System.out.printf("\nQuantidade pos-venda: %d", produtoDois.quantidade);
                System.out.println("\n--------------------------");
                //
                System.out.println("");
                //igual()
                System.out.println("--------------------------");
                System.out.println("produtoDois + 'igual(produtoDois)':");
                 if (produtoDois.igual(produtoDois)) //comparando com produtoDois
                     System.out.println("Sao iguais");
                 else
                    System.out.println("Nao sao iguais");
                 System.out.println("--------------------------");
                //
                
                System.out.println("PROXIMO PRODUTO");
                
                //Prenchendo os campos faltantes
                produtoTres.tipo = "Alimento";
                produtoTres.valorProduto = 7.14;
                //
                
                //comprar()
                System.out.println("--------------------------");
                System.out.println("produtoTres + 'comprar(12)':");
                produtoTres.comprar(12); //comprei 12 jilós
                System.out.printf("Quantidade pos-compra: %d", produtoTres.quantidade);
                System.out.println("\n--------------------------");
                //
                System.out.println("");
                //vender()
                System.out.println("--------------------------");
                System.out.println("produtoTres + 'vender(3)':");
                produtoTres.vender(3); //vendi três jilós
                System.out.printf("\nQuantidade pos-venda: %d", produtoTres.quantidade);
                System.out.println("\n--------------------------");
                //
                System.out.println("");
                //igual()
                System.out.println("--------------------------");
                System.out.println("produtoTres + 'igual(produtoDois)':");
                 if (produtoTres.igual(produtoDois)) //comparando com produtoDois
                     System.out.println("Sao iguais");
                 else
                    System.out.println("Nao sao iguais");
                 System.out.println("--------------------------");
                //
                
                System.out.println("PROXIMO PRODUTO");
                
                //comprar()
                System.out.println("--------------------------");
                System.out.println("produtoQuatro + 'comprar(12)':");
                produtoQuatro.comprar(12); //comprei 12 jurubebas
                System.out.printf("Quantidade pos-compra: %d", produtoQuatro.quantidade);
                System.out.println("\n--------------------------");
                //
                System.out.println("");
                //vender()
                System.out.println("--------------------------");
                System.out.println("produtoQuatro + 'vender(3)':");
                produtoQuatro.vender(3); //vendi três jurubebas
                System.out.printf("\nQuantidade pos-venda: %d", produtoQuatro.quantidade);
                System.out.println("\n--------------------------");
                //
                System.out.println("");
                //igual()
                System.out.println("--------------------------");
                System.out.println("produtoQuatro + 'igual(produtoDois)':");
                 if (produtoQuatro.igual(produtoDois)) //comparando com produtoDois
                     System.out.println("Sao iguais");
                 else
                    System.out.println("Nao sao iguais");
                 System.out.println("--------------------------");
                //
                
                
    }
}
