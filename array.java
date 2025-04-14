import java.util.Scanner;
class array{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        for(int i= 0;i<size;i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("array Element are");
        for(int nums : array){
            System.out.println(nums);
        }
    }
}