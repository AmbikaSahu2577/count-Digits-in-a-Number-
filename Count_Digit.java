import java.util.Scanner;
class Count_Digit
{
    public static void main(String[] args) 
    {
        int number,count=0;
        System.out.println("enter any number");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
       while(number>0)
       {
       	 number=number/10;
       	 count++;
       }
       System.out.println("number of digits"+count);
    }	
}