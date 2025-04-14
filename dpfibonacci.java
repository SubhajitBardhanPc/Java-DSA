class dpfibonacci{


    public static int fibonacci(int n){
        int[] fb = new int[n+1];
        fb[0] = 0;
        fb[1] = 1;
        for(int i=2;i<=n;i++){
            fb[i] = fb[i-2]+fb[i-1];
        }
        return fb[n];
    }


    public static void main(String[] args){
    int n = 10;
    System.out.println("Fibonacci series using dynamic programming:"+"\n"+fibonacci(n));
    
    }
}