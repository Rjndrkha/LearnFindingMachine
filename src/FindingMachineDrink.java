import java.util.*;

public class FindingMachineDrink {

    private static Map<String, Integer> drink = new HashMap<String, Integer>();
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        drink.put("Coca Cola", 10000);
        drink.put("Fanta", 10000);
        drink.put("Sprite", 10000);
        drink.put("Pocari Sweat", 10000);
        drink.put("Aqua", 10000);

        System.out.println("Selamat Datang Di Aplikasi Saya");
        while(true){
            System.out.println("1. Lihat Daftar Minuman");
            System.out.println("2. Beli Minuman");
            System.out.println("3. Keluar");
            System.out.print("Pilih Menu : ");
            int menu = input.nextInt();

            if(menu == 1){
                showDrink();
            }else if(menu == 2){
                buyDrink(input);
            }else if(menu == 3){
                System.out.println("Terima Kasih Telah Menggunakan Aplikasi Saya");
                break;
            }else{
                System.out.println("Menu Tidak Tersedia");
            }
        }
    }
    
    private static void showDrink(){
        System.out.println("Daftar Minuman");
        for (Map.Entry<String, Integer> entry : drink.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();
    }

    private static void buyDrink(Scanner input){
        System.out.println("Masukkan Nama Minuman : ");
        String name = input.next();
        System.out.println("Masukkan Jumlah Minuman : ");
        int amount = input.nextInt();

        if (drink.containsKey(name) ) {
            int price = drink.get(name);
            int total = price * amount;
            System.out.println("Total Harga : " + total);

            System.out.println("Harap Masukkan Uang Pas : ");
            int money = input.nextInt();

            if (money != total) {
                System.out.println("Uang Kembali ! Masukkan Uang Pas" + money );
            }else if (money == total) {
                System.out.println("Terima Kasih Telah Membeli Minuman" + name);
            }else{
                System.out.println("Uang Anda Kurang");
            }
            
        }else{
            System.out.println("Minuman Tidak Tersedia");
        }
    

    }
}
