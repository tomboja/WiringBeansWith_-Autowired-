import config.Config;
import domain.Parrot;
import domain.Person;
import domain.Person1;
import domain.Person2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ProjectName: WiringBeansWith_@Autowired
 * @Author: Temesgen D.
 * @Date: 2/1/22
 */

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Parrot parrot = context.getBean(Parrot.class);
        parrot.setName("Koko");
        System.out.println("parrot = " + parrot);

        Person person = context.getBean(Person.class);
        person.setName("Jane");
        System.out.println("person = " + person);

        Person1 person1 = context.getBean(Person1.class);
        person1.setName("Jemma");
        System.out.println("person1 = " + person1);

        Person2 person2 = context.getBean(Person2.class);
        person2.setName("Elina");
        System.out.println("person2 = " + person2);
    }
}
