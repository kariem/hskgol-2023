import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GolTest {

    @Test
    public void shouldCellDie() {
        Gol gol = new Gol();
        gol.init(new boolean[][]{
                {false, false, false},
                {false, true, false},
                {false, false, false}
        });
        gol.next();
        assertThat(gol.getCell(1, 1)).isFalse();
    }

    @Test
    public void shouldDieWithOneNeighbor() {
        Gol gol = new Gol();
        gol.init(new boolean[][]{
                {false, false, false},
                {false, true, true},
                {false, false, false}
        });
        gol.next();
        assertThat(gol.getCell(1, 1)).isFalse();
    }

    @Test
    public void shouldLiveWithTwoNeighbors() {
        Gol gol = new Gol();
        gol.init(new boolean[][]{
                {false, false, false},
                {false, true, true},
                {false, true, false}
        });
        gol.next();
        assertThat(gol.getCell(1, 1)).isTrue();
    }

    @Test
    public void shouldLiveWithThreeNeighbors() {
        Gol gol = new Gol();
        gol.init(new boolean[][]{
                {false, false, false},
                {false, true, true},
                {false, true, true}
        });
        gol.next();
        assertThat(gol.getCell(1, 1)).isTrue();
    }

    @Test
    public void shouldDieWithFourNeighbors() {
        Gol gol = new Gol();
        gol.init(new boolean[][]{
                {false, false, false},
                {true, true, true},
                {false, true, true}
        });
        gol.next();
        assertThat(gol.getCell(1, 1)).isFalse();
    }

    @Test
    public void shouldGetAliveWithThreeNeighbors() {
        Gol gol = new Gol();
        gol.init(new boolean[][]{
                {false, false, false},
                {false, false, true},
                {false, true, true}
        });
        gol.next();
        assertThat(gol.getCell(1, 1)).isTrue();
    }
}
