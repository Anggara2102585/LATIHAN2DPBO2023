<?php
/* Saya Apri Anggara Yudha NIM 2102585 mengerjakan soal Latihan2 dalam mata kuliah 
Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya 
tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

class Human {

    private $nik;
    private $nama;
    private $jenis_kelamin;

    public function __construct($nik='', $nama='', $jenis_kelamin='') {
        $this->nik = $nik;
        $this->nama = $nama;
        $this->jenis_kelamin = $jenis_kelamin;
    }

    // Getter
    public function getNik() {
        return $this->nik;
    }
    public function getNama() {
        return $this->nama;
    }
    public function getJenisKelamin() {
        return $this->jenis_kelamin;
    }
    // Setter
    public function setNik($nik) {
        $this->nik = $nik;
    }
    public function setNama($nama) {
        $this->nama = $nama;
    }
    public function setJenisKelamin($jenis_kelamin) {
        $this->jenis_kelamin = $jenis_kelamin;
    }

}
?>