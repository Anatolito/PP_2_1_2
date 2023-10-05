import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloBean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloBean.getMessage());
        HelloWorld helloBean2 = (HelloWorld) applicationContext.getBean("helloworld");
        Cat catBean = (Cat) applicationContext.getBean("cat");
        Cat catBean2 = (Cat) applicationContext.getBean("cat");
        System.out.println("Переменные HelloWorld ссылаются на один объект? " + helloBean.equals(helloBean2));
        System.out.println("Переменные Cat ссылаются на один объект? " + catBean.equals(catBean2));
    }
}