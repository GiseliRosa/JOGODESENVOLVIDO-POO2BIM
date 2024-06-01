package jogodesenvolvido;

public class fogo extends Arma {
   
    @Override
    public int getDano(){
        int max = 50, min = 30;
        dano = (int)Math.floor(Math.random() * (max - min + 1) + min);
        return dano;
    }
   
    @Override
    public void usarArma(){
        InOut.MsgDeAviso("Usando fogo", "O fogo foi usado!");
    }
}