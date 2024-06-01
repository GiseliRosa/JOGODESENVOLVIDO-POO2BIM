/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogodesenvolvido;

  public class General extends Personagem {

    public General() {
        desenhar();
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando General");
    }

    @Override
    public void falar() {
        //print
    }

    public void arma() {
       System.out.println("General usando o fuzil");
    } 

    public void correr() {
        System.out.println(" está correndo");
    }    
  }
