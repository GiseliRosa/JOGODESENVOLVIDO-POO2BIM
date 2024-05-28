/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogodesenvolvido;

/**
 *
 * @author alunolab03
 */
public class faca extends Arma {
   
    @Override
    public int getDano(){
        int max = 15, min = 10;
        dano = (int)Math.floor(Math.random() * (max - min + 1) + min);
        
        return dano;
    }
   
    @Override
    public void usarArma(){
        InOut.MsgDeAviso("Usando faca", "A faca foi usada!");
    }
}