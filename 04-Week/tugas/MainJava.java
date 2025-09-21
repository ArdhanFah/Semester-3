package tugas;
public class MainJava {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("P001", "Budi");
        Pegawai asisten = new Pegawai("P002", "Andi");
        Stasiun stasiun = new Stasiun("ST01", "Gambir");

        // Buat kereta api
        KeretaApi kereta = new KeretaApi("Argo Bromo", "Eksekutif", masinis, asisten);

        kereta.setStasiun(stasiun);

        // Buat gerbong dengan 2 baris dan 3 kolom kursi
        Gerbong g1 = new Gerbong("G1", 2, 3);
        kereta.addGerbong(g1);
        Gerbong g2 = new Gerbong("G2", 2, 3);
        kereta.addGerbong(g2);

        // Buat penumpang
        Penumpang p1 = new Penumpang("KTP001", "Gabriel", 1);
        Penumpang p2 = new Penumpang("KTP002", "Agus", 2);
        Penumpang p3 = new Penumpang("KTP011", "Slamet", 1);
        Penumpang p4 = new Penumpang("KTP012", "Ethan", 2);
        // Pasang penumpang ke kursi
        g1.setPenumpang(p1, 0, 0);
        g1.setPenumpang(p2, 1, 2);
        g2.setPenumpang(p3, 0, 0);
        g2.setPenumpang(p4, 1, 2);
        // Cetak info kereta
        System.out.println(kereta.info());
    }
}
