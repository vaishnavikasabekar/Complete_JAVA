class Roll
{
     public static void main(String[] args)
     { 
          if(args.length!=2)
          {
              System.out.println("pls provide 2 arguments:");
              return;
          }
           
           int roll;
           String nm['20'];
           roll=Integer.parseInt(args[0]);
           nm=(args[1]);
           System.out.println("your roll number is:"+roll);
           System.out.println("your name is:"+nm);
     }
}