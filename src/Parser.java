
public class Parser {
	
	public static int toInteger(String string) {
		int i = 0;
		
		try 
		{
			i = Integer.parseInt(string);
		} 
		catch(NumberFormatException e) 
		{
			return 0;
		}
		
		return i;
	}
	
	//private void check(String string) {
		
	//}

}
