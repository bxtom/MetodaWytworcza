public class CreatorOsobowy implements Creator {
    public Samochod stworzSamochod() {
        return new Osobowy();
    }
}
