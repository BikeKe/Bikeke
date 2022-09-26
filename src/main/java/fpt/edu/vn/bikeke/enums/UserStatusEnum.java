package fpt.edu.vn.bikeke.enums;

public enum UserStatusEnum {
    ACTIVE("Active"), INACTIVE("Inactive");

    private final String status;

    UserStatusEnum(String status) {
        this.status = status;
    }

    public String getStatus(){
        return status;
    }
}
