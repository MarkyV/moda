package gov.nyc.moda.geocoder;

import org.junit.Before;
import org.junit.Test;

public class GeocodeTest {

    private Geocode geocode;

    @Before
    public void setup() {
        final String inputFilePath = "";
        final String outputFilePath = "";
        final String columnCharDelimiter = "";
        final String columnNameForBuildingNumber = "";
        final String columnNameForStreetName = "";
        final String columnNameForZipCode = "";
        final String columnNameForBorough = "";
        final String columnNameForCity = "";

        geocode = new Geocode(inputFilePath, outputFilePath,
                columnCharDelimiter,
                columnNameForBuildingNumber, columnNameForStreetName,
                columnNameForZipCode, columnNameForBorough,
                columnNameForCity);
    }

    @Test
    public void test() {

    }
}

