
public class Parser {
	
	public static int toInteger(String string) {
		int i = 0;
			
		try 
		{
			i = Short.parseShort(string);
		} 
		catch(NumberFormatException e) 
		{
			throw e;
		}
		
		return Integer.parseInt(string);
	}

}
