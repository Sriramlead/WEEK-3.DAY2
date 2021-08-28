package week3.day2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class MissingElements {

	public static void main(String[] args) {
	
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		List<Integer> list=new ArrayList<Integer>();
		for(Integer arr1:arr)
		{
			list.add(arr1);
		}
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)!=i+1)
			{
				System.out.println("Missing Element:" + (i+1));
				break;
			}
		}
		
	}

}

