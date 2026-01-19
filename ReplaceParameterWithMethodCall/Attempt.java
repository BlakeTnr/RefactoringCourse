package ReplaceParameterWithMethodCall;

/**
 * What I did
 * 
 * Originally extracted out a getDiscountLevel
 * 
 * Realized there I can remove the parameter
 * 
 * Realized then I can just conver tit to
 * getDiscountFactor
 */

/**
 * What solution did
 * 
 * it went even furhter and extracted a
 * getBasePrice method
 */

class Original {
    int quantity;
    int itemPrice;
    
    public double getPrice() {
        int basePrice = quantity * itemPrice;

        double finalPrice = discountedPrice();
        return finalPrice;
    }

    private double getDiscountFactor() {
        if(quantity > 100) {
            return 0.1;
        } else {
            return 0.05;
        }
    }

    private double discountedPrice() {
        return getBasePrice() * getDiscountFactor();
    }

    private int getBasePrice() {
        return quantity * itemPrice;
    }
}
