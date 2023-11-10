public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc" , 13 , 100, 90, 15);
        Fighter alex = new Fighter("Alex" , 17 , 95, 100, 10);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();
    }
}