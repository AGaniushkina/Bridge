public class Main {
    public static void main(String[] args) {
        City city = new Moscow(new Library());
        city.visit();
        city = new Saratov(new Square());
        city.visit();
        city = new Moscow(new Museum());
        city.visit();
        city = new Saratov(new Library());
        city.visit();
    }
}