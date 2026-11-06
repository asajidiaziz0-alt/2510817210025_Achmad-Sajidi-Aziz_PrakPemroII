package Module04.Problem03;

public class Dog extends Pet{
    private String furColor;
    private String skills;

    public Dog(String r, String n, String furColor, String skills) {
        super(r, n);
        this.furColor = furColor;
        this.skills = skills;
    }

    public void displayDogDetails() {
        super.display();
        System.out.println("Memiliki Warna Bulu : " + furColor);
        System.out.println("Memiliki Kemampuan : " + skills);
        for (String skill : skills.split(",")) {
        }
    }
}