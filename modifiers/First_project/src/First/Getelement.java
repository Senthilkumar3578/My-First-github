//$Id$
package First;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Getelement {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public int getValue()
	{
	try{
	
		return Integer.parseInt(br.readLine());
	
	}
	catch(Exception e)
	{
		System.out.println("Sorry your entry is wrong please enter the correct value");
		return getValue();
	}
	}
}
