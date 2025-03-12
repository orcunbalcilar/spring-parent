package io.github.orcunbalcilar.springparent;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Deneme {

    @Value("${text}")
    private String text;

    public void deneme() {
        System.out.println(text);
    }

}
