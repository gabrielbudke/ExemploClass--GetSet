
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alunos
 */
public class BrinquedoJUnitTest {
    
    @Test
    public void testeNome(){
        Brinquedo carrinho = new Brinquedo();
        carrinho.setNome("Hot Wheels");
        assertEquals("Hot Wheels", carrinho.getNome());
        
    }
    
    @Test
    public void testeMarca(){
        Brinquedo carrinho = new Brinquedo();
        carrinho.setMarca("Mattel");
        assertEquals("Mattel", carrinho.getMarca());
    }
    
    @Test
    public void testeModelo(){
        Brinquedo carrinho = new Brinquedo();
        carrinho.setModelo("Ford Mustang");
        assertEquals("Ford Mustang", carrinho.getModelo());
    }
    
    @Test
    public void testePreco(){
        Brinquedo carrinho = new Brinquedo();
        carrinho.setPreco(15.50);
        assertEquals(15.50, carrinho.getPreco(),0);
    }
    
    @Test
    public void testeCodigo(){
        Brinquedo carrinho = new Brinquedo();
        carrinho.setCodigo(12345678);
        assertEquals(12345678, carrinho.getCodigo());
    }
    
    @Test
    public void testeCodigoBarras(){
        Brinquedo carrinho = new Brinquedo();
        carrinho.setCodigoBarras((long) 1234567891);
        assertEquals(1234567891, carrinho.getCodigoBarras());
    }
    
    @Test
    public void testeDescricao(){
        Brinquedo carrinho = new Brinquedo();
        carrinho.setDescricao("Carrinho de brinquedo produzido pela Mattel");
        assertEquals("Carrinho de brinquedo produzido pela Mattel", carrinho.getDescricao());

        
      
        
        
    }
    
    
    
}
