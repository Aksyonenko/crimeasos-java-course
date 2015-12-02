//��� ����� ������ ����� � ����� ����������� �����
package com.crimeasos.java.course.third;

/**
 * Created by ���� on 28.11.2015.
 */
public class Dog {

    /* �� ������������ � ������� ������ ���������� ��'���� ���� Dog
         name = "John", color = "red"
    */
    public String name = "John";
    // color - �������� ����, ���� �� ����� � ������ ����
    private String color = "red";

    /**
     * �������� ����� bark ����� ��������� � ����-����� ���� ��������
     */
    public void bark() {
        System.out.println("Lay-lay-lay");
        //��������� �������� �����
        bite();
    }

    /**
     * �������� ����� getColor ����� ��������� � ����-����� ���� ��������
     */
    public String getColor() {
        return color;
    }


    /**
     * ��������� ����� bite ����� ��������� ���� � ����� ����
     */
    private void bite() {
        System.out.println("RRRR!!! Bite!");
    }


}
