package domain;

import org.springframework.stereotype.Component;

/**
 * @ProjectName: WiringBeansWith_@Autowired
 * @Author: Temesgen D.
 * @Date: 2/1/22
 */

@Component
public class Parrot {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                '}';
    }
}
