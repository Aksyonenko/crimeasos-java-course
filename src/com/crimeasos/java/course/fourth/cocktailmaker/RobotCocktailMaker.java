package com.crimeasos.java.course.fourth.cocktailmaker;

import com.crimeasos.java.course.fourth.Robot;

/**
 * Created by Паша on 07.12.2015.
 */
public class RobotCocktailMaker extends Robot {
    private CocktailMakerModule milkCocktailMaker = new MilkCocktailMaker();
    private CocktailMakerModule coffeeCocktailMaker = new CoffeeCocktailMaker();

    public void makeCoffeeCocktail() {
        coffeeCocktailMaker.makeCocktail();
    }

    public void makeMilkCocktail() {
        milkCocktailMaker.makeCocktail();
    }
}
