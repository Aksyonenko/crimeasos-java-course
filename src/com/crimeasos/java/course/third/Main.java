//��� ����� ������ ����� � ����� ����������� �����
package com.crimeasos.java.course.third;


public class Main {

    /**
     * �������� �����, � ����� ���� ������ ������ ��������
     * @param args - ��������� �� ����������� � ���������� �����
     */
    public static void main(String[] args) {
        /*
         * �������������� ��������
         */

        //������������ ��������

        /*
         * �������� ����� ��'��� ���� Dog �� ����������� ����
         �������� ������ ��������� ���� Dog
         */
        Dog myDog = new Dog();

        //��������� � ����� myDog ����� bark
        myDog.bark();
        //�������� ��'� � ����� myDog
        System.out.println(myDog.name);
        //������������ ���� myDog �������� name = "Bill"
        myDog.name = "Bill";
        //�������� ��'�  � ����� myDog
        System.out.println(myDog.name);
        //�������� ����  � ����� myDog
        System.out.println(myDog.getColor());
    }


}
