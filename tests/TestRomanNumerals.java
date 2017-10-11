import static org.junit.Assert.*;


import org.junit.Test;

public class TestRomanNumerals {
	
	@Test
	public void test_Convert_tointeger_I() {
		
		RomanNumerals converter = new RomanNumerals();
		
		assertEquals(1, converter.convertToInteger("I"));
	}
	
	@Test
	public void test_ConvertToInteger_V() {
		RomanNumerals converter = new RomanNumerals();
		
		assertEquals(5, converter.convertToInteger("V"));
	}
	
	@Test
	public void test_ConvertToInteger_X() {
		RomanNumerals converter = new RomanNumerals();
		
		assertEquals(10, converter.convertToInteger("X"));
	}
	
	@Test
	public void test_ConvertToInteger_L() {
		RomanNumerals converter = new RomanNumerals();
		
		assertEquals(50, converter.convertToInteger("L"));
	}
	
	@Test
	public void test_ConvertToInteger_C() {
		RomanNumerals converter = new RomanNumerals();
		
		assertEquals(100, converter.convertToInteger("C"));
	}
	
	@Test
	public void test_ConvertToInteger_D() {
		RomanNumerals converter = new RomanNumerals();
		
		assertEquals(500, converter.convertToInteger("D"));
	}
	
	@Test
	public void test_ConvertToInteger_M() {
		RomanNumerals converter = new RomanNumerals();
		
		assertEquals(1000, converter.convertToInteger("M"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_ConvertToInteger_Invalid_Numeral_T() {
		RomanNumerals converter = new RomanNumerals();
		
		converter.convertToInteger("T");
	}
	
	@Test
	public void test_ConvertToInteger_III() {
		RomanNumerals converter = new RomanNumerals();
		
		assertEquals(3, converter.convertToInteger("III"));
	}
	
	@Test
	public void test_convertToInteger_XXX() {
		RomanNumerals converter = new RomanNumerals();
		
		assertEquals(30, converter.convertToInteger("XXX"));
	}
	
	@Test
	public void test_ConvertToInteger_CCC() {
		RomanNumerals converter = new RomanNumerals();
		
		assertEquals(300, converter.convertToInteger("CCC"));
	}
	
	@Test
	public void test_ConvertToInteger_MMM() {
		RomanNumerals converter = new RomanNumerals();
		
		assertEquals(3000, converter.convertToInteger("MMM"));
	}
	
	@Test
	public void test_ConvertToInteger_XX() {
		RomanNumerals converter = new RomanNumerals();
		
		assertEquals(20, converter.convertToInteger("XX"));
	}
	
	@Test
	public void test_ConvertToInteger_LXXX() {
		RomanNumerals converter = new RomanNumerals();
		
		assertEquals(80, converter.convertToInteger("LXXX"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_ConvertToInteger_TooManyRepeats() {
		RomanNumerals converter = new RomanNumerals();
		
		converter.convertToInteger("MMMM");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_ConvertToInteger_InvalidValueRepeated() {
		RomanNumerals converter = new RomanNumerals();
		
		converter.convertToInteger("VVV");
	}
	
	@Test
	public void test_ConvertToInteger_IV() {
		
		RomanNumerals converter = new RomanNumerals();
		
		assertEquals(4, converter.convertToInteger("IV"));
	}
	
	@Test
	public void test_ConvertToInteger_IX() {
		RomanNumerals converter = new RomanNumerals();
		
		assertEquals(9, converter.convertToInteger("IX"));
	}
	
	@Test
	public void test_ConvertToInteger_XL() {
		RomanNumerals converter = new RomanNumerals();
		
		assertEquals(40, converter.convertToInteger("XL"));
	}
	
	@Test
	public void test_ConvertToInteger_XC() {
		RomanNumerals converter = new RomanNumerals();
		
		assertEquals(90, converter.convertToInteger("XC"));
	}
	
	@Test
	public void test_ConvertToInteger_CD() {
		RomanNumerals converter = new RomanNumerals();
		
		assertEquals(400, converter.convertToInteger("CD"));
	}
	
	@Test
	public void test_ConvertToInteger_CM() {
		RomanNumerals converter = new RomanNumerals();
		
		assertEquals(900, converter.convertToInteger("CM"));
	}
	
	@Test
	public void test_ConvertToInteger_MCMLXXXIV(){
		RomanNumerals converter = new RomanNumerals();
		
		assertEquals(1984, converter.convertToInteger("MCMLXXXIV"));
	}
	
	@Test
	public void test_ConvertToInteger_MMXIV(){
		RomanNumerals converter = new RomanNumerals();
		
		assertEquals(2014, converter.convertToInteger("MMXIV"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_ConvertToInteger_XXC() {
		RomanNumerals converter = new RomanNumerals();
		
		converter.convertToInteger("XXC");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_ConvertToInteger_IIV() {
		RomanNumerals converter = new RomanNumerals();
		
		converter.convertToInteger("IIV");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_ConvertToInteger_CCM() {
		RomanNumerals converter = new RomanNumerals();
		
		converter.convertToInteger("CCM");
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void test_ConvertToInteger_VX() {
		RomanNumerals converter = new RomanNumerals();
		
		converter.convertToInteger("VX");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_convertToInteger_LCC() {
		RomanNumerals converter = new RomanNumerals();
		
		converter.convertToInteger("LCC");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test_ConverToInteger_DM() {
		RomanNumerals converter = new RomanNumerals();
		
		converter.convertToInteger("DM");
	}
	

	
	

}
