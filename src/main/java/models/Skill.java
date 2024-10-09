package models;

import java.util.ArrayList;
import java.util.List;

public enum Skill {
    ADOBE_INDESIGN("Adobe InDesign"),
    ADOBE_PHOTOSHOP("Adobe Photoshop"),
    ANALYTICS("Analytics"),
    ANDROID("Android"),
    APIS("APIs"),
    ART_DESIGN("Art Design"),
    AUTOCAD("AutoCAD"),
    BACKUP_MANAGEMENT("Backup Management"),
    C("C"),
    C_PLUS_PLUS("C++"),
    CERTIFICATIONS("Certifications"),
    CLIENT_SERVER("Client Server"),
    CLIENT_SUPPORT("Client Support"),
    CONFIGURATION("Configuration"),
    CONTENT_MANAGEMENT("Content Management"),
    CONTENT_MANAGEMENT_SYSTEMS("Content Management Systems (CMS)"),
    COREL_DRAW("Corel Draw"),
    COREL_WORD_PERFECT("Corel Word Perfect"),
    CSS("CSS"),
    DATA_ANALYTICS("Data Analytics"),
    DESKTOP_PUBLISHING("Desktop Publishing"),
    DESIGN("Design"),
    DIAGNOSTICS("Diagnostics"),
    DOCUMENTATION("Documentation"),
    END_USER_SUPPORT("End User Support"),
    EMAIL("Email"),
    ENGINEERING("Engineering"),
    EXCEL("Excel"),
    FILEMAKER_PRO("FileMaker Pro"),
    FORTRAN("Fortran"),
    HTML("HTML"),
    IMPLEMENTATION("Implementation"),
    INSTALLATION("Installation"),
    INTERNET("Internet"),
    IOS("iOS"),
    IPHONE("iPhone"),
    LINUX("Linux"),
    JAVA("Java"),
    JAVASCRIPT("JavaScript"),
    MAC("Mac"),
    MATLAB("Matlab"),
    MAYA("Maya"),
    MICROSOFT_EXCEL("Microsoft Excel"),
    MICROSOFT_OFFICE("Microsoft Office"),
    MICROSOFT_OUTLOOK("Microsoft Outlook"),
    MICROSOFT_PUBLISHER("Microsoft Publisher"),
    MICROSOFT_WORD("Microsoft Word"),
    MICROSOFT_VISUAL("Microsoft Visual"),
    MOBILE("Mobile"),
    MYSQL("MySQL"),
    NETWORKS("Networks"),
    OPEN_SOURCE_SOFTWARE("Open Source Software"),
    ORACLE("Oracle"),
    PERL("Perl"),
    PHP("PHP"),
    PRESENTATIONS("Presentations"),
    PROCESSING("Processing"),
    PROGRAMMING("Programming"),
    PT_MODELER("PT Modeler"),
    PYTHON("Python"),
    QUICKBOOKS("QuickBooks"),
    RUBY("Ruby"),
    SHADE("Shade"),
    SOFTWARE("Software"),
    SPREADSHEET("Spreadsheet"),
    SQL("SQL"),
    SUPPORT("Support"),
    SYSTEMS_ADMINISTRATION("Systems Administration"),
    TECH_SUPPORT("Tech Support"),
    TROUBLESHOOTING("Troubleshooting"),
    UNIX("Unix"),
    UI_UX("UI / UX"),
    WEB_PAGE_DESIGN("Web Page Design"),
    WINDOWS("Windows"),
    WORD_PROCESSING("Word Processing"),
    XML("XML"),
    XHTML("XHTML");

    public static List<String> skillEnum = new ArrayList();
    private final String skillName;

    // Parameterized constructor
    Skill(String skillName) {
        this.skillName = skillName;
    }

    // Getter for skill name
    public String getSkillName() {
        return skillName;
    }

    public static List<String> getAllValues() {
        Skill[] skill = Skill.values();
        for (Skill s : skill) {
            skillEnum.add(s.getSkillName());
        }
        return skillEnum;
    }

    // To String method to return the skill name
    @Override
    public String toString() {
        return skillName;
    }
}