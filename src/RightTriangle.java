
public class RightTriangle {
    public static void drawTriangle(int n){
        HorizontalLine horizontal_line=new HorizontalLine();
        int i;
        for(i=1;i<=n;i++){
            horizontal_line.drawLine(i);
            System.out.println();
        }
    }

    public static void main(String args[]){
        drawTriangle(3);
    }

}
