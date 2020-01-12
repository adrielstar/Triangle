package com.keylane.triangle;

import lombok.Data;
import lombok.NonNull;

@Data
public class Triangle {
    @NonNull
    private Integer firstSide;

    @NonNull
    private Integer secondSide;

    @NonNull
    private Integer thirdSide;

    @Override
    public String toString() {
        return "The Triangle is " + TriangleClassification.getTriangleClassification(firstSide, secondSide, thirdSide);
    }
}
