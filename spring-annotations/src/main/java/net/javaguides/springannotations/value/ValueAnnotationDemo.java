package net.javaguides.springannotations.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotationDemo {

    @Value("Default Name")
    private String defaultName;

    public  String getDefaultName(){
        return defaultName ;
    }

}
