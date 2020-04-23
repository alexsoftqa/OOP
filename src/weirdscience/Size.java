package weirdscience;

public enum Size {

    UNDEFINED(""), EXTRA_SMALL("XS"), SMALL("S"),
    AVERAGE("M"), LARGE("L"), EXTRA_LARGE("XL");

    Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    private String abbreviation;

    public String getAbbreviation() {
        return abbreviation;
    }
}
