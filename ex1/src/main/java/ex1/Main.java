package ex1;

public class Main {
    public static void main(String[] args) {
        Onibus onibus = new Onibus();
        Passageiro[] passageiro = new Passageiro[10];
        for (int i = 0; i <= 9; i++) {
            passageiro[i] = new Passageiro("Passageiro " + i, onibus);
        }
        for (int i = 0; i <= 9; i++) {
            passageiro[i].start();
        }
    }
}