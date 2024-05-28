/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogodesenvolvido;

  public class Soldado extends Personagem {

    public Soldado() {
        desenhar();
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando soldado");
    }

    @Override
    public void falar() {
        System.out.println("Soldado falando");
    }

    public void arma() {
        //print
    }
    
      
      
  }
