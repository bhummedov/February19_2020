public class Assignment4 {
    public static void main(String[] args) {
        /*for (int i = 1; i <=10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print("- ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}*/
// with while loop
        int k = 0;
        while (k < 20) {
            int i = 0;
            while (i < (20 - k)) {
                System.out.print(" ");
                i++;
            }
            int j = 0;
            while (j < k) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            k++;
        }
    }
}
//with do-while loop
   /*     int c=0;
        do{
            int i=0;
            do{
                System.out.print(" ");
                i++;
            }while(i<(20-c));
            int j=0;
            do{
                System.out.print("*");
                j++;
            }while(j<c);
            System.out.println();
            c++;
        }while (c<20);
    }
}*/