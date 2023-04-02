public class Main {
    public static void main(String[] args) {

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic){
            System.out.println("This car is domestic to our country");
        }

        String s = isDomestic ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        int ageOfClient = 20;
        String ageText = ageOfClient >= 18 ? "Over 18" : "Still a kid";
        System.out.println("Our client is " + ageText);

        // Challenge

         double double1 = 20.00;
         double double2 = 80.00;

         double result1 = (double1 + double2) * 100.00;
         double remainder = result1 % 40.00;

         boolean isNoRemainder = remainder == 0 ? true : false;
         System.out.println(isNoRemainder);

         if (!isNoRemainder){
             System.out.println("We have got some remainder");
         } else {
             System.out.println("We do not have any remainder");
         }
    }
}