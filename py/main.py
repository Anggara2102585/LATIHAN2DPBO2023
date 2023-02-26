""" Saya Apri Anggara Yudha NIM 2102585 mengerjakan soal Latihan2 dalam mata kuliah 
Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya 
tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. """

from Mahasiswa import Mahasiswa

# Deklarasi list
listMhs = []

# Mengisi list
mhs = Mahasiswa()
mhs.setNik("12341")
mhs.setNama("Orang1")
mhs.setJenisKelamin("L")
mhs.setAsalUniversitas("UPI")
mhs.setEmailEdu("satu@upi.edu")
mhs.setNim("11234")
mhs.setProdi("Ilkom")
mhs.setFakultas("FPMIPA")
listMhs.append(mhs)

mhs = Mahasiswa()
mhs.setNik("12342")
mhs.setNama("Orang2")
mhs.setJenisKelamin("P")
mhs.setAsalUniversitas("UPI")
mhs.setEmailEdu("dua@upi.edu")
mhs.setNim("21234")
mhs.setProdi("Ilkom")
mhs.setFakultas("FPMIPA")
listMhs.append(mhs)

# Print isi list
for mhs in listMhs:
    print("------------------------------")
    print("NIK             : ", mhs.getNik())
    print("Nama            : ", mhs.getNama())
    print("Jenis_kelamin   : ", mhs.getJenisKelamin())
    print("Asal universitas: ", mhs.getAsalUniversitas())
    print("Email_edu       : ", mhs.getEmailEdu())
    print("NIM             : ", mhs.getNim())
    print("Prodi           : ", mhs.getProdi())
    print("Fakultas        : ", mhs.getFakultas())
