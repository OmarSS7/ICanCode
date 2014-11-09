package ma.sqli.vehicles.utils;

import org.junit.Assert;
import org.junit.Test;

public class DistanceParserTest {

    @Test
    public void testParse(){
        Assert.assertEquals(new Double(200), DistanceParser.parse("200 KM"));
    }

}
