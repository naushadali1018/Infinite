package Training;
import java.lang.String;
class DataTypes{
    int a = 10;
    Integer obj = a; //boxing
    int g =obj;  //unboxing
    char c = 'r';
    int r = (int)c;
    double d = 3.14D;
    Double d1 = d;
    boolean t = true;
}

public class stringDemo {


    public static void main(String[] args) {
        //com.infinite.code.ForLoopExample obj = new com.infinite.code.ForLoopExample();
//        obj.MultiDimensionArray();
        DataTypes d = new DataTypes();
        f1();
    }

    static <Stream> void f1(){

        String name = "Oliver";
        String ab = name.concat(" Carter");
        System.out.println(ab);
        StringBuilder name1 = new StringBuilder();
        name1.append("Oliver");
        name1.append(" Carter");
        System.out.println(name1);
        System.out.println();
        // lines.forEach(System.out::println);
        //Creating StringBuilder Objects
        StringBuilder strOne = new StringBuilder("Java");
        StringBuilder strTwo = new StringBuilder();
        strTwo.append("Python");
        // method will return length of strOne
        Integer length = strOne.length();
        //method will insert a new string to the original string
        strTwo.insert(0,"I love ");
        System.out.println(strTwo);
        // method will append 2.0
        strOne.append(9.0);
        System.out.println(strOne);
        //to print the capacity of object we use capacity()
        System.out.println(strOne.capacity());
        //this method will insert SE into strOne at specified position
        strOne.insert(length,"SE");
        System.out.println(strOne);
        //this method will create a string from start index till end index as specified
        String sub = strTwo.substring(4,9);
        System.out.println(sub);
        //this method can convert StringBuilder Object
        String str = strTwo.toString();
        System.out.println(str.getClass());
        // this method deletes characters from strOne based on the arguments specified
        strOne.delete(0,3);
        System.out.println(strOne);
    }
}
