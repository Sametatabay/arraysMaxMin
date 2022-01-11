import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Please a count enter :");
        int count = inp.nextInt();
        int[] list = {-87,25,1,9,85,-23,8,100};
        int min=count;
        int max=count;
        Arrays.sort(list);
        for (int i = 0; i <list.length ; i++) {
            if(count<list[i]){
                min= list[i-1];
                max= list[i];
                break;
            }
        }
        System.out.println(count+"den küçük en yakın sayı " + min);
        System.out.println(count+"den büyük en yakın sayı " + max);

    }
}