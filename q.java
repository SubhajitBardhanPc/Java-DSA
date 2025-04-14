import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class q{
    public static void main(String[] args){
        Queue <Integer> que = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Data");
        while(true){
            int x = sc.nextInt();
            
            if(x==0){
                break;
            }else{
                que.add(x);
            }
            System.out.println("Entered  Data");
            for(int q : que){
                System.out.println("Data is : "+q);
            }
        }

    }
}