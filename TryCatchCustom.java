import java.lang.Exception;

class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}

class Main{
    public static void main(String args[]){
        int a,b,c;
        a=10;
        b=0;
        try{
            if(a>b) throw new MyException("first arg should be less.");
            System.out.println("runnn");
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
}