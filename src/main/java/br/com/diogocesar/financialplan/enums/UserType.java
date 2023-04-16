package br.com.diogocesar.financialplan.enums;

public enum UserType {
    ADMIN("Admin"),
    USER("User"),
    GUEST("Guest");

    private final String displayName;

    UserType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
