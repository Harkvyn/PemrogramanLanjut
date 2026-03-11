class FoodProduct extends Product {

    private String expiryDate;

    public FoodProduct(String id, String name, double price, int stock, String expiryDate) {
        super(id, name, price, stock);
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    // Override method
    @Override
    public double calculateDiscount() {

        if (getStockQuantity() > 10) {
            return getPrice() * 0.10;
        }

        return 0;
    }
}
