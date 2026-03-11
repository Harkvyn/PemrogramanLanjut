package LK3;
public class ShopManagementSystem {

    public static void main(String[] args) {
        // disini polymorphismnya, pake array
        Product[] products = new Product[6];

        products[0] = new FoodProduct("F01", "makan", 10000, 20, "2026-05-01");
        products[1] = new FoodProduct("F02", "air", 15000, 5, "2026-04-01");

        products[2] = new ElectronicProduct("E01", "Mouse", 200000, 15, "1 Tahun");
        products[3] = new ElectronicProduct("E02", "Keyboard", 600000, 10, "2 Tahun");

        products[4] = new ClothingProduct("C01", "Kaos", 120000, 30, "L", "Uniqlo");
        products[5] = new ClothingProduct("C02", "Jaket", 250000, 10, "M", "Nike");

        System.out.println("=== DAFTAR PRODUK ===");

        for (Product p : products) {

            p.getProductInfo();

            double discount = p.calculateDiscount();

            System.out.println("Diskon : " + discount);
            System.out.println("---------------------");
        }
        //contoh transaksi pertama
        Transaction t1 = new Transaction("T01");

        t1.addItem(products[0]);
        t1.addItem(products[3]);

        double total1 = t1.processSale();

        //cotnh transaksi kedua
        Transaction t2 = new Transaction("T02");

        t2.addItem(products[4], 2);
        t2.addItem(products[2]);

        double total2 = t2.processSale();

        double totalSales = total1 + total2;

        System.out.println("=== LAPORAN PENJUALAN ===");
        System.out.println("Total transaksi 1 : " + total1);
        System.out.println("Total transaksi 2 : " + total2);
        System.out.println("Total penjualan   : " + totalSales);
    }
}
