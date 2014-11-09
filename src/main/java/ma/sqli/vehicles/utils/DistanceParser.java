package ma.sqli.vehicles.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DistanceParser {

    public static Double parse(String distance){
        Pattern pattern = Pattern.compile("(\\d+) KM");
        Matcher matcher = pattern.matcher(distance);
        if(matcher.find()){
            return Double.parseDouble(matcher.group(1));
        } else {
            throw new IllegalArgumentException("Valid format: XXXX KM");
        }
    }
}
