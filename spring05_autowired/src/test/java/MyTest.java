import com.kuang.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.misc.CEFormatException;

public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person.toString());
        System.out.println(person.getName());
        person.getCat().shout();
        person.getDog().shout();
    }
}
