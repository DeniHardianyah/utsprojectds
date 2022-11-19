/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsstrukturdata;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Soal2 {
   public static void main(String[] args) {

        int[] angka = new int[10];
        Scanner valueArray = new Scanner(System.in);

        System.out.println("Masukan Isi Dari Array");

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukan Index ke-" + (i + 1) + " : ");
            angka[i] = valueArray.nextInt();
        }
        bubbleSort(angka);
        System.out.println("Isi Arraay : " + Arrays.toString(angka));
    }

     static void bubbleSort(int array[]) {
        int size = array.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

}
