class average_r
{
    int a,m,j;
    average_r(int apr, int may, int jun)
    {
        a=apr;
        m=may;
        j=jun;
    }
    void avg(double avg)
    {
        avg=(a+m+j)/3.0;
        System.out.println("The average rainfall is:"+ avg);
    }
    public static void main()
    {
     average_r Average_r= new  average_r(12,14,8);
     System.out.println("Rainfall for april:"+Average_r.a+"\t"+"Rainfall for may:"+Average_r.m+"\t"+"Rainfall For june:"+Average_r.j);
    Average_r.avg(11.33);
    }
}