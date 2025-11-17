import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product product1 = new Product();
        product1.name = "codetree";
        product1.code = 50;

        String id2 = sc.next();
        int code2 = sc.nextInt();

        Product product2 = new Product();
        product2.name = id2;
        product2.code = code2;

        System.out.println("product " + product1.code + " is " + product1.name);
        System.out.println("product " + product2.code + " is " + product2.name);
    }
}

class Product {
    public String name;
    public int code;

    public Product() {
        name = "";
        code = 0;
    }

    public Product(String name, int code) {
        this.name = name;
        this.code = code;
    }
}