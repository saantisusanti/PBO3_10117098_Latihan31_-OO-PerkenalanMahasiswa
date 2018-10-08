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
public class PBO3_10117098_Latihan31_OOPerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = "10117098";
        mhs1.nama = "Santi Susanti";
        mhs1.perkenalanDiri(mhs1.nim, mhs1.nama);
     
         Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = "10117082";
        mhs2.nama = "Widiamega";
        mhs2.perkenalanDiri(mhs2.nim, mhs2.nama);     
        
         Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = "20000320";
        mhs3.nama = "Perth Tanapon";
        mhs3.perkenalanDiri(mhs3.nim, mhs3.nama);
    }
    
}
