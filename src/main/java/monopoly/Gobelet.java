package monopoly;

public class Gobelet {

    private De de1;

    private De de2;

    public Gobelet(De de1, De de2) {
        this.de1 = de1;
        this.de2 = de2;
    }

    protected boolean estUnDouble() {     // test si c'est un double
        return (de1.getValeur() == de2.getValeur());
    }

    public int lancer() {
        de1.lancer();
        de2.lancer();
        return de1.getValeur() + de2.getValeur();
    }


}



