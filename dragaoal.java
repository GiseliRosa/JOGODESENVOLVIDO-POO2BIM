/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogodesenvolvido;

public abstract class dragaoal extends Personagem {

    public dragaoal(String nome) {
        super(nome);
    }

    @Override
    public void usarArma() {
        System.out.println(getNome() + " cospe fogo!");
        getArma().usarArma();
        System.out.println(getNome() + " atacou causando " + getArma().getDano() + " de dano.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando para se proteger!");
    }

  
}