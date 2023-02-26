/* Saya Apri Anggara Yudha NIM 2102585 mengerjakan soal Latihan2 dalam mata kuliah 
Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya 
tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */


#include <string>
#include "SivitasAkademik.cpp"

using namespace std;

class Mahasiswa : public SivitasAkademik {

private:
    string nim;
    string prodi;
    string fakultas;

public:
    Mahasiswa () {
    }

    Mahasiswa (string nik, string nama, string jenis_kelamin, string asal_universitas, string email_edu, string nim, string prodi, string fakultas)
    : SivitasAkademik (nik, nama, jenis_kelamin, asal_universitas, email_edu) {
        this->nim = nim;
        this->prodi = prodi;
        this->fakultas = fakultas;
    }

    // Getter
    string getNim () {
        return nim;
    }
    string getProdi () {
        return prodi;
    }
    string getFakultas () {
        return fakultas;
    }
    // Setter
    void setNim (string nim) {
        this->nim = nim;
    }
    void setProdi (string prodi) {
        this->prodi = prodi;
    }
    void setFakultas (string fakultas) {
        this->fakultas = fakultas;
    }
  
};
