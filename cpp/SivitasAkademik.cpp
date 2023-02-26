/* Saya Apri Anggara Yudha NIM 2102585 mengerjakan soal Latihan2 dalam mata kuliah 
Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya 
tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

#include <string>
#include "Human.cpp"

using namespace std;

class SivitasAkademik : public Human  {
    
private:
    string asal_universitas;
    string email_edu;

public:
    SivitasAkademik () {
    }
    
    SivitasAkademik (string nik, string nama, string jenis_kelamin, string asal_universitas, string email_edu)
    : Human (nik, nama, jenis_kelamin) {
        this->asal_universitas = asal_universitas;
        this->email_edu = email_edu;
    }

    // Getter
    string getAsalUniversitas () {
        return asal_universitas;
    }
    string getEmailEdu () {
        return email_edu;
    }
    // Setter
    void setAsalUniversitas (string asal_universitas) {
        this->asal_universitas = asal_universitas;
    }
    void setEmailEdu (string email_edu) {
        this->email_edu = email_edu;
    }
    
};
