""" Saya Apri Anggara Yudha NIM 2102585 mengerjakan soal Latihan2 dalam mata kuliah 
Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya 
tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. """

from SivitasAkademik import SivitasAkademik

class Mahasiswa(SivitasAkademik):
    def __init__(self):
        self.__nim = ""
        self.__prodi = ""
        self.__fakultas = ""

    # Getter
    def getNim(self):
        return self.__nim
    def getProdi(self):
        return self.__prodi
    def getFakultas(self):
        return self.__fakultas

    # Setter
    def setNim(self, value):
        self.__nim = value
    def setProdi(self, value):
        self.__prodi = value
    def setFakultas(self, value):
        self.__fakultas = value
