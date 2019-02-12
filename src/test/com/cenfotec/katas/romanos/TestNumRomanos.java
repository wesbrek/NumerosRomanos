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
	
	
}
