package be.pxl.ja.oefening1;

import java.util.ArrayList;

public class NumberMachine {

	@FunctionalInterface
	interface NumberFilter{
		boolean check(int number);
	}

	private ArrayList<Integer> numbers = new ArrayList<>();

	public NumberMachine(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			this.numbers.add(numbers[i]);
		}
	}

	public String processNumbers(NumberFilter filter) {
		String result = "";
		for(int i=0;i<numbers.size();i++) {
			if(filter.check(numbers.get(i))) {
				if(!result.equals("")) {
					result += "-";
				}
				result += numbers.get(i);
			}
		}
		return result;
	}

	public String convertNumbers(){
		String result = "";
		for(int i=0;i<numbers.size();i++) {
			if(!result.equals("")) {
				result += "-";
			}
			result += Integer.toHexString(numbers.get(i));
		}
		return result;
	}

}
