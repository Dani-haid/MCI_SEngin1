package mci.se1.ex2;

public enum Gender {
    FEMALE("female"),
    MALE("male"),
    DIVERSE("diverse"),
    UNKNOWN("unknown");

    private String gender;
    Gender(String inputGender){
        this.gender = inputGender;
    }

    public String getGender(){
        return gender;
    }
}
