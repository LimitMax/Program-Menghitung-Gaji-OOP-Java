package uts2genap;


public class Honor extends Gaji {
     //Inisialisasi Field
    private int honor;
    private int tunjanganMakan;
    private int gaji;
    private int jumlahHari;
    private String alamat;

    //Constructor
    public Honor() {
        this.status = "HONOR";
        this.jumlahHari = jumlahHari;
        this.alamat = alamat;
        this.honor = honor;
        this.tunjanganMakan = tunjanganMakan;
    }

    //Getter Setter
    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getTunjanganMakan() {
        return tunjanganMakan;
    }

    public void setTunjanganMakan(int tunjanganMakan) {
        this.tunjanganMakan = tunjanganMakan;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public int getJumlahHari() {
        return jumlahHari;
    }

    public void setJumlahHari(int jumlahHari) {
        this.jumlahHari = jumlahHari;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    //Hitung Tunjangan Biaya Makan
    public int biayaMakan(){
        return tunjanganMakan = (jumlahHari*10000);
    }

    //Hitung Gaji Pokok Sesuai dengan Lama Kerjanya
    public int honorPokok(){
        return honor = (jumlahHari*80000);
    }

    //Hitung Total Gaaji Pegawai Honor
    public int gajiPegawai(){
        return honorPokok()+biayaMakan();
    }
}
