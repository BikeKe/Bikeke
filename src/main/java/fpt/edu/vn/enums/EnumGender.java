package fpt.edu.vn.enums;

public enum EnumGender {
    MALE("Male"), FEMALE("Female"), OTHER("Other");

    private final String gender;

    EnumGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public static EnumGender getGenderConst(String gender) {
        for (EnumGender enumGender : values()) {
            if (enumGender.gender.equals(gender)){
                return enumGender;
            }
        }
        return null;
    }
}
