import org.junit.Test;
import static org.junit.Assert.*;

public class TesteTorreHanoi {

    @Test
    public void testResolverTorreHanoiComZeroDiscos() {
        TorreHanoi torreHanoi = new TorreHanoi();
        assertEquals(0, torreHanoi.resolverTorreHanoi(0));
    }

    @Test
    public void testResolverTorreHanoiComUmDisco() {
        TorreHanoi torreHanoi = new TorreHanoi();
        assertEquals(1, torreHanoi.resolverTorreHanoi(1));
    }

    @Test
    public void testResolverTorreHanoiComDoisDiscos() {
        TorreHanoi torreHanoi = new TorreHanoi();
        assertEquals(3, torreHanoi.resolverTorreHanoi(2));
    }
