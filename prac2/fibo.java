class fibo {
    public static void main(String[]args){
    int n1,n2,n3,i;
    n1=0;
    n2=1;
    int sum=1;
    System.out.println(n1);
    System.out.println(n2);
    for(i=1;i<=10-2;i++)
    {
       n3=n1+n2;
       System.out.println(n3);
       sum=sum+n3;
       n1=n2;
       n2=n3;


    }
    System.out.println("sumof the fibonacci series is "+sum);
}
    
    
}
