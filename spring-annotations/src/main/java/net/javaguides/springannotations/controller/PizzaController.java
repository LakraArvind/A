package net.javaguides.springannotations.controller;

import net.javaguides.springannotations.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PizzaController {
    private VegPizza vegPizza;

//    @Autowired
//    public PizzaController(VegPizza vegPizza) {
//        this.vegPizza = vegPizza;
//    }
    @Autowired
    public void setVegPizza(VegPizza vegPizza){
        this.vegPizza = vegPizza ;
    }

    public String getPizza() {
        return vegPizza.getPizza();
    }
}
