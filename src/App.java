import java.util.Scanner;
import java.util.*;

public class App {

    private static double balance = 0;
    private static String accountName = "";

    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Selamat Datang Di Aplikasi Saya");
            
            System.out.println("1. Cek Saldo");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Tambah Account");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu : ");
            int menu = input.nextInt();

            if(menu == 1){
                if(accountName == ""){
                    System.out.println("Anda Belum Memiliki Account");
                    System.out.println("Silahkan Tambah Account Terlebih Dahulu");
                    continue;
                } else{}
                checkBalance();

            }else if(menu == 2){

                if(accountName == ""){
                    System.out.println("Anda Belum Memiliki Account");
                    System.out.println("Silahkan Tambah Account Terlebih Dahulu");
                    continue;
                } else{}
                deposit(input);

            }else if(menu == 3){
                if(accountName == ""){
                    System.out.println("Anda Belum Memiliki Account");
                    System.out.println("Silahkan Tambah Account Terlebih Dahulu" + "\n");
                    continue;
                } else{}
                withdraw(input);

            }else if(menu == 4){

               addAccount(input, accountName);

            }else if(menu == 5){
                System.out.println("Terima Kasih Telah Menggunakan Aplikasi Saya");
                break;

            }else{
                System.out.println("Menu Tidak Tersedia");
            }
        }
    }

    private static void checkBalance(){
        System.out.println("Nama Account : " + accountName);
        System.out.println("Saldo Anda : " + balance);
    }

    private static void addAccount(Scanner input, String name){

        System.out.print("Masukkan nama pelanggan: ");
        name = input.next();
        accountName = name;
        

    }

    private static void deposit(Scanner input){
        System.out.println("Masukkan Nominal Deposit : ");
        double nominal = input.nextDouble();

        if(nominal > 0) {
            balance += nominal;
            System.out.println("Deposit Berhasil");
        }else{
            System.out.println("Deposit Gagal");
        }

        System.out.println("Saldo Anda : " + balance);
        
    }

    private static void withdraw(Scanner input){
        System.out.println("Masukkan Nominal Withdraw : ");
        double nominal = input.nextDouble();

        if(nominal > balance){
            System.out.println("Saldo Anda Tidak Mencukupi");
        }else{
            balance -= nominal;
            System.out.println("Withdraw Berhasil");
            System.out.println("Saldo Anda : " + balance);
        }
    }




}
