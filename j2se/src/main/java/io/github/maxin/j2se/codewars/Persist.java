package io.github.maxin.j2se.codewars;

public class Persist {
    public static int persistence(long n) {
        // your code
        long result=1;
        long temp=n;
        int count=0;

        if(n<10){
            result=n;
        } else{
            do {
                result=1;
                do{
                    result=result*(temp%10);
                    temp=temp/10;
                }while(temp>=1);
                temp=result;
                count++;
            }while (result>9);
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(Persist.persistence(39));
    }
}
