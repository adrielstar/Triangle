package com.keylane.triangle;

public enum TriangleClassification {
    EQUILATERAL, ISOSCELES, SCALENE, INVALID;


    public static TriangleClassification getTriangleClassification(final int firstSide, final int secondSide, final int thirdSide) {
        if (isInvalid(firstSide, secondSide, thirdSide))
            return INVALID;

        if (isEquilateral(firstSide, secondSide, thirdSide))
            return EQUILATERAL;

        else if (isIsosceles(firstSide, secondSide, thirdSide))
            return ISOSCELES;

        return SCALENE;
    }

    public static boolean isInvalid(final int firstSide, final int secondSide, final int thirdSide) {
        return firstSide <= 0 || secondSide <= 0 || thirdSide <= 0;
    }

    public static boolean isIsosceles(final int firstSide, final int secondSide, final int thirdSide) {
        return (firstSide == secondSide) || (secondSide == thirdSide);
    }

    public static boolean isEquilateral(final int firstSide, final int secondSide, final int thirdSide) {
        return (firstSide == secondSide) && (firstSide == thirdSide);
    }
}