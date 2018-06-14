
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gabriel Budke
 */
public class JanelaJUnitTest {

    @Test
    public void testeComprimento() {
        Janela x1 = new Janela();
        x1.setComprimento(1.25f);
        assertEquals(1.25f, x1.getComprimento(), 00);
    }

    @Test
    public void testeLargura() {
        Janela x1 = new Janela();
        x1.setLargura(0.60f);
        assertEquals(0.60f, x1.getLargura(), 00);
    }
    
    @Test
    public void testeAtura(){
        Janela x1 = new Janela();
        x1.setAltura(1.30f);
        assertEquals(1.30f, x1.getAltura(), 00);
    }
    
    @Test
    public void testePreco(){
        Janela x1 = new Janela();
        x1.setPreco(25.50f);
        assertEquals(25.50f, x1.getPreco(), 00);
    }
    
    @Test
    public void testeMarca(){
        Janela x1 = new Janela();
        x1.setMarca("Aluminox");
        assertEquals("Aluminox", x1.getMarca());
    }
    
    
    @Test
    public void testeInsulfilme(){
        Janela x1 = new Janela();
        x1.setInsulfilme("Aluminox");
        assertEquals("Aluminox", x1.getInsulfilme());
    }

}
