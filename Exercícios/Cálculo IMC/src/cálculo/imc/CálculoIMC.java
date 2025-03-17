/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cálculo.imc;

/**
 *
 * @author gabri
 */
public class CálculoIMC 
{
    public static class Pessoa 
    {
        String nome;
        int idade;
        double peso;
        double altura;
        
        Pessoa(String nome, int idade, double peso, double altura) 
        {
            this.nome = nome;
            this.idade = idade;
            this.peso = peso;
            this.altura = altura;
        }
        
        public double IMC()
        {
            return peso/(altura*altura);
        }
    }
    
    public static void main(String[] args) 
    {
        Pessoa pes = new Pessoa("Maria", 20, 60, 1.53);
            
        System.out.println("Nome: " + pes.nome + " - Idade: " + pes.idade +
                " - Altura: " + pes.altura + " - Peso: " + pes.peso + 
                " - IMC: " + pes.IMC());
    }         
}

    

