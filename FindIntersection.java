package week3.day2;



import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={4,2,11,4,8,2};
		int arr1[]= {1,8,32,4,9,7};
		List<Integer> first=new ArrayList<Integer>();
		for(int i:arr)
			first.add(i);
		
		List<Integer> Second=new ArrayList<Integer>();
		for(int j:arr1)
			Second.add(j);
		first.retainAll(Second);
		System.out.println("Set Intersection:" + first);
		
		for(int num:first)
		System.out.println(num);

	}

}
