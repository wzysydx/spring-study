import com.kuang.dao.UserDaoMySqlImpl;
import com.kuang.dao.UserDaoOracleImpl;
import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {

        //获取Applicationcontext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //容器，需要什么直接get什么
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");

        userServiceImpl.getUser();


    }

//    @Test
//    public void test(){
//        UserServiceImpl service = new UserServiceImpl();
//        service.setUserDao( new UserDaoMySqlImpl() );
//        service.getUser();
//        //那我们现在又想用Oracle去实现呢
//        service.setUserDao( new UserDaoOracleImpl() );
//        service.getUser();
//    }

}
