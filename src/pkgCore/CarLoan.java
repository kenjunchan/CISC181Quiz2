package pkgCore;
public class CarLoan
{
	private double totalPrice;
	private double downPayment;
	private int lengthOfLoan;
	private double interestRate;
	
	public CarLoan(double tP, double downP, int length, double iR)
	{
		this.totalPrice = tP;
		this.downPayment = downP;
		this.lengthOfLoan = length;
		this.interestRate = iR;
	}
	public double calculateMonthlyPayment()
	{
		double int12 = (this.interestRate)/12;
		double num = int12 * (totalPrice - downPayment);
		double denom = (1 - Math.pow((1 + int12), -lengthOfLoan));
		return num/denom;
	}
	public double calculateTotalInterest()
	{
		return (this.calculateMonthlyPayment() - ((totalPrice - downPayment) / lengthOfLoan)) * lengthOfLoan;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public double getDownPayment() {
		return downPayment;
	}
	public void setDownPayment(double downPayment) {
		this.downPayment = downPayment;
	}
	public int getLengthOfLoan() {
		return lengthOfLoan;
	}
	public void setLengthOfLoan(int lengthOfLoan) {
		this.lengthOfLoan = lengthOfLoan;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
}
