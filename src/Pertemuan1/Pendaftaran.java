package Pertemuan1;


import Pertemuan1.Mahasiswa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RIMTECH COMPUTER
 */
public class Pendaftaran {
    public static void main(String[] args){
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Rahmi";
        mhs.nobp = "2101092016";
        mhs.kelas = "2b";
        mhs.prodi = "MI";
        mhs.jurusan = "Teknlogi Informasi";
        
        System.out.println("Nama :"+mhs.nama+ "\n"
                    + "No BP :"+mhs.nobp+ "\n"
                        + "Jurusan :"+mhs.jurusan+ "\n"
                            + "Prodi :"+mhs.prodi+ "\n"
                                + "Kelas :"+mhs.kelas);
        
        System.out.println("     ");
        
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nama = "Nila";
        mhs2.nobp = "2101092012";
        mhs2.kelas = "2b";
        mhs2.prodi = "MI";
        mhs2.jurusan = "Teknologi Informasi";
        
        System.out.println("Nama :"+mhs2.nama+ "\n"
                    + "No BP :"+mhs2.nobp+ "\n"
                        + "Jurusan :"+mhs2.jurusan+ "\n"
                            + "Prodi :"+mhs2.prodi+ "\n"
                                + "Kelas :"+mhs2.kelas);
    }
}
