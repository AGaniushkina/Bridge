public abstract class City {
    protected Place place;

    public City(Place place) {
        this.place = place;
    }
    public abstract void visit();
}
