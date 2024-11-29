import java.util.ArrayList;
import java.util.List;

public class Film implements IKayit {
    private int filmId;
    private String filmAdi;
    private String tur;
    private int sure;
    private Salon oynatildigiSalon;

    private static List<Film> filmler = new ArrayList<>();

    public Film(int filmId, String filmAdi, String tur, int sure) {
        this.filmId = filmId;
        this.filmAdi = filmAdi;
        this.tur = tur;
        this.sure = sure;
        this.oynatildigiSalon = null;
    }

    public int getFilmId() {
        return filmId;
    }

    public String getFilmAdi() {
        return filmAdi;
    }

    public void setFilmAdi(String filmAdi) {
        this.filmAdi = filmAdi;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public int getSure() {
        return sure;
    }

    public void setSure(int sure) {
        this.sure = sure;
    }

    public Salon getOynatildigiSalon() {
        return oynatildigiSalon;
    }

    public void setOynatildigiSalon(Salon oynatildigiSalon) {
        this.oynatildigiSalon = oynatildigiSalon;
    }

    @Override
    public void kayitEkle() {
        filmler.add(this);
    }

    @Override
    public void kayitSil() {
        filmler.remove(this);
    }

    @Override
    public void kayitGuncelle() {
        for (int i = 0; i < filmler.size(); i++) {
            if (filmler.get(i).getFilmId() == this.getFilmId()) {
                filmler.set(i, this);
                break;
            }
        }
    }

    public static void filmListesiGoruntule() {
        if (filmler.isEmpty()) {
            System.out.println("Kayıtlı film yok.");
        } else {
            for (Film film : filmler) {
                String salonBilgisi = film.getOynatildigiSalon() != null ? film.getOynatildigiSalon().getAdi() : "Henüz atanmadı";
                System.out.println("ID: " + film.getFilmId() + ", Adı: " + film.getFilmAdi() +
                        ", Tür: " + film.getTur() + ", Süre: " + film.getSure() + " dakika, Salon: " + salonBilgisi);
            }
        }
    }

    public static List<Film> getFilmler() {
        return filmler;
    }

    public static void addDefaultFilms() {
        new Film(1, "Moana 2", "Macera, Animasyon, Aile", 100).kayitEkle();
        new Film(2, "Terrifier 3", "Korku", 125).kayitEkle();
        new Film(3, "Venom: Son Dans", "Aksiyon, Komedi, Fantastik", 110).kayitEkle();
        new Film(4, "0000 Kilometre", "Romantik", 110).kayitEkle();
    }
}
