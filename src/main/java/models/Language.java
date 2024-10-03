package models;

import java.util.ArrayList;
import java.util.List;

public enum Language {
    ARABIC("Arabic"),
    BULGARIAN("Bulgarian"),
    CATALAN("Catalan"),
    CROATIAN("Croatian"),
    CZECH("Czech"),
    DANISH("Danish"),
    DUTCH("Dutch"),
    ENGLISH("English"),
    ESTONIAN("Estonian"),
    FILIPINO("Filipino"),
    FINNISH("Finnish"),
    FRENCH("French"),
    GERMAN("German"),
    GREEK("Greek"),
    HEBREW("Hebrew"),
    HINDI("Hindi"),
    HUNGARIAN("Hungarian"),
    ICELANDIC("Icelandic"),
    INDONESIAN("Indonesian"),
    ITALIAN("Italian"),
    JAPANESE("Japanese"),
    KOREAN("Korean"),
    LATVIAN("Latvian"),
    LITHUANIAN("Lithuanian"),
    MALAY("Malay"),
    NORWEGIAN("Norwegian"),
    PERSIAN("Persian"),
    POLISH("Polish"),
    PORTUGUESE("Portuguese"),
    ROMANIAN("Romanian"),
    RUSSIAN("Russian"),
    SERBIAN("Serbian"),
    SLOVAK("Slovak"),
    SLOVENIAN("Slovenian"),
    SPANISH("Spanish"),
    SWEDISH("Swedish"),
    THAI("Thai"),
    TURKISH("Turkish"),
    UKRAINIAN("Ukrainian"),
    URDU("Urdu"),
    VIETNAMESE("Vietnamese");

    private final String languageName;
    public static List<String> languagesEnum = new ArrayList();

    // Parameterized constructor
    Language(String languageName) {
        this.languageName = languageName;
    }

    // Getter for language name
    public String getLanguageName() {
        return languageName;
    }

    public static List<String> getAllValues() {
        Language[] languages = Language.values();
        for (Language s : languages) {
            languagesEnum.add(s.getLanguageName());
        }
        return languagesEnum;
    }

    // To String method to return the language name
    @Override
    public String toString() {
        return languageName;
    }
}