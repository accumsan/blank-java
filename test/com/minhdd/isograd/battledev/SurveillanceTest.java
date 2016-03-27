package com.minhdd.isograd.battledev;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Created by minhdao on 13/03/16.
 */
public class SurveillanceTest {
    @Test
    public void test1() throws FileNotFoundException {
        test("data/input1.txt", "data/output1.txt");
    }

    @Test
    public void test2() throws FileNotFoundException {
        test("data/input2.txt", "data/output2.txt");
    }

    private void test(String input, String output) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(input));
        Scanner responseSc = new Scanner(new File(output));
        int res = responseSc.nextInt();
//        assertEquals(res, MyClass.get(sc));
    }

}
