package ex1;
public class Passageiro extends Thread {
    Onibus onibus;
    
    public Passageiro(String nome, Onibus passageiro){
        this.setName(nome);
        this.onibus = passageiro;
    }
    public void run(){
        try {
            onibus.comprar(this);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}