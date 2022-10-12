import java.util.Scanner;

class Test1 {
    public static void main(String args[]) {
        System.out.print("Enter the year:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.print("Enter the ____ day:");
        Scanner scann = new Scanner(System.in);
        int b = scann.nextInt();
        int i=0 ;
        if ((a% 400 == 0) || ((a% 4 == 0) && !(a % 100 == 0))){
            i = 1;
            System.out.println(a +" is a leap year");}
        int m = 0;
        if (b > 0 && b <= 31)
            System.out.println(b + " January");
        if ((b > 31 + i) && (b <= 59 + i))
        {
            m=31;
            System.out.println(b - m + " February");}
        else if((b > 59 + i) && (b <= 90 + i)){
            m=59+i;
            System.out.println(b - m + " March");}
        else if ((b > 90 + i) && (b <= 120 + i)){
            m=90+i;
            System.out.println(b - m + " April");}
        else if ((b > 120 + i) && (b <= 151 + i)){
            m=120+i;
            System.out.println(b - m + " May");}
        else if ((b > 151 + i) && (b <= 181 + i)){
            m=151+i;
            System.out.println(b - m + " June");}
        else if ((b > 181 + i) && (b <= 212 + i)){
            m=181+i;
            System.out.println(b - m + " July");}
        else if ((b > 212 + i) && (b <= 243 + i)){
            m=212+i;
            System.out.println(b - m + " August");}
        else if ((b > 243 + i) && (b <= 273 + i)){
            m=243+i;
            System.out.println(b - m + " September");}
        else if ((b > 273 + i) && (b <= 304 + i)){
            m=273+i;
            System.out.println(b - m + " October");}
        else if ((b > 304 + i) && (b <= 334 + i)){
            m=304+i;
            System.out.println(b - m + " November");}
        else if ((b > 334 + i) && (b <= 365 + i)){
            m=334+i;
            System.out.println(b - m + " December");}
        else{
            System.out.print("There are only ");
            System.out.println(i+365+" days in year "+a);
        }

    }
}
