package nicebank;

public class Konto {

    private int saldo;

    public void gutschreiben(int betrag) {
        saldo += betrag;
    }

    public void belasten(int betrag) {
        saldo -= betrag;
    }

    public int getSaldo() {
        return saldo;
    }
}
