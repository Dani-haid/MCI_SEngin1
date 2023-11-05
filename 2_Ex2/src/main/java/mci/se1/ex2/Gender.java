package mci.se1.ex2;

/**
 * enum with Gender
 * referenced in Student and it's childs
 */
public enum Gender {
    DIVERSE("diverse"),
    FEMALE("female"),
    MALE("male"),
    UNKNOWN("unknown");
    private String gender;

    Gender(String inputGender) {
        this.gender = inputGender;
    }
    public String getGender() {
        return gender;
    }
}
