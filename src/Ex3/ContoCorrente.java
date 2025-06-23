package Ex3;

public class ContoCorrente {
    protected final int maxMovimenti = 50;
    protected String titolare;
    protected int nMovimenti;
    protected double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    public void preleva(double x) {
        try {
            if (nMovimenti < maxMovimenti) saldo = saldo - x;
            else saldo = saldo - x - 0.50;

            nMovimenti++;

            if (saldo < 0) {
                throw new BancaException("il conto è in rosso");
            }
        } catch (BancaException e) {
            System.out.println("Eccezione: " + e.getMessage());
        }
    }

    public double restituisciSaldo() {
        return saldo;
    }
}
