package school.hei;

import org.junit.jupiter.api.Test;
import school.hei.Carte.Lieu;
import school.hei.Carte.Rue;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LieuTest {
    @Test
    public void lieuTest() {
        var marais = new Lieu("Marais");
        var sekolontsika = new Lieu("Sekolontsika");

        var maraisSekolontsika = new Rue(marais, sekolontsika);

        marais.ajouterRue(maraisSekolontsika);
        marais.ajouterRue(maraisSekolontsika);

        assertEquals(1, marais.getRues().size());
    }
}
