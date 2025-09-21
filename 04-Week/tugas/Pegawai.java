package tugas;
public class Pegawai {
    private String nip, nama;

    Pegawai(String nip, String nama){
        this.nip  = nip;
        this.nama = nama;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public String getNip(){
        return nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }
    
    public String info(){
        return "" + this.nama + "[NIP: " + this.nip + "]" ;
    }
}
