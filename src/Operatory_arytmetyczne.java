public class Operatory_arytmetyczne {
    public static void main(String[] args) {
        int a = 25;
        int b = 10;
        double wynik = (double) a / b;
        System.out.println(wynik);

        a = a + b;
        a += b;

        System.out.println(a);

        System.out.println(Math.pow(2, 3));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.abs(-50));

        a++;
        System.out.println(a);

        ++a;
        System.out.println(a);

        int c = 30;
        System.out.println(c);
        System.out.println(++c);
    }

}
