package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listA = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		List<Integer> listB = new ArrayList<Integer>(Arrays.asList(2,3));
		List<Integer> listC = new ArrayList<Integer>();
		listC = listA.stream().filter( num -> !listB.contains(num)) .collect(Collectors.toList());
		listC.forEach( item -> System.out.println(item));
	}

}
