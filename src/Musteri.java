import java.util.ArrayList;
import java.util.List;

public class Musteri extends BaseEntity implements IKayit {
    private String telefon;
    private String email;
    private Film kayitliFilm;

    private static List<Musteri> musteriler = new ArrayList<>();

    public Musteri(int id, String adi, String telefon, String email, Film kayitliFilm) {
        super(id, adi);
        this.telefon = telefon;
        this.email = email;
        this.kayitliFilm = kayitliFilm;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Film getKayitliFilm() {
        return kayitliFilm;
    }

    @Override
    public void kayitEkle() {
        musteriler.add(this);
    }

    @Override
    public void kayitSil() {
        musteriler.remove(this);
    }

    @Override
    public void kayitGuncelle() {
        for (int i = 0; i < musteriler.size(); i++) {
            if (musteriler.get(i).getId() == this.getId()) {
                musteriler.set(i, this);
                break;
            }
        }
    }

    public static void musteriListesiGoruntule() {
        if (musteriler.isEmpty()) {
            System.out.println("Kayıtlı müşteri yok.");
        } else {
            for (Musteri musteri : musteriler) {
                String filmBilgisi = musteri.getKayitliFilm() != null ? musteri.getKayitliFilm().getFilmAdi() : "Henüz kayıtlı değil";
                System.out.println("ID: " + musteri.getId() +
                        ", Adı: " + musteri.getAdi() +
                        ", Telefon: " + musteri.getTelefon() +
                        ", E-posta: " + musteri.getEmail() +
                        ", Film: " + filmBilgisi);
            }
        }
    }

    public static List<Musteri> getMusteriler() {
        return musteriler;
    }
}
