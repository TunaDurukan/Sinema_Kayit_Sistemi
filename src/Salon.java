import java.util.ArrayList;
import java.util.List;

public class Salon extends BaseEntity implements IKayit {
    private int kapasite;
    private Film oynatilanFilm;

    private static List<Salon> salonlar = new ArrayList<>();

    public Salon(int id, String adi, int kapasite) {
        super(id, adi);
        this.kapasite = kapasite;
        this.oynatilanFilm = null;
    }

    public int getKapasite() {
        return kapasite;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }

    public Film getOynatilanFilm() {
        return oynatilanFilm;
    }

    public void setOynatilanFilm(Film oynatilanFilm) {
        this.oynatilanFilm = oynatilanFilm;
    }

    @Override
    public void kayitEkle() {
        salonlar.add(this);
    }

    @Override
    public void kayitSil() {
        salonlar.remove(this);
    }

    @Override
    public void kayitGuncelle() {
        for (int i = 0; i < salonlar.size(); i++) {
            if (salonlar.get(i).getId() == this.getId()) {
                salonlar.set(i, this);
                break;
            }
        }
    }

    public static void salonListesiGoruntule() {
        if (salonlar.isEmpty()) {
            System.out.println("Kayıtlı salon yok.");
        } else {
            for (Salon salon : salonlar) {
                String filmBilgisi = salon.getOynatilanFilm() != null ? salon.getOynatilanFilm().getFilmAdi() : "Henüz atanmadı";
                System.out.println("ID: " + salon.getId() + ", Adı: " + salon.getAdi() +
                        ", Kapasite: " + salon.getKapasite() + ", Film: " + filmBilgisi);
            }
        }
    }

    public static List<Salon> getSalonlar() {
        return salonlar;
    }

    public static void addDefaultSalons() {
        new Salon(1, "Salon-1", 150).kayitEkle();
        new Salon(2, "Salon-2", 200).kayitEkle();
        new Salon(3, "Salon-3", 100).kayitEkle();
        new Salon(4, "Salon-4", 250).kayitEkle();
    }
}
