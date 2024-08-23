package net.javaguides.springannotations;

import org.springframework.stereotype.Component;

@Component
public class PizzaController {
    public String getPizza(){
        return "HOT PIZZA";
    }
}
