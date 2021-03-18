
import java.util.ArrayList;
import java.util.Scanner;
public class minimumBase{
    public static void main(String[] args){
        int base = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Number of houses: ");
        int houses = sc.nextInt();

        ArrayList<Integer> road = new ArrayList<Integer>();
        System.out.println("Miles of house: ");
        for (int i = 1; i <= houses; i++){
            int miles = sc.nextInt();
            road.add(miles);
        }

        int sum = 0;
        for (int i = 0; i < road.size(); i++){
            sum+= road.get(i);
            if (sum >= 8){
                base++;
                sum =0;
            }
        }
        System.out.println("Number of base: " + base);
    }
}

