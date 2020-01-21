class Main{
    public static void main(String args[]){
        int a,b,c;
        a=10;
        b=2;
        try{
            c=a/b;
            System.out.println(c);
        }catch(ArithmeticException e){
            System.out.println("cannot divide by 0");
        }
    }
}