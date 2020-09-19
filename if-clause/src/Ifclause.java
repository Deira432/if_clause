public class Ifclause {

    public static void main (String[] args){

        int a = 5;
        int b = 10;
        int c = 5;

        if((a+b)==15){

            System.out.println("THIS IS IF CLAUSE");
            System.out.println("It is correct");
        }

        if (a==b){

            System.out.println("THIS IS IF ELSE");
            System.out.println("This is inside if in if else");

        }else{

            System.out.println("This is inside else in if-else");
        }
        

        if(a>b){

            System.out.println("THIS IS ELSE-IF");
            System.out.println("a is greater");
        }else if (a==b){

            System.out.println("this is inside elseif in else if");
            System.out.println("both are equal");
        }else {

            System.out.println("b is greater");
        }

        if(a==5 && b==10){

            if((a+b)==15){

                System.out.println("THIS IS NESTED IF");
                System.out.println("it is true");
            }
        }else{
            System.out.println("This is false");
        }

    }


}
