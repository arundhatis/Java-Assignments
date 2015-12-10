/**
 * Created by asawant on 10/12/15.
 */
public class FizzBuzz {
    public static void main(String args[]){
        int i;
        for(i=1;i<=100;i++){
            System.out.println();
            if(i%3==0 || i%5==0){
                if(i%3==0)
                    System.out.print("Fizz");
                if(i%5==0)
                    System.out.print("Buzz");
                continue;
            }
            System.out.print(i);
        }
    }
}
