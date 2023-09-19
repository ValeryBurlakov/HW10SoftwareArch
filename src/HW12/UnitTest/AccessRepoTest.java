package HW12.UnitTest;

import HW12.AccessRepo;
import HW12.Group;
import HW12.User;

import static org.junit.jupiter.api.Assertions.*;

class AccessRepoTest {

    @org.junit.jupiter.api.Test
    void getGroup() {
        Group groupTest = new Group("Architectors");
        AccessRepo accessRepoTest = new AccessRepo(new User("Valery"), groupTest);
        assertEquals(groupTest, accessRepoTest.getGroup());
    }

    @org.junit.jupiter.api.Test
    void setGroup() {
    }

    @org.junit.jupiter.api.Test
    void getUser() {
        User userTest = new User("Valery");
        AccessRepo accessRepoTest = new AccessRepo(userTest, new Group("SoftwareArchitecture"));
        assertEquals(userTest, accessRepoTest.getUser());
    }

    @org.junit.jupiter.api.Test
    void setUser() {
//        User userTest = new User("Valery");
        AccessRepo accessRepoTest = new AccessRepo(new User("Valery"), new Group("SoftwareArchitecture"));
        User userTest = new User("Valery Burlakov");
        accessRepoTest.setUser(userTest);
        assertEquals(userTest, accessRepoTest.getUser());
    }
}