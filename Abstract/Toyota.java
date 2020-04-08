public abstract class Toyota extends Car{
  
      @Override
      public void displayYear() {
        System.out.println("Toyota: displayYear");
    }

      @Override
    public void displayModel() {
        System.out.println("Toyota: displayModel");
    }

      @Override
    public void displayPrice() {
        System.out.println("Toyota: displayPrice");
    }

    public static void main(String[] args) {
        Toyota toyota = new Toyota() {};
        toyota.displayYear();
        toyota.displayModel();
        toyota.displayPrice();
    }
}

