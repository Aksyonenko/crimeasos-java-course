package com.crimeasos.java.course.seventh;

/**
 * Created by Паша on 15.01.2016.
 * Клас з перевизначеними equals , hashcode
 */
public class Table {

    int height;
    int width;

    public Table(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Table table = (Table) o;

        if (height != table.height) return false;
        return width == table.width;

    }

    @Override
    public int hashCode() {
        int result = height;
        result = 31 * result + width;
        return result;
    }
}
