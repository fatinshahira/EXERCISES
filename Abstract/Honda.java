package car;

public abstract class Honda extends Car{
  
      @Override
      public void displayYear() {
        System.out.println("Honda: displayYear");
    }

      @Override
    public void displayModel() {
        System.out.println("Honda: displayModel");
    }

      @Override
    public void displayPrice() {
        System.out.println("Honda: displayPrice");
    }

    public static void main(String[] args) {
        Honda honda = new Honda() {};
        honda.displayYear();
        honda.displayModel();
        honda.displayPrice();
    }
  
}

