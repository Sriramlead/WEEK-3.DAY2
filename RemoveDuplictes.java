package week3.day2;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplictes {

	public static void main(String[] args) {
	
		String text = "today is a good day because weather was good";	
		String[] s1=text.split(" ");
		Set<String> S2=new LinkedHashSet<String>();
		for(String s3:s1)
		{
			S2.add(s3);
		}
		for(String s4:S2)
		{
			System.out.print(s4+ " ");
		}
	}

}

