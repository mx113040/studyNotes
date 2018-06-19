package io.github.maxin.j2se.base;

public class TestLoop {
    public static void main(String[] args) {
        int x = 10;
        while( x < 20 ) {
            System.out.print("value of x : " + x );
            x++;
            System.out.print("\n");
        }

        x = 10;
        do{
            System.out.print("value of x : " + x );
            x++;
            System.out.print("\n");
        }while( x < 20 );


        for(int y = 10; y < 20; y = y+1) {
            System.out.print("value of y : " + y );
            System.out.print("\n");
        }


        int [] numbers = {10, 20, 30, 40, 50};

        for(int z : numbers ){
            System.out.print( z );
            System.out.print(",");
        }
        System.out.print("\n");
        String [] names ={"James", "Larry", "Tom", "Lacy"};
        for( String name : names ) {
            System.out.print( name );
            System.out.print(",");
        }
    }
}
