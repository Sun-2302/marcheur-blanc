package school.hei.Carte;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@ToString
public class Carte {
    private final String nom;
    private List<Lieu> lieux;
    private List<Rue> rues;

    public Carte(String nom) {
        this.nom = nom;
        this.lieux = new ArrayList<>();
        this.rues = new ArrayList<>();
    }

    public void ajouterLieu(Lieu lieu) {
        if (!lieux.contains(lieu)) {
            lieux.add(lieu);
        }
    }

    public void ajouterRue(Rue rue) {
        if (!rues.contains(rue)) {
            rues.add(rue);
            rue.getLieu1().ajouterRue(rue);
            rue.getLieu2().ajouterRue(rue);
        }
    }
}
