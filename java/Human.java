/* Saya Apri Anggara Yudha NIM 2102585 mengerjakan soal Latihan2 dalam mata kuliah 
Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya 
tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

package p2.prak.lat2.java;

class Human {
    
    private String nik;
    private String nama;
    private String jenis_kelamin;

    Human () {
    }

    Human (String nik, String nama, String jenis_kelamin) {
        this.nik = nik;
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
    }

    // Getter
    String getNik () {
        return nik;
    }
    String getNama () {
        return nama;
    }
    String getJenisKelamin () {
        return jenis_kelamin;
    }
    // Setter
    void setNik (String nik) {
        this.nik = nik;
    }
    void setNama (String nama) {
        this.nama = nama;
    }
    void setJenisKelamin (String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

}
