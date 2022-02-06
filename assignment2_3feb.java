
import java.util.Scanner;

//  1. Evaluate below expression without running the code
//       int x = 9, y = 12;
//       int a = 2, b = 4, c = 6;
//       int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
//       4/3*(9+34)+9*(2+4*6)+(3+12*(2+2))/(2+4*12)
//       4/3*(9+34)+9*(2+4*6)+(3+12*4)/(2+4*12)
//       1*43+9*26+51/50
//       43+234+1
//       278
//        

// 2   WAP to check whether given number is lesser or greater than 10 if its lesser than check further if its lesser or greater than 
//    5 using ternary operator and Print greater or smaller accordingly.
class greaterLesser{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num =s.nextInt();
        
        int result=(num>10)?(10):(num>5)?(5):0;
        if(result==0){
            System.out.println(num+" is lesser then 5");
        }else{
            System.out.println(num+" is greater then "+result+" lesser then 10");;
        }

        s.close();

    }
}

//3 WAP to check whether given number is 10,20,30,40,50 or not any of these using ternary operator.
//   *** using if()..else()

class checknumber{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=s.nextInt();
        if(num==10 || num==20 || num==30 || num==40 || num==50){
            System.out.println(num+" is equal to : "+num);
        }
        else{
            System.out.println("Your number not match in 10, 20, 30, 40, 50");
        }
        s.close();
    }
}

//3 WAP to check whether given number is 10,20,30,40,50 or not any of these using ternary operator.

class checknumber1{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=s.nextInt();
        //int result=(num==10)?(num):(num==20)?(num):(num==30)?(num):(num==40)?(num):(num==50)?(num):0;
        int result=(num==10 || num==20 || num==30 || num==40 || num==50)? (num):0;
        if(result==0){
            System.out.println(num+" Given number is NOT match in 10,20,30,40,50 :");
        }
        else{
            System.out.println(num+" Given number is match from :"+result);
        }
        s.close();
    }
}


// 4. write a program to print name of the month by passing number of the month using switch or if else 

// using if()...else()

class NumOfMonth {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a number 1 to 12 : ");
        int num =s.nextInt();

        while(true){
            if(num==1){System.out.println("Number 1 Coresponding Month : January"); break;}
            else if(num==2){System.out.println(" Number 2  Coresponding Month : Febuary"); break;}
            else if(num==3){System.out.println(" Number 3  Coresponding Month : March"); break;}
            else if(num==4){System.out.println(" Number 4  Coresponding Month : April"); break;}
            else if(num==5){System.out.println(" Number 5  Coresponding Month : May"); break;}
            else if(num==6){System.out.println(" Number 6  Coresponding Month : Jun"); break;}
            else if(num==7){System.out.println(" Number 7  Coresponding Month : July"); break;}
            else if(num==8){System.out.println(" Number 8  Coresponding Month : August"); break;}
            else if(num==9){System.out.println(" Number 9  Coresponding Month : September"); break;}
            else if(num==10){System.out.println("Number 10 Coresponding Month : October"); break;}
            else if(num==11){System.out.println("Number 11 Coresponding Month : November"); break;}
            else if(num==12){System.out.println("Number 12 Coresponding Month : December"); break;}
            else{
                System.out.println("Number is invalied : " + num);
                break;
            }    
        }
        s.close();
    } 
}
//  using switch statement 

class monthnum{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a number 1 to 12 : ");
        int num =s.nextInt();
        switch(num){
            case 1:
            System.out.println("Number 1 Coresponding Month : january"); break;
            case 2:
            System.out.println("Number 2 Coresponding Month : febuaryr"); break;
            case 3:
            System.out.println("Number 3 Coresponding Month : march"); break;
            case 4:
            System.out.println("Number 4 Coresponding Month : april"); break;
            case 5:
            System.out.println("Number 5 Coresponding Month : may"); break;
            case 6:
            System.out.println("Number 6 Coresponding Month : jun"); break;
            case 7:
            System.out.println("Number 7 Coresponding Month : july"); break;
            case 8:
            System.out.println("Number 8 Coresponding Month : august"); break;
            case 9:
            System.out.println("Number 9 Coresponding Month : september"); break;
            case 10:
            System.out.println("Number 10 Coresponding Month : october"); break;
            case 11:
            System.out.println("Number 11 Coresponding Month : November"); break;
            case 12:
            System.out.println("Number 12 Coresponding Month : December"); break;
            default:
            System.out.println("invailed number : " +num);
        }
        s.close();
    }
} 


// 5. write a program to print given character is vovel or Consonant using ternary operator.

class vovelconsonant{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch=s.next().charAt(0);

        char character=(ch=='a' || ch=='A')?(ch):(ch=='e' || ch=='E')?(ch):(ch=='i' || ch=='I')?(ch):(ch=='o' || ch=='O')?(ch):(ch=='u' || ch=='U')?(ch):0;
        if(character==0){
            System.out.println("given character is consonant :"+ ch);
        }
        else{
            System.out.println("given character is vovel ");
        }
        s.close();
    }
}