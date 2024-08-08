public class fibanocci {
    public static void main(String[] args)
    {
        int n=5;
        int n1=0;
        int n2=1;
        int n3=0;
        System.out.print(n1+" "+n2);
        for(int i=0;i<5;i++)
        {
            n3=n1+n2;
            System.out.print(" "+n3+" ");
            n1=n2;
            n2=n3;

        }
    }
}
