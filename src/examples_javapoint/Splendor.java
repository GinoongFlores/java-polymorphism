package examples_javapoint;

class Bike {
    void run() {
        System.out.println("Running");
    }
}

 class Splendor extends Bike {
     void run () {
         System.out.println("Running safely with 60km");
    }

     public static void main(String[] args) {

         Bike bike = new Splendor(); // Upcasting casting from subclass to superclass
         bike.run();

         Splendor splendor = new Splendor(); // Downcasting casting from superclass to subclass
         splendor.run();
     }
}
