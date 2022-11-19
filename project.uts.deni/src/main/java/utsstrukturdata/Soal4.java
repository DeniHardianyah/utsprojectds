/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsstrukturdata;

import java.util.Scanner;
import java.util.LinkedList;
/**
 *
 * @author ASUS
 */
public class Soal4 {
    public static void main(String[] args) {
        LinkedList<Mahasiswa> MahasiswaList = new LinkedList<>();
        MahasiswaList.add(new Mahasiswa(0001, "Aditya Ramdhani", "TIFRM22A", 011222));
        MahasiswaList.add(new Mahasiswa(0002, "William Pradana P", "TIFRM22A", 011222));
        MahasiswaList.add(new Mahasiswa(0003, "Dian", "TIFRM22A", 011222));
        MahasiswaList.add(new Mahasiswa(0004, "Reppy", "TIFRM22A", 011222));
        MahasiswaList.add(new Mahasiswa(0005, "Nadif", "TIFRM22A", 011222));

        Scanner valueId = new Scanner(System.in);
        Scanner valueName = new Scanner(System.in);
        Scanner valueKelas = new Scanner(System.in);
        Scanner valueTanggal = new Scanner(System.in);
        Scanner value = new Scanner(System.in);
        System.out.println("Masukan Data Mahasiswa Untuk Ditambahkan");
        System.out.print("Masukan Id Mahasiswa : ");
        int id = valueId.nextInt();
        System.out.print("Masukan Nama Mahasiswa : ");
        String name = valueName.nextLine();
        System.out.print("Masukan Kelas Mahasiswa : ");
        String kelas = valueKelas.nextLine();
        System.out.print("Masukan Tanggal : ");
        int tanggal = valueTanggal.nextInt();

        MahasiswaList.add(new Mahasiswa(id, name, kelas, tanggal));

        MahasiswaList.forEach(Mahasiswa -> System.out.println(Mahasiswa.toString()));

        System.out.println("Masukan Data Mahasiswa Untuk Dihapus");
        System.out.print("Masukan Nama Mahasiswa : ");
        String nameRemove = value.nextLine();
        MahasiswaList.removeIf(Mahasiswa -> Mahasiswa.getName().contains(nameRemove));
        MahasiswaList.forEach(Mahasiswa -> System.out.println(Mahasiswa.toString()));

    }

}

