package General;

import java.util.Collection;

public class Utils {


     public static <T> void printArray(T[] array){
        for (T obj:
                array
        ) {
            System.out.println(obj);
        }

    }

    public static  <T> void printCollection(Collection<T> collection){
        for (T object:
                collection) {
            if(object!=null){
                System.out.println(object.toString());
            }else{
                System.out.println("null");
            }
        }

    }

}
