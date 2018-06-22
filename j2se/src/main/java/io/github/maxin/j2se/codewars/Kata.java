package io.github.maxin.j2se.codewars;

public class Kata {
    public static String HighAndLow(String numbers) {
        // Code here or
        String[] sortStr=numbers.split(" ");
        int[] sortNum=new int[sortStr.length];
        int temp;
        String result;

        for (int i=0;i<sortStr.length;i++){
            sortNum[i]=Integer.parseInt(sortStr[i]);
            for (int j=0;j<i;j++){
                if (sortNum[i]<sortNum[j]){
                    temp=sortNum[i];
                    sortNum[i]=sortNum[j];
                    sortNum[j]=temp;
                }
            }
        }

        result=sortNum[sortNum.length-1]+" "+sortNum[0];

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Kata.HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
