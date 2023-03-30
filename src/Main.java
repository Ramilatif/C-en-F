import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        char an = 'O';
        while (an == 'O')
        {
            System.out.println("1 - Vous voulez convertir du F° au C°\n"+
                    "2 - Vous voulez convetire du C° au F°");
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();
            while(t!=1 && t!=2)
            {
                t = sc.nextInt();
            }
            if(t == 1)
            {
                System.out.print("Saissisez votre valeur F°:");

                float x = sc.nextFloat();
                float y = (x - 32) * 5 / 9;
                System.out.println("La convertion en C° vaut "+y+"°");
            }
            else if(t == 2)
            {
                System.out.print("Saissisez votre valeur C°:");

                float x = sc.nextFloat();
                float y = (float) (x*1.8+32);
                System.out.println("La convertion en F° vaut " + y+"°");
            }
            System.out.println("Voulez-vous reutiliser le programme? (O/N)");
            sc.nextLine();
            an =  sc.nextLine().charAt(0);
            while (an != 'O' && an != 'N')
            {
                an =  sc.nextLine().charAt(0);
            }
        }
        System.out.println("Au revoir!");



    }
}
