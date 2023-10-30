/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scanner;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class latihan22 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===perhitungan lingkaran===");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        double diameter = scanner.nextDouble();

        double jariJari = diameter / 2;
        double luas = Math.PI * jariJari * jariJari;
        double keliling = 2 * Math.PI * jariJari;
        try {

        System.out.println("===hasil perhitungan lingkaran===");
        System.out.println("jari jari lingkaran = " + jariJari + " cm");
        System.out.printf("luas lingkaran = %.2f cm\n", luas);
        System.out.printf("keliling lingkaran = %.2f cm\n", keliling);

    	} catch (Exception e) {
    		System.out.println("Nilai diameter tidak sesuai.");
    	}
    }

}
