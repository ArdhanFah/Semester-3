package tugas;
public class Penumpang {
    private String ktp, nama;
    private int kursi;

    Penumpang(String ktp, String nama, int kursi){
        this.ktp = ktp;
        this.nama = nama;
        this.kursi = kursi;
    }

    public void setKtp(String ktp){
        this.ktp = ktp;
    }

    public String getKtp(){
        return ktp;
    }
    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setKursi(int kursi){
        this.kursi = kursi;

    }

    public int getKursi(){
        return kursi;
    }

    public String info(){
         return "KTP: " + ktp + ", Nama: " + nama;

    }

}
