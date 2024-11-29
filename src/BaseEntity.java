public class BaseEntity {
    private int id;
    private String adi;

    public BaseEntity(int id, String adi) {
        this.id = id;
        this.adi = adi;
    }

    public int getId() {
        return id;
    }

    public String getAdi() {
        return adi;
    }
}