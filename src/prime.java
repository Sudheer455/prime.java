public class prime {
    public static void main(String[] args) {
        //prime(null);
        System.out.println(prime(49));
    }
    public static boolean prime(int num)
    {
       if(num<=1)return false;
       if(num==2||num==3)return true;
       if(num%2==0||num%3==0) return  false;
       for(int i=5;i<num/2;i=i+6){
           if(num%i==0||num%(i+2)==0)return false;
       }
       return true;
    }
}
