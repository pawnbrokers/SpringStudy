import com.kuang.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        //获取spring的上下文对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象现在都在spring中管理，我们要使用，直接去里面去出来
        Hello hello = (Hello) applicationContext.getBean("hello");
        System.out.println(hello.toString());



    }
}
