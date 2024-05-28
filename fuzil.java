/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogodesenvolvido;

 public abstract class fuzil extends Arma{
     
    
    @Override
    public int getDano(){
        int max = 45, min = 30;
        dano = (int)Math.floor(Math.random() * (max - min + 1) + min);
        
        return dano;
    }
     
    @Override
    public void usarArma(){
        InOut.MsgDeAviso("Usando Fuzil", "O fuzil foi usado");
    }
}
