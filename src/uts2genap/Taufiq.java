package uts2genap;
import java.util.Scanner;

/**
 *
 * NIM      : 10120708
 * NAMA     : TAUFIQ QUROHMAN RUKI
 * KELAS    : IF7
 */
public class Taufiq {
    public static void main(String[] args) {
        //Pengulangan Program
        String ulg = "y";
        while (ulg.equals("y")){
            
        //Input data via keyboard
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung Gaji Pegawai PT.CENAT-CENUT");
        System.out.println("==============================================");
        System.out.print("Masukkan Status Pegawai [TETAP/HONOR] : ");
        String status = input.nextLine();
        System.out.println("");

        //Cek Apakah Status Pegawai Tetap atau Honor
            if(status.equalsIgnoreCase("Tetap")){
                Tetap tetap = new Tetap();
                System.out.println("Masukkan Data Pegawai");
                System.out.println("=============================================");
                System.out.print("Masukan NIP Pegawai               : ");
                tetap.setNip((input.nextLine()));
                System.out.print("Masukan Nama Pegawai              : ");
                tetap.setNama((input.nextLine()));
                System.out.print("Masukan Alamat Pegawai            : ");
                tetap.setAlamat((input.nextLine()));
                System.out.print("Masukan Lama Kerja Pegawai (Tahun): ");
                tetap.setLamaKerja((input.nextInt()));
                System.out.println("");

                System.out.println("Tampil Data Gaji Pegawai Tetap");
                System.out.println("=============================================");
                System.out.println("NIP Pegawai                     : " + tetap.getNip());
                System.out.println("Nama Pegawai                    : " + tetap.getNama());
                System.out.println("Alamat Pegawai                  : " + tetap.getAlamat());
                System.out.println("Status Pegawai                  : " + tetap.getStatus());
                System.out.println("Total Gaji Pegawai              : Rp. " + tetap.totalGajiPegawai());
                System.out.println("");
                System.out.println("Rincian Gaji Pegawai");
                System.out.println("Lama Kerja Pegawai              : " + tetap.getLamaKerja() + " Tahun");
                System.out.println("Gaji Pokok Pegawai              : Rp. " + tetap.gajiPokok());
                System.out.println("Tunjangan Anak                  : Rp. " + tetap.getTunjanganAnak());
                System.out.println("Tunjangan Transportasi          : Rp. " + tetap.getTunjanganTransportasi());
            } else if(status.equalsIgnoreCase("Honor")){
                Honor honor = new Honor();
                System.out.println("Masukkan Data Pegawai");
                System.out.println("==============================================");
                System.out.print("Masukan Nama Pegawai              : ");
                honor.setNama((input.nextLine()));
                System.out.print("Masukan Alamat Pegawai            : ");
                honor.setAlamat((input.nextLine()));
                System.out.print("Jumlah hari kerja Pegawai         : ");
                honor.setJumlahHari((input.nextInt()));
                System.out.println("");

                System.out.println("Tampil Data Gaji Pegawai Honor");
                System.out.println("=============================================");
                System.out.println("Nama Pegawai                    : " + honor.getNama());
                System.out.println("Alamat                          : " + honor.getAlamat());
                System.out.println("Status Pegawai                  : " + honor.getStatus());
                System.out.println("Total Gaji                      : Rp. " + honor.gajiPegawai());
                System.out.println("");
                System.out.println("Rincian Gaji Pegawai");
                System.out.println("Jumlah Hari Kerja Pegawai       : " + honor.getJumlahHari() + " Hari") ;
                System.out.println("Honor Pokok Pegawai             : Rp. " + honor.honorPokok());
                System.out.println("Tunjangan Makan Harian          : Rp. " + honor.biayaMakan());
            } else {
                System.out.println("Silahkan Masukkan Status Pegawai Anda!!!");
            }
            
            System.out.println("");
            System.out.println("==========================================");
            System.out.print("Apakah anda ingin mengulang (y/t)? ");
            ulg = input.next();
            System.out.println("");
            if(ulg.equalsIgnoreCase("t")){
                System.out.println("Terima Kasih Telah Menggunakan Program Ini :)");
            }
        }
    }
}