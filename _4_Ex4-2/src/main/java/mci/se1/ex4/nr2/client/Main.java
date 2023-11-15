package mci.se1.ex4.nr2.client;

import mci.se1.ex4.nr2.businessLogic.BoardMember;
import mci.se1.ex4.nr2.businessLogic.StaffDirectory;

public class Main {
    public static void main(String[] args) {
        BoardMember member1 = new BoardMember(1, "Hans", "Mueller");
        BoardMember member2 = new BoardMember(2, "Sabine", "Muster");
        member1.print();

        StaffDirectory directory = new StaffDirectory();
        directory.addStaff(member1, "member1");
        directory.addStaff(member2, "member2");
        directory.print();
        directory.remove(member1, member1.getFirstName()+" "+member1.getLastName());

    }
}