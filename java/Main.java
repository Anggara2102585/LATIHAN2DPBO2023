/* Saya Apri Anggara Yudha NIM 2102585 mengerjakan soal Latihan2 dalam mata kuliah 
Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya 
tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

package p2.prak.lat2.java;

// import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Mahasiswa mhsBaru;
        ArrayList<Mahasiswa> listMhs = new ArrayList<Mahasiswa>();

        // Mahasiswa mhsBaru = new Mahasiswa(nik, nama, jenis_kelamin, asal_universitas, email_edu, nim, prodi, fakultas);
        mhsBaru = new Mahasiswa("12341", "Orang1", "L", "UPI", "satu@upi.edu", "11234", "Ilkom", "FPMIPA");
        listMhs.add(mhsBaru);
        mhsBaru = new Mahasiswa("12342", "Orang2", "P", "UPI", "dua@upi.edu", "21234", "Ilkom", "FPMIPA");
        listMhs.add(mhsBaru);

        // READ
        if (listMhs.isEmpty()) {
            System.out.println("------------------------------");
            System.out.println("Data kosong");
        } else {
            for (int i=0; i<listMhs.size(); i++) {
                System.out.println("------------------------------");
                System.out.println("NIK             : " + listMhs.get(i).getNik());
                System.out.println("Nama            : " + listMhs.get(i).getNama());
                System.out.println("Jenis_kelamin   : " + listMhs.get(i).getJenisKelamin());
                System.out.println("Asal universitas: " + listMhs.get(i).getAsalUniversitas());
                System.out.println("Email_edu       : " + listMhs.get(i).getEmailEdu());
                System.out.println("NIM             : " + listMhs.get(i).getNim());
                System.out.println("Prodi           : " + listMhs.get(i).getProdi());
                System.out.println("Fakultas        : " + listMhs.get(i).getFakultas());
            }
        }

    }
}