package laba1;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        confectionery[] Nconfectionery = new confectionery[10];

        Random random = new Random();
        for(int i = 0; i <= 9; i++) {
            int j = random.nextInt(2) +1;
            switch (j) {
                case (1):
                    Nconfectionery[i] = new candy("candy", "red", 50, "KDV");
                    break;
                case (2):
                    Nconfectionery[i] = new cake("cake", "white", 3000, "chocolate");
                    break;

            }
        }
        for(int i = 0; i <= 9; i++) {
            System.out.println(Nconfectionery[i].Description());
        }

        confectionery confectionery1 = new candy("candy", "red", 50, "KDV");

        System.out.println(confectionery1.getDescription() );

        confectionery confectionery2 = new cake("cake", "white", 3000, "chocolate");


        System.out.println(confectionery2.getDescription() );
    }
}
