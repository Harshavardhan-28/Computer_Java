class circle
{
    double a,pie;
    circle()//this is a constructor
    {
        a=10.0;
        pie=3.14;
    }
    void calc()
    {
     double r= 2*a*pie;
     System.out.println("The radius of the circle is"+ r);
    }
    public static void main()
    {
     circle obj = new circle();
     obj.calc();
    }
    }