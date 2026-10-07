package mpack;

public class BookOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quantity=3;
		int price = 275;
		
		double total = (double) (quantity * price);
		
		int discount=10;
		double discountPercentage=(double) discount;
		double discountAmount = total*discountPercentage/100;
		
		double finalAmount= total-discountAmount;
		System.out.println("Number of books:"+ quantity);
		System.out.println("Price per book:"+ price);
		System.out.println("Total Amount: " + total);
		System.out.println("Discount: " + discountPercentage + "%");
		System.out.println("Discount Amount: " + discountAmount);
		System.out.println("Final Bill Amount: " + finalAmount);
		
	}

}
