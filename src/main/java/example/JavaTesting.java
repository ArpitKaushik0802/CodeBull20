package example;

public class JavaTesting {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        String name = "Arpit";
        if (name.equalsIgnoreCase("ajay")) {
            System.out.println("Ajay ka naam chla");
        } else if (name.equalsIgnoreCase("prashant")) {
            System.out.println("prashant chal gya");
        } else if (name.equalsIgnoreCase("amod")) {
            System.out.println("Amod bhai ki jai");
        } else if ( name.equalsIgnoreCase("Arpit")){
            System.out.println("Arpi ka naam");

        } else {
            System.out.println("kuch bhi chal jaa, upar waale nhi chal rahe");
        }
    }
}