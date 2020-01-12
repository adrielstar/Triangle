package com.keylane.triangle;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleClassificationTest {

    private static final String TRIANGLE_TYPE = "The Triangle is ";

    @Test
    public void testGetTriangleClassificationIsEquilateral() {
        // Prepare
        final Triangle triangle = new Triangle(4, 4, 4);

        // Execute
        String result = triangle.toString();

        // Validate
        assertThat(result, is(TRIANGLE_TYPE + TriangleClassification.EQUILATERAL));
    }

    @Test
    public void testGetTriangleClassificationIsIsosceles() {
        // Prepare
        final Triangle triangle = new Triangle(4, 4, 9);

        // Execute
        String result = triangle.toString();

        // Validate
        assertThat(result, is(TRIANGLE_TYPE + TriangleClassification.ISOSCELES));
    }

    @Test
    public void testGetTriangleClassificationIsScalene() {
        // Prepare
        final Triangle triangle = new Triangle(4, 2, 9);

        // Execute
        String result = triangle.toString();

        // Validate
        assertThat(result, is(TRIANGLE_TYPE + TriangleClassification.SCALENE));
    }

    @Test
    public void testGetTriangleClassificationIsInvalid() {
        // Prepare
        final Triangle triangle = new Triangle(0, 0, -1);

        // Execute
        String result = triangle.toString();

        // Validate
        assertThat(result, is(TRIANGLE_TYPE + TriangleClassification.INVALID));
    }
}