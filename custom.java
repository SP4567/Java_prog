import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface annotation
{
    int value();
}
class hello
{
    @annotation(value = 10)
    public void val()
    {
        System.out.println("got the value");
    }
}
class custom
{
    public static void main(String args[])throws Exception
    {
        try{
        hello h = new hello();
        Method m = h.getClass().getMethod("say hello!");
        annotation a = m.getAnnotation(annotation.class);
        System.out.println("value is:"+a.value());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }  
    }
}