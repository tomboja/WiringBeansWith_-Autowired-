package domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: WiringBeansWith_@Autowired
 * @Author: Temesgen D.
 * @Date: 2/1/22
 */

@Component
public class Person1 {
    private String name;
    private final Parrot parrot;

    // Using constructor injection
    @Autowired // @Autowired on constructor is optional starting with Spring version 4.3
    public Person1(Parrot parrot) {
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", parrot=" + parrot +
                '}';
    }
}
