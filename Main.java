public class Main {
    public static void main(String[] args) {

        Restuarant mcDonalds = new Restuarant();
        Restuarant qdoba = new Restuarant(30, 4.5, 14.99, 5, "6:00am - 9:00pm");

        System.out.println(mcDonalds);
        System.out.println(qdoba.avgPrice);

    }
}
