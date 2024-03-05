import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hii , welcome to our cosmetology!");
        System.out.println("We have skincare , correction, massage procedures and also catalogue with price list , time and procedures name");
        System.out.println("ANYWAYS");
        System.out.println("Have you ever been in our cosmetology? true- yes / false - no");
        boolean y= sc.nextBoolean();
        if (y) {
            System.out.println("WOW you already have an expirience, let's start !!!!");
            System.out.println("We hope you will enjoy here ^^");
            System.out.println("We try do all procedures perfectly ");
        }
        else {
            System.out.println("Now we asking you for a question ");
            System.out.println("Do you care about your skin quality, health , face parameters? true-yes/ false-no ");
            boolean n = sc.nextBoolean();
            if (n) {
                System.out.println("Fine ,  let's go to the fantastic procedures!!");
                System.out.println("We hope you will enjoy here ^^");
                System.out.println("We try do all procedures perfectly ");
            } else {
                System.out.println("WAIT!!! HOW ?? WE NEED TO DO ALL BEAUTY PROCEDURES, anyway..let's go to correct it");
                System.out.println("We hope you will enjoy here ^^");
                System.out.println("We try do all procedures perfectly ");
            }
        }
        System.out.println("*AFTER PROCEDURES*");
        System.out.println( " Do you enjoy in our cosmetology? true-yes / false -no");
        boolean c = sc.nextBoolean();
        if (c){
            System.out.println(" We are so happy to hear that, see you soon ❤️");
        }else {
            System.out.println( " We are so sorry, that we did something wrong, that you didn't like....");
            System.out.println("\nThis is discount coupon, maybe you will change you opinion about us!");
        }
            


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
