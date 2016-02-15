package com.crimeasos.java.course.eleventh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by Паша on 10.02.2016.
 */
public class UpperCaseReader extends BufferedReader {

    public UpperCaseReader(Reader in) {
        super(in);
    }

    @Override
    public String readLine() throws IOException {
        String line = super.readLine();
        return line != null ? line.toUpperCase() : null;
    }
}
