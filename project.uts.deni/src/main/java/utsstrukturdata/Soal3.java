/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsstrukturdata;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Soal3 {
    public static void main(String[] args) {

        List<Mahasiswa> MahasiswaList = new ArrayList<>();
        MahasiswaList.add(new Mahasiswa(0001, "Aditya Ramdhani", "TIFRM22A", 011222));
        MahasiswaList.add(new Mahasiswa(0002, "William Pradana P", "TIFRM22A", 011222));
        MahasiswaList.add(new Mahasiswa(0003, "Dian", "TIFRM22A", 011222));
        MahasiswaList.add(new Mahasiswa(0004, "Reppy", "TIFRM22A", 011222));
        MahasiswaList.add(new Mahasiswa(0005, "Nadif", "TIFRM22A", 011222));

        MahasiswaList.forEach(Mahasiswa -> System.out.println(Mahasiswa.toString()));
        System.out.println("Panjang Data Mahasiswa -> " + MahasiswaList.size());
        MahasiswaList.remove(0);

        MahasiswaList.forEach(Mahasiswa -> System.out.println(Mahasiswa.toString()));
        System.out.println("Panjang Data Mahasiswa -> " + MahasiswaList.size()); 
    }

}
