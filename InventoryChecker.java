public class InventoryChecker {
    public static void main(String[] args) {
        int[] stock = {20, 15, 30, 0, 25}; 
        int total = 0;
        boolean outOfStock = false;

        
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] == 0) {
                outOfStock = true;
                break; 
            }
            total += stock[i];
        }

        if (outOfStock) {
            System.out.println("Out of stock");
        } else {
            System.out.println("Total Stock: " + total);

            // Stock level classification
            if (total < 50) {
                System.out.println("Low Stock");
            } else if (total <= 100) {
                System.out.println("Moderate Stock");
            } else {
                System.out.println("Good Stock");
            }
        }
    }
}
