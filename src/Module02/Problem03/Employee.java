package Module02.Problem03;

//error karena because di Main aja pakai use English(Employee), lah disini malah pakai Indo(Pegawai)
//public class Pegawai {
public class Employee {
    public String name;
    //dari lembar praktikum sih output origin ini berupa rangkaian huruf yh, kalo char kan cuma satu huruf
    //public char origin;
    public String origin;
    public String role;
    public int age;

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    //perlu parameter String r, supaya r di "this.role = r" itu valdi, berhubungan juga dengan e.setRole di Main.java karena nanti nyimpan "Assasin" itu di r
    //public void setRole() {
    public void setRole(String r) {
        this.role = r;
    }
}