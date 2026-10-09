package Module02.Problem01;

public class Fruit {
    private String fruitName;
    private double price;
    private double weight;
    private double purchaseTotal;
    private double pricePerKg;

    public Fruit(String fruitName, double price, double weight, double purchaseTotal) {
        this.fruitName = fruitName;
        this.price = price;
        this.weight = weight;
        this.purchaseTotal = purchaseTotal;
        this.pricePerKg = this.price / this.weight;
    }

    public void printInfo() {
        System.out.println("Nama buah: " + this.fruitName);
        System.out.println("Harga Sebelum Diskon: " + getPreDiscountPrice());
        System.out.println("Total Diskon: " + getDiscountTotal());
        System.out.println("Harga Setelah Diskon: " + getPostDiscountPrice());
    }

    public double getPreDiscountPrice() {
        return this.pricePerKg * this.purchaseTotal;
    }

    public double getDiscountTotal() {
        int discountThresholdKg = 4;
        double discountPercentage = 0.02;

        int discountBatches = (int)(this.purchaseTotal / discountThresholdKg);
        return discountBatches * (this.pricePerKg * discountThresholdKg) * discountPercentage;
    }

    public double getPostDiscountPrice() {
        return getPreDiscountPrice() - getDiscountTotal();
    }
}