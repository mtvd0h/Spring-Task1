import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        System.out.println(bean2.getMessage());

        Cat bean3 = (Cat) applicationContext.getBean("cat");
        Cat bean4 = (Cat) applicationContext.getBean("cat");

        System.out.println(bean3.getMeow());
        System.out.println(bean4.getMeow());

        System.out.println("Для HelloWorld: " + (bean1==bean2));
        System.out.println("Для Cat: " + (bean3==bean4));

    }
}