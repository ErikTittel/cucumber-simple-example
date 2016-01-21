package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.de.Dann;
import cucumber.api.java.de.Gegebensei;
import cucumber.api.java.de.Wenn;
import nicebank.Konto;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeldautomatSteps {

    private Konto konto;

    @Gegebensei("^meinem Konto wurden (\\d+) Euro gutgeschrieben\\.$")
    public void meinemKontoWurdenEuroGutgeschrieben(int betrag) {
        konto = new Konto();
        konto.gutschreiben(betrag);
    }

    @Wenn("^ich (\\d+) Euro abhebe,$")
    public void ichEuroAbhebe(int betrag) {
        konto.belasten(betrag);
    }

    @Dann("^ist das Saldo meines Kontos (\\d+) Euro\\.$")
    public void istDasSaldoMeinesKontosEuro(int betrag) {
        assertThat(konto.getSaldo(), is(betrag));
    }

}
