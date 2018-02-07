package academia;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ExercicioTest {

	private Exercicio exercicio;
    
    @Before
    public void criaExercicio() throws Exception {
        exercicio = new Exercicio("abdominal", 200);
    }
    
    @Test
    public void testExercicio() {
        assertEquals("Nome do exercicio esta errado.", 
                     "abdominal",exercicio.getNome());
        assertEquals("Cph do exercicio esta errada.", 200, exercicio.getCph());
    }
    
    private Exercicio exercicio2;
    @Test
    public void testaNomenull(){
    try {
    	   exercicio2 = new Exercicio(null, 200);
    	   fail("Deveria ter lancado excecao de nome");
    	} catch ( Exception exp ) {
    	    assertEquals("Mensagem de excecao capturada.","O nome do exercicio não pode ser null", exp.getMessage());
    	}
    }
    
    @Test
    public void cphMenorIgualaZero(){
    	try{
    		exercicio = new Exercicio("Trapezio descendente",0);
    		fail("Deveria ter lançado excecao de cph");
    	}catch(Exception ex){
    		assertEquals("Mensagem de excecao capturada.","Calorias por hora do exercicio nao pode ser zero ou menor do que zero", ex.getMessage());
    	}
    }
    
    @Test
    public void testSetCph(){
    	try{
    		exercicio.setCph(0);
    		fail("Deveria te")
    	}
    }
}
