public class Main {
    public static void main(String[] args) {
        int s = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            s += i;
        }
        System.out.println("Tong cac so chan tu 0 den 10 la: " + s);
    }
}