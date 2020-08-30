class calculator_if
{
    int calc;
    String error;
    char input;
 void check( char s, int a, int b)
 {
     int c=0;
     String e="";
    if (s=='*'){
        c= a*b;
    }
    else if(s=='/'){
     c= a/b;   
    }
    else if(s=='+'){
     c= a+b;   
    }
     else if (s=='-')
     {
         c= a-b;
        }
        else
        {
         e="Invalid Input";   
        }
        calc= c;
        error=e;
        input= s;
    }
    void print()
    {
        if (input=='*'){
        System.out.println("Your answer is:"+ calc);
    }
    else if(input=='/'){
     System.out.println("Your answer is:"+ calc);
    }
    else if(input=='+'){
     System.out.println("Your answer is:"+ calc);
    }
     else if (input=='-')
     {
         System.out.println("Your answer is:"+ calc);
        }
        else
        {
         System.out.println(error);   
        }
        
    }
    public static void main()
    {
     calculator_if answer= new calculator_if();
     answer.check('+',2,3);
     answer.print();
    }
    
    
}