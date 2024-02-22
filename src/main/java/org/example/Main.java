import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("Jenis Kelamin (L/P): ");
        String jenisKelamin = input.nextLine();

        System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        String tanggalL = input.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalL, DateTimeFormatter.ISO_DATE);

        System.out.println("\n// output\n");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin.equalsIgnoreCase("P") ? "Perempuan" : "Laki - Laki"));

        LocalDate kalender = LocalDate.now();
        Period period = Period.between(tanggalLahir, kalender);
        int umurTahun = period.getYears();
        int umurBulan = period.getMonths();
        System.out.println("Umur Anda: " + umurTahun + " tahun " + umurBulan + " bulan");

        input.close();
    }
}