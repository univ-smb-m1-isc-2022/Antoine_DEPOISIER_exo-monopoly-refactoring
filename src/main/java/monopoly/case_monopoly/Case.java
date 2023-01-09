package monopoly.case_monopoly;

import monopoly.Joueur;

public abstract class Case {

    private final String name;
    private Case suivante;

    public Case(String name) {
        this.name = name;
    }

    public void setSuivante(Case c) {
        suivante = c;
    }

    public Case retourneCaseSuivante() {
        return suivante;
    }

    public void sArreterSur(){

    }

    public void passerSur(Joueur joueur){

    }

    public String getName() {
        return name;
    }


}
