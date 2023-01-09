package monopoly;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CaseConstructibleTest {

    @Test
    void nombreProprieteDeLaCouleur() {
        Plateau plateau = new Plateau();
        Assertions.assertThat(plateau.bellevile.nombreProprieteDeLaCouleur("v")).isEqualTo(2);
        Assertions.assertThat(plateau.bellevile.nombreProprieteDeLaCouleur("b")).isEqualTo(3);
        Assertions.assertThat(plateau.bellevile.nombreProprieteDeLaCouleur("p")).isEqualTo(3);
        Assertions.assertThat(plateau.bellevile.nombreProprieteDeLaCouleur("o")).isEqualTo(3);
        Assertions.assertThat(plateau.bellevile.nombreProprieteDeLaCouleur("r")).isEqualTo(3);
        Assertions.assertThat(plateau.bellevile.nombreProprieteDeLaCouleur("j")).isEqualTo(3);
        Assertions.assertThat(plateau.bellevile.nombreProprieteDeLaCouleur("w")).isEqualTo(3);
        Assertions.assertThat(plateau.bellevile.nombreProprieteDeLaCouleur("g")).isEqualTo(2);
    }
}