package fpt.edu.vn.enums;

public enum EnumAccountStatus {
    ACTIVE("Active"), INACTIVE("Inactive");

    private final String status;

    EnumAccountStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public static EnumAccountStatus getStatusConst(String status) {
        for (EnumAccountStatus enumAccountStatus : values()) {
            if (enumAccountStatus.status.equals(status)) {
                return enumAccountStatus;
            }
        }
        return null;
    }
}
