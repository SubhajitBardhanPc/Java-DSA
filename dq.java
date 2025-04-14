import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
class dq{
    public static void main(String[] args){
        Deque<Integer> dques = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("Enter Value: ");
            int x = sc.nextInt();
            if(x == 0){
                break;
            }
            
            
            dques.add(x);
        }
        for(int a : dques){
            System.out.println(a);
        }
        System.out.println("First :"+dques.peekFirst());
        System.out.println("Last :"+dques.peekLast());
    }
}