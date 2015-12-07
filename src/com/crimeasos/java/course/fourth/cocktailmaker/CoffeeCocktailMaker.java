package com.crimeasos.java.course.fourth.cocktailmaker;

/**
 * Created by Паша on 07.12.2015.
 */
public class CoffeeCocktailMaker implements CocktailMakerModule {
    @Override
    public void makeCocktail() {
        System.out.println("Coffee cocktail is ready");
    }
}
