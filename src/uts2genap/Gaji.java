package uts2genap;


public class Gaji {
    //Inisialisasi Field
    protected String nama;
    protected String status;

    //Constructor
    public Gaji() {
        this.status = "Belum Ada Status";
    }

    //Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void statusPegawai(){
        System.out.println("MAAF STATUS KARYAWAN TERSEBUT TIDAK ADA");
    }
}
