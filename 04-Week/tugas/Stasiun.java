package tugas;
public class Stasiun {
    private String nama, lokasi;

    Stasiun(String nama, String lokasi){
        this.nama = nama;
        this.lokasi = lokasi;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setLokasi(String lokasi){
        this.lokasi = lokasi;
    }

    public String getLokasi(){
        return lokasi;
    }

    public String info(){
        return "" + this.lokasi + "(" + this.nama + ")";
    }
}
