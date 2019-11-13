import java.util.*;

class Main{
    public static void main(String args[]){
        Vector list = new Vector();

        if(args.length > 0){
            for(int i=0;i<args.length;i++)
                list.addElement(args[i]);
        }

        // insrt element at position 2
        list.insertElementAt("good", 2);
        System.out.println("size of vector is "+list.size());
    }
}