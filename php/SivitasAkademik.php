<?php
/* Saya Apri Anggara Yudha NIM 2102585 mengerjakan soal Latihan2 dalam mata kuliah 
Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya 
tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

require('Human.php');

class SivitasAkademik extends Human  {
    
    private $asal_universitas;
    private $email_edu;

    public function __construct($nik='', $nama='', $jenis_kelamin='', $asal_universitas='', $email_edu='') {
        parent::__construct($nik, $nama, $jenis_kelamin);
        $this->asal_universitas = $asal_universitas;
        $this->email_edu = $email_edu;
    }

    // Getter
    public function getAsalUniversitas() {
        return $this->asal_universitas;
    }
    public function getEmailEdu() {
        return $this->email_edu;
    }
    // Setter
    public function setAsalUniversitas($asal_universitas) {
        $this->asal_universitas = $asal_universitas;
    }
    public function setEmailEdu($email_edu) {
        $this->email_edu = $email_edu;
    }
    
}
?>