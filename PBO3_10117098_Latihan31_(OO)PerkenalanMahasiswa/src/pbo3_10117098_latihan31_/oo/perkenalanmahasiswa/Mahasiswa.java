/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan31_.oo.perkenalanmahasiswa;

/**
 *
 * @author
 * NAMA     : Santi Susanti
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : program ini berisi program untuk memperkenalkan mahasiswa 
 *                     dengan nim juga dan dari data yang ada
 */
public class Mahasiswa {
    public  String nim;
    public  String nama;
    public void perkenalanDiri(String nim, String nama){
        System.out.println("Hello Everyone");
        System.out.println("My Nim is "+nim);
        System.out.println("My Name is "+nama+"\n");
    }
}
