/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RIMTECH COMPUTER
 */
public class Mahasiswa {
    String nama,nobp,kelas,prodi,jurusan;
    
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama ="Rahmi";
        mhs.nobp ="2101092016";
        mhs.kelas ="2b";
        mhs.prodi ="MI";
        mhs.jurusan ="Teknologi Informasi";
        
        System.out.println("Nama : "+mhs.nama+ "\n"
                + "No BP :"+mhs.nobp+ "\n"
                    + "Jurusan :" +mhs.jurusan+ "\n"
                            + "Prodi :" +mhs.prodi+ "\n"
                                    + "Kelas :"+mhs.kelas);
        
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nama = "Nila";
        mhs2.nobp = " 2101092012";
        mhs2.kelas = "2b";
        mhs2.prodi = "MI";
        mhs2.jurusan = "Teknologi Informasi";
        
        System.out.println("Nama: "+mhs.nama+ "\n"
                + "No BP :"+mhs.nobp+ "\n"
                    + "Jurusan :"+mhs.jurusan+ "\n"
                        +)
    }
}
