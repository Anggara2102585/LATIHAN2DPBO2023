/* Saya Apri Anggara Yudha NIM 2102585 mengerjakan soal Latihan2 dalam mata kuliah 
Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya 
tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

package p2.prak.lat2.java;

class SivitasAkademik extends Human  {
    
    private String asal_universitas;
    private String email_edu;

    SivitasAkademik () {
    }
    
    SivitasAkademik (String nik, String nama, String jenis_kelamin, String asal_universitas, String email_edu) {
        super(nik, nama, jenis_kelamin);
        this.asal_universitas = asal_universitas;
        this.email_edu = email_edu;
    }

    // Getter
    String getAsalUniversitas () {
        return asal_universitas;
    }
    String getEmailEdu () {
        return email_edu;
    }
    // Setter
    void setAsalUniversitas (String asal_universitas) {
        this.asal_universitas = asal_universitas;
    }
    void setEmailEdu (String email_edu) {
        this.email_edu = email_edu;
    }
    
}
