import java.util.ArrayList;

public class PrimeFactors {
    public static boolean checkIfPrime(int n){
        if(n==1)
            return false;
        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static ArrayList<Integer> generate(int n){
        ArrayList<Integer> result= new ArrayList<Integer>();
        for(int i=1;i<n;i++){
            if(n%i==0){
                if(checkIfPrime(i))
                    result.add(i);
            }
        }
        return result;
    }

    public static void main(String args[]){
        ArrayList<Integer> result;
        result=generate(1);
        System.out.println(result);


    }

}
