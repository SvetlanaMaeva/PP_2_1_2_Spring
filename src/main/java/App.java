import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat bean2 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean2.getName());

        Cat bean3 = (Cat) applicationContext.getBean("cat");
        bean3.setName("Mur-mew");
        System.out.println(bean3.getName());
    }
}