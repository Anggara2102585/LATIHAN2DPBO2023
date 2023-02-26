<?php
/* Saya Apri Anggara Yudha NIM 2102585 mengerjakan soal Latihan2 dalam mata kuliah 
Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya 
tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

// Include files
require('Mahasiswa.php');

// Deklarasi list
$listMhs = array();

// Isi nilai list
array_push($listMhs, new Mahasiswa("12341", "Orang1", "L", "UPI", "satu@upi.edu", "11234", "Ilkom", "FPMIPA"));
array_push($listMhs, new Mahasiswa("12342", "Orang2", "P", "UPI", "dua@upi.edu", "21234", "Ilkom", "FPMIPA"));

// Foreach loop listMhs dan lakukan read data
foreach ($listMhs as $mhs) {
    echo "------------------------------" . "<br>";
    echo "NIK             : " . $mhs->getNik() . "<br>";
    echo "Nama            : " . $mhs->getNama() . "<br>";
    echo "Jenis_kelamin   : " . $mhs->getJenisKelamin() . "<br>";
    echo "Asal universitas: " . $mhs->getAsalUniversitas() . "<br>";
    echo "Email_edu       : " . $mhs->getEmailEdu() . "<br>";
    echo "NIM             : " . $mhs->getNim() . "<br>";
    echo "Prodi           : " . $mhs->getProdi() . "<br>";
    echo "Fakultas        : " . $mhs->getFakultas() . "<br>";
}
?>
