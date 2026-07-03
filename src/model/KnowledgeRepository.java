package model;

import java.util.ArrayList;

/**
 * Repository (Model): menyimpan dan mengelola koleksi data Putusan
 * menggunakan ArrayList. Tidak tahu apapun tentang tampilan (View).
 * (Versi awal: baru simpan, cariByNomor, cariByNama)
 */
public class KnowledgeRepository {

    private ArrayList<Putusan> daftarPutusan;

    public KnowledgeRepository() {
        this.daftarPutusan = new ArrayList<>();
    }

    public void simpan(Putusan p) {
        daftarPutusan.add(p);
    }

    public Putusan cariByNomor(String nomor) {
        for (Putusan p : daftarPutusan) {
            if (p.getNomorPerkara().equalsIgnoreCase(nomor)) {
                return p;
            }
        }
        return null;
    }

    public ArrayList<Putusan> cariByNama(String nama) {
        ArrayList<Putusan> hasil = new ArrayList<>();
        for (Putusan p : daftarPutusan) {
            if (p.getNamaTerdakwa().toLowerCase().contains(nama.toLowerCase())) {
                hasil.add(p);
            }
        }
        return hasil;
    }

    public ArrayList<Putusan> getDaftarSemua() {
        return daftarPutusan;
    }

    public int getTotalData() {
        return daftarPutusan.size();
    }
}