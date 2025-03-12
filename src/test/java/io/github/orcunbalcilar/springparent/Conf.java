package io.github.orcunbalcilar.springparent;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan("io.github.orcunbalcilar")
@PropertySource("classpath:application-sp.properties")
//@ComponentScans({@ComponentScan("io.github.orcunbalcilar.sp"), @ComponentScan("io.github.orcunbalcilar.springparent")})
public class Conf {

}
