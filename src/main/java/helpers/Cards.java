package helpers;

public enum Cards {
    ELEMENTS("Elements"),
    FORMS("Forms"),
    ALERTS("Alerts, Frame & Windows"),
    WIDGETS("Widgets"),
    INTERACTIONS("Interactions"),
    BOOKSTORE("Book Store Application");

    String name;

    Cards(String name) {
        this.name = name;
    }

    public String getCardName() {
        return this.name;
    }

}
