public class NestingLoops
{
    public static void main( String[] args ) throws InterruptedException {

        for(int a=0;a<100;a++){
            for(int b=0;b<100;b++){
                for(int c=0;c<100;c++){
                    for(int d=0;d<100;d++){
                        if(((a+2) == (b-2) && (b-2) == (c*2) && (c*2) == (d/2)) && ((a+b+c+d) == 45))
                            System.out.println(a + " " + b + " " + c + " " + d);
                    }
                }
            }
        }

//        for(int i=100;i<1000;i++){
//            if(Math.pow(i/100,3) + Math.pow((i/10)%10,3) + Math.pow(i%10,3) == i){
//                System.out.println("Armstrong numbers: " + i + " => " + i/100 + " " + (i/10)%10 + " " + i%10);
//            }
//        }
//        //**************************************************************
//
//        for(int i=10;i<100;i++){
//            if(i - ((i%10) * 10 + (i/10)) == ((i/10) + (i%10)))
//                System.out.println(i + " (5+4) => " + (i%10) + (i/10) + " (4+5) => " + ((i/10) + (i%10)));
//        }
//
//        //**************************************************************
//
//        for(int i=10;i<100;i++){
//            if((i/10)+(i%10)>10 && i<=56)
//                System.out.println(i + " <=56 \t " + (i/10) + "+" + (i%10) + " = " + ((i/10) + (i%10)) + " >10");
//            }
//
//        //**************************************************************
//
//        for(int i=10;i<100;i++){
//                System.out.println(i + ", " + (i/10) + "+" + (i%10) + " = " + ((i/10) + (i%10)) );
//            }
//
//        //**************************************************************
//
//        int a=0,b=0;
//        for(int i=10;i<100;i++){
//            for(int j=10;j<100;j++){
//                if(i+j == 60)
//                {a++;
//                    System.out.println(i + " + " + j + " = " + (i+j));}
//                if(i-j == 14)
//                {b++;
//                    System.out.println(i + " - " + j + " = " + (i-j));}
//            }
//        }
//        System.out.println("XX+XX=60:" + a + "; XX-XX=14:" + b);
//
//        //**************************************************************
//
//        System.out.print("x\t|\t");
//        for(int c=1;c<=9;c++) {
//            System.out.print(c + "\t");
//        }
//        System.out.println();
//        for (int d=1;d<=42;d++){
//            System.out.print("=");
//        }
//        System.out.println();
//        for(int i=1;i<=12;i++){
//            System.out.print(i + "\t|\t");
//            for(int j=1;j<=9;j++){
//                System.out.print(i * j + "\t");
//            }
//            System.out.println();
//        }
//
//        //**************************************************************
//
//        for(int i =0;i<=5;i++){
//            for (int j = 0;j <= 5;j++) {
//                System.out.print("(" + i + "," + j +") ");
//            }
//            System.out.println();
//        }
//
//        //**************************************************************
//        for ( int thous=0; thous<2; thous++ )
//        {
//            for ( int hund=0; hund<2; hund++ )
//            {
//                for ( int tens=0; tens<2; tens++ )
//                {
//                    for ( int ones=0; ones<2; ones++ )
//                    {
//                        System.out.println( " " + thous + "" + hund + "" + tens + "" + ones/* + "\r" */);
//                        Thread.sleep(500);
//                    }
//                }
//            }
//        }
//        System.out.println();
//
//        //**************************************************************
//
//        for ( char c='A'; c <= 'E'; c++ )
//        {
//            for ( int n=1; n <= 3; n++ )
//            {
//                System.out.println( c + " " + n );
//            }
//        }
//
//        System.out.println("\n");
//
//        for ( int f=1; f <= 3; f++ )
//        {
//            for ( int e=1; e <= 3; e++ )
//            {
//                System.out.print( f + "-" + e + " " );
//            }
//        }
//        System.out.println("\n");

    }
}
