package io.github.orcunbalcilar.springparent;

import io.github.orcunbalcilar.sp.DependencyText;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringParentApplicationTests {

    @Autowired
    private Deneme deneme;

    @Autowired
    private DependencyText dependencyText;

    @Test
    void contextLoads() {
        deneme.deneme();
        dependencyText.printDependencyText();
    }

}
