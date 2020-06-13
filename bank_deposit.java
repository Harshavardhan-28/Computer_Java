class bank_deposit
{
    
 void switch_case(char a,double p,double r, double n)
 {
     double amt;
     switch(a)
     {
         case'1':
         amt=p*Math.pow((1+(r/100)),n);
         break;
         case'2':
         amt=(p*n)+(p*((n*n+n)/2)*(r/100)*(1/12));
         break;
         default:
         System.out.println("Invalid input");
         
        }
     
    }
    
    public static void main()
    {
     bank_deposit obj=new bank_deposit();
     obj.switch_case('1',8000,9,12);
    }
    
}