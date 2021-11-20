import java.util.Scanner;

public class Main {

    public static void main(String[] agrs){

        String[] first = new String[5];
        String[] second = new String[5];

        System.out.println("enter first string array");
        Scanner x = new Scanner(System.in);
        for(int i=0; i< first.length; i++){
            first[i] = x.next();
        }

        System.out.println("enter second string array");
        for(int i=0; i< second.length; i++){
            second[i] = x.next();
        }

        LCS lcs = new LCS<String>();
        System.out.println(lcs.find(first, second));

//        System.out.print("first array : ");
//        for(int i =0; i<first.length; i++){
//            System.out.print(first[i]+" ");
//        }
//
//        System.out.print("\nsecond array : ");
//        for(int i =0; i<second.length; i++){
//            System.out.print(second[i]+" ");
//        }
    }
}
