// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int cash = Integer.parseInt(args[0]);
		double interest = Double.parseDouble(args[1]);
		int duration = Integer.parseInt(args[2]);

		double futureValue = cash * Math.pow((1 + (interest/100)), duration);

		System.out.println("After " + duration + " years, a $" + cash + " saved at " + interest + "% will yield $" + (int) futureValue);
	}
}