import java.util.HashMap;

public class RomanNumerals {
	
	private HashMap<Character, Integer> conversionTable;
	private String numeral;
	private int iNumber;
	private int repeats;
	private Character prevDigit;
	boolean prevSubtraction;
	
	public RomanNumerals() {
		
		conversionTable = new HashMap<Character, Integer>();
		
		conversionTable.put('I', 1);
		conversionTable.put('V', 5);
		conversionTable.put('X', 10);
		conversionTable.put('L', 50);
		conversionTable.put('C', 100);
		conversionTable.put('D', 500);
		conversionTable.put('M', 1000);
		
		iNumber = 0;
		repeats = 0;
		prevDigit = null;
		prevSubtraction = false;
	}
	
	private boolean checkNumber(Character aNumber) {
		
		if(!conversionTable.containsKey(aNumber)){
			return false;
		}
		
		if(prevDigit == null) {
			return true;
		}
		
		if(conversionTable.get(aNumber) < conversionTable.get(prevDigit)) {
			return false;
		}
		
		
		return true;

	}
	
	private boolean checkRepeats(Character aNumber) {
		
		if(prevDigit == null) {
			repeats = 0;
			return true;
		}
		
		if(!prevDigit.equals(aNumber)) {
			repeats = 0;
			return true;
		}
		
		if(prevSubtraction && (aNumber.equals(prevDigit))) {
			return false;
		}
		
		repeats++;
		
		if( (repeats < 3) && (aNumber.equals('I') || 
								aNumber.equals('X') ||
								aNumber.equals('C') ||
								aNumber.equals('M') ) ) {
			return true;
		}
		
		return false;
	}
	
	private boolean checkSubtraction(Character aNumber) {
		
		if(prevDigit == null) {
			return false;
		}
		
		if(aNumber.equals('I') && ( prevDigit.equals('V' ) ||
									prevDigit.equals('X') ) ) {
			
			return true;
			
		}
		else if(aNumber.equals('X') && ( prevDigit.equals('L' ) ||
				prevDigit.equals('C') ) ) {

			return true;

		}
		else if(aNumber.equals('C') && ( prevDigit.equals('D' ) ||
				prevDigit.equals('M') ) ) {

			return true;

		}
		
		return false;

	}
	
	public int convertToInteger(String romanNum) {
		// To be Implemented
		numeral = romanNum;
		iNumber = 0;
		repeats = 0;
		prevDigit = null;
		prevSubtraction = false;
		
		for(int i = numeral.length() - 1; i >= 0; i--) {
			
			if(!checkRepeats(numeral.charAt(i))) {
				throw new IllegalArgumentException("Invalid numeral");
			}
			
			if(checkSubtraction(numeral.charAt(i))) {
				iNumber -= conversionTable.get(numeral.charAt(i));
				prevSubtraction = true;
			}
			else if(checkNumber(numeral.charAt(i))) {
				iNumber += conversionTable.get(numeral.charAt(i));
				prevSubtraction = false;
			}
			else {
				throw new IllegalArgumentException("Invalid numeral");
			}
			
			prevDigit = numeral.charAt(i);
			
		}
		
		
		return iNumber;
		
	}
}
