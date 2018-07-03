package servletApp;

public class ReverseAction {

	public String reverseMethod(String input)
	{
		char[] reverse = input.toCharArray();
		input = "";
		for(int i=reverse.length-1; i>=0; i--)
		{
			input += reverse[i];
		}
		return input;
	}
}
