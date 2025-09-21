package tugas;
public class KeretaApi{
   private String nama, kelas;
   private Pegawai masinis;
   private Pegawai asisten;
   private Stasiun stasiun;

   private Gerbong[] gerbongs;
   private int jumlahGerbong = 0; 
   
   KeretaApi(String nm, String kelas, Pegawai masinis, Pegawai asisten){
      this.nama = nm;
      this.kelas = kelas;
      this.masinis = masinis;
      this.asisten = asisten;
      this.gerbongs = new Gerbong[3];
   };
   public void setNama(String nama){
      this.nama = nama;
   }
   public void setKelas(String kls){
      this.kelas = kls;
   }

   public void setStasiun(Stasiun s){
      this.stasiun = s;
   }

   public void addGerbong(Gerbong g){
      if(jumlahGerbong < gerbongs.length){
         gerbongs[jumlahGerbong] = g;
         jumlahGerbong++;
      }else{
         System.out.print("Gerbong sudah penuh, tidak bisa tambah gerbong lagi");
      }
   }
   public String info() {
        String info = "=== Informasi Kereta Api ===\n";
        info += "Nama     : " + this.nama + "\n";
        info += "Kelas    : " + this.kelas + "\n";
        info += "Masinis  : " + this.masinis.info() + "\n";
        if(this.asisten != null){
            info += "Asisten  : " + this.asisten.info() + "\n";
        }
        if(this.stasiun != null){ 
            info += "Stasiun  : " + this.stasiun.info() + "\n\n";
        }

        if (jumlahGerbong > 0) {
            info += "\n--- Data Gerbong ---\n";
            for (int i = 0; i < jumlahGerbong; i++) {
                info += gerbongs[i].info() + "\n";
            }
        }
        return info;
    }
}  