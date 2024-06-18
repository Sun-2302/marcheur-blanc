package school.hei.Carte;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@ToString
public class Lieu {
    private final String nom;
    private List<Rue> rues;

    public Lieu(String nom) {
        this.nom = nom;
        this.rues = new ArrayList<>();
    }

    public void ajouterRue(Rue rue) {
        if (!rues.contains(rue)) {
            rues.add(rue);
        }
    }
}
