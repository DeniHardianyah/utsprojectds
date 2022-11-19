/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsstrukturdata;

/**
 *
 * @author ASUS
 */
public class Soal1 {
    public static void main(String[] args) {
        
        int angka [] = {30, 31, 44, 46, 87, 88, 112, 114, 150, 159, 190, 280, 266, 290, 350};
    
    System.out.println ("\t Angka Ganjil & Genap \n");
    
    System.out.println("====================================================== \n");
    
    System.out.print("\n Angka Genap :");
    for (int i = 0; i < 15; i++) {
        if (angka[i] %2 == 0){
            System.out.print(angka[i] + ", ");
        }
    }    
       System.out.print("\n Angka Ganjil :");
    for (int j = 0; j < 15; j++) {
        if (angka[j] %2 != 0){
            System.out.print(angka[j] + ", ");
        }
     }   
    }
}
