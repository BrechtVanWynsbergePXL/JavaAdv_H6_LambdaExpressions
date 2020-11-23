package be.pxl.ja.oefening1;

public class NumberSelector{

	private NumberMachine numberMachine;

	public NumberSelector(NumberMachine numberMachine) {
		this.numberMachine = numberMachine;
	}

	public String showEvenNumbers() {
		NumberMachine.NumberFilter filter = new NumberMachine.NumberFilter() {
			@Override
			public boolean check(int number) {
				if(number % 2 == 0){
					return true;
				} else {
					return false;
				}
			}
		};
		return numberMachine.processNumbers(filter);
	}

	public String printHexNumbers() {
		return numberMachine.convertNumbers();
	}

	public String showNumbersAbove(int numberAbove) {
		NumberMachine.NumberFilter filter = number -> {
			if (number > numberAbove){
				return true;
			} else {
				return false;
			}
		};
		return numberMachine.processNumbers(filter);

//		NumberMachine.NumberFilter filter = new NumberMachine.NumberFilter() {
//			@Override
//			public boolean check(int number) {
//				if(number > numberAbove){
//					return true;
//				} else {
//					return false;
//				}
//			}
//		};
//		return numberMachine.processNumbers(filter);
	}
}
