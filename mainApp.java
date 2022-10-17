

public class mainApp {
    public static void main(String[] args){
        karyawan karyawan=new karyawan("Mursalin", "Sukarara", "087754436624");

        penggajian penggajian=new penggajian("Rp.2.500.000", "Rp.2.000.00", "Rp.4.000.000");

        status_pendidikan status_pendidikan=new status_pendidikan("Aktif");

        jabatan jabatan=new jabatan("Kasir");

        karyawan.cetakkaryawan(karyawan.no_hp);
        penggajian.cetakpenggajian(penggajian.gajiPokok);
        jabatan.cetakjabatan(jabatan.jabatan);
        status_pendidikan.cetakstatus_pendidikan(status_pendidikan.status);
    }


}
