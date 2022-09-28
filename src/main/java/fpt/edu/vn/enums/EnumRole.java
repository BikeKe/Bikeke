package fpt.edu.vn.enums;

public enum EnumRole {
    ADMIN("Admin"), CUSTOMER("Customer"), DRIVER("Driver");

    private final String role;

    EnumRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public static EnumRole getRoleConst(String role) {
        for (EnumRole enumRole : values()) {
            if (enumRole.role.equals(role)) {
                return enumRole;
            }
        }
        return null;
    }
}
