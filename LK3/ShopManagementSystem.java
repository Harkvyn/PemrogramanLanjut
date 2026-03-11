
/**
 *
 * @author Hamam
 */

package LK3;

public class ShopManagementSystem {

    public static void main(String[] args) {

        // Array polymorphism
        Product[] products = new Product[6];

        products[0] = new FoodProduct("F01", "Mie ayam uenak", 15000, 20, "2026-10-11");
        products[1] = new FoodProduct("F02", "Es teh anget", 2000, 5, "2026-10-10");

        products[2] = new ElectronicProduct("E01", "Kulkas", 250000, 15, "1 Tahun");
        products[3] = new ElectronicProduct("E02", "Mouse", 666666, 10, "2 Tahun");

        products[4] = new ClothingProduct("C01", "Kaos", 1000, 30, "L", "Uniqlo");
        products[5] = new ClothingProduct("C02", "Jaket", 2000, 10, "M", "Nike");

        System.out.println("=== DAFTAR PRODUK ===");

        for (Product p : products) {

            p.getProductInfo();

            double discount = p.calculateDiscount();

            System.out.println("Diskon : " + discount);
            System.out.println("---------------------");
        }

        // Transaksi 1
        Transaction t1 = new Transaction("T01");

        t1.addItem(products[0]);
        t1.addItem(products[3]);

        double total1 = t1.processSale();

        // Transaksi 2
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
