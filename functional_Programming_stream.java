package assignment;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

 
public class functional_Programming_stream {

	public static void main(String[] args) {
		

		
				List<Integer> num = Arrays.asList(34,45,67,87,99);
				List<Integer> oddNum = num.stream()
				   .filter(num1->num1%2==1)
				   .collect(Collectors.toList());
				oddNum.forEach(System.out::println);
			}

		 

		}