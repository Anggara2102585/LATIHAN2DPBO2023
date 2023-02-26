/* Saya Apri Anggara Yudha NIM 2102585 mengerjakan soal Latihan2 dalam mata kuliah 
Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya 
tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

#include <iostream>
#include <string>
#include <list>
#include "Mahasiswa.cpp"

using namespace std;

int main () {
    // Deklarasi list
    list<Mahasiswa*> listMhs;

    // Isi nilai list
    listMhs.push_back(new Mahasiswa("12341", "Orang1", "L", "UPI", "satu@upi.edu", "11234", "Ilkom", "FPMIPA"));
    listMhs.push_back(new Mahasiswa("12342", "Orang2", "P", "UPI", "dua@upi.edu", "21234", "Ilkom", "FPMIPA"));

    // Foreach loop listMhs ke i lakukan read data
    for (auto i : listMhs) {
        cout << "------------------------------\n";
        cout << "NIK             : " << i->getNik() << endl;
        cout << "Nama            : " << i->getNama() << endl;
        cout << "Jenis_kelamin   : " << i->getJenisKelamin() << endl;
        cout << "Asal universitas: " << i->getAsalUniversitas() << endl;
        cout << "Email_edu       : " << i->getEmailEdu() << endl;
        cout << "NIM             : " << i->getNim() << endl;
        cout << "Prodi           : " << i->getProdi() << endl;
        cout << "Fakultas        : " << i->getFakultas() << endl;
    }
    
    // Foreach loop listMhs free memory
    for (auto i : listMhs) {
        delete i;
    }
    // Lepas semua pointer di listMhs
    listMhs.clear();

    return 0;
}
