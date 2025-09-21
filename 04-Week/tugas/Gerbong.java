package tugas;
public class Gerbong {
    private String kode;
    private Penumpang[][] arrKursi;

    Gerbong(String kode, int baris, int kolom){
        this.kode = kode;
        this.arrKursi = new Penumpang[baris][kolom];
    }

    public void setKode(String kode){
        this.kode = kode;
    }

    public String getKode(){
        return kode;
    }

    public void setPenumpang(Penumpang p, int baris, int kolom){
        if(baris < arrKursi.length && kolom < arrKursi[0].length){
            arrKursi[baris][kolom] = p;
        }else{
            System.out.println("Posisi Kursi tidak valid!");
        }
    }

    public Penumpang getPenumpang(int baris, int kolom){
        if(baris < arrKursi.length && kolom < arrKursi[0].length){
            return arrKursi[baris][kolom];
        }
        return null;
    }

    public Penumpang[][] getArrKursi() {
        return arrKursi;
    }

    public String info() {
        String result = "Gerbong { Kode: " + kode + " }\n";
        for (int i = 0; i < arrKursi.length; i++) {
            for (int j = 0; j < arrKursi[i].length; j++) {
                if (arrKursi[i][j] != null) {
                    result += "Kursi[" + i + "][" + j + "]: " + arrKursi[i][j].info() + "\n";
                } else {
                    result += "Kursi[" + i + "][" + j + "]: Kosong\n";
                }
            }
        }
    return result;
    }
}


