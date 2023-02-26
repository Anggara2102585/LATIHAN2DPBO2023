<?php
/* Saya Apri Anggara Yudha NIM 2102585 mengerjakan soal Latihan2 dalam mata kuliah 
Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya 
tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

require('SivitasAkademik.php');

class Mahasiswa extends SivitasAkademik {

    private $nim;
    private $prodi;
    private $fakultas;

    public function __construct($nik='', $nama='', $jenis_kelamin='', $asal_universitas='', $email_edu='', $nim='', $prodi='', $fakultas='') {
        parent::__construct($nik, $nama, $jenis_kelamin, $asal_universitas, $email_edu);
        $this->nim = $nim;
        $this->prodi = $prodi;
        $this->fakultas = $fakultas;
    }

    // Getter
    public function getNim() {
        return $this->nim;
    }
    public function getProdi() {
        return $this->prodi;
    }
    public function getFakultas() {
        return $this->fakultas;
    }
    // Setter
    public function setNim($nim) {
        $this->nim = $nim;
    }
    public function setProdi($prodi) {
        $this->prodi = $prodi;
    }
    public function setFakultas($fakultas) {
        $this->fakultas = $fakultas;
    }
  
}
?>