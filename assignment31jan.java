import java.util.Scanner;

// 1.Write a program to print the product of the decimal and int numbers ex: 8.2 and 6
class product {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number integer type : ");
        int x=s.nextInt();
        System.out.print("Enter a number decimal : ");
        float y=s.nextFloat();
        float result= x*y;
        System.out.println(result);
        
        s.close();
    }
}


// 2 Print the ASCII value of any character user provides
class ascci{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print(" Please Enter any Character : ");
        char chh=s.next().charAt(0);
        int num=chh;
        //int number=(int)chh;
        System.out.println(" ascii value of  "+chh+" = "+num);
        
        s.close();
    }
}

// 3.Write a program to add 3 to the ASCII value of the any character user provides and print the equivalent character.
class asciiValueAdd{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print(" Please Enter any Character : ");
        char cch1=s.next().charAt(0);
        System.out.print(" Please Enter any Character : ");
        char cch2=s.next().charAt(0);

        System.out.print(" Please Enter any Character : ");
        char cch3=s.next().charAt(0);

        int num1=cch1;
        int num2=cch2;
        int num3=cch3;

        int number=num1+num2+num3;
        char character=(char)number;
        System.out.println(" Ascii value of  "+cch1+" = "+num1+", "+cch2+" = "+num2+", "+cch3+" = "+num3);
    
        System.out.println(" character value after adding is  "+number+" and equelent character is "+character);

        s.close();
    }
}

// 4 Write a Java program to convert temperature from Fahrenheit to Celsius degree

class temperature{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number fahrenheit : ");
        int fahrenheit=s.nextInt();
        float celsius= ((fahrenheit-32)*5)/9;
        System.out.println("temp.. in celsius : " + celsius);
        s.close();
    }
}

// 5 Write a Java program that reads a number in inches, converts it to meters.
class inchTometer{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter inches : ");
        int inch=s.nextInt();
        double meter=inch/39.37008;
        System.out.println(inch+" Inches in Meters : "+meter);
        s.close();
    }
}


// 6. Write a Java program to convert minutes into a number of years and days.
class minuts{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter minuts : ");
        int minut=s.nextInt();
        float day= minut/1440;
        float year=minut/525600;
        System.out.println("number of days : "+day+"  number of year : "+year);
        s.close();
    }
}

// 7. Take String input as Name of the city and convert it to reverse string and show on the console.

class reverseString{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter name of city : ");
        String str=s.nextLine();
        int n=str.length();
        String rev="";
        while(n!=0){
            char ch=str.charAt(n-1);
            rev=rev+ch;
            n=n-1;
        }  
        System.out.println("reverse of given string : ");
        s.close();

    }
}
// 8. Check if a string is pallindrome or not. eg. input : ABCBA

class palindromABCD{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a string : ");

        String str1=s.nextLine();
        int index=str1.length();
        String rev="";
        while(index!=0){
            char ch1=str1.charAt(index-1);
            rev=rev+ch1;
            index--;
        }
        if(rev.equals(str1)){
            System.out.println("is pallindrome");
        }else{
            System.out.println("not pallindrome");
        }
        
        s.close();
    }
}