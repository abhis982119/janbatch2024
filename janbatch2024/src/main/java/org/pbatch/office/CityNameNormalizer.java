package org.pbatch.office;

import java.text.Normalizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CityNameNormalizer {
/*    public static String normalizeCityName(String cityName) {
        // Normalize the string using NFKD normalization
        String normalizedString = Normalizer.normalize(cityName, Normalizer.Form.NFKD);
        // Remove non-ASCII characters
        normalizedString = normalizedString.replaceAll("[^\\p{ASCII}]", "");
        // Convert to lowercase
        normalizedString = normalizedString.toLowerCase();
        return normalizedString;
    }*/


    public static String normalizeCityName(String cityName) {
        // Decode Unicode escape sequences
        Matcher matcher = Pattern.compile("\\\\u([0-9a-fA-F]{4})").matcher(cityName);
        StringBuffer decoded = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(decoded, "");
            String unicode = matcher.group(1);
            char character = (char) Integer.parseInt(unicode, 16);
            decoded.append(character);
        }
        matcher.appendTail(decoded);

        // Normalize the string using NFKD normalization
        String normalizedString = Normalizer.normalize(decoded.toString(), Normalizer.Form.NFKD);
        // Remove non-ASCII characters
        normalizedString = normalizedString.replaceAll("[^\\p{ASCII}]", "");
        // Convert to lowercase
        normalizedString = normalizedString.toLowerCase();
        return normalizedString;
    }

    public static void main(String[] args) {
   /*     String cityName1 = "M\u00e1laga";
        String cityName2 = "Barcelona";*/
        
        String cityName1 = "Troms\\u00f8";
        String cityName2 = "tromso";

        String normalizedCityName1 = normalizeCityName(cityName1);
        String normalizedCityName2 = normalizeCityName(cityName2);
        
        System.out.println(normalizedCityName1);  // Output: malaga
        System.out.println(normalizedCityName2);  // Output: barcelona
    }
}
