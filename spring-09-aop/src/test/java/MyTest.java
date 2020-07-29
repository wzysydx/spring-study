import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //动态代理代理的是接口：注意点！！！
        UserService userService = (UserService) context.getBean("userService");

        userService.query();

    }
}
