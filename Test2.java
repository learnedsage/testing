import java.util.Locale;
import java.util.Scanner;
class Launch{
    void Ekart(int c){
        String[] Mobile ={"Samsung","Apple","OnePlus","Oppo","Redmi"};
        String[] laptop= {"Dell","Hp","Lenovo","Toshiba","Macbook"};
        String[] electonic= {"Whirlpool","lg","sony"};
        String[] perfume= {"Axe","Fogg","Denver",};

        if(c==1){
            for(int i=0; i< Mobile.length;i++){
                System.out.println((i+1)+"."+Mobile[i]);
            }}
        else if(c==2){
            for(int i=0; i< laptop.length;i++){
                System.out.println((i+1)+"."+laptop[i]);
            }}
        else if(c==3){
            for(int i=0; i< electonic.length;i++){
                System.out.println((i+1)+"."+electonic[i]);
            }}
        else if(c==4){
            for(int i=0; i< perfume.length;i++){
                System.out.println((i+1)+"."+perfume[i]);
            }}
        else if(c>4)
            System.out.println("Invalid input");
    }

    String email() {
        String b;

        System.out.print("Enter the email id: ");
        Scanner scann = new Scanner(System.in);
        b = scann.next();
       if ((b.contains("@"))&&(b.endsWith(".com"))){
            return b;
        }

        else{
            System.out.println("Invalid email-id");

            String  d="**";
            return d;

        }
    }

}

class Test1{


    public static void main(String args[]) {
        String b;
        String a;
        System.out.print("Enter the name: ");
        Scanner scan = new Scanner(System.in);
        a = scan.next();

        Launch em= new Launch();
        String y = em.email();
        for(int i =0;y=="**";i++){
           y= em.email();
            break;}
        System.out.println("1.Mobile\n2.Laptop\n3.Electonic Appliances\n4.Perfumes\n Enter the choice by number");
        Scanner scannn = new Scanner(System.in);
        String[] ekart={"Mobile","laptop","electonic","perfume"};
        int c;
        for (int i=0; i<4;i++){
            c = scannn.nextInt();
            if(c>4){
                System.out.println("Enter a  valid input: ");}
            else{

                Launch calc= new Launch();
                calc.Ekart(c);

                break;

            }

        }

        System.out.println("Enter your choices using the number: ");
        Scanner scnnn = new Scanner(System.in);
        int d= scnnn.nextInt();

        System.out.println(a.toUpperCase(Locale.ROOT)+ " Thanks for purchasing.... \nVISIT AGIAN "+"\nYour bill has been sent to your email-id: "+y);

    }}
