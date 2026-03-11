class ClothingProduct extends Product {

    private String size;
    private String brand;

    public ClothingProduct(String id, String name, double price, int stock, String size, String brand) {
        super(id, name, price, stock);
        this.size = size;
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public double calculateDiscount() {

        if (size.equals("L") || size.equals("XL")) {
            return getPrice() * 0.15;
        }

        return 0;
    }
}
