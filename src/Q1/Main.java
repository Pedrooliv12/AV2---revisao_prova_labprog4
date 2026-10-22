package Q1;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------------------- PRODUTO PERECIVEL ---------------------------");

        NoPerishableProduct p1 = new NoPerishableProduct("Cadeira", 100.0, 10);

        try { p1.sell(5); } catch (IllegalArgumentException e) { System.out.println(e.getMessage()); }
        System.out.println(p1);

        try { p1.sell(0); } catch (IllegalArgumentException e) { System.out.println(e.getMessage()); }
        System.out.println(p1);

        try { p1.sell(-1); } catch (IllegalArgumentException e) { System.out.println(e.getMessage()); }
        System.out.println(p1);

        System.out.println("--------------------------- PRODUTO PERECIVEL ---------------------------");

        PerishableProduct p2 = new PerishableProduct("Leite", 7.00, 35, "12/12/2026");
        try { p2.sell(5); } catch (IllegalArgumentException e) { System.out.println(e.getMessage()); }
        System.out.println(p2);

        try { p2.sell(0); } catch (IllegalArgumentException e) { System.out.println(e.getMessage()); }
        System.out.println(p2);

        try { p2.sell(-1); } catch (IllegalArgumentException e) { System.out.println(e.getMessage()); }
        System.out.println(p2);

    }
}
