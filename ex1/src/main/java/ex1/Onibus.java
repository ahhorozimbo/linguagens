package ex1;
public class Onibus {
    
    Boolean poltronas[] = new Boolean[10];
    public void comprar(Passageiro p) throws InterruptedException{ 
        int i = poltronasLivres();
        if(poltronas[i] == false) {
            poltronas[i] = true;
            System.out.println(p.getName()+ " Ja comprou a poltrona: " + i);
        }
        else {
            System.out.println(p.getName()+ "Tentou comprar a poltrona: " + i + " Poltrona já comprada");
        }
    }
    public Onibus() {
        for(int i = 0; i<=9; i++) {
            poltronas[i] = false;
        }
    }
    public Integer poltronasLivres() {
        for(int i = 0; i<=9; i++) {
            if(poltronas[i] == false) {
                return i;
            }
        }
        return 0;
    }
}