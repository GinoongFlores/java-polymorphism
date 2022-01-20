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

        Splendor s  = new Splendor();
        Bike b = s; // Upcasting from sublcass to a superlcass
         b.run();

         Bike bi = new Splendor();
         Splendor sp = (Splendor) bi; // Downcasting from super class to a subclass
         sp.run();
     }
}
