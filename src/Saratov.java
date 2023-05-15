public class Saratov extends City {
    public Saratov(Place place) {
        super(place);
    }
    @Override
    public void visit() {
        System.out.print("Visiting Saratov");
        place.visitPlace();
    }
}
