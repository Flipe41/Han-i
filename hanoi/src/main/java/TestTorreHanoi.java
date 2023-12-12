import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTorreHanoi {
    @Test
    public void testMovimentos3Discos() {
        TorreHanoi torre = new TorreHanoi();
        torre.hanoi(3, 'A', 'C', 'B');
        assertEquals(7, torre.getMovimentos());
    }

    @Test
    public void testMovimentos4Discos() {
        TorreHanoi torre = new TorreHanoi();
        torre.hanoi(4, 'A', 'C', 'B');
        assertEquals(15, torre.getMovimentos());
    }
}
