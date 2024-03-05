import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hii , welcome to our cosmetology!");
//        System.out.println("Choose which procedure you want and then you will see total cost, options and time");
//        System.out.println("Procedures info ( c1-c3) - skincare(s1-s2), correction(cr1-cr2), massage(m1-m2)");
        System.out.println("Have you ever been in out cosmetology? true / false");
        boolean yesno = sc.hasNextBoolean();
        if (yesno) {
            System.out.println("WOW you already have an expirience, let's start !!!!");
        } else {
            System.out.println("Now we asking you for a couple of questions ");
            System.out.println("Do you care about your skin ? ");
        }
//            boolean yesno2 = sc.hasNextBoolean();
//            if (yesno2) {
//                System.out.println("Fine ,  let's go to the last question!!");
//            } else {
//                System.out.println("WAIT!!! HOW ?? WE NEED TO DO ALL BEAUTY PROCEDURES, anyway..let's go to the last question");

                System.out.println("We hope you will enjoy here ^^");
                System.out.println("We try do all procedures perfectly ");
            


            Cosmetology c1 = new Cosmetology("Skincare (separately for to each)", 40, 60);
            Cosmetology c2 = new Cosmetology("Correction( for all)", 5000, 3600);
            Cosmetology c3 = new Cosmetology("Massage", 126, 120);

            Skincare s1 = new Skincare("Skincare", "Dry", "toner, mask1, peeling, mask2, patches , moisturize creme", 40, 60);
            Skincare s2 = new Skincare("Skin cleaning", "Fat", "toner,peeling,mask,cleaning,", 40, 60);
            Skincare s3 = new Skincare("Recovery", "Sensetive", "toner, mask1,light peeling, patches, moisturize creme", 40, 60);

            Correction cr1 = new Correction("Tattoo", "Juisy lips", true, 2500, 120);
            Correction cr2 = new Correction("Tattoo", "Brows", false, 500, 120);

            Massage m1 = new Massage("Plastic massage ", true, false, 63, 60);
            Massage m2 = new Massage("Healthy massage", false, true, 63, 60);


            ArrayList<Cosmetology> beauty = new ArrayList<>();
            beauty.add(cr1);
            beauty.add(m1);
            beauty.add(c3);

            for (Cosmetology i : beauty) {
                i.writeFile(beauty);
            }


    }
}