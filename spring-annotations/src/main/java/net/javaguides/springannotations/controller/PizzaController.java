package net.javaguides.springannotations.controller;

import net.javaguides.springannotations.service.Pizza;
import net.javaguides.springannotations.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class PizzaController {

    private Pizza pizza;
   // @Autowired
    public PizzaController(Pizza pizza){
        this.pizza = pizza;
    }

//    @Autowired
//    public PizzaController(VegPizza vegPizza) {
//        this.vegPizza = vegPizza;
//    }
//    @Autowired
//    public void setVegPizza(VegPizza vegPizza){
//        this.vegPizza = vegPizza ;
//    }


    public String getPizza() {
        return pizza.getPizza();
    }
    public void init(){
        System.out.println("Initialization logic");
    }
    public void destroy(){
        System.out.println("Destruction Logic");
    }
}
