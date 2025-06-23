package Ex3;

public class ContoOnline extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnline(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    public void stampaSaldo() {
        System.out.println("Titolare: " + titolare + "- Saldo: " + saldo + "- Num movimenti: " + nMovimenti + "- Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
    }

    public void preleva(double x) {
        try {
            if (x <= maxPrelievo) {
                super.preleva(x);
            } else {
                throw new BancaException("il prelievo non è disponibile");
            }
        } catch (BancaException e) {
            System.out.println("Eccezione: " + e.getMessage());
        }
    }
}
