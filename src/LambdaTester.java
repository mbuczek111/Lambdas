import java.util.function.Function;

public class LambdaTester {
    public static String modifyString(String string, Function<String, String> fun)
    {
        return fun.apply(string);
    }
    public static Integer stringStat(String string, Function<String, Integer> fun)
    {
        return fun.apply(string);
    }
    public static void main(String[] args) {
        String result = modifyString("tralalala", string-> string.toUpperCase());
        System.out.println(result);
        result = modifyString("traLAlala", string-> string.toLowerCase());
        System.out.println(result);
        result = modifyString("traLAlala", string-> string.substring(0,1));
        System.out.println(result);
        result = modifyString("traLAlala", string-> string.substring(string.length() - 1));
        System.out.println(result);

        Integer anotherResult= stringStat("tralalala", string->string.length());
        System.out.println(anotherResult);
        System.out.println(stringStat("it is just a test string", string -> string.split(" ").length));
    }
}
