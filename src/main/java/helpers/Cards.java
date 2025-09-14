package helpers;

public enum Cards {
    ELEMENTS("Elements", "/elements"),
    FORMS("Forms", "/forms");

    private final String name;
    private final String endpoint;

    Cards(String name, String endpoint) {
        this.name = name;
        this.endpoint = endpoint;
    }

    public String getCardName() {
        return this.name;
    }
    public String getCardEndpoint() {
        return this.endpoint;
    }
}
