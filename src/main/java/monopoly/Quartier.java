package monopoly;

import java.util.ArrayList;
import java.util.List;

public class Quartier {
    private final String couleur;
    private List<CaseConstructible> quartier = new ArrayList<>();

    public Quartier(String couleur) {
        this.couleur = couleur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void addCaseConstructible(CaseConstructible caseConstructible) {
        this.quartier.add(caseConstructible);
    }

    public int nombreProprieteDeLaCouleur(){
        return this.quartier.size();
    }
}
