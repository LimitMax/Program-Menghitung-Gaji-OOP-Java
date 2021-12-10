package uts2genap;

public class Tetap extends Gaji {
    //Inisialisai Field
    private String nip;
    private String alamat;
    private int lamaKerja;
    private int gaji;
    private int tunjanganTransportasi;
    private int tunjanganAnak;

    //Constructor
    public Tetap(){
        this.status = "TETAP";
        this.nip = nip;
        this.tunjanganAnak = 500000;
        this.tunjanganTransportasi = 300000;
    }

    //Getter Setter
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public int getTunjanganTransportasi() {
        return tunjanganTransportasi;
    }

    public void setTunjanganTransportasi(int tunjanganTransportasi) {
        this.tunjanganTransportasi = tunjanganTransportasi;
    }

    public int getTunjanganAnak() {
        return tunjanganAnak;
    }

    public void setTunjanganAnak(int tunjanganAnak) {
        this.tunjanganAnak = tunjanganAnak;
    }

    //Gaji Pokok Sesuai Lama Kerjanya
    public int gajiPokok(){
        if(lamaKerja <= 5){
            return 1800000;
        } else if(lamaKerja <= 10){
            return 2500000;
        } else if(lamaKerja <= 20){
            return 3500000;
        }else {
            return 5000000;
        }
    }

    //Total Gaji Pegawai
    public int totalGajiPegawai(){
        return gajiPokok() + tunjanganAnak + tunjanganTransportasi;
    }
}
