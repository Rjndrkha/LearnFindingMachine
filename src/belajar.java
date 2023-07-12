import java.util.*;

public class belajar {

    private static String nama = "Rizky";
    private static int saldo = 0;
    private static String password = "123";

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        login(input);

        while (true) {
            dashboard(input, nama);
        }
    }

    private static void login(Scanner input) {
        System.out.print("Masukkan Nama ");
        nama = input.next();

        System.out.print("Masukkan Password ");
        String passwordinput = input.next();
        
        for (int i = 0; i < 3; i++) {
            if (passwordinput.equals(password)) {
                System.out.println("Login Berhasil \n" );
                break;
            } else {
                int sisa = i + 1;
                System.out.println("Password Salah " + sisa + " Kali");
                System.out.print("Masukkan Password ");
                passwordinput = input.next();
            }
        }

    }

    private static void dashboard(Scanner input, String nama) {
        System.out.println("Selamat Datang Di Aplikasi Saya " + nama);

        System.out.println("1. Cek Saldo");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Keluar");
        System.out.print("Pilih Menu : ");
        int menu = input.nextInt();

        if (menu == 1) {
            checkBalance();
        } else if (menu == 2) {
            deposit(input);
        } else if (menu == 3) {
            withdraw(input);
        } else if (menu == 4) {
            System.out.println("Terima Kasih Telah Menggunakan Aplikasi Saya");
            System.exit(0);
        } else {
            System.out.println("Menu Tidak Tersedia");
        }
    }

    private static void checkBalance() {
        System.out.println("Saldo Anda Saat Ini : " + saldo);
    }

    private static void deposit(Scanner input) {
        System.out.println("Masukkan Nominal Deposit : ");
        int nominal = input.nextInt();
        saldo = saldo + nominal;
        System.out.println("Saldo Anda Saat Ini : " + saldo);
    }

    private static void withdraw(Scanner input) {
        System.out.println("Masukkan Nominal Withdraw : ");
        int nominal = input.nextInt();
        saldo = saldo - nominal;

        if (saldo < 0 && saldo < nominal) {
            System.out.println("Saldo Anda Tidak Mencukupi");
            saldo = saldo + nominal;
        } else {
            System.out.println("Saldo Anda Saat Ini : " + saldo);
        }
        
    }
}
