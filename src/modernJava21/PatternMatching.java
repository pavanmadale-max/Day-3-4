package modernJava21;

class Handler{
    public static void handle(Object obj){
        if(obj instanceof Integer n){
            System.out.println("Integer found "+n);
        }
        else if(obj instanceof String s){
           System.out.println("String found "+s);
        }
        else if(obj instanceof Double d){
            System.out.println("Double found "+d);
        }
        else{
            System.out.println("Unknown type");
        }
    }
}

public class PatternMatching {

    public static void main(String[] args) {

        Object obj1=10;
        Object obj2="Pavan";
        Object obj3=10.0;
        Object obj4=false;

        Handler.handle(obj1);
        Handler.handle(obj2);
        Handler.handle(obj3);
        Handler.handle(obj4);

    }
}
