/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogodesenvolvido;

  public abstract class Personagem {
    Arma Arma_IF;
    int vida;
    String nome;

  public Personagem(String nome, Arma Arma_IF) {
        this.nome = nome;
        this.Arma = Arma_IF;
    }


  }

  public String getnome() {
    return nome;
}
    public abstract void desenhar();
  
    public abstract void falar();
    public abstract void arma();
        
    public void usarDesenhar() {
       
    }
  
    public void usarFalar() {
        
    }
  
    public void usarArma() {
       
    }
     public void setArma(Arma_IF) {
         this.Arma_IF = Arma_IF;
          }

    
 public void correr() {
        System.out.println(nome + " está correndo para se proteger!");
    }

    public void voar() {
        System.out.println(nome + " está voando.");
    }

 public void atacar() {
        Arma.usarArma();
        System.out.println(nome + " atacou causando " + Arma.getDano() + " de dano.");
    }
  
  
