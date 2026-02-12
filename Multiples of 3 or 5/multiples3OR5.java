

public class multiples3OR5 {
    public static void main(String[] args){
        long result = 0;
        for(long i =0;i<Long.parseLong(args[0]);i++) {
            if(i%3 == 0 || i%5 == 0){
                result += i;
            }
        }
        System.out.println(result);
    }
}


