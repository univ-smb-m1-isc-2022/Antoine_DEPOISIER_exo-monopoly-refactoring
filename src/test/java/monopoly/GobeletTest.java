package monopoly;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class GobeletTest {

    @Test
    void estUnDouble() {
        De mockedDe1 = mock(De.class);
        when(mockedDe1.getValeur()).thenReturn(1);

        De mockedDe2 = mock(De.class);
        when(mockedDe2.getValeur()).thenReturn(2);

        Gobelet gobeletDouble = new Gobelet(mockedDe1, mockedDe1);
        Assertions.assertThat(gobeletDouble.estUnDouble()).isEqualTo(true);

        Gobelet gobeletNotDouble = new Gobelet(mockedDe1, mockedDe2);
        Assertions.assertThat(gobeletNotDouble.estUnDouble()).isEqualTo(false);
    }

    @Test
    void lancer() {
        De mockedDe1 = mock(De.class);
        when(mockedDe1.getValeur()).thenReturn(1);

        De mockedDe2 = mock(De.class);
        when(mockedDe2.getValeur()).thenReturn(2);

        De mockedDe3 = mock(De.class);
        when(mockedDe3.getValeur()).thenReturn(3);

        Gobelet gobelet2 = new Gobelet(mockedDe1, mockedDe1);
        Assertions.assertThat(gobelet2.lancer()).isEqualTo(2);

        Gobelet gobelet4 = new Gobelet(mockedDe1, mockedDe3);
        Assertions.assertThat(gobelet4.lancer()).isEqualTo(4);

        Gobelet gobelet5 = new Gobelet(mockedDe3, mockedDe2);
        Assertions.assertThat(gobelet5.lancer()).isEqualTo(5);
    }
}