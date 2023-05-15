public class Kazan extends City {
    public Kazan(Place place) {
        super(place);
    }
    @Override
    public void visit() {
        System.out.print("Visiting Kazan");
        place.visitPlace();
    }
}
