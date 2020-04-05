public class Toyota extends Car {

    public void displayYear() {
        System.out.println("Toyota: displayYear");
    }

    public void displayModel() {
        System.out.println("Toyota: displayModel");
    }

    public void displayPrice() {
        System.out.println("Toyota: displayPrice");
    }

    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        toyota.displayYear();
        toyota.displayModel();
        toyota.displayPrice();
    }
}

/***
 * Toyota: displayYear
 * Toyota: displayModel
 * Toyota: displayPrice
 */
