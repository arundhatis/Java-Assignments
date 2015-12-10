public class Diamond {
    public static void drawDiamond(int n) {
        int i, j;
        HorizontalLine horizontal_line = new HorizontalLine();

        for (i = 0; i < n; i++) {
            for (j = n - i; j > 0; j--)
                System.out.print(" ");
            horizontal_line.drawLine(i * 2 + 1);
            System.out.println();
            if(i==n-1)
                drawInvertedTriangle(n);
        }
    }

    public static void drawDiamondWithName(int n, String name) {
        int i, j;
        HorizontalLine horizontal_line = new HorizontalLine();

        for (i = 0; i < n; i++) {
            for (j = n - i; j > 0; j--)
                System.out.print(" ");
            if (i == n - 1) {
                System.out.println(name);
                drawInvertedTriangle(n);
            }
            else {
                horizontal_line.drawLine(i * 2 + 1);
                System.out.println();
            }

        }
    }

    private static void drawInvertedTriangle(int n) {
        HorizontalLine horizontal_line = new HorizontalLine() ;
        int j;
        int i = n - 1;
            for (; i > 0; i--) {
                for (j = n - i + 1; j > 0; j--)
                    System.out.print(" ");
                horizontal_line.drawLine((i - 1) * 2 + 1);
                System.out.println();
            }
    }

    public static void main(String args[]) {
        drawDiamond(3);
        drawDiamondWithName(5, "Bill");
    }

}
