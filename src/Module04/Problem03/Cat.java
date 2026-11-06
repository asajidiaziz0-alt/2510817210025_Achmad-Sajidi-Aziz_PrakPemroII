package Module04.Problem03;

public class Cat extends Pet {
    private String furColor;

    public Cat(String r, String n, String furColor) {
        super(r, n);
        this.furColor = furColor;
    }

    public void displayCatDetails() {
        super.display();
        System.out.println("Memiliki Warna Bulu : " + furColor);
    }
}