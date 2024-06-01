package jogodesenvolvido;

public class magia extends Arma {
   
    @Override
    public int getDano(){
        int max = 60, min = 40;
        dano = (int)Math.floor(Math.random() * (max - min + 1) + min);
        return dano;
    }
   
    @Override
    public void usarArma(){
        InOut.MsgDeAviso("Usando magia", "A magia foi usada!");
    }
}