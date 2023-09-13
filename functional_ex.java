package assignment;

 

import java.util.function.Function;

 

public class functional_ex {

 

	public static void main(String args[]){
		Function<String,Integer> function = (str)->str.length();
		System.out.println(function.apply("Teja"));

		Function<String,String> function1 = (str)->str.toLowerCase();
		System.out.println(function1.apply("TEJA"));
	}
}