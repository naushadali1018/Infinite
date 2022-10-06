public class StaticClass {
    static int a;
    public StaticClass(){
        a++;
    }
    static void fun(){
        System.out.println("Hii");
    }
    static  void  fun(int a){
        System.out.println(a);
    }

    public static void main(String []args){
        StaticClass s1 = new StaticClass();
        System.out.println(s1.a);
        StaticClass s2 = new StaticClass();
        System.out.println(s1.a);
        System.out.println(s2.a);
        StaticClass s3 = new StaticClass();
        System.out.println(s3.a);

        // Static Function
        fun();
        StaticClass.fun();
        s3.fun();

        fun(1);



    }
}
