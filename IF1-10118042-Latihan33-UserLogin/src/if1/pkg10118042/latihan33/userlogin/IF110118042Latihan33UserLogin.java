
package if1.pkg10118042.latihan33.userlogin;

import java.util.Scanner;

/**
 * @author
 * Nama  : Dhimas Aji Ghairrahmat
 * Kelas : IF1
 * NIM   : 10118042
 * Deskripsi Program : Program ini berfungsi untuk Memasukkan User login
 * 
 */
public class IF110118042Latihan33UserLogin {
    private static String usName;
    private static String passWord;
    
    public static void main(String[] args) {
        //input
            Scanner scanner = new Scanner(System.in);
                            
            System.out.print("Masukkan Username = ");
            usName = scanner.nextLine();
                            
            System.out.print("Masukkan Password = ");
            passWord = scanner.nextLine();
                            
        //proses
            User user = new User();
            user.pengecekanLogin(usName, passWord);
                            
                            
                                    
	}

}