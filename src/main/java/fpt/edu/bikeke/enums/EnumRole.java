package fpt.edu.bikeke.enums;

public enum EnumRole {
    ADMIN(1), CUSTOMER(2), DRIVER(3);

    private final int roleId;

    EnumRole(int i) {
        this.roleId = i;
    }

    public int getRoleId(){
        return roleId;
    }
}
