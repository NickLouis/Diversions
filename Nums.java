import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Nums {

	static String convert(int num) {
		String retVal = "";
		final int [] powsOfThousand = {1000000000,1000000,1000};
		final int [] tens = {10,20,30,40,50,60,70,80,90};	
		final int [] teens = {11,12,13,14,15,16,17,18,19};
		final int [] ones = {1,2,3,4,5,6,7,8,9};
		final int hundred = 100;	
		final String hun = "Hundred";
		final List <String> thouWords = List.of("Billion", "Million", "Thousand");
		final List <String> tenWords = List.of("Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty","Ninety");
		final List <String> teenWords = List.of("Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen","Nineteen");
		final List <String> oneWords = List.of("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight","Nine");

		for (int i=0;i<powsOfThousand.length;i++) {
			if((num/powsOfThousand[i])>=1 && (num/powsOfThousand[i])<1000){
				retVal+=thouWords.get(i);
				
				break;
			}	
		}
		 
		return retVal;
	}
	public static void main(String[] args) {
		
	System.out.println(	convert(1000000000) );

	}

}
