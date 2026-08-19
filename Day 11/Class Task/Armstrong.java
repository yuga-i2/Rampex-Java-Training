public class Armstrong {
    public static void main(String [] args){
       System.out.print(checkAmstrong(153)) ;
    }
    public static boolean checkAmstrong(int num){
        int temp =num;
        int original =num;
        int digit=0;
        while(temp!=0){
           temp= temp/10;
           digit++;
        }
        int sum =0;
        int  rem;
        while(num!=0){
          rem =num%10;
          sum = sum+(int)(Math.pow(rem,digit));
          num/=10;
        }
        if(original==sum){
            return true;
        }
        else{
            return false;

        }
    }
}