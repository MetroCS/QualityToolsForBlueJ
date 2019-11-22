package edu.msudenver.bluejext.qualitytools;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class QualityToolsExtensionTest {

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
        assertEquals("0.0.01", unit.getVersion());
    }

    @Test
    void getName() {
        assertEquals("Quality Tools", unit.getName());
    }

    @Test
    void terminate() {
        unit.terminate();
    }

    @Test
    void getDescription() {
        assertEquals("BlueJ extension that integrates quality assessment tools", unit.getDescription());
    }

    @Test
    void getURL() throws MalformedURLException {
        URL url = new URL("https://metrocs.github.io/QualityToolsForBlueJ");
        assertEquals(url, unit.getURL());
    }
}
