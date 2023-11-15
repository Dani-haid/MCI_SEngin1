package mci.se1.ex4.nr2.client;

import mci.se1.ex4.nr2.businessLogic.*;

public class Main {
    public static void main(String[] args) {
        BoardMember member1 = new BoardMember(1, "Hans", "Mueller");
        BoardMember member2 = new BoardMember(2, "Sabine", "Muster");
        AdminEmployee admin1 = new AdminEmployee(3, "Cookie", "Monster", "Sweets");
        Researcher researcher1 = new Researcher(4, "Daniel", "Duesentrieb", "Chemics", "New Elements");
        TechnicalStaff technicalStaff1 = new TechnicalStaff(5, "Bob", "Builder");
        TechnicalStaff technicalStaff2 = new TechnicalStaff(6, "Harry", "Potter");

        StaffDirectory directory = new StaffDirectory();

        directory.addStaff(member1, "member1");
        directory.addStaff(member2, "member2");
        directory.addStaff(admin1, "admin1");
        directory.addStaff(researcher1, "researcher1");
        directory.addStaff(technicalStaff1, "technical1");
        directory.addStaff(technicalStaff2, "technical2");


        System.out.println("----------------");
        directory.print();
        System.out.println("----------------");

        directory.remove(member1, member1.getFirstName()+" "+member1.getLastName());
        directory.remove(admin1, admin1.getFirstName()+" "+admin1.getLastName());

        System.out.println("----------------");
        directory.print();

    }
}