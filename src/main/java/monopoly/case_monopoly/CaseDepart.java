package monopoly.case_monopoly;

import monopoly.Joueur;

public class CaseDepart extends CaseSpeciale {

    public CaseDepart(String name) { super (name); }
    public void passerSur(Joueur joueur){
        joueur.ajouterArgent(200);
        joueur.faitUnTourEnPlus();
    }
}
