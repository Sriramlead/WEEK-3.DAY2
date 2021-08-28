package week3.day2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LearnCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"axis bank", "hdfc", "icic", "kvb"};
		List<String> list=new ArrayList<String>(Arrays.asList(str));
		
		int listsize=list.size();          //length of String
		System.out.println("Length of String:" + listsize);
		
		Collections.sort(list);//sort the Array
		System.out.println("Sorted Array:" + list);
		
		Collections.reverse(list);    //Reverse Order
		System.out.println("Reversed Order:" + list);
		

	}

}

