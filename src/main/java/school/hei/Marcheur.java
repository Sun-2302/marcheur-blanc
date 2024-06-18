package school.hei;

import school.hei.Carte.Lieu;
import school.hei.Carte.Rue;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public record Marcheur(String nom) {

    public Marche marcher(Lieu depart, Lieu destination) {
        List<Lieu> trajet = new ArrayList<>();
        trajet.add(depart);
        Lieu positionActuel = depart;

        Random random = new Random();
        while (!positionActuel.equals(destination)) {
            List<Rue> ruesDisponibles = new ArrayList<>(positionActuel.getRues());
            Rue rueChoisie = ruesDisponibles.get(random.nextInt(ruesDisponibles.size()));

            positionActuel = rueChoisie.lieuRelie(positionActuel);
            trajet.add(positionActuel);
        }
        return new Marche(trajet);
    }

}
