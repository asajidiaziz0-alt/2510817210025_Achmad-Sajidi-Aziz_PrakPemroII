package Module04.Problem02;

public class Pet {
    private String name;
    private String breed;

    public Pet(String r, String n) {
        this.breed = r;
        this.name = n;
    }

    public void display() {
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + name);
        System.out.println("Dengan ras : " + breed);
    }
}
