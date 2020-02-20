public class Assignment2 {
    public static void main (String[]args){
        // with while loop
  /*      int a = 1;
        while (a < 10) {
            int b = 1;
            while (b < a) {
                System.out.print("*\t");
                b++;
            }
            System.out.println();
            a++;

        }
    }
}*/
// do and while loop
       int c=0;
        do {
            int d=0;
            do{
                System.out.print("*");
                d++;
            }
            while(d<=c);
            System.out.println();
            c++;
        }
        while(c<17);

    }
}

