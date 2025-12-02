package randoop.User;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setLastName("null,null,null,hi!,null,null,[],");
        user0.setLastName("null,null,null,hi!,null,null,[],");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole2 = null;
        user0.setAccountRole(accountRole2);
        java.lang.String str4 = user0.getEmail();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setLastName("");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getId();
        java.lang.String str5 = user0.getId();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole6 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking7 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking8 = user0.addBooking(booking7);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(accountRole6);
        org.junit.Assert.assertNull(booking8);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getPassword();
        java.lang.String str21 = user0.getId();
        org.openjfx.EECS_3311_Project.model.Booking booking22 = null;
        user0.removeBooking(booking22);
        java.lang.String str24 = user0.getId();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole25 = null;
        user0.setAccountRole(accountRole25);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.Class<?> wildcardClass2 = user0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getId();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole5 = user0.getAccountRole();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(accountRole5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        java.lang.String str2 = user0.getUserType();
        java.lang.String str3 = user0.getLastName();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setUserType("hi!");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList3 = null;
        user0.setBookings(bookingList3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = user0.toCSVRow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.stream()\" because the return value of \"org.openjfx.EECS_3311_Project.model.User.getBookings()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getId();
        java.lang.String str5 = user0.getId();
        org.openjfx.EECS_3311_Project.model.Booking booking6 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking7 = user0.addBooking(booking6);
        org.openjfx.EECS_3311_Project.model.User user8 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole9 = user8.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking10 = null;
        user8.removeBooking(booking10);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList12 = user8.getVisibleBookings();
        user8.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user15 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole16 = user15.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking17 = null;
        user15.removeBooking(booking17);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList19 = user15.getVisibleBookings();
        user15.setFirstName("");
        java.lang.String str22 = user15.getLastName();
        user15.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList25 = user15.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList26 = user15.getVisibleBookings();
        user8.setBookings(bookingList26);
        user0.setBookings(bookingList26);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(booking7);
        org.junit.Assert.assertNull(accountRole9);
        org.junit.Assert.assertNotNull(bookingList12);
        org.junit.Assert.assertNull(accountRole16);
        org.junit.Assert.assertNotNull(bookingList19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(bookingList25);
        org.junit.Assert.assertNotNull(bookingList26);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        org.openjfx.EECS_3311_Project.model.Booking booking10 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking11 = user0.addBooking(booking10);
        java.lang.String str12 = user0.getId();
        user0.setId("null,null,null,hi!,null,null,[],");
        user0.setUserType("");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getId();
        java.lang.String str5 = user0.getId();
        org.openjfx.EECS_3311_Project.model.Booking booking6 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking7 = user0.addBooking(booking6);
        java.lang.String str8 = user0.getUserType();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(booking7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setFirstName("");
        java.lang.String str3 = user0.getPassword();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user0.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user0.getVisibleBookings();
        java.lang.Class<?> wildcardClass12 = bookingList11.getClass();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setEmail("hi!");
        java.lang.String str3 = user0.toCSVRow();
        user0.setPassword("hi!");
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null,null,null,hi!,null,null,[]," + "'", str3, "null,null,null,hi!,null,null,[],");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList8 = user0.getVisibleBookings();
        user0.setPassword("null,null,null,null,null,null,[],");
        java.lang.String str11 = user0.getId();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setLastName("null,null,null,hi!,null,null,[],");
        user0.setId("null,null,null,hi!,null,null,[],");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        user0.setId("null,,,null,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getPassword();
        java.lang.String str21 = user0.getId();
        user0.setLastName("");
        user0.setPassword("null,null,null,hi!,null,null,[],");
        java.lang.Class<?> wildcardClass26 = user0.getClass();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getPassword();
        java.lang.String str21 = user0.getId();
        org.openjfx.EECS_3311_Project.model.Booking booking22 = null;
        user0.removeBooking(booking22);
        user0.setUserType("");
        user0.setId("null,null,null,null,null,null,[],");
        user0.setLastName("null,,,null,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        org.openjfx.EECS_3311_Project.model.Booking booking10 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking11 = user0.addBooking(booking10);
        java.lang.String str12 = user0.getId();
        java.lang.String str13 = user0.getId();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        org.openjfx.EECS_3311_Project.model.Booking booking10 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking11 = user0.addBooking(booking10);
        user0.setPassword("null,,,null,null,null,[],");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole14 = null;
        user0.setAccountRole(accountRole14);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(booking11);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getPassword();
        java.lang.String str21 = user0.getId();
        user0.setLastName("");
        java.lang.String str24 = user0.getUserType();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getEmail();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList5 = user0.getBookings();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(bookingList5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getPassword();
        org.openjfx.EECS_3311_Project.model.User user21 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole22 = user21.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking23 = null;
        user21.removeBooking(booking23);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList25 = user21.getVisibleBookings();
        user21.setFirstName("");
        java.lang.String str28 = user21.getLastName();
        user21.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList31 = user21.getBookings();
        java.lang.String str32 = user21.getLastName();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList33 = user21.getVisibleBookings();
        user0.setBookings(bookingList33);
        org.openjfx.EECS_3311_Project.model.Booking booking35 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking36 = user0.addBooking(booking35);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(accountRole22);
        org.junit.Assert.assertNotNull(bookingList25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(bookingList31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(bookingList33);
        org.junit.Assert.assertNull(booking36);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole2 = null;
        user0.setAccountRole(accountRole2);
        java.lang.String str4 = user0.getId();
        org.openjfx.EECS_3311_Project.model.Booking booking5 = null;
        user0.removeBooking(booking5);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList7 = user0.getBookings();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user0.getAccountRole();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNull(accountRole8);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getFirstName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setUserType("hi!");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList3 = null;
        user0.setBookings(bookingList3);
        user0.setEmail("");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setEmail("hi!");
        java.lang.String str3 = user0.toCSVRow();
        java.lang.String str4 = user0.getUserType();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole5 = null;
        user0.setAccountRole(accountRole5);
        user0.setUserType("null,,,null,null,null,[],");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null,null,null,hi!,null,null,[]," + "'", str3, "null,null,null,hi!,null,null,[],");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setUserType("hi!");
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("null,null,null,null,null,null,[],");
        java.lang.String str6 = user0.getUserType();
        org.openjfx.EECS_3311_Project.model.Booking booking7 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking8 = user0.addBooking(booking7);
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(booking8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user0.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user0.getVisibleBookings();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole12 = null;
        user0.setAccountRole(accountRole12);
        java.lang.String str14 = user0.getUserType();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        org.openjfx.EECS_3311_Project.model.Booking booking10 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking11 = user0.addBooking(booking10);
        user0.setPassword("null,,,null,null,null,[],");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList14 = user0.getBookings();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertNotNull(bookingList14);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList7 = user0.getVisibleBookings();
        user0.setPassword("null,null,null,null,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNotNull(bookingList7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getPassword();
        java.lang.String str21 = user0.getId();
        user0.setLastName("");
        user0.setUserType("");
        org.openjfx.EECS_3311_Project.model.Booking booking26 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking27 = user0.addBooking(booking26);
        java.lang.String str28 = user0.getLastName();
        java.lang.String str29 = user0.getId();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(booking27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.toCSVRow();
        java.lang.String str5 = user0.getId();
        org.openjfx.EECS_3311_Project.model.User user6 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole7 = user6.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking8 = null;
        user6.removeBooking(booking8);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user6.getVisibleBookings();
        user6.setFirstName("");
        java.lang.String str13 = user6.getLastName();
        user6.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList16 = user6.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user6.getVisibleBookings();
        user0.setBookings(bookingList17);
        org.openjfx.EECS_3311_Project.model.Booking booking19 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking20 = user0.addBooking(booking19);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null,null,null,null,null,null,[]," + "'", str4, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(accountRole7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNull(booking20);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        java.lang.String str10 = user0.getId();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole11 = null;
        user0.setAccountRole(accountRole11);
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.toCSVRow();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null,,null,null,null,null,[]," + "'", str7, "null,,null,null,null,null,[],");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getId();
        java.lang.String str5 = user0.getId();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole6 = user0.getAccountRole();
        java.lang.String str7 = user0.getId();
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(accountRole6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getPassword();
        java.lang.String str21 = user0.getId();
        user0.setLastName("");
        org.openjfx.EECS_3311_Project.model.Booking[] bookingArray24 = new org.openjfx.EECS_3311_Project.model.Booking[] {};
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList25 = new java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<org.openjfx.EECS_3311_Project.model.Booking>) bookingList25, bookingArray24);
        user0.setBookings(bookingList25);
        java.lang.Class<?> wildcardClass28 = bookingList25.getClass();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(bookingArray24);
        org.junit.Assert.assertArrayEquals(bookingArray24, new org.openjfx.EECS_3311_Project.model.Booking[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setEmail("hi!");
        java.lang.String str3 = user0.toCSVRow();
        java.lang.String str4 = user0.getUserType();
        user0.setEmail("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null,null,null,hi!,null,null,[]," + "'", str3, "null,null,null,hi!,null,null,[],");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user0.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user0.getVisibleBookings();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole12 = user0.getAccountRole();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(accountRole12);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setEmail("hi!");
        java.lang.String str3 = user0.toCSVRow();
        user0.setFirstName("null,null,null,hi!,null,null,[],");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole6 = null;
        user0.setAccountRole(accountRole6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null,null,null,hi!,null,null,[]," + "'", str3, "null,null,null,hi!,null,null,[],");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getFirstName();
        user0.setId("null,null,null,null,null,null,[],");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList23 = user0.getBookings();
        user0.setUserType("");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(bookingList23);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getPassword();
        java.lang.String str21 = user0.getId();
        user0.setLastName("");
        java.lang.String str24 = user0.toCSVRow();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList25 = user0.getBookings();
        java.lang.String str26 = user0.getPassword();
        user0.setId("null,,,null,null,null,[],");
        user0.setPassword("null,,,null,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "null,,,null,null,null,[]," + "'", str24, "null,,,null,null,null,[],");
        org.junit.Assert.assertNotNull(bookingList25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.toCSVRow();
        java.lang.String str5 = user0.getId();
        org.openjfx.EECS_3311_Project.model.User user6 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole7 = user6.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking8 = null;
        user6.removeBooking(booking8);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user6.getVisibleBookings();
        user6.setFirstName("");
        java.lang.String str13 = user6.getLastName();
        user6.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList16 = user6.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user6.getVisibleBookings();
        user0.setBookings(bookingList17);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList19 = user0.getVisibleBookings();
        user0.setLastName("");
        org.openjfx.EECS_3311_Project.model.User user22 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole23 = user22.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking24 = null;
        user22.removeBooking(booking24);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList26 = user22.getVisibleBookings();
        user22.setFirstName("");
        java.lang.String str29 = user22.getLastName();
        user22.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList32 = user22.getBookings();
        java.lang.String str33 = user22.getLastName();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList34 = user22.getVisibleBookings();
        user0.setBookings(bookingList34);
        java.lang.Class<?> wildcardClass36 = bookingList34.getClass();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null,null,null,null,null,null,[]," + "'", str4, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(accountRole7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList19);
        org.junit.Assert.assertNull(accountRole23);
        org.junit.Assert.assertNotNull(bookingList26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(bookingList32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(bookingList34);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getEmail();
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getId();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getFirstName();
        user0.setId("null,null,null,null,null,null,[],");
        user0.setLastName("null,,null,null,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getEmail();
        java.lang.String str5 = user0.toCSVRow();
        java.lang.String str6 = user0.toCSVRow();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null,null,null,null,null,null,[]," + "'", str5, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null,null,null,null,null,null,[]," + "'", str6, "null,null,null,null,null,null,[],");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        user0.setUserType("null,,,null,null,null,[],");
        user0.setId("null,null,null,null,null,null,[],");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole6 = null;
        user0.setAccountRole(accountRole6);
        org.junit.Assert.assertNull(accountRole1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.toCSVRow();
        java.lang.String str5 = user0.getId();
        user0.setFirstName("null,null,null,null,null,null,[],");
        user0.setPassword("");
        user0.setFirstName("hi!");
        user0.setEmail("null,null,null,hi!,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null,null,null,null,null,null,[]," + "'", str4, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList7 = user0.getVisibleBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList8 = user0.getVisibleBookings();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole9 = user0.getAccountRole();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNull(accountRole9);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList7 = user0.getVisibleBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList8 = user0.getVisibleBookings();
        user0.setEmail("");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList8);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        user0.setUserType("null,,,null,null,null,[],");
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getFirstName();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole21 = null;
        user0.setAccountRole(accountRole21);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        java.lang.String str1 = user0.getUserType();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole2 = null;
        user0.setAccountRole(accountRole2);
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole4 = user0.getAccountRole();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(accountRole4);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setUserType("hi!");
        java.lang.String str3 = user0.getUserType();
        org.openjfx.EECS_3311_Project.model.User user4 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole5 = user4.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking6 = null;
        user4.removeBooking(booking6);
        java.lang.String str8 = user4.toCSVRow();
        java.lang.String str9 = user4.getId();
        org.openjfx.EECS_3311_Project.model.User user10 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole11 = user10.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking12 = null;
        user10.removeBooking(booking12);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList14 = user10.getVisibleBookings();
        user10.setFirstName("");
        java.lang.String str17 = user10.getLastName();
        user10.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList20 = user10.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList21 = user10.getVisibleBookings();
        user4.setBookings(bookingList21);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList23 = user4.getVisibleBookings();
        user0.setBookings(bookingList23);
        org.openjfx.EECS_3311_Project.model.Booking booking25 = null;
        user0.removeBooking(booking25);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(accountRole5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null,null,null,null,null,null,[]," + "'", str8, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(accountRole11);
        org.junit.Assert.assertNotNull(bookingList14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(bookingList20);
        org.junit.Assert.assertNotNull(bookingList21);
        org.junit.Assert.assertNotNull(bookingList23);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setLastName("null,null,null,hi!,null,null,[],");
        java.lang.String str3 = user0.getFirstName();
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setUserType("hi!");
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("null,null,null,null,null,null,[],");
        user0.setEmail("null,null,null,hi!,null,null,[],");
        user0.setId("null,null,null,hi!,null,null,[],");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getId();
        user0.setPassword("null,null,null,null,null,null,[],");
        java.lang.String str7 = user0.getFirstName();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.toCSVRow();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole5 = null;
        user0.setAccountRole(accountRole5);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null,null,null,null,null,null,[]," + "'", str4, "null,null,null,null,null,null,[],");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        java.lang.String str10 = user0.getId();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.Booking booking13 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking14 = user0.addBooking(booking13);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(booking14);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.toCSVRow();
        java.lang.String str5 = user0.getId();
        org.openjfx.EECS_3311_Project.model.User user6 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole7 = user6.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking8 = null;
        user6.removeBooking(booking8);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user6.getVisibleBookings();
        user6.setFirstName("");
        java.lang.String str13 = user6.getLastName();
        user6.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList16 = user6.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user6.getVisibleBookings();
        user0.setBookings(bookingList17);
        org.openjfx.EECS_3311_Project.model.User user19 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole20 = user19.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking21 = null;
        user19.removeBooking(booking21);
        java.lang.String str23 = user19.toCSVRow();
        java.lang.String str24 = user19.getId();
        org.openjfx.EECS_3311_Project.model.User user25 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole26 = user25.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking27 = null;
        user25.removeBooking(booking27);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList29 = user25.getVisibleBookings();
        user25.setFirstName("");
        java.lang.String str32 = user25.getLastName();
        user25.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList35 = user25.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList36 = user25.getVisibleBookings();
        user19.setBookings(bookingList36);
        user0.setBookings(bookingList36);
        org.openjfx.EECS_3311_Project.model.Booking[] bookingArray39 = new org.openjfx.EECS_3311_Project.model.Booking[] {};
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList40 = new java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.openjfx.EECS_3311_Project.model.Booking>) bookingList40, bookingArray39);
        user0.setBookings(bookingList40);
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole43 = null;
        user0.setAccountRole(accountRole43);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null,null,null,null,null,null,[]," + "'", str4, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(accountRole7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNull(accountRole20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null,null,null,null,null,null,[]," + "'", str23, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(accountRole26);
        org.junit.Assert.assertNotNull(bookingList29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(bookingList35);
        org.junit.Assert.assertNotNull(bookingList36);
        org.junit.Assert.assertNotNull(bookingArray39);
        org.junit.Assert.assertArrayEquals(bookingArray39, new org.openjfx.EECS_3311_Project.model.Booking[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.toCSVRow();
        java.lang.String str5 = user0.getId();
        org.openjfx.EECS_3311_Project.model.User user6 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole7 = user6.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking8 = null;
        user6.removeBooking(booking8);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user6.getVisibleBookings();
        user6.setFirstName("");
        java.lang.String str13 = user6.getLastName();
        user6.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList16 = user6.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user6.getVisibleBookings();
        user0.setBookings(bookingList17);
        java.lang.String str19 = user0.getId();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null,null,null,null,null,null,[]," + "'", str4, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(accountRole7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        user0.setUserType("null,,,null,null,null,[],");
        org.openjfx.EECS_3311_Project.model.User user6 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole7 = user6.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking8 = null;
        user6.removeBooking(booking8);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user6.getVisibleBookings();
        user6.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user13 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole14 = user13.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking15 = null;
        user13.removeBooking(booking15);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user13.getVisibleBookings();
        user13.setFirstName("");
        java.lang.String str20 = user13.getLastName();
        user13.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList23 = user13.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList24 = user13.getVisibleBookings();
        user6.setBookings(bookingList24);
        java.lang.String str26 = user6.getPassword();
        java.lang.String str27 = user6.getId();
        user6.setLastName("");
        org.openjfx.EECS_3311_Project.model.Booking[] bookingArray30 = new org.openjfx.EECS_3311_Project.model.Booking[] {};
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList31 = new java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.openjfx.EECS_3311_Project.model.Booking>) bookingList31, bookingArray30);
        user6.setBookings(bookingList31);
        user0.setBookings(bookingList31);
        org.openjfx.EECS_3311_Project.model.User user35 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole36 = user35.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking37 = null;
        user35.removeBooking(booking37);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList39 = user35.getVisibleBookings();
        user35.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user42 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole43 = user42.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking44 = null;
        user42.removeBooking(booking44);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList46 = user42.getVisibleBookings();
        user42.setFirstName("");
        java.lang.String str49 = user42.getLastName();
        user42.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList52 = user42.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList53 = user42.getVisibleBookings();
        user35.setBookings(bookingList53);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList55 = user35.getBookings();
        user0.setBookings(bookingList55);
        user0.setLastName("null,null,null,null,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(accountRole7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(accountRole14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(bookingList23);
        org.junit.Assert.assertNotNull(bookingList24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(bookingArray30);
        org.junit.Assert.assertArrayEquals(bookingArray30, new org.openjfx.EECS_3311_Project.model.Booking[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(accountRole36);
        org.junit.Assert.assertNotNull(bookingList39);
        org.junit.Assert.assertNull(accountRole43);
        org.junit.Assert.assertNotNull(bookingList46);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(bookingList52);
        org.junit.Assert.assertNotNull(bookingList53);
        org.junit.Assert.assertNotNull(bookingList55);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getPassword();
        java.lang.String str21 = user0.getId();
        user0.setEmail("null,null,null,hi!,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList7 = user0.getVisibleBookings();
        java.lang.String str8 = user0.getId();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole9 = null;
        user0.setAccountRole(accountRole9);
        java.lang.String str11 = user0.toCSVRow();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole12 = user0.getAccountRole();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null,,null,null,null,null,[]," + "'", str11, "null,,null,null,null,null,[],");
        org.junit.Assert.assertNull(accountRole12);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getId();
        user0.setEmail("hi!");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole7 = user0.getAccountRole();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(accountRole7);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setUserType("hi!");
        java.lang.String str3 = user0.getUserType();
        org.openjfx.EECS_3311_Project.model.Booking booking4 = null;
        user0.removeBooking(booking4);
        java.lang.String str6 = user0.getPassword();
        user0.setFirstName("null,,null,null,null,null,[],");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user0.getBookings();
        java.lang.String str11 = user0.getLastName();
        org.openjfx.EECS_3311_Project.model.Booking booking12 = null;
        user0.removeBooking(booking12);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setId("");
        java.lang.String str10 = user0.getId();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user0.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user0.getVisibleBookings();
        java.lang.String str12 = user0.getId();
        java.lang.String str13 = user0.toCSVRow();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole14 = null;
        user0.setAccountRole(accountRole14);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ",,null,null,null,null,[]," + "'", str13, ",,null,null,null,null,[],");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        org.openjfx.EECS_3311_Project.model.Booking booking10 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking11 = user0.addBooking(booking10);
        java.lang.String str12 = user0.getLastName();
        java.lang.String str13 = user0.toCSVRow();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null,,null,null,,null,[]," + "'", str13, "null,,null,null,,null,[],");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getPassword();
        java.lang.String str21 = user0.getId();
        user0.setLastName("");
        java.lang.String str24 = user0.toCSVRow();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList25 = user0.getBookings();
        java.lang.String str26 = user0.getPassword();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList27 = user0.getBookings();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "null,,,null,null,null,[]," + "'", str24, "null,,,null,null,null,[],");
        org.junit.Assert.assertNotNull(bookingList25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(bookingList27);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user0.getBookings();
        java.lang.String str11 = user0.getLastName();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList12 = user0.getVisibleBookings();
        java.lang.String str13 = user0.getId();
        java.lang.String str14 = user0.getLastName();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole15 = user0.getAccountRole();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList16 = user0.getBookings();
        java.lang.Class<?> wildcardClass17 = bookingList16.getClass();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(bookingList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(accountRole15);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        org.openjfx.EECS_3311_Project.model.Booking booking10 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking11 = user0.addBooking(booking10);
        java.lang.String str12 = user0.getEmail();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user0.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user0.getVisibleBookings();
        java.lang.String str12 = user0.getId();
        java.lang.String str13 = user0.getPassword();
        java.lang.String str14 = user0.getFirstName();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getId();
        user0.setLastName("");
        java.lang.String str7 = user0.getLastName();
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getEmail();
        java.lang.String str5 = user0.toCSVRow();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList6 = user0.getBookings();
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null,null,null,null,null,null,[]," + "'", str5, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        user0.setUserType("null,,,null,null,null,[],");
        org.openjfx.EECS_3311_Project.model.User user6 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole7 = user6.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking8 = null;
        user6.removeBooking(booking8);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user6.getVisibleBookings();
        user6.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user13 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole14 = user13.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking15 = null;
        user13.removeBooking(booking15);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user13.getVisibleBookings();
        user13.setFirstName("");
        java.lang.String str20 = user13.getLastName();
        user13.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList23 = user13.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList24 = user13.getVisibleBookings();
        user6.setBookings(bookingList24);
        java.lang.String str26 = user6.getPassword();
        java.lang.String str27 = user6.getId();
        user6.setLastName("");
        org.openjfx.EECS_3311_Project.model.Booking[] bookingArray30 = new org.openjfx.EECS_3311_Project.model.Booking[] {};
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList31 = new java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.openjfx.EECS_3311_Project.model.Booking>) bookingList31, bookingArray30);
        user6.setBookings(bookingList31);
        user0.setBookings(bookingList31);
        org.openjfx.EECS_3311_Project.model.User user35 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole36 = user35.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking37 = null;
        user35.removeBooking(booking37);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList39 = user35.getVisibleBookings();
        user35.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user42 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole43 = user42.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking44 = null;
        user42.removeBooking(booking44);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList46 = user42.getVisibleBookings();
        user42.setFirstName("");
        java.lang.String str49 = user42.getLastName();
        user42.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList52 = user42.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList53 = user42.getVisibleBookings();
        user35.setBookings(bookingList53);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList55 = user35.getBookings();
        user0.setBookings(bookingList55);
        java.lang.String str57 = user0.getId();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(accountRole7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(accountRole14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(bookingList23);
        org.junit.Assert.assertNotNull(bookingList24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(bookingArray30);
        org.junit.Assert.assertArrayEquals(bookingArray30, new org.openjfx.EECS_3311_Project.model.Booking[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(accountRole36);
        org.junit.Assert.assertNotNull(bookingList39);
        org.junit.Assert.assertNull(accountRole43);
        org.junit.Assert.assertNotNull(bookingList46);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(bookingList52);
        org.junit.Assert.assertNotNull(bookingList53);
        org.junit.Assert.assertNotNull(bookingList55);
        org.junit.Assert.assertNull(str57);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.toCSVRow();
        java.lang.String str5 = user0.getId();
        org.openjfx.EECS_3311_Project.model.User user6 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole7 = user6.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking8 = null;
        user6.removeBooking(booking8);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user6.getVisibleBookings();
        user6.setFirstName("");
        java.lang.String str13 = user6.getLastName();
        user6.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList16 = user6.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user6.getVisibleBookings();
        user0.setBookings(bookingList17);
        org.openjfx.EECS_3311_Project.model.User user19 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole20 = user19.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking21 = null;
        user19.removeBooking(booking21);
        java.lang.String str23 = user19.toCSVRow();
        java.lang.String str24 = user19.getId();
        org.openjfx.EECS_3311_Project.model.User user25 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole26 = user25.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking27 = null;
        user25.removeBooking(booking27);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList29 = user25.getVisibleBookings();
        user25.setFirstName("");
        java.lang.String str32 = user25.getLastName();
        user25.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList35 = user25.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList36 = user25.getVisibleBookings();
        user19.setBookings(bookingList36);
        user0.setBookings(bookingList36);
        org.openjfx.EECS_3311_Project.model.Booking[] bookingArray39 = new org.openjfx.EECS_3311_Project.model.Booking[] {};
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList40 = new java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.openjfx.EECS_3311_Project.model.Booking>) bookingList40, bookingArray39);
        user0.setBookings(bookingList40);
        java.lang.String str43 = user0.toCSVRow();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null,null,null,null,null,null,[]," + "'", str4, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(accountRole7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNull(accountRole20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null,null,null,null,null,null,[]," + "'", str23, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(accountRole26);
        org.junit.Assert.assertNotNull(bookingList29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(bookingList35);
        org.junit.Assert.assertNotNull(bookingList36);
        org.junit.Assert.assertNotNull(bookingArray39);
        org.junit.Assert.assertArrayEquals(bookingArray39, new org.openjfx.EECS_3311_Project.model.Booking[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "null,null,null,null,null,null,[]," + "'", str43, "null,null,null,null,null,null,[],");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setUserType("hi!");
        org.openjfx.EECS_3311_Project.model.Booking booking3 = null;
        user0.removeBooking(booking3);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user0.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user0.getVisibleBookings();
        java.lang.String str12 = user0.getUserType();
        java.lang.Class<?> wildcardClass13 = user0.getClass();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user0.getBookings();
        java.lang.String str11 = user0.getFirstName();
        java.lang.String str12 = user0.getFirstName();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList13 = user0.getBookings();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(bookingList13);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getId();
        user0.setPassword("null,null,null,null,null,null,[],");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList7 = user0.getVisibleBookings();
        user0.setLastName("null,null,null,hi!,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(bookingList7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        org.openjfx.EECS_3311_Project.model.Booking booking20 = null;
        user0.removeBooking(booking20);
        java.lang.String str22 = user0.getFirstName();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getUserType();
        java.lang.Class<?> wildcardClass5 = user0.getClass();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getPassword();
        java.lang.String str21 = user0.getId();
        user0.setLastName("");
        java.lang.String str24 = user0.toCSVRow();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList25 = user0.getBookings();
        java.lang.String str26 = user0.getLastName();
        org.openjfx.EECS_3311_Project.model.Booking booking27 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking28 = user0.addBooking(booking27);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "null,,,null,null,null,[]," + "'", str24, "null,,,null,null,null,[],");
        org.junit.Assert.assertNotNull(bookingList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(booking28);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        java.lang.String str10 = user0.getId();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole11 = null;
        user0.setAccountRole(accountRole11);
        java.lang.String str13 = user0.getPassword();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.toCSVRow();
        java.lang.String str5 = user0.getId();
        org.openjfx.EECS_3311_Project.model.User user6 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole7 = user6.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking8 = null;
        user6.removeBooking(booking8);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user6.getVisibleBookings();
        user6.setFirstName("");
        java.lang.String str13 = user6.getLastName();
        user6.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList16 = user6.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user6.getVisibleBookings();
        user0.setBookings(bookingList17);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList19 = user0.getVisibleBookings();
        user0.setLastName("");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole22 = null;
        user0.setAccountRole(accountRole22);
        java.lang.String str24 = user0.getLastName();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null,null,null,null,null,null,[]," + "'", str4, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(accountRole7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setUserType("hi!");
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("null,null,null,null,null,null,[],");
        java.lang.String str6 = user0.getUserType();
        user0.setLastName("null,,,null,null,null,[],");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setUserType("hi!");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList3 = null;
        user0.setBookings(bookingList3);
        user0.setEmail("null,null,null,hi!,null,null,[],");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList7 = user0.getBookings();
        org.junit.Assert.assertNull(bookingList7);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setUserType("hi!");
        java.lang.String str3 = user0.getUserType();
        org.openjfx.EECS_3311_Project.model.Booking booking4 = null;
        user0.removeBooking(booking4);
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole6 = null;
        user0.setAccountRole(accountRole6);
        java.lang.String str8 = user0.toCSVRow();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null,null,null,null,null,hi!,[]," + "'", str8, "null,null,null,null,null,hi!,[],");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList8 = user0.getVisibleBookings();
        user0.setFirstName("null,null,null,null,null,hi!,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookingList8);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.toCSVRow();
        java.lang.String str5 = user0.getId();
        org.openjfx.EECS_3311_Project.model.User user6 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole7 = user6.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking8 = null;
        user6.removeBooking(booking8);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user6.getVisibleBookings();
        user6.setFirstName("");
        java.lang.String str13 = user6.getLastName();
        user6.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList16 = user6.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user6.getVisibleBookings();
        user0.setBookings(bookingList17);
        org.openjfx.EECS_3311_Project.model.User user19 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole20 = user19.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking21 = null;
        user19.removeBooking(booking21);
        java.lang.String str23 = user19.toCSVRow();
        java.lang.String str24 = user19.getId();
        org.openjfx.EECS_3311_Project.model.User user25 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole26 = user25.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking27 = null;
        user25.removeBooking(booking27);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList29 = user25.getVisibleBookings();
        user25.setFirstName("");
        java.lang.String str32 = user25.getLastName();
        user25.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList35 = user25.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList36 = user25.getVisibleBookings();
        user19.setBookings(bookingList36);
        user0.setBookings(bookingList36);
        user0.setUserType("null,,,null,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null,null,null,null,null,null,[]," + "'", str4, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(accountRole7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNull(accountRole20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null,null,null,null,null,null,[]," + "'", str23, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(accountRole26);
        org.junit.Assert.assertNotNull(bookingList29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(bookingList35);
        org.junit.Assert.assertNotNull(bookingList36);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getEmail();
        java.lang.String str5 = user0.toCSVRow();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList6 = user0.getBookings();
        user0.setLastName("null,,,null,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null,null,null,null,null,null,[]," + "'", str5, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNotNull(bookingList6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        java.lang.String str10 = user0.getFirstName();
        java.lang.String str11 = user0.getId();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = null;
        user0.setAccountRole(accountRole1);
        user0.setPassword("null,null,null,null,null,null,[],");
        org.openjfx.EECS_3311_Project.model.User user5 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole6 = user5.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking7 = null;
        user5.removeBooking(booking7);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList9 = user5.getVisibleBookings();
        user5.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user12 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole13 = user12.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking14 = null;
        user12.removeBooking(booking14);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList16 = user12.getVisibleBookings();
        user12.setFirstName("");
        java.lang.String str19 = user12.getLastName();
        user12.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList22 = user12.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList23 = user12.getVisibleBookings();
        user5.setBookings(bookingList23);
        user0.setBookings(bookingList23);
        org.openjfx.EECS_3311_Project.model.Booking booking26 = null;
        user0.removeBooking(booking26);
        org.junit.Assert.assertNull(accountRole6);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNull(accountRole13);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(bookingList22);
        org.junit.Assert.assertNotNull(bookingList23);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setEmail("hi!");
        java.lang.String str3 = user0.toCSVRow();
        java.lang.String str4 = user0.getUserType();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList5 = user0.getVisibleBookings();
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null,null,null,hi!,null,null,[]," + "'", str3, "null,null,null,hi!,null,null,[],");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getId();
        user0.setPassword("null,null,null,null,null,null,[],");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList7 = user0.getVisibleBookings();
        user0.setId(",,null,null,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(bookingList7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getPassword();
        java.lang.String str21 = user0.getId();
        user0.setLastName("");
        java.lang.String str24 = user0.toCSVRow();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList25 = user0.getBookings();
        java.lang.String str26 = user0.getPassword();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList27 = user0.getVisibleBookings();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole28 = user0.getAccountRole();
        java.lang.String str29 = user0.toCSVRow();
        java.lang.String str30 = user0.getFirstName();
        java.lang.String str31 = user0.getPassword();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "null,,,null,null,null,[]," + "'", str24, "null,,,null,null,null,[],");
        org.junit.Assert.assertNotNull(bookingList25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(bookingList27);
        org.junit.Assert.assertNull(accountRole28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "null,,,null,null,null,[]," + "'", str29, "null,,,null,null,null,[],");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user0.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user0.getVisibleBookings();
        java.lang.String str12 = user0.getUserType();
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getFirstName();
        user0.setPassword("");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user0.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user0.getVisibleBookings();
        java.lang.String str12 = user0.getEmail();
        java.lang.String str13 = user0.getFirstName();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        org.openjfx.EECS_3311_Project.model.Booking booking20 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking21 = user0.addBooking(booking20);
        user0.setFirstName("hi!");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(booking21);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        java.lang.String str10 = user0.getId();
        java.lang.String str11 = user0.getId();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getEmail();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        java.lang.String str10 = user0.getFirstName();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole11 = user0.getAccountRole();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(accountRole11);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getId();
        user0.setPassword("null,null,null,null,null,null,[],");
        java.lang.String str7 = user0.getUserType();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList8 = user0.getVisibleBookings();
        java.lang.String str9 = user0.getEmail();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user0.getBookings();
        java.lang.String str11 = user0.getLastName();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList12 = user0.getVisibleBookings();
        user0.setPassword(",,null,null,null,null,[],");
        user0.setId("null,,null,null,null,null,[],");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user0.getBookings();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(bookingList12);
        org.junit.Assert.assertNotNull(bookingList17);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole2 = null;
        user0.setAccountRole(accountRole2);
        java.lang.String str4 = user0.getId();
        org.openjfx.EECS_3311_Project.model.Booking booking5 = null;
        user0.removeBooking(booking5);
        org.openjfx.EECS_3311_Project.model.Booking booking7 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking8 = user0.addBooking(booking7);
        user0.setLastName("null,,null,null,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(booking8);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setFirstName("");
        java.lang.String str3 = user0.getLastName();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole4 = user0.getAccountRole();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(accountRole4);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.toCSVRow();
        java.lang.String str5 = user0.getId();
        org.openjfx.EECS_3311_Project.model.User user6 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole7 = user6.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking8 = null;
        user6.removeBooking(booking8);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user6.getVisibleBookings();
        user6.setFirstName("");
        java.lang.String str13 = user6.getLastName();
        user6.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList16 = user6.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user6.getVisibleBookings();
        user0.setBookings(bookingList17);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList19 = user0.getVisibleBookings();
        user0.setLastName("");
        org.openjfx.EECS_3311_Project.model.User user22 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole23 = user22.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking24 = null;
        user22.removeBooking(booking24);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList26 = user22.getVisibleBookings();
        user22.setFirstName("");
        java.lang.String str29 = user22.getLastName();
        user22.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList32 = user22.getBookings();
        java.lang.String str33 = user22.getLastName();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList34 = user22.getVisibleBookings();
        user0.setBookings(bookingList34);
        java.lang.String str36 = user0.getLastName();
        user0.setPassword("hi!");
        user0.setId(",,null,null,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null,null,null,null,null,null,[]," + "'", str4, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(accountRole7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList19);
        org.junit.Assert.assertNull(accountRole23);
        org.junit.Assert.assertNotNull(bookingList26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(bookingList32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(bookingList34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getFirstName();
        user0.setId("null,null,null,null,null,null,[],");
        java.lang.String str23 = user0.getId();
        java.lang.String str24 = user0.getPassword();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null,null,null,null,null,null,[]," + "'", str23, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getEmail();
        java.lang.String str5 = user0.toCSVRow();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole6 = null;
        user0.setAccountRole(accountRole6);
        user0.setEmail(",,null,null,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null,null,null,null,null,null,[]," + "'", str5, "null,null,null,null,null,null,[],");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setUserType("hi!");
        java.lang.String str3 = user0.getEmail();
        org.openjfx.EECS_3311_Project.model.Booking booking4 = null;
        user0.removeBooking(booking4);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.toCSVRow();
        java.lang.String str5 = user0.getId();
        user0.setFirstName("null,null,null,null,null,null,[],");
        org.openjfx.EECS_3311_Project.model.Booking booking8 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking9 = user0.addBooking(booking8);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null,null,null,null,null,null,[]," + "'", str4, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(booking9);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setLastName("null,null,null,hi!,null,null,[],");
        java.lang.String str3 = user0.getLastName();
        user0.setPassword("null,null,null,null,null,null,[],");
        user0.setPassword("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null,null,null,hi!,null,null,[]," + "'", str3, "null,null,null,hi!,null,null,[],");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user0.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user0.getVisibleBookings();
        java.lang.String str12 = user0.getUserType();
        java.lang.String str13 = user0.getUserType();
        java.lang.String str14 = user0.getFirstName();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setFirstName("");
        java.lang.String str3 = user0.getEmail();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole4 = null;
        user0.setAccountRole(accountRole4);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getId();
        user0.setPassword("null,null,null,null,null,null,[],");
        user0.setEmail("");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole9 = user0.getAccountRole();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(accountRole9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getId();
        user0.setPassword("null,null,null,null,null,null,[],");
        user0.setEmail("");
        user0.setId(",,null,null,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getEmail();
        java.lang.String str5 = user0.toCSVRow();
        java.lang.String str6 = user0.getLastName();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList7 = user0.getBookings();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null,null,null,null,null,null,[]," + "'", str5, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(bookingList7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getPassword();
        java.lang.String str21 = user0.getId();
        user0.setLastName("");
        java.lang.String str24 = user0.toCSVRow();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList25 = user0.getBookings();
        java.lang.String str26 = user0.getPassword();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList27 = user0.getVisibleBookings();
        org.openjfx.EECS_3311_Project.model.Booking booking28 = null;
        user0.removeBooking(booking28);
        org.openjfx.EECS_3311_Project.model.User user30 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole31 = user30.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking32 = null;
        user30.removeBooking(booking32);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList34 = user30.getVisibleBookings();
        user30.setFirstName("");
        java.lang.String str37 = user30.getLastName();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList38 = user30.getVisibleBookings();
        user0.setBookings(bookingList38);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "null,,,null,null,null,[]," + "'", str24, "null,,,null,null,null,[],");
        org.junit.Assert.assertNotNull(bookingList25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(bookingList27);
        org.junit.Assert.assertNull(accountRole31);
        org.junit.Assert.assertNotNull(bookingList34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(bookingList38);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setEmail("null,null,null,hi!,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        user0.setUserType("null,,,null,null,null,[],");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getBookings();
        user0.setPassword("null,,null,null,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        user0.setUserType("null,,,null,null,null,[],");
        org.openjfx.EECS_3311_Project.model.User user6 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole7 = user6.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking8 = null;
        user6.removeBooking(booking8);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user6.getVisibleBookings();
        user6.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user13 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole14 = user13.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking15 = null;
        user13.removeBooking(booking15);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user13.getVisibleBookings();
        user13.setFirstName("");
        java.lang.String str20 = user13.getLastName();
        user13.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList23 = user13.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList24 = user13.getVisibleBookings();
        user6.setBookings(bookingList24);
        java.lang.String str26 = user6.getPassword();
        java.lang.String str27 = user6.getId();
        user6.setLastName("");
        org.openjfx.EECS_3311_Project.model.Booking[] bookingArray30 = new org.openjfx.EECS_3311_Project.model.Booking[] {};
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList31 = new java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.openjfx.EECS_3311_Project.model.Booking>) bookingList31, bookingArray30);
        user6.setBookings(bookingList31);
        user0.setBookings(bookingList31);
        org.openjfx.EECS_3311_Project.model.User user35 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole36 = user35.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking37 = null;
        user35.removeBooking(booking37);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList39 = user35.getVisibleBookings();
        user35.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user42 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole43 = user42.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking44 = null;
        user42.removeBooking(booking44);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList46 = user42.getVisibleBookings();
        user42.setFirstName("");
        java.lang.String str49 = user42.getLastName();
        user42.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList52 = user42.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList53 = user42.getVisibleBookings();
        user35.setBookings(bookingList53);
        java.lang.String str55 = user35.getPassword();
        java.lang.String str56 = user35.getId();
        user35.setLastName("");
        java.lang.String str59 = user35.toCSVRow();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList60 = user35.getBookings();
        user0.setBookings(bookingList60);
        org.openjfx.EECS_3311_Project.model.Booking booking62 = null;
        user0.removeBooking(booking62);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(accountRole7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(accountRole14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(bookingList23);
        org.junit.Assert.assertNotNull(bookingList24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(bookingArray30);
        org.junit.Assert.assertArrayEquals(bookingArray30, new org.openjfx.EECS_3311_Project.model.Booking[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(accountRole36);
        org.junit.Assert.assertNotNull(bookingList39);
        org.junit.Assert.assertNull(accountRole43);
        org.junit.Assert.assertNotNull(bookingList46);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(bookingList52);
        org.junit.Assert.assertNotNull(bookingList53);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "null,,,null,null,null,[]," + "'", str59, "null,,,null,null,null,[],");
        org.junit.Assert.assertNotNull(bookingList60);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setUserType("hi!");
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("null,null,null,null,null,null,[],");
        user0.setEmail("null,null,null,hi!,null,null,[],");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = null;
        user0.setAccountRole(accountRole8);
        org.openjfx.EECS_3311_Project.model.User user10 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole11 = user10.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking12 = null;
        user10.removeBooking(booking12);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList14 = user10.getVisibleBookings();
        user10.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user17 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole18 = user17.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking19 = null;
        user17.removeBooking(booking19);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList21 = user17.getVisibleBookings();
        user17.setFirstName("");
        java.lang.String str24 = user17.getLastName();
        user17.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList27 = user17.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList28 = user17.getVisibleBookings();
        user10.setBookings(bookingList28);
        java.lang.String str30 = user10.getPassword();
        java.lang.String str31 = user10.getId();
        user10.setLastName("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList34 = user10.getVisibleBookings();
        user0.setBookings(bookingList34);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(accountRole11);
        org.junit.Assert.assertNotNull(bookingList14);
        org.junit.Assert.assertNull(accountRole18);
        org.junit.Assert.assertNotNull(bookingList21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(bookingList27);
        org.junit.Assert.assertNotNull(bookingList28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(bookingList34);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getFirstName();
        user0.setId("null,null,null,null,null,null,[],");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList23 = user0.getBookings();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole24 = user0.getAccountRole();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(bookingList23);
        org.junit.Assert.assertNull(accountRole24);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setUserType("hi!");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList3 = null;
        user0.setBookings(bookingList3);
        user0.setEmail("null,null,null,hi!,null,null,[],");
        user0.setUserType("null,null,null,null,null,null,[],");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        org.openjfx.EECS_3311_Project.model.Booking booking5 = null;
        user0.removeBooking(booking5);
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole7 = null;
        user0.setAccountRole(accountRole7);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = null;
        user0.setAccountRole(accountRole1);
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = user0.getAccountRole();
        java.lang.String str4 = user0.toCSVRow();
        org.junit.Assert.assertNull(accountRole3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null,null,null,null,null,null,[]," + "'", str4, "null,null,null,null,null,null,[],");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        user0.setUserType("null,,,null,null,null,[],");
        java.lang.String str4 = user0.getPassword();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setUserType("hi!");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = null;
        user0.setAccountRole(accountRole3);
        org.openjfx.EECS_3311_Project.model.User user5 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole6 = user5.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking7 = null;
        user5.removeBooking(booking7);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList9 = user5.getVisibleBookings();
        user5.setFirstName("");
        java.lang.String str12 = user5.getLastName();
        user5.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList15 = user5.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList16 = user5.getVisibleBookings();
        user0.setBookings(bookingList16);
        org.junit.Assert.assertNull(accountRole6);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(bookingList15);
        org.junit.Assert.assertNotNull(bookingList16);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole9 = user0.getAccountRole();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNull(accountRole9);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setFirstName("");
        java.lang.String str3 = user0.getEmail();
        user0.setId(",,null,null,null,null,[],");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.toCSVRow();
        java.lang.String str5 = user0.getId();
        org.openjfx.EECS_3311_Project.model.User user6 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole7 = user6.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking8 = null;
        user6.removeBooking(booking8);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user6.getVisibleBookings();
        user6.setFirstName("");
        java.lang.String str13 = user6.getLastName();
        user6.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList16 = user6.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user6.getVisibleBookings();
        user0.setBookings(bookingList17);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList19 = user0.getVisibleBookings();
        java.lang.String str20 = user0.getUserType();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null,null,null,null,null,null,[]," + "'", str4, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(accountRole7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user0.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user0.getVisibleBookings();
        java.lang.String str12 = user0.getId();
        java.lang.String str13 = user0.getPassword();
        user0.setEmail(",,null,null,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList7 = user0.getVisibleBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList8 = user0.getVisibleBookings();
        java.lang.String str9 = user0.getLastName();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUserType();
        user0.setUserType("null,,,null,null,null,[],");
        user0.setPassword("null,,null,null,,null,[],");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole7 = null;
        user0.setAccountRole(accountRole7);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setUserType("hi!");
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("null,null,null,null,null,null,[],");
        java.lang.String str6 = user0.getUserType();
        org.openjfx.EECS_3311_Project.model.Booking booking7 = null;
        user0.removeBooking(booking7);
        user0.setLastName("");
        java.lang.String str11 = user0.getPassword();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        org.openjfx.EECS_3311_Project.model.Booking booking5 = null;
        user0.removeBooking(booking5);
        java.lang.String str7 = user0.getEmail();
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        org.openjfx.EECS_3311_Project.model.Booking booking10 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking11 = user0.addBooking(booking10);
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole14 = null;
        user0.setAccountRole(accountRole14);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(booking11);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole2 = null;
        user0.setAccountRole(accountRole2);
        java.lang.String str4 = user0.getUserType();
        user0.setEmail("null,null,null,null,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user0.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user0.getVisibleBookings();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole12 = null;
        user0.setAccountRole(accountRole12);
        user0.setPassword("null,null,null,null,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNotNull(bookingList11);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user0.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user0.getVisibleBookings();
        java.lang.String str12 = user0.getUserType();
        java.lang.String str13 = user0.getLastName();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setUserType("hi!");
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("null,null,null,null,null,null,[],");
        java.lang.String str6 = user0.getUserType();
        org.openjfx.EECS_3311_Project.model.Booking booking7 = null;
        user0.removeBooking(booking7);
        user0.setLastName("");
        user0.setFirstName(",,null,null,null,null,[],");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getPassword();
        java.lang.String str21 = user0.getId();
        user0.setLastName("");
        java.lang.String str24 = user0.toCSVRow();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList25 = user0.getBookings();
        java.lang.String str26 = user0.getPassword();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList27 = user0.getVisibleBookings();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole28 = user0.getAccountRole();
        java.lang.String str29 = user0.toCSVRow();
        java.lang.String str30 = user0.getFirstName();
        org.openjfx.EECS_3311_Project.model.Booking booking31 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking32 = user0.addBooking(booking31);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "null,,,null,null,null,[]," + "'", str24, "null,,,null,null,null,[],");
        org.junit.Assert.assertNotNull(bookingList25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(bookingList27);
        org.junit.Assert.assertNull(accountRole28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "null,,,null,null,null,[]," + "'", str29, "null,,,null,null,null,[],");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(booking32);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getId();
        user0.setLastName("");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole7 = user0.getAccountRole();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(accountRole7);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setUserType("hi!");
        java.lang.String str3 = user0.getUserType();
        org.openjfx.EECS_3311_Project.model.Booking booking4 = null;
        user0.removeBooking(booking4);
        user0.setId("null,,,null,null,null,[],");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        org.openjfx.EECS_3311_Project.model.Booking booking10 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking11 = user0.addBooking(booking10);
        user0.setEmail("");
        org.openjfx.EECS_3311_Project.model.Booking booking14 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking15 = user0.addBooking(booking14);
        org.openjfx.EECS_3311_Project.model.Booking[] bookingArray16 = new org.openjfx.EECS_3311_Project.model.Booking[] {};
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = new java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.openjfx.EECS_3311_Project.model.Booking>) bookingList17, bookingArray16);
        user0.setBookings(bookingList17);
        user0.setPassword("null,,,null,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertNull(booking15);
        org.junit.Assert.assertNotNull(bookingArray16);
        org.junit.Assert.assertArrayEquals(bookingArray16, new org.openjfx.EECS_3311_Project.model.Booking[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setId("");
        java.lang.String str10 = user0.getUserType();
        java.lang.String str11 = user0.getPassword();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        org.openjfx.EECS_3311_Project.model.Booking booking10 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking11 = user0.addBooking(booking10);
        user0.setEmail("");
        java.lang.String str14 = user0.getId();
        user0.setPassword("null,,,null,null,null,[],");
        java.lang.String str17 = user0.getFirstName();
        user0.setEmail("null,null,null,null,null,hi!,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList7 = user0.getVisibleBookings();
        java.lang.String str8 = user0.getId();
        java.lang.String str9 = user0.getPassword();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getId();
        user0.setPassword("null,null,null,null,null,null,[],");
        user0.setEmail("");
        java.lang.String str9 = user0.getEmail();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setUserType("hi!");
        java.lang.String str3 = user0.getEmail();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole4 = null;
        user0.setAccountRole(accountRole4);
        user0.setId("hi!");
        org.openjfx.EECS_3311_Project.model.User user8 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole9 = user8.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking10 = null;
        user8.removeBooking(booking10);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList12 = user8.getVisibleBookings();
        user8.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user15 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole16 = user15.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking17 = null;
        user15.removeBooking(booking17);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList19 = user15.getVisibleBookings();
        user15.setFirstName("");
        java.lang.String str22 = user15.getLastName();
        user15.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList25 = user15.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList26 = user15.getVisibleBookings();
        user8.setBookings(bookingList26);
        java.lang.String str28 = user8.getPassword();
        org.openjfx.EECS_3311_Project.model.User user29 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole30 = user29.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking31 = null;
        user29.removeBooking(booking31);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList33 = user29.getVisibleBookings();
        user29.setFirstName("");
        java.lang.String str36 = user29.getLastName();
        user29.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList39 = user29.getBookings();
        java.lang.String str40 = user29.getLastName();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList41 = user29.getVisibleBookings();
        user8.setBookings(bookingList41);
        user0.setBookings(bookingList41);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(accountRole9);
        org.junit.Assert.assertNotNull(bookingList12);
        org.junit.Assert.assertNull(accountRole16);
        org.junit.Assert.assertNotNull(bookingList19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(bookingList25);
        org.junit.Assert.assertNotNull(bookingList26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(accountRole30);
        org.junit.Assert.assertNotNull(bookingList33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(bookingList39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(bookingList41);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user0.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user0.getVisibleBookings();
        user0.setUserType("hi!,,null,null,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNotNull(bookingList11);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList7 = user0.getVisibleBookings();
        java.lang.String str8 = user0.getId();
        java.lang.String str9 = user0.getLastName();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getPassword();
        java.lang.String str21 = user0.getId();
        user0.setLastName("");
        user0.setUserType("");
        org.openjfx.EECS_3311_Project.model.Booking booking26 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking27 = user0.addBooking(booking26);
        user0.setEmail("null,null,null,hi!,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(booking27);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getPassword();
        java.lang.String str21 = user0.getId();
        user0.setLastName("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList24 = user0.getVisibleBookings();
        java.lang.Class<?> wildcardClass25 = user0.getClass();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(bookingList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getPassword();
        java.lang.String str21 = user0.getId();
        user0.setLastName("");
        java.lang.String str24 = user0.toCSVRow();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList25 = user0.getBookings();
        java.lang.String str26 = user0.getPassword();
        user0.setId("null,,,null,null,null,[],");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole29 = null;
        user0.setAccountRole(accountRole29);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList31 = user0.getBookings();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "null,,,null,null,null,[]," + "'", str24, "null,,,null,null,null,[],");
        org.junit.Assert.assertNotNull(bookingList25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(bookingList31);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        org.openjfx.EECS_3311_Project.model.Booking booking10 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking11 = user0.addBooking(booking10);
        user0.setLastName("");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(booking11);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setEmail("hi!");
        java.lang.String str3 = user0.toCSVRow();
        java.lang.String str4 = user0.getUserType();
        user0.setLastName("hi!");
        java.lang.String str7 = user0.getUserType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null,null,null,hi!,null,null,[]," + "'", str3, "null,null,null,hi!,null,null,[],");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.toCSVRow();
        java.lang.String str5 = user0.getId();
        org.openjfx.EECS_3311_Project.model.User user6 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole7 = user6.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking8 = null;
        user6.removeBooking(booking8);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user6.getVisibleBookings();
        user6.setFirstName("");
        java.lang.String str13 = user6.getLastName();
        user6.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList16 = user6.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user6.getVisibleBookings();
        user0.setBookings(bookingList17);
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole19 = null;
        user0.setAccountRole(accountRole19);
        java.lang.String str21 = user0.getFirstName();
        java.lang.String str22 = user0.getUserType();
        java.lang.String str23 = user0.getUserType();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null,null,null,null,null,null,[]," + "'", str4, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(accountRole7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.Booking booking7 = null;
        user0.removeBooking(booking7);
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole9 = null;
        user0.setAccountRole(accountRole9);
        java.lang.Class<?> wildcardClass11 = user0.getClass();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getPassword();
        java.lang.String str21 = user0.getId();
        user0.setLastName("");
        java.lang.String str24 = user0.toCSVRow();
        java.lang.String str25 = user0.getId();
        org.openjfx.EECS_3311_Project.model.Booking booking26 = null;
        user0.removeBooking(booking26);
        org.openjfx.EECS_3311_Project.model.Booking booking28 = null;
        user0.removeBooking(booking28);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "null,,,null,null,null,[]," + "'", str24, "null,,,null,null,null,[],");
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getPassword();
        java.lang.String str21 = user0.getId();
        user0.setLastName("");
        java.lang.String str24 = user0.toCSVRow();
        java.lang.String str25 = user0.getId();
        org.openjfx.EECS_3311_Project.model.Booking booking26 = null;
        user0.removeBooking(booking26);
        java.lang.String str28 = user0.toCSVRow();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "null,,,null,null,null,[]," + "'", str24, "null,,,null,null,null,[],");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "null,,,null,null,null,[]," + "'", str28, "null,,,null,null,null,[],");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setEmail("hi!");
        java.lang.String str3 = user0.toCSVRow();
        java.lang.String str4 = user0.getLastName();
        java.lang.String str5 = user0.getLastName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null,null,null,hi!,null,null,[]," + "'", str3, "null,null,null,hi!,null,null,[],");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        java.lang.String str10 = user0.getId();
        user0.setFirstName("");
        user0.setId("null,null,null,hi!,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList8 = user0.getVisibleBookings();
        user0.setPassword("null,null,null,null,null,null,[],");
        user0.setLastName("null,,,null,null,null,[],");
        user0.setEmail("null,,,null,null,null,[],");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole15 = user0.getAccountRole();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNull(accountRole15);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user0.getBookings();
        java.lang.String str11 = user0.getLastName();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList12 = user0.getVisibleBookings();
        user0.setPassword(",,null,null,null,null,[],");
        java.lang.String str15 = user0.getUserType();
        java.lang.String str16 = user0.getEmail();
        org.openjfx.EECS_3311_Project.model.Booking booking17 = null;
        user0.removeBooking(booking17);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(bookingList12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user0.getBookings();
        java.lang.String str11 = user0.getFirstName();
        java.lang.String str12 = user0.getFirstName();
        java.lang.String str13 = user0.getPassword();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getEmail();
        user0.setUserType("null,null,null,null,null,null,[],");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setEmail("hi!");
        java.lang.String str3 = user0.toCSVRow();
        java.lang.String str4 = user0.getLastName();
        org.openjfx.EECS_3311_Project.model.User user5 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole6 = user5.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking7 = null;
        user5.removeBooking(booking7);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList9 = user5.getVisibleBookings();
        user5.setFirstName("");
        java.lang.String str12 = user5.getLastName();
        user5.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList15 = user5.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList16 = user5.getVisibleBookings();
        user0.setBookings(bookingList16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null,null,null,hi!,null,null,[]," + "'", str3, "null,null,null,hi!,null,null,[],");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(accountRole6);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(bookingList15);
        org.junit.Assert.assertNotNull(bookingList16);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setUserType("hi!");
        java.lang.String str3 = user0.getUserType();
        org.openjfx.EECS_3311_Project.model.Booking booking4 = null;
        user0.removeBooking(booking4);
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole6 = null;
        user0.setAccountRole(accountRole6);
        java.lang.String str8 = user0.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user0.getBookings();
        java.lang.String str11 = user0.getLastName();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList12 = user0.getVisibleBookings();
        java.lang.String str13 = user0.getId();
        user0.setId("hi!");
        user0.setLastName("null,,,null,null,null,[],");
        org.openjfx.EECS_3311_Project.model.Booking booking18 = null;
        user0.removeBooking(booking18);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(bookingList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setFirstName("");
        java.lang.String str3 = user0.getLastName();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setPassword("null,,null,null,,null,[],");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(bookingList4);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole2 = null;
        user0.setAccountRole(accountRole2);
        user0.setPassword("null,null,null,null,null,hi!,[],");
        org.junit.Assert.assertNull(accountRole1);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getPassword();
        java.lang.String str21 = user0.getId();
        user0.setLastName("");
        java.lang.String str24 = user0.toCSVRow();
        java.lang.String str25 = user0.getId();
        java.lang.String str26 = user0.getFirstName();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "null,,,null,null,null,[]," + "'", str24, "null,,,null,null,null,[],");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setLastName("null,null,null,hi!,null,null,[],");
        org.openjfx.EECS_3311_Project.model.Booking booking3 = null;
        user0.removeBooking(booking3);
        org.openjfx.EECS_3311_Project.model.User user5 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole6 = user5.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking7 = null;
        user5.removeBooking(booking7);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList9 = user5.getVisibleBookings();
        user5.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user12 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole13 = user12.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking14 = null;
        user12.removeBooking(booking14);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList16 = user12.getVisibleBookings();
        user12.setFirstName("");
        java.lang.String str19 = user12.getLastName();
        user12.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList22 = user12.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList23 = user12.getVisibleBookings();
        user5.setBookings(bookingList23);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList25 = user5.getBookings();
        user0.setBookings(bookingList25);
        org.junit.Assert.assertNull(accountRole6);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNull(accountRole13);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(bookingList22);
        org.junit.Assert.assertNotNull(bookingList23);
        org.junit.Assert.assertNotNull(bookingList25);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getPassword();
        java.lang.String str21 = user0.getId();
        user0.setLastName("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList24 = user0.getVisibleBookings();
        java.lang.String str25 = user0.getLastName();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(bookingList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getPassword();
        java.lang.String str21 = user0.getId();
        user0.setLastName("");
        java.lang.String str24 = user0.toCSVRow();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList25 = user0.getBookings();
        java.lang.String str26 = user0.getPassword();
        user0.setId("null,,,null,null,null,[],");
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "null,,,null,null,null,[]," + "'", str24, "null,,,null,null,null,[],");
        org.junit.Assert.assertNotNull(bookingList25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getPassword();
        java.lang.String str21 = user0.getId();
        user0.setLastName("");
        java.lang.String str24 = user0.toCSVRow();
        java.lang.String str25 = user0.getId();
        user0.setUserType("null,,null,null,,null,[],");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole28 = null;
        user0.setAccountRole(accountRole28);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "null,,,null,null,null,[]," + "'", str24, "null,,,null,null,null,[],");
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList8 = user0.getVisibleBookings();
        user0.setId("null,null,null,hi!,null,null,[],");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user0.getVisibleBookings();
        user0.setUserType("null,,null,null,,null,[],");
        java.lang.String str14 = user0.getUserType();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookingList8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null,,null,null,,null,[]," + "'", str14, "null,,null,null,,null,[],");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setId("null,null,null,hi!,null,null,[],");
        user0.setLastName(",,null,null,null,null,[],");
        java.lang.String str5 = user0.getLastName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",,null,null,null,null,[]," + "'", str5, ",,null,null,null,null,[],");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user0.getBookings();
        java.lang.String str11 = user0.getLastName();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList12 = user0.getVisibleBookings();
        java.lang.String str13 = user0.getId();
        user0.setId("hi!");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole16 = user0.getAccountRole();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(bookingList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(accountRole16);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        org.openjfx.EECS_3311_Project.model.Booking booking10 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking11 = user0.addBooking(booking10);
        user0.setPassword("hi!");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(booking11);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        java.lang.String str1 = user0.getUserType();
        user0.setPassword(",,null,null,null,null,[],");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setId("");
        java.lang.String str10 = user0.getUserType();
        user0.setFirstName("null,null,null,null,null,hi!,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setUserType("hi!");
        java.lang.String str3 = user0.getEmail();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole4 = null;
        user0.setAccountRole(accountRole4);
        user0.setId("hi!");
        user0.setPassword("null,,,null,null,null,[],");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.toCSVRow();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList5 = user0.getBookings();
        org.openjfx.EECS_3311_Project.model.User user6 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole7 = user6.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking8 = null;
        user6.removeBooking(booking8);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user6.getVisibleBookings();
        user6.setFirstName("");
        java.lang.String str13 = user6.getLastName();
        user6.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList16 = user6.getBookings();
        java.lang.String str17 = user6.getLastName();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user6.getVisibleBookings();
        user0.setBookings(bookingList18);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null,null,null,null,null,null,[]," + "'", str4, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNotNull(bookingList5);
        org.junit.Assert.assertNull(accountRole7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(bookingList18);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getEmail();
        java.lang.String str5 = user0.toCSVRow();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList6 = user0.getBookings();
        java.lang.String str7 = user0.getFirstName();
        org.openjfx.EECS_3311_Project.model.Booking booking8 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking9 = user0.addBooking(booking8);
        user0.setLastName("");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null,null,null,null,null,null,[]," + "'", str5, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(booking9);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        user0.setUserType("null,null,null,null,null,hi!,[],");
        user0.setEmail("null,null,null,hi!,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        org.openjfx.EECS_3311_Project.model.Booking booking5 = null;
        user0.removeBooking(booking5);
        java.lang.String str7 = user0.getEmail();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = null;
        user0.setAccountRole(accountRole8);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setUserType("hi!");
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("null,null,null,null,null,null,[],");
        java.lang.String str6 = user0.getUserType();
        org.openjfx.EECS_3311_Project.model.Booking booking7 = null;
        user0.removeBooking(booking7);
        user0.setLastName("null,,,null,null,null,[],");
        user0.setLastName("");
        user0.setLastName("null,null,null,hi!,null,null,[],");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getPassword();
        java.lang.String str21 = user0.getId();
        user0.setLastName("");
        java.lang.String str24 = user0.toCSVRow();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList25 = user0.getBookings();
        java.lang.String str26 = user0.getPassword();
        user0.setId("null,,,null,null,null,[],");
        user0.setFirstName("null,null,null,null,null,null,[],");
        java.lang.String str31 = user0.getEmail();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "null,,,null,null,null,[]," + "'", str24, "null,,,null,null,null,[],");
        org.junit.Assert.assertNotNull(bookingList25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        java.lang.String str5 = user0.getUserType();
        org.openjfx.EECS_3311_Project.model.Booking booking6 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking7 = user0.addBooking(booking6);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(booking7);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setUserType("hi!");
        java.lang.String str3 = user0.getUserType();
        user0.setLastName("hi!");
        user0.setUserType(",,null,null,null,null,[],");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user0.getBookings();
        java.lang.String str11 = user0.getLastName();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList12 = user0.getVisibleBookings();
        user0.setPassword(",,null,null,null,null,[],");
        user0.setId("null,,null,null,null,null,[],");
        user0.setUserType("null,,null,null,,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(bookingList12);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getId();
        java.lang.String str5 = user0.getId();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole6 = user0.getAccountRole();
        java.lang.String str7 = user0.getId();
        java.lang.String str8 = user0.getPassword();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(accountRole6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        java.lang.String str5 = user0.getUserType();
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setUserType("hi!");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList3 = null;
        user0.setBookings(bookingList3);
        java.lang.String str5 = user0.getId();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        org.openjfx.EECS_3311_Project.model.Booking booking10 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking11 = user0.addBooking(booking10);
        user0.setEmail("");
        java.lang.String str14 = user0.getId();
        user0.setPassword("null,,,null,null,null,[],");
        user0.setLastName("hi!");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList19 = user0.getBookings();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList19);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setUserType("hi!");
        java.lang.String str3 = user0.getUserType();
        java.lang.String str4 = user0.getLastName();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole5 = null;
        user0.setAccountRole(accountRole5);
        org.openjfx.EECS_3311_Project.model.Booking booking7 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking8 = user0.addBooking(booking7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(booking8);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getId();
        user0.setPassword("null,null,null,null,null,null,[],");
        java.lang.String str7 = user0.getUserType();
        java.lang.String str8 = user0.getUserType();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.toCSVRow();
        java.lang.String str5 = user0.getId();
        org.openjfx.EECS_3311_Project.model.User user6 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole7 = user6.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking8 = null;
        user6.removeBooking(booking8);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user6.getVisibleBookings();
        user6.setFirstName("");
        java.lang.String str13 = user6.getLastName();
        user6.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList16 = user6.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user6.getVisibleBookings();
        user0.setBookings(bookingList17);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList19 = user0.getVisibleBookings();
        user0.setLastName("");
        org.openjfx.EECS_3311_Project.model.User user22 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole23 = user22.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking24 = null;
        user22.removeBooking(booking24);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList26 = user22.getVisibleBookings();
        user22.setFirstName("");
        java.lang.String str29 = user22.getLastName();
        user22.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList32 = user22.getBookings();
        java.lang.String str33 = user22.getLastName();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList34 = user22.getVisibleBookings();
        user0.setBookings(bookingList34);
        java.lang.String str36 = user0.getLastName();
        user0.setPassword("hi!");
        java.lang.String str39 = user0.getEmail();
        java.lang.String str40 = user0.getUserType();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null,null,null,null,null,null,[]," + "'", str4, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(accountRole7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList19);
        org.junit.Assert.assertNull(accountRole23);
        org.junit.Assert.assertNotNull(bookingList26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(bookingList32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(bookingList34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        java.lang.String str1 = user0.getUserType();
        org.openjfx.EECS_3311_Project.model.Booking[] bookingArray2 = new org.openjfx.EECS_3311_Project.model.Booking[] {};
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList3 = new java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.openjfx.EECS_3311_Project.model.Booking>) bookingList3, bookingArray2);
        user0.setBookings(bookingList3);
        org.openjfx.EECS_3311_Project.model.Booking booking6 = null;
        user0.removeBooking(booking6);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(bookingArray2);
        org.junit.Assert.assertArrayEquals(bookingArray2, new org.openjfx.EECS_3311_Project.model.Booking[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getId();
        java.lang.String str5 = user0.getId();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole6 = user0.getAccountRole();
        java.lang.String str7 = user0.getId();
        java.lang.String str8 = user0.getEmail();
        java.lang.String str9 = user0.getFirstName();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(accountRole6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole2 = null;
        user0.setAccountRole(accountRole2);
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole4 = null;
        user0.setAccountRole(accountRole4);
        org.junit.Assert.assertNull(accountRole1);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setUserType("hi!");
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("null,null,null,null,null,null,[],");
        java.lang.String str6 = user0.getUserType();
        org.openjfx.EECS_3311_Project.model.Booking booking7 = null;
        user0.removeBooking(booking7);
        user0.setLastName("");
        user0.setPassword("null,,null,null,,null,[],");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole13 = null;
        user0.setAccountRole(accountRole13);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getId();
        user0.setId("hi!");
        java.lang.String str7 = user0.getEmail();
        java.lang.String str8 = user0.toCSVRow();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!,null,null,null,null,null,[]," + "'", str8, "hi!,null,null,null,null,null,[],");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getUserType();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole5 = null;
        user0.setAccountRole(accountRole5);
        java.lang.Class<?> wildcardClass7 = user0.getClass();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole2 = null;
        user0.setAccountRole(accountRole2);
        user0.setPassword("hi!");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList6 = user0.getBookings();
        user0.setUserType("");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList6);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUserType();
        org.openjfx.EECS_3311_Project.model.User user3 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole4 = user3.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking5 = null;
        user3.removeBooking(booking5);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList7 = user3.getVisibleBookings();
        user3.setFirstName("");
        java.lang.String str10 = user3.getLastName();
        user3.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList13 = user3.getBookings();
        java.lang.String str14 = user3.getLastName();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList15 = user3.getVisibleBookings();
        java.lang.String str16 = user3.getId();
        user3.setId("hi!");
        java.lang.String str19 = user3.toCSVRow();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList20 = user3.getVisibleBookings();
        user0.setBookings(bookingList20);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(accountRole4);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(bookingList13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!,,null,null,null,null,[]," + "'", str19, "hi!,,null,null,null,null,[],");
        org.junit.Assert.assertNotNull(bookingList20);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setLastName("null,null,null,hi!,null,null,[],");
        org.openjfx.EECS_3311_Project.model.Booking booking3 = null;
        user0.removeBooking(booking3);
        java.lang.String str5 = user0.getId();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole6 = user0.getAccountRole();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(accountRole6);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        org.openjfx.EECS_3311_Project.model.Booking booking10 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking11 = user0.addBooking(booking10);
        java.lang.String str12 = user0.getId();
        user0.setFirstName("null,,null,null,null,null,[],");
        java.lang.String str15 = user0.getId();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user0.getBookings();
        java.lang.String str11 = user0.getLastName();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList12 = user0.getVisibleBookings();
        user0.setPassword(",,null,null,null,null,[],");
        user0.setId("null,,null,null,null,null,[],");
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(bookingList12);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole2 = null;
        user0.setAccountRole(accountRole2);
        java.lang.String str4 = user0.getUserType();
        user0.setPassword("hi!");
        java.lang.String str7 = user0.getLastName();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user0.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user0.getVisibleBookings();
        java.lang.String str12 = user0.getId();
        java.lang.String str13 = user0.getPassword();
        org.openjfx.EECS_3311_Project.model.Booking booking14 = null;
        user0.removeBooking(booking14);
        user0.setUserType("null,,,null,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getFirstName();
        user0.setId("null,null,null,null,null,null,[],");
        java.lang.String str23 = user0.getId();
        org.openjfx.EECS_3311_Project.model.Booking booking24 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking25 = user0.addBooking(booking24);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null,null,null,null,null,null,[]," + "'", str23, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNull(booking25);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        org.openjfx.EECS_3311_Project.model.Booking booking10 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking11 = user0.addBooking(booking10);
        user0.setEmail("");
        org.openjfx.EECS_3311_Project.model.Booking booking14 = null;
        user0.removeBooking(booking14);
        user0.setId("null,,,null,null,null,[],");
        user0.setUserType("hi!,,null,null,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(booking11);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user0.getAccountRole();
        user0.setEmail("null,,null,null,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(accountRole8);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setLastName("null,null,null,hi!,null,null,[],");
        org.openjfx.EECS_3311_Project.model.Booking booking3 = null;
        user0.removeBooking(booking3);
        java.lang.String str5 = user0.getId();
        java.lang.String str6 = user0.getPassword();
        user0.setUserType("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList9 = user0.getVisibleBookings();
        java.lang.String str10 = user0.getId();
        user0.setLastName("null,,null,null,null,null,[],");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(bookingList9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getPassword();
        java.lang.String str21 = user0.getId();
        user0.setLastName("");
        java.lang.String str24 = user0.toCSVRow();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList25 = user0.getBookings();
        java.lang.String str26 = user0.getPassword();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList27 = user0.getVisibleBookings();
        org.openjfx.EECS_3311_Project.model.Booking booking28 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking29 = user0.addBooking(booking28);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "null,,,null,null,null,[]," + "'", str24, "null,,,null,null,null,[],");
        org.junit.Assert.assertNotNull(bookingList25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(bookingList27);
        org.junit.Assert.assertNull(booking29);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.toCSVRow();
        java.lang.String str5 = user0.getId();
        org.openjfx.EECS_3311_Project.model.User user6 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole7 = user6.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking8 = null;
        user6.removeBooking(booking8);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user6.getVisibleBookings();
        user6.setFirstName("");
        java.lang.String str13 = user6.getLastName();
        user6.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList16 = user6.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user6.getVisibleBookings();
        user0.setBookings(bookingList17);
        org.openjfx.EECS_3311_Project.model.User user19 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole20 = user19.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking21 = null;
        user19.removeBooking(booking21);
        java.lang.String str23 = user19.toCSVRow();
        java.lang.String str24 = user19.getId();
        org.openjfx.EECS_3311_Project.model.User user25 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole26 = user25.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking27 = null;
        user25.removeBooking(booking27);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList29 = user25.getVisibleBookings();
        user25.setFirstName("");
        java.lang.String str32 = user25.getLastName();
        user25.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList35 = user25.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList36 = user25.getVisibleBookings();
        user19.setBookings(bookingList36);
        user0.setBookings(bookingList36);
        org.openjfx.EECS_3311_Project.model.Booking[] bookingArray39 = new org.openjfx.EECS_3311_Project.model.Booking[] {};
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList40 = new java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.openjfx.EECS_3311_Project.model.Booking>) bookingList40, bookingArray39);
        user0.setBookings(bookingList40);
        java.lang.String str43 = user0.getFirstName();
        org.openjfx.EECS_3311_Project.model.Booking booking44 = null;
        user0.removeBooking(booking44);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null,null,null,null,null,null,[]," + "'", str4, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(accountRole7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNull(accountRole20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null,null,null,null,null,null,[]," + "'", str23, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(accountRole26);
        org.junit.Assert.assertNotNull(bookingList29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(bookingList35);
        org.junit.Assert.assertNotNull(bookingList36);
        org.junit.Assert.assertNotNull(bookingArray39);
        org.junit.Assert.assertArrayEquals(bookingArray39, new org.openjfx.EECS_3311_Project.model.Booking[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user0.getBookings();
        java.lang.String str11 = user0.getLastName();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList12 = user0.getVisibleBookings();
        java.lang.String str13 = user0.getId();
        user0.setId("hi!");
        java.lang.String str16 = user0.toCSVRow();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user0.getVisibleBookings();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole18 = null;
        user0.setAccountRole(accountRole18);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(bookingList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!,,null,null,null,null,[]," + "'", str16, "hi!,,null,null,null,null,[],");
        org.junit.Assert.assertNotNull(bookingList17);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        org.openjfx.EECS_3311_Project.model.Booking booking10 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking11 = user0.addBooking(booking10);
        java.lang.String str12 = user0.getId();
        user0.setId("null,null,null,hi!,null,null,[],");
        user0.setUserType("null,,null,null,,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        org.openjfx.EECS_3311_Project.model.Booking booking10 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking11 = user0.addBooking(booking10);
        user0.setEmail("");
        java.lang.String str14 = user0.getId();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList15 = null;
        user0.setBookings(bookingList15);
        java.lang.String str17 = user0.getUserType();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        java.lang.String str10 = user0.getId();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user13 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole14 = user13.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking15 = null;
        user13.removeBooking(booking15);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user13.getVisibleBookings();
        user13.setFirstName("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList20 = user13.getVisibleBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList21 = user13.getVisibleBookings();
        user0.setBookings(bookingList21);
        user0.setLastName("null,null,null,null,null,hi!,[],");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList25 = user0.getVisibleBookings();
        user0.setEmail("");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(accountRole14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList20);
        org.junit.Assert.assertNotNull(bookingList21);
        org.junit.Assert.assertNotNull(bookingList25);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user7 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = user7.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking9 = null;
        user7.removeBooking(booking9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user7.getVisibleBookings();
        user7.setFirstName("");
        java.lang.String str14 = user7.getLastName();
        user7.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user7.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList18 = user7.getVisibleBookings();
        user0.setBookings(bookingList18);
        java.lang.String str20 = user0.getFirstName();
        java.lang.String str21 = user0.getLastName();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole8);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        user0.setUserType("hi!");
        java.lang.String str3 = user0.getEmail();
        user0.setFirstName("null,null,null,null,null,null,[],");
        java.lang.String str6 = user0.getUserType();
        org.openjfx.EECS_3311_Project.model.Booking booking7 = null;
        user0.removeBooking(booking7);
        user0.setLastName("");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole11 = null;
        user0.setAccountRole(accountRole11);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        org.openjfx.EECS_3311_Project.model.Booking booking10 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking11 = user0.addBooking(booking10);
        user0.setPassword("null,,,null,null,null,[],");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList14 = user0.getVisibleBookings();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(booking11);
        org.junit.Assert.assertNotNull(bookingList14);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        java.lang.String str2 = user0.getUserType();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList3 = user0.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("null,null,null,null,null,hi!,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(bookingList3);
        org.junit.Assert.assertNotNull(bookingList4);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setId("");
        user0.setId("null,,null,null,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getEmail();
        java.lang.String str5 = user0.toCSVRow();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList6 = user0.getBookings();
        user0.setPassword("");
        user0.setLastName("null,,,null,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null,null,null,null,null,null,[]," + "'", str5, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNotNull(bookingList6);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setId("");
        java.lang.String str10 = user0.getUserType();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user0.getVisibleBookings();
        user0.setFirstName("");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole14 = user0.getAccountRole();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertNull(accountRole14);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        java.lang.String str10 = user0.getId();
        java.lang.String str11 = user0.getEmail();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList12 = user0.getBookings();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(bookingList12);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.toCSVRow();
        java.lang.String str5 = user0.getId();
        org.openjfx.EECS_3311_Project.model.User user6 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole7 = user6.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking8 = null;
        user6.removeBooking(booking8);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user6.getVisibleBookings();
        user6.setFirstName("");
        java.lang.String str13 = user6.getLastName();
        user6.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList16 = user6.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user6.getVisibleBookings();
        user0.setBookings(bookingList17);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList19 = user0.getVisibleBookings();
        user0.setLastName("");
        org.openjfx.EECS_3311_Project.model.User user22 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole23 = user22.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking24 = null;
        user22.removeBooking(booking24);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList26 = user22.getVisibleBookings();
        user22.setFirstName("");
        java.lang.String str29 = user22.getLastName();
        user22.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList32 = user22.getBookings();
        java.lang.String str33 = user22.getLastName();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList34 = user22.getVisibleBookings();
        user0.setBookings(bookingList34);
        user0.setEmail("hi!,,null,null,null,null,[],");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null,null,null,null,null,null,[]," + "'", str4, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(accountRole7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList19);
        org.junit.Assert.assertNull(accountRole23);
        org.junit.Assert.assertNotNull(bookingList26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(bookingList32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(bookingList34);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        user0.setUserType("null,,,null,null,null,[],");
        user0.setEmail("null,null,null,null,null,null,[],");
        java.lang.String str8 = user0.getId();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        user0.setUserType("null,,,null,null,null,[],");
        org.openjfx.EECS_3311_Project.model.User user6 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole7 = user6.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking8 = null;
        user6.removeBooking(booking8);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user6.getVisibleBookings();
        user6.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user13 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole14 = user13.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking15 = null;
        user13.removeBooking(booking15);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user13.getVisibleBookings();
        user13.setFirstName("");
        java.lang.String str20 = user13.getLastName();
        user13.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList23 = user13.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList24 = user13.getVisibleBookings();
        user6.setBookings(bookingList24);
        java.lang.String str26 = user6.getPassword();
        java.lang.String str27 = user6.getId();
        user6.setLastName("");
        org.openjfx.EECS_3311_Project.model.Booking[] bookingArray30 = new org.openjfx.EECS_3311_Project.model.Booking[] {};
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList31 = new java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.openjfx.EECS_3311_Project.model.Booking>) bookingList31, bookingArray30);
        user6.setBookings(bookingList31);
        user0.setBookings(bookingList31);
        org.openjfx.EECS_3311_Project.model.User user35 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole36 = user35.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking37 = null;
        user35.removeBooking(booking37);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList39 = user35.getVisibleBookings();
        user35.setFirstName("");
        org.openjfx.EECS_3311_Project.model.User user42 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole43 = user42.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking44 = null;
        user42.removeBooking(booking44);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList46 = user42.getVisibleBookings();
        user42.setFirstName("");
        java.lang.String str49 = user42.getLastName();
        user42.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList52 = user42.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList53 = user42.getVisibleBookings();
        user35.setBookings(bookingList53);
        java.lang.String str55 = user35.getPassword();
        java.lang.String str56 = user35.getId();
        user35.setLastName("");
        java.lang.String str59 = user35.toCSVRow();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList60 = user35.getBookings();
        user0.setBookings(bookingList60);
        java.lang.String str62 = user0.getLastName();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(accountRole7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(accountRole14);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(bookingList23);
        org.junit.Assert.assertNotNull(bookingList24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(bookingArray30);
        org.junit.Assert.assertArrayEquals(bookingArray30, new org.openjfx.EECS_3311_Project.model.Booking[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(accountRole36);
        org.junit.Assert.assertNotNull(bookingList39);
        org.junit.Assert.assertNull(accountRole43);
        org.junit.Assert.assertNotNull(bookingList46);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(bookingList52);
        org.junit.Assert.assertNotNull(bookingList53);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "null,,,null,null,null,[]," + "'", str59, "null,,,null,null,null,[],");
        org.junit.Assert.assertNotNull(bookingList60);
        org.junit.Assert.assertNull(str62);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.toCSVRow();
        java.lang.String str5 = user0.getId();
        org.openjfx.EECS_3311_Project.model.User user6 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole7 = user6.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking8 = null;
        user6.removeBooking(booking8);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user6.getVisibleBookings();
        user6.setFirstName("");
        java.lang.String str13 = user6.getLastName();
        user6.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList16 = user6.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user6.getVisibleBookings();
        user0.setBookings(bookingList17);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList19 = user0.getVisibleBookings();
        user0.setLastName("");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole22 = null;
        user0.setAccountRole(accountRole22);
        java.lang.Class<?> wildcardClass24 = user0.getClass();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null,null,null,null,null,null,[]," + "'", str4, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(accountRole7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNotNull(bookingList19);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.toCSVRow();
        java.lang.String str5 = user0.getId();
        org.openjfx.EECS_3311_Project.model.User user6 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole7 = user6.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking8 = null;
        user6.removeBooking(booking8);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user6.getVisibleBookings();
        user6.setFirstName("");
        java.lang.String str13 = user6.getLastName();
        user6.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList16 = user6.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList17 = user6.getVisibleBookings();
        user0.setBookings(bookingList17);
        org.openjfx.EECS_3311_Project.model.User user19 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole20 = user19.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking21 = null;
        user19.removeBooking(booking21);
        java.lang.String str23 = user19.toCSVRow();
        java.lang.String str24 = user19.getId();
        org.openjfx.EECS_3311_Project.model.User user25 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole26 = user25.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking27 = null;
        user25.removeBooking(booking27);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList29 = user25.getVisibleBookings();
        user25.setFirstName("");
        java.lang.String str32 = user25.getLastName();
        user25.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList35 = user25.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList36 = user25.getVisibleBookings();
        user19.setBookings(bookingList36);
        user0.setBookings(bookingList36);
        org.openjfx.EECS_3311_Project.model.Booking[] bookingArray39 = new org.openjfx.EECS_3311_Project.model.Booking[] {};
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList40 = new java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.openjfx.EECS_3311_Project.model.Booking>) bookingList40, bookingArray39);
        user0.setBookings(bookingList40);
        java.lang.String str43 = user0.getFirstName();
        org.openjfx.EECS_3311_Project.model.Booking booking44 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking45 = user0.addBooking(booking44);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null,null,null,null,null,null,[]," + "'", str4, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(accountRole7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(bookingList16);
        org.junit.Assert.assertNotNull(bookingList17);
        org.junit.Assert.assertNull(accountRole20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null,null,null,null,null,null,[]," + "'", str23, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(accountRole26);
        org.junit.Assert.assertNotNull(bookingList29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(bookingList35);
        org.junit.Assert.assertNotNull(bookingList36);
        org.junit.Assert.assertNotNull(bookingArray39);
        org.junit.Assert.assertArrayEquals(bookingArray39, new org.openjfx.EECS_3311_Project.model.Booking[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(booking45);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.toCSVRow();
        java.lang.String str5 = user0.getId();
        user0.setFirstName("null,null,null,null,null,null,[],");
        user0.setPassword("");
        user0.setId("null,,,null,null,null,[],");
        java.lang.String str12 = user0.getLastName();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null,null,null,null,null,null,[]," + "'", str4, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList7 = user0.getVisibleBookings();
        java.lang.String str8 = user0.getId();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole9 = null;
        user0.setAccountRole(accountRole9);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user0.getVisibleBookings();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNotNull(bookingList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(bookingList11);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setId("");
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList10 = user0.getBookings();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList11 = user0.getVisibleBookings();
        java.lang.String str12 = user0.getId();
        java.lang.String str13 = user0.getPassword();
        org.openjfx.EECS_3311_Project.model.Booking booking14 = null;
        user0.removeBooking(booking14);
        java.lang.String str16 = user0.getUserType();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(bookingList10);
        org.junit.Assert.assertNotNull(bookingList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        org.openjfx.EECS_3311_Project.model.Booking booking5 = null;
        user0.removeBooking(booking5);
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole7 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = null;
        user0.setAccountRole(accountRole8);
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(accountRole7);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getEmail();
        java.lang.String str5 = user0.toCSVRow();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList6 = user0.getBookings();
        java.lang.String str7 = user0.getPassword();
        user0.setLastName("hi!");
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null,null,null,null,null,null,[]," + "'", str5, "null,null,null,null,null,null,[],");
        org.junit.Assert.assertNotNull(bookingList6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList4 = user0.getVisibleBookings();
        user0.setFirstName("");
        java.lang.String str7 = user0.getLastName();
        user0.setPassword("");
        java.lang.String str10 = user0.getId();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole11 = null;
        user0.setAccountRole(accountRole11);
        java.lang.String str13 = user0.getId();
        java.util.ArrayList<org.openjfx.EECS_3311_Project.model.Booking> bookingList14 = user0.getVisibleBookings();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNotNull(bookingList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(bookingList14);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.openjfx.EECS_3311_Project.model.User user0 = new org.openjfx.EECS_3311_Project.model.User();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = user0.getAccountRole();
        org.openjfx.EECS_3311_Project.model.Booking booking2 = null;
        user0.removeBooking(booking2);
        java.lang.String str4 = user0.getEmail();
        java.lang.String str5 = user0.getPassword();
        user0.setUserType("");
        java.lang.String str8 = user0.getFirstName();
        org.junit.Assert.assertNull(accountRole1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }
}

