/*
 * 
 * @author
 * NAMA : Zulfi Ihzam R
 * KELAS : PBO1
 * NIM : 10117125
 * 
 */
package if1.pkg10117125.latihan3.input;

import java.util.Scanner;

public class IF110117125Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Memasukan nama anda: ");
        Scanner scanner = new Scanner(System.in);

        String nama = scanner.next();
        System.out.print("Nama anda adalah " + nama);

    }

}
