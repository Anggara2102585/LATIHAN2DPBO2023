/* Saya Apri Anggara Yudha NIM 2102585 mengerjakan soal Latihan2 dalam mata kuliah 
Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya 
tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

package p2.prak.lat2.java;

class Mahasiswa extends SivitasAkademik {

    private String nim;
    private String prodi;
    private String fakultas;

    Mahasiswa (String nik, String nama, String jenis_kelamin, String asal_universitas, String email_edu, String nim, String prodi, String fakultas) {
        super(nik, nama, jenis_kelamin, asal_universitas, email_edu);
        this.nim = nim;
        this.prodi = prodi;
        this.fakultas = fakultas;
    }

    // Getter
    String getNim () {
        return nim;
    }
    String getProdi () {
        return prodi;
    }
    String getFakultas () {
        return fakultas;
    }
    // Setter
    void setNim (String nim) {
        this.nim = nim;
    }
    void setProdi (String prodi) {
        this.prodi = prodi;
    }
    void setFakultas (String fakultas) {
        this.fakultas = fakultas;
    }
  
}
