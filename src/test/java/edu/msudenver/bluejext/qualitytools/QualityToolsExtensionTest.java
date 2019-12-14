/* Quality Tools for BlueJ project.  See: https://metrocs.github.io/QualityToolsForBlueJ */
package edu.msudenver.bluejext.qualitytools;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit tests for QualityToolsExtension class.
 * @author <a href="https://github.com/MetroCS">MetroCS</a>
 * @author CS3250 Fall 2019 Students
 * @version 0.1.0
 */
class QualityToolsExtensionTest {
    /** The intended name of the product. */
    public static final String PRODUCT_NAME = "Quality Tools";
    /** The intended description of the product. */
    public static final String PRODUCT_DESCRIPTION = "BlueJ extension that integrates quality assessment tools";
    /** The intended URL of the project. */
    private final String PROJECT_URL = "https://metrocs.github.io/QualityToolsForBlueJ";

    private QualityToolsExtension unit;

    @BeforeEach
    void setup() {
        unit = new QualityToolsExtension();
    }

    @Test
    void isCompatible() {
        assertTrue(unit.isCompatible());
    }

    @Test
    void getVersion() {
        //TODO - Create check for a valid version
    }

    @Test
    void getName() {
        assertEquals(PRODUCT_NAME, unit.getName());
    }

    @Test
    void terminate() {
        unit.terminate();
    }

    @Test
    void getDescription() {
        assertEquals(PRODUCT_DESCRIPTION, unit.getDescription());
    }

    @Test
    void getURL() throws MalformedURLException {
        URL url = new URL(PROJECT_URL);
        assertEquals(url, unit.getURL());
    }
}
