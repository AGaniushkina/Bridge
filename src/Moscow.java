public class Moscow extends City {
    public Moscow(Place place) {
        super(place);
    }
    @Override
    public void visit() {
        System.out.print("Visiting Moscow");
        place.visitPlace();
    }
}
