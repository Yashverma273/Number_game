import java.util.Random;
import java.util.Scanner;

public class Numbergame {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      Random ran = new Random();

      int Randomno = ran.nextInt(100);
      System.out.println("Guess the number");

      System.out.println("Click 1 to play game");
      System.out.println("Click 2 to Cancel");

      int n = sc.nextInt();
      int chance = 10;
      int score = 0;
      int totalscore = 0;
      if (n == 1) {

         while (chance != 0) {

            System.out.println("Enter your choice");
            int userchoice = sc.nextInt();
            if (userchoice == Randomno) {
               System.out.println("You win");
               if (chance != 0) {
                  totalscore = score+1;
                  if (score > 8) {
                     System.out.println("Excellent: Your score is " + totalscore);
                  } else if (score > 4 && score < 8) {
                     System.out.println("Nice: Your score is " + totalscore);
                  } else {
                     System.out.println("Welldone Your score is " + totalscore);
                  }
                  System.out.print("Click 1 for Play Again" + "  ");

                  System.out.print("Click 2 for Next Time");

                  System.out.println();

                  int no = sc.nextInt();
                  if (no == 1) {
                     chance = 10;
                  } else {
                     break;
                  }
               }

            } else if (userchoice > 100) {
               System.out.println("Invalid no");
               System.out.println("Select the number in between 0 to 100");
            } else if (userchoice > Randomno) {
               System.out.println("To high");
               chance--;
               System.out.println("Chance Left: " + chance);
               score = chance - 1;
            } else {
               System.out.println("To Low");
               chance--;
               System.out.println("Chance Left: " + chance);
               score = chance - 1;
            }
            if (chance == 0) {
               System.out.println("You lost: ");

               System.out.print("Click 1 for Play Again" + "  ");

               System.out.print("Click 2 for Next Time");

               System.out.println();

               int no = sc.nextInt();
               if (no == 1) {
                  chance = 10;
               } else {
                  break;
               }
            }
         }

      }

   }
}
