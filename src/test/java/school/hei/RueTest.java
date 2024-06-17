package school.hei;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RueTest {
    @Test
    public void rueTest(){
        var marais = new Lieu("Marais");
        var sekolontsika = new Lieu("Sekolontsika");

        var maraisSekolontsika = new Rue(marais, sekolontsika);

        Assertions.assertTrue(marais.getRues().contains(maraisSekolontsika));
    }
}
