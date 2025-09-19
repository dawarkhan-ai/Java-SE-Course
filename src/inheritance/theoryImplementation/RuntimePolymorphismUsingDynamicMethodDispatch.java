package inheritance.theoryImplementation;

class Market {
    void open() {
        System.out.println("Market is opening");
    }
}

class HyperMarket extends Market {
    void open() {
        System.out.println("HyperMarket is opening");
    }
}

class SuperMarket extends Market {
    void open() {
        System.out.println("SuperMarket is opening");
    }
}


public class RuntimePolymorphismUsingDynamicMethodDispatch {
   public static void main(String[] args) {
       Market market ;

       market = new HyperMarket();
       market.open();

       market = new SuperMarket();
       market.open();

   }

}
