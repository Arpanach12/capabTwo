
public class initial_rob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "Kalinga Orchard       Program      ";
		String newString = InitialString(inputString);
		System.out.println("initials are : "+newString);
	}
	static String InitialString(String inputString)
	{
		String Initial=" ";
		String newString=' '+inputString;
		for(int i=0;i<newString.length()-1;i++)
		{
			
			if((newString.charAt(i)==' '&& newString.charAt(i+1)!=' '))
			{
				Initial=Initial+newString.charAt(i+1);
			}
		}
		return Initial;
	}
}
