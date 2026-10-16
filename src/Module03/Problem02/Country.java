package Module03.Problem02;

import java.util.HashMap;
import java.util.Locale;

public class Country {
    private String countryName;
    private String leadershipType;
    private String leaderName;
    private String independenceDate;
    private String independenceMonth;
    private String independenceYear;

    public Country(String countryName, String leadershipType, String leaderName, String independenceDate, String independenceMonth, String independenceYear) {
        this.countryName = countryName;
        this.leadershipType = leadershipType;
        this.leaderName = leaderName;
        this.independenceDate = independenceDate;
        this.independenceMonth = independenceMonth;
        this.independenceYear = independenceYear;
    }

    public Country(String countryName, String leadershipType, String leaderName) {
        this.countryName = countryName;
        this.leadershipType = leadershipType;
        this.leaderName = leaderName;
    }

    public void printInfo() {
        HashMap<Integer, String> monthNames = new HashMap<>();
        monthNames.put(1, "Januari");
        monthNames.put(2, "Februari");
        monthNames.put(3, "Maret");
        monthNames.put(4, "April");
        monthNames.put(5, "Mei");
        monthNames.put(6, "Juni");
        monthNames.put(7, "Juli");
        monthNames.put(8, "Agustus");
        monthNames.put(9, "September");
        monthNames.put(10, "Oktober");
        monthNames.put(11, "November");
        monthNames.put(12, "Desember");
        String leaderTitle = switch (this.leadershipType.toLowerCase(Locale.ROOT)) {
            case "monarki" -> "Raja";
            case "presiden" -> "Presiden";
            case "perdana menteri" -> "Perdana Menteri";
            default -> "Invalid";
        };

        System.out.println("Negara " + this.countryName
                + " mempunyai " + leaderTitle
                + " bernama " + this.leaderName
        );

        if (!this.leadershipType.equalsIgnoreCase("monarki")) {
            System.out.println("Deklarasi Kemerdekaan pada Tanggal "
                    + this.independenceDate + " "
                    + monthNames.get(Integer.parseInt(independenceMonth)) + " "
                    + this.independenceYear
            );
        }
    }
}
