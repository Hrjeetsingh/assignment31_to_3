import java.util.Scanner;

//1. WAP to caluclate no. of digits in a number entered by user.

class NOdigit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter a number : ");
        int num=s.nextInt();
        int count=0;
        while(num!=0){
            num=num/10;
            count=count+1;    
        }
        System.out.println(count);
        s.close();
    }
}
// 2. Apply do while loop to calculat factorial of a number such that, program asks user, if he wants to continue, if yes, program should run again
class factorial{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int result=fact(n);
        System.out.println(result);
        while(true){
            System.out.print("if you wants to continue type yes : ");
            String a=s.next();
            if(a.equals("yes")){
                n=s.nextInt();
                result=fact(n);
                System.out.println(result);
            } 
            s.close();   
        }    
    }
    private static int fact(int n){
        int num=n;
        int facto=1;
        int i=1;
        do{
            facto=facto*i;
            i=i+1;
        }while(i<=num);
        return facto;    
    }
}

// 3. WAP to creat a fuction that check if no. is odd or even. call this function from main method

class OddEven{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("please enter a number : ");
        int num=s.nextInt();
        oddeven(num);
        s.close();
    }
    private static int oddeven(int n){
        int a=n;
        if(a%2==0){
            System.out.println(a+" is Even number");
            
        }else{
            System.out.println(a+" is Odd number");
        }
        return a;
    }
}



