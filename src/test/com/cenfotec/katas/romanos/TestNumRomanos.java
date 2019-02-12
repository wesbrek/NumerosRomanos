package test.com.cenfotec.katas.romanos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.cenfotec.katas.romanos.NumRomanos;

public class TestNumRomanos {


	@Test
	public void testUnidades() {
		int number1 = 3;
		
		String result = NumRomanos.process(number1);
		
		assertEquals("III", result, "This should be III");
		
	}
	


	@Test
	public void testDecenas() {
		int number1 = 73;
		
		String result = NumRomanos.process(number1);
		
		assertEquals("LXXIII", result, "This should be LXXIII");
		
	}
	
	
	@Test
	public void testCentenas() {
		int number1 = 461;
		
		String result = NumRomanos.process(number1);
		
		assertEquals("CDLXI", result, "This should be CDLXI");
		
	}
	
	@Test
	public void testUnidadesM() {
		int number1 = 5000;
		
		String result = NumRomanos.process(number1);
		
		assertEquals("v", result, "This should be v");
		
	}
	
}

