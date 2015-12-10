public class HorizontalLine {
    public static void drawLine(int n){
        int i;
        for(i=0;i<n;i++){
            System.out.print("*");
        }
    }

    public static void main(String args[]){
        drawLine(3);
    }
}
