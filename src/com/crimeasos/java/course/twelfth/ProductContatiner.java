package com.crimeasos.java.course.twelfth;

import com.crimeasos.java.course.sixth.calculator.Calculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Паша on 15.02.2016.
 */
public class ProductContatiner<T extends Product>  {

    public BigDecimal countSummuryPrice(List<T> tList) {
        BigDecimal sum = BigDecimal.ZERO;
        for (Product product : tList) {
            sum = sum.add(product.price);
        }
        return sum;
    }

    public int countSummuryPeopleCount(List<? extends Car> carList) {
        int sum = 0;
        for (Car car : carList) {
            sum += car.peopleCount;
        }
        return sum;
    }

    public void addCarToProduct(List<? super Car> productList, List<? extends Car> carList) {
        for (Car car : carList) {
            productList.add(car);
        }
    }


    //----------------------------------------
    public static void main(String[] args) {
        ProductContatiner<Product> productContatiner = new ProductContatiner<>();
        List<Product> productList = new ArrayList<>();
        productList.add(new Vehicle("vehicle1", new BigDecimal(100), 100));
        productList.add(new Car("car1", new BigDecimal(125), 125, 4));


        List<Car> carList = Arrays.asList(new Car("car1", new BigDecimal(125), 125, 4),
                new Car("car2", new BigDecimal(125), 125, 5));

        productContatiner.addCarToProduct(productList, carList);
//        System.out.println(productList);
//
//        System.out.println(productContatiner.countSummuryPrice(productList));
//        System.out.println(productContatiner.countSummuryPeopleCount(carList));

        System.out.println(TestGenericMethod.fill(new ArrayList<Double>(), 10.0));

    }

}


class TestGenericMethod {

    public static <E extends Number> List<E> fill(List<E> eList, E e) {
       for (int i =0 ; i<10; i++) {
           eList.add(e);
       }
        return eList;
    }
}
