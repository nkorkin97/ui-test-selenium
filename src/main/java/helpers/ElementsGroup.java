package helpers;

public enum ElementsGroup {

    TEXT_BOX("Text Box", "/text-box"),
    CHECK_BOX("Check Box", "/checkbox");

    private final String name;
    private final String endpoint;

    ElementsGroup(String name, String endpoint) {
        this.name = name;
        this.endpoint = endpoint;
    }

    public String getElementsGroupName() {
        return this.name;
    }

    public String getElementsGroupEndpoint() {
        return this.endpoint;
    }
}
