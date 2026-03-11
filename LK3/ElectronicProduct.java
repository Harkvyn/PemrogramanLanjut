class ElectronicProduct extends Product {

    private String warrantyPeriod;

    public ElectronicProduct(String id, String name, double price, int stock, String warrantyPeriod) {
        super(id, name, price, stock);
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    @Override
    public double calculateDiscount() {

        double discount = getPrice() * 0.05;

        if (getPrice() > 500000) {
            discount += getPrice() * 0.02;
        }

        return discount;
    }
}
