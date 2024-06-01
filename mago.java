package jogodesenvolvido;

public abstract class mago extends Personagem {

    public mago(String nome, Arma magia) {
        super(nome);
    }

    

    @Override
    public void arma() {
        System.out.println(nome + " conjura um feitiço!");
  
    }

    @Override
    public void desenhar() {
        
    }

    @Override
    public void falar() {
       
    }
  @Override
    public void correr() {
        System.out.println(getNome() + " está correndo");
    }
}