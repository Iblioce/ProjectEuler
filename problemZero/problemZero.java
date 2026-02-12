public class problemZero {
    public static void main(String[] args){
        long result = 0;
        for(long i =0;i<=Long.parseLong(args[0]);i++) {
            long temp = i*i;
            if(temp%2 == 1){
                result += temp;
            }
        }
        System.out.println(result);
    }
}
