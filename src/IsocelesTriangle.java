
public class IsocelesTriangle {
    public static void drawTriangle(int n){
        int i,j;
        HorizontalLine horizontal_line= new HorizontalLine();
        for(i=0;i<n;i++){
            for(j=n-i;j>0;j--)
                System.out.print(" ");
            horizontal_line.drawLine(i*2+1);
            System.out.println();
        }
    }

    public static void main(String args[]){
        drawTriangle(5);
    }
}
