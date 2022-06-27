public class Parser {
	
	public static int toInteger(String string) {
		try 
		{
			short i = Short.parseShort(string);
		} 
		catch(NumberFormatException e) 
		{
			throw e;
		}
		
		return Integer.parseInt(string);
	}

}
