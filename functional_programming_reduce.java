package assignment;
import java.util.Arrays;
import java.util.List;

public class functional_programming_reduce {

	public static void main(String[] args) {
		
		
		       List<String> stringList = Arrays.asList("fish", "goat", "cat", "apple", "ballon");

		       String result = stringList.stream()
		               .map(String::toUpperCase) 
		               .filter(s -> s.length() >= 4) 
		               .reduce("", (partialResult, str) -> partialResult + str); 

		       System.out.println( result);
		   }
		}