package randoop.Booking;

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
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Booking booking1 = new org.openjfx.EECS_3311_Project.model.Booking("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole6 = null;
        java.time.Duration duration7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = booking4.calculateExtendPrice(accountRole6, duration7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.Duration.toHours()\" because \"extension\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.lang.String str7 = booking4.getRoomId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = booking4.toCSVRow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.toString()\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = booking4.toCSVRow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.toString()\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = booking4.calculateTotalPrice(accountRole9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime2, localDateTime3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = booking4.toCSVRow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.toString()\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        java.lang.Boolean boolean13 = booking4.getIsCheckedIn();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = booking4.calculateTotalPrice(accountRole14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        java.lang.String str6 = booking4.getStudentOrOrganizationId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime2, localDateTime3);
        boolean boolean5 = booking4.isCancelled();
        booking4.checkIn();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole7 = null;
        java.time.Duration duration8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = booking4.calculateExtendPrice(accountRole7, duration8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.Duration.toHours()\" because \"extension\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Class<?> wildcardClass5 = booking4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = booking4.calculateDepositPrice(accountRole5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getId();
        java.lang.String str6 = booking4.getStudentOrOrganizationId();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = booking4.calculateTotalPrice(accountRole7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "1) test012(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "582f013d-71a3-42b6-ad8d-1aefe9a996aa" + "'", str5, "582f013d-71a3-42b6-ad8d-1aefe9a996aa");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        boolean boolean5 = booking4.isCancelled();
        booking4.setName("");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = null;
        java.time.Duration duration9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = booking4.calculateExtendPrice(accountRole8, duration9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.Duration.toHours()\" because \"extension\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList13);
        java.lang.Boolean boolean16 = booking4.getIsCheckedIn();
        java.time.LocalDateTime localDateTime17 = booking4.getEndTime();
        java.lang.String str18 = booking4.getId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(localDateTime17);
// flaky "2) test014(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "40e1ffec-196b-4a90-af80-8a4381451585" + "'", str18, "40e1ffec-196b-4a90-af80-8a4381451585");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime2, localDateTime3);
        boolean boolean5 = booking4.isCancelled();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = booking4.getCheckInTime();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = booking4.calculateDepositPrice(accountRole8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.util.List<java.lang.String> strList8 = null;
        booking4.setAttendeeIds(strList8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = booking4.toCSVRow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"this.attendeeIds\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "", localDateTime2, localDateTime3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = booking4.toCSVRow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.toString()\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getId();
        booking4.checkIn();
        booking4.setIsCheckedIn((java.lang.Boolean) false);
// flaky "3) test018(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff" + "'", str5, "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime2, localDateTime3);
        boolean boolean5 = booking4.isCancelled();
        booking4.checkIn();
        booking4.setHostId("b6952f00-19ed-471e-a77c-5ac86038da89");
        java.lang.Class<?> wildcardClass9 = booking4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime2, localDateTime3);
        boolean boolean5 = booking4.isCancelled();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = booking4.getCheckInTime();
        booking4.setName("fb0ea706-77b6-4282-b952-8013cf849ac4");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = booking4.toCSVRow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.toString()\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.util.List<java.lang.String> strList8 = null;
        booking4.setAttendeeIds(strList8);
        booking4.setIsCheckedIn((java.lang.Boolean) false);
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = booking4.calculateDepositPrice(accountRole12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking11 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime9, localDateTime10);
        java.lang.Boolean boolean12 = booking11.getIsCheckedIn();
        booking11.checkIn();
        java.time.LocalDateTime localDateTime14 = null;
        booking11.setCheckInTime(localDateTime14);
        booking11.setHostId("hi!");
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        booking11.setAttendeeIds((java.util.List<java.lang.String>) strList20);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList20);
        java.lang.Class<?> wildcardClass24 = strList20.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        boolean boolean13 = booking4.isCancelled();
        java.lang.String str14 = booking4.getHostId();
        java.time.LocalDateTime localDateTime15 = booking4.getCheckInTime();
        java.util.List<java.lang.String> strList16 = booking4.getAttendeeIds();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = booking4.toCSVRow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.toString()\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.setRoomId("");
        java.time.LocalDateTime localDateTime8 = booking4.getEndTime();
        java.lang.String str9 = booking4.getStudentOrOrganizationId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.lang.String str7 = booking4.getRoomId();
        java.time.LocalDateTime localDateTime8 = booking4.getEndTime();
        java.lang.String str9 = booking4.getStudentOrOrganizationId();
        booking4.setName("hi!");
        java.lang.String str12 = booking4.getHostId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        boolean boolean13 = booking4.isCancelled();
        java.lang.String str14 = booking4.getHostId();
        java.time.LocalDateTime localDateTime15 = booking4.getCheckInTime();
        java.util.List<java.lang.String> strList16 = booking4.getAttendeeIds();
        booking4.setRoomId("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        booking4.setIsCheckedIn((java.lang.Boolean) false);
        booking4.checkIn();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = booking4.toCSVRow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.toString()\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList13);
        booking4.setHostId("hi!");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole18 = null;
        java.time.Duration duration19 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = booking4.calculateExtendPrice(accountRole18, duration19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.Duration.toHours()\" because \"extension\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setName("hi!");
        java.time.LocalDateTime localDateTime13 = booking4.getStartTime();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = booking4.calculateTotalPrice(accountRole14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "", localDateTime2, localDateTime3);
        booking4.setStudentOrOrganizationId("b6952f00-19ed-471e-a77c-5ac86038da89");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking13 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime11, localDateTime12);
        boolean boolean14 = booking13.isCancelled();
        booking13.checkIn();
        java.time.LocalDateTime localDateTime16 = booking13.getCheckInTime();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking21 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime19, localDateTime20);
        boolean boolean22 = booking21.isCancelled();
        booking21.checkIn();
        java.time.LocalDateTime localDateTime24 = booking21.getCheckInTime();
        org.openjfx.EECS_3311_Project.model.Booking booking25 = new org.openjfx.EECS_3311_Project.model.Booking("fb0ea706-77b6-4282-b952-8013cf849ac4", "New Meeting", localDateTime16, localDateTime24);
        booking4.setStartTime(localDateTime16);
        java.lang.String str27 = booking4.getStudentOrOrganizationId();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "b6952f00-19ed-471e-a77c-5ac86038da89" + "'", str27, "b6952f00-19ed-471e-a77c-5ac86038da89");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.time.LocalDateTime localDateTime8 = null;
        booking4.setStartTime(localDateTime8);
        java.lang.String str10 = booking4.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList11 = booking4.getAttendeeIds();
        booking4.setCancelled(true);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking18 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime16, localDateTime17);
        boolean boolean19 = booking18.isCancelled();
        booking18.checkIn();
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking25 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime23, localDateTime24);
        java.lang.String str26 = booking25.getRoomId();
        booking25.setRoomId("hi!");
        java.lang.String str29 = booking25.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList30 = booking25.getAttendeeIds();
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking35 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime33, localDateTime34);
        java.lang.Boolean boolean36 = booking35.getIsCheckedIn();
        booking35.setRoomId("");
        java.time.LocalDateTime localDateTime39 = booking35.getEndTime();
        java.time.LocalDateTime localDateTime40 = booking35.getCheckInTime();
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking45 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime43, localDateTime44);
        java.lang.Boolean boolean46 = booking45.getIsCheckedIn();
        booking45.checkIn();
        java.time.LocalDateTime localDateTime48 = null;
        booking45.setCheckInTime(localDateTime48);
        booking45.setHostId("hi!");
        booking45.setRoomId("");
        boolean boolean54 = booking45.isCancelled();
        java.lang.String str55 = booking45.getHostId();
        java.time.LocalDateTime localDateTime58 = null;
        java.time.LocalDateTime localDateTime59 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking60 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime58, localDateTime59);
        boolean boolean61 = booking60.isCancelled();
        booking60.checkIn();
        java.time.LocalDateTime localDateTime63 = booking60.getCheckInTime();
        booking45.setStartTime(localDateTime63);
        booking35.setStartTime(localDateTime63);
        booking25.setStartTime(localDateTime63);
        booking18.setCheckInTime(localDateTime63);
        booking4.setStartTime(localDateTime63);
        java.lang.Boolean boolean69 = booking4.getIsCheckedIn();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(localDateTime39);
        org.junit.Assert.assertNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.util.List<java.lang.String> strList8 = null;
        booking4.setAttendeeIds(strList8);
        booking4.setId("");
        java.lang.String str12 = booking4.getRoomId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.time.LocalDateTime localDateTime8 = null;
        booking4.setStartTime(localDateTime8);
        java.lang.String str10 = booking4.getStudentOrOrganizationId();
        boolean boolean11 = booking4.isCancelled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Booking booking1 = new org.openjfx.EECS_3311_Project.model.Booking("New Meeting");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.setRoomId("");
        booking4.setName("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        booking4.setRoomId("1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "", localDateTime2, localDateTime3);
        booking4.setCancelled(false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = booking4.getEndTime();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = booking4.calculateDepositPrice(accountRole10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        boolean boolean13 = booking4.isCancelled();
        java.lang.String str14 = booking4.getHostId();
        java.time.LocalDateTime localDateTime15 = booking4.getCheckInTime();
        java.lang.String str16 = booking4.getStudentOrOrganizationId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = booking4.getEndTime();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole10 = null;
        java.time.Duration duration11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = booking4.calculateExtendPrice(accountRole10, duration11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.Duration.toHours()\" because \"extension\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList13);
        java.lang.Boolean boolean16 = booking4.getIsCheckedIn();
        booking4.setIsCheckedIn((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.util.List<java.lang.String> strList8 = null;
        booking4.setAttendeeIds(strList8);
        booking4.setId("");
        java.lang.Boolean boolean12 = booking4.getIsCheckedIn();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking17 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime15, localDateTime16);
        java.lang.Boolean boolean18 = booking17.getIsCheckedIn();
        booking17.checkIn();
        java.time.LocalDateTime localDateTime20 = null;
        booking17.setCheckInTime(localDateTime20);
        booking17.setHostId("hi!");
        booking17.setRoomId("");
        boolean boolean26 = booking17.isCancelled();
        java.lang.String str27 = booking17.getHostId();
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking32 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime30, localDateTime31);
        boolean boolean33 = booking32.isCancelled();
        booking32.checkIn();
        java.time.LocalDateTime localDateTime35 = booking32.getCheckInTime();
        booking17.setStartTime(localDateTime35);
        booking4.setEndTime(localDateTime35);
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole38 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double39 = booking4.calculateDepositPrice(accountRole38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(localDateTime35);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime2, localDateTime3);
        boolean boolean5 = booking4.isCancelled();
        booking4.checkIn();
        booking4.setHostId("b6952f00-19ed-471e-a77c-5ac86038da89");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole9 = null;
        java.time.Duration duration10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = booking4.calculateExtendPrice(accountRole9, duration10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.Duration.toHours()\" because \"extension\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        boolean boolean13 = booking4.isCancelled();
        java.lang.String str14 = booking4.getId();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime16 = booking4.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "4) test042(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "fc014012-396f-4995-8464-7c1dd3ea2b8b" + "'", str14, "fc014012-396f-4995-8464-7c1dd3ea2b8b");
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.lang.String str7 = booking4.getRoomId();
        java.time.LocalDateTime localDateTime8 = booking4.getEndTime();
        java.lang.String str9 = booking4.getStudentOrOrganizationId();
        booking4.setName("hi!");
        boolean boolean12 = booking4.isCancelled();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole13 = null;
        java.time.Duration duration14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = booking4.calculateExtendPrice(accountRole13, duration14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.Duration.toHours()\" because \"extension\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking6 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime4, localDateTime5);
        boolean boolean7 = booking6.isCancelled();
        booking6.checkIn();
        java.time.LocalDateTime localDateTime9 = booking6.getCheckInTime();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking14 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime12, localDateTime13);
        boolean boolean15 = booking14.isCancelled();
        booking14.checkIn();
        java.time.LocalDateTime localDateTime17 = booking14.getCheckInTime();
        org.openjfx.EECS_3311_Project.model.Booking booking18 = new org.openjfx.EECS_3311_Project.model.Booking("fb0ea706-77b6-4282-b952-8013cf849ac4", "New Meeting", localDateTime9, localDateTime17);
        booking18.setRoomId("fc014012-396f-4995-8464-7c1dd3ea2b8b");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Booking booking1 = new org.openjfx.EECS_3311_Project.model.Booking("b6952f00-19ed-471e-a77c-5ac86038da89");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList9);
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole12 = null;
        java.time.Duration duration13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = booking4.calculateExtendPrice(accountRole12, duration13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.Duration.toHours()\" because \"extension\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.setRoomId("");
        booking4.setHostId("b6952f00-19ed-471e-a77c-5ac86038da89");
        java.lang.String str10 = booking4.getName();
        java.lang.Boolean boolean11 = booking4.getIsCheckedIn();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = booking4.toCSVRow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.toString()\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "New Meeting" + "'", str10, "New Meeting");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Booking booking1 = new org.openjfx.EECS_3311_Project.model.Booking("1769c7fb-fb90-48af-99cd-b3e5c45c90cb");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.util.List<java.lang.String> strList8 = null;
        booking4.setAttendeeIds(strList8);
        booking4.setIsCheckedIn((java.lang.Boolean) false);
        booking4.setStudentOrOrganizationId("dacbd1e4-b01b-4af2-a5e2-41702233ed46");
        java.time.LocalDateTime localDateTime14 = booking4.getCheckInTime();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime2, localDateTime3);
        boolean boolean5 = booking4.isCancelled();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = booking4.calculateDepositPrice(accountRole6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.lang.String str7 = booking4.getRoomId();
        java.time.LocalDateTime localDateTime8 = booking4.getEndTime();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking13 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime11, localDateTime12);
        boolean boolean14 = booking13.isCancelled();
        booking13.checkIn();
        java.time.LocalDateTime localDateTime16 = booking13.getCheckInTime();
        booking4.setEndTime(localDateTime16);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking22 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime20, localDateTime21);
        java.lang.String str23 = booking22.getRoomId();
        booking22.setRoomId("hi!");
        java.lang.String str26 = booking22.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList27 = booking22.getAttendeeIds();
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking32 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime30, localDateTime31);
        java.lang.Boolean boolean33 = booking32.getIsCheckedIn();
        booking32.setRoomId("");
        java.time.LocalDateTime localDateTime36 = booking32.getEndTime();
        java.time.LocalDateTime localDateTime37 = booking32.getCheckInTime();
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking42 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime40, localDateTime41);
        java.lang.Boolean boolean43 = booking42.getIsCheckedIn();
        booking42.checkIn();
        java.time.LocalDateTime localDateTime45 = null;
        booking42.setCheckInTime(localDateTime45);
        booking42.setHostId("hi!");
        booking42.setRoomId("");
        boolean boolean51 = booking42.isCancelled();
        java.lang.String str52 = booking42.getHostId();
        java.time.LocalDateTime localDateTime55 = null;
        java.time.LocalDateTime localDateTime56 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking57 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime55, localDateTime56);
        boolean boolean58 = booking57.isCancelled();
        booking57.checkIn();
        java.time.LocalDateTime localDateTime60 = booking57.getCheckInTime();
        booking42.setStartTime(localDateTime60);
        booking32.setStartTime(localDateTime60);
        booking22.setStartTime(localDateTime60);
        booking4.setCheckInTime(localDateTime60);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(localDateTime60);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = booking4.getRoomId();
        java.lang.String[] strArray19 = new java.lang.String[] { "fb0ea706-77b6-4282-b952-8013cf849ac4", "40e1ffec-196b-4a90-af80-8a4381451585" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList20);
        java.time.LocalDateTime localDateTime23 = booking4.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "fb0ea706-77b6-4282-b952-8013cf849ac4", "40e1ffec-196b-4a90-af80-8a4381451585" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList9);
        java.lang.String str12 = booking4.getName();
        java.lang.String str13 = booking4.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "New Meeting" + "'", str12, "New Meeting");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        java.lang.Boolean boolean9 = booking4.getIsCheckedIn();
        booking4.setName("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking16 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime14, localDateTime15);
        java.lang.String str17 = booking16.getRoomId();
        booking16.setRoomId("hi!");
        java.time.LocalDateTime localDateTime20 = null;
        booking16.setStartTime(localDateTime20);
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking26 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime24, localDateTime25);
        java.lang.Boolean boolean27 = booking26.getIsCheckedIn();
        booking26.checkIn();
        java.time.LocalDateTime localDateTime29 = null;
        booking26.setCheckInTime(localDateTime29);
        booking26.setHostId("hi!");
        booking26.setRoomId("");
        boolean boolean35 = booking26.isCancelled();
        java.lang.String str36 = booking26.getHostId();
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking41 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime39, localDateTime40);
        boolean boolean42 = booking41.isCancelled();
        booking41.checkIn();
        java.time.LocalDateTime localDateTime44 = booking41.getCheckInTime();
        booking26.setStartTime(localDateTime44);
        booking16.setStartTime(localDateTime44);
        booking4.setCheckInTime(localDateTime44);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(localDateTime44);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setName("hi!");
        java.lang.String str13 = booking4.getId();
        java.lang.String str14 = booking4.getStudentOrOrganizationId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "5) test055(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5ac1f678-3e49-4f90-9760-5884d8e09d2e" + "'", str13, "5ac1f678-3e49-4f90-9760-5884d8e09d2e");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.time.LocalDateTime localDateTime8 = null;
        booking4.setStartTime(localDateTime8);
        java.lang.String str10 = booking4.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList11 = booking4.getAttendeeIds();
        booking4.setCancelled(true);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking18 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime16, localDateTime17);
        boolean boolean19 = booking18.isCancelled();
        booking18.checkIn();
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking25 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime23, localDateTime24);
        java.lang.String str26 = booking25.getRoomId();
        booking25.setRoomId("hi!");
        java.lang.String str29 = booking25.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList30 = booking25.getAttendeeIds();
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking35 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime33, localDateTime34);
        java.lang.Boolean boolean36 = booking35.getIsCheckedIn();
        booking35.setRoomId("");
        java.time.LocalDateTime localDateTime39 = booking35.getEndTime();
        java.time.LocalDateTime localDateTime40 = booking35.getCheckInTime();
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking45 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime43, localDateTime44);
        java.lang.Boolean boolean46 = booking45.getIsCheckedIn();
        booking45.checkIn();
        java.time.LocalDateTime localDateTime48 = null;
        booking45.setCheckInTime(localDateTime48);
        booking45.setHostId("hi!");
        booking45.setRoomId("");
        boolean boolean54 = booking45.isCancelled();
        java.lang.String str55 = booking45.getHostId();
        java.time.LocalDateTime localDateTime58 = null;
        java.time.LocalDateTime localDateTime59 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking60 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime58, localDateTime59);
        boolean boolean61 = booking60.isCancelled();
        booking60.checkIn();
        java.time.LocalDateTime localDateTime63 = booking60.getCheckInTime();
        booking45.setStartTime(localDateTime63);
        booking35.setStartTime(localDateTime63);
        booking25.setStartTime(localDateTime63);
        booking18.setCheckInTime(localDateTime63);
        booking4.setStartTime(localDateTime63);
        java.lang.String str69 = booking4.getHostId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(localDateTime39);
        org.junit.Assert.assertNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime2, localDateTime3);
        boolean boolean5 = booking4.isCancelled();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = booking4.getCheckInTime();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking12 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime10, localDateTime11);
        boolean boolean13 = booking12.isCancelled();
        booking12.checkIn();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking19 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime17, localDateTime18);
        java.lang.String str20 = booking19.getRoomId();
        booking19.setRoomId("hi!");
        java.lang.String str23 = booking19.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList24 = booking19.getAttendeeIds();
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking29 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime27, localDateTime28);
        java.lang.Boolean boolean30 = booking29.getIsCheckedIn();
        booking29.setRoomId("");
        java.time.LocalDateTime localDateTime33 = booking29.getEndTime();
        java.time.LocalDateTime localDateTime34 = booking29.getCheckInTime();
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking39 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime37, localDateTime38);
        java.lang.Boolean boolean40 = booking39.getIsCheckedIn();
        booking39.checkIn();
        java.time.LocalDateTime localDateTime42 = null;
        booking39.setCheckInTime(localDateTime42);
        booking39.setHostId("hi!");
        booking39.setRoomId("");
        boolean boolean48 = booking39.isCancelled();
        java.lang.String str49 = booking39.getHostId();
        java.time.LocalDateTime localDateTime52 = null;
        java.time.LocalDateTime localDateTime53 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking54 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime52, localDateTime53);
        boolean boolean55 = booking54.isCancelled();
        booking54.checkIn();
        java.time.LocalDateTime localDateTime57 = booking54.getCheckInTime();
        booking39.setStartTime(localDateTime57);
        booking29.setStartTime(localDateTime57);
        booking19.setStartTime(localDateTime57);
        booking12.setCheckInTime(localDateTime57);
        java.time.LocalDateTime localDateTime64 = null;
        java.time.LocalDateTime localDateTime65 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking66 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime64, localDateTime65);
        java.lang.Boolean boolean67 = booking66.getIsCheckedIn();
        booking66.setRoomId("");
        java.time.LocalDateTime localDateTime70 = booking66.getEndTime();
        java.time.LocalDateTime localDateTime71 = booking66.getCheckInTime();
        java.time.LocalDateTime localDateTime74 = null;
        java.time.LocalDateTime localDateTime75 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking76 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime74, localDateTime75);
        java.lang.Boolean boolean77 = booking76.getIsCheckedIn();
        booking76.checkIn();
        java.time.LocalDateTime localDateTime79 = null;
        booking76.setCheckInTime(localDateTime79);
        booking76.setHostId("hi!");
        booking76.setRoomId("");
        boolean boolean85 = booking76.isCancelled();
        java.lang.String str86 = booking76.getHostId();
        java.time.LocalDateTime localDateTime89 = null;
        java.time.LocalDateTime localDateTime90 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking91 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime89, localDateTime90);
        boolean boolean92 = booking91.isCancelled();
        booking91.checkIn();
        java.time.LocalDateTime localDateTime94 = booking91.getCheckInTime();
        booking76.setStartTime(localDateTime94);
        booking66.setStartTime(localDateTime94);
        booking12.setEndTime(localDateTime94);
        booking4.setEndTime(localDateTime94);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(localDateTime33);
        org.junit.Assert.assertNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(localDateTime70);
        org.junit.Assert.assertNull(localDateTime71);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(localDateTime94);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.setRoomId("");
        booking4.setHostId("b6952f00-19ed-471e-a77c-5ac86038da89");
        booking4.setHostId("bce87b8a-ced2-4072-9574-e7ba451cf76a");
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking16 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime14, localDateTime15);
        boolean boolean17 = booking16.isCancelled();
        booking16.checkIn();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking23 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime21, localDateTime22);
        java.lang.String str24 = booking23.getRoomId();
        booking23.setRoomId("hi!");
        java.lang.String str27 = booking23.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList28 = booking23.getAttendeeIds();
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking33 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime31, localDateTime32);
        java.lang.Boolean boolean34 = booking33.getIsCheckedIn();
        booking33.setRoomId("");
        java.time.LocalDateTime localDateTime37 = booking33.getEndTime();
        java.time.LocalDateTime localDateTime38 = booking33.getCheckInTime();
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking43 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime41, localDateTime42);
        java.lang.Boolean boolean44 = booking43.getIsCheckedIn();
        booking43.checkIn();
        java.time.LocalDateTime localDateTime46 = null;
        booking43.setCheckInTime(localDateTime46);
        booking43.setHostId("hi!");
        booking43.setRoomId("");
        boolean boolean52 = booking43.isCancelled();
        java.lang.String str53 = booking43.getHostId();
        java.time.LocalDateTime localDateTime56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking58 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime56, localDateTime57);
        boolean boolean59 = booking58.isCancelled();
        booking58.checkIn();
        java.time.LocalDateTime localDateTime61 = booking58.getCheckInTime();
        booking43.setStartTime(localDateTime61);
        booking33.setStartTime(localDateTime61);
        booking23.setStartTime(localDateTime61);
        booking16.setCheckInTime(localDateTime61);
        booking4.setCheckInTime(localDateTime61);
        java.lang.Class<?> wildcardClass67 = localDateTime61.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        boolean boolean13 = booking4.isCancelled();
        java.lang.String str14 = booking4.getHostId();
        java.time.LocalDateTime localDateTime15 = booking4.getCheckInTime();
        java.util.List<java.lang.String> strList16 = booking4.getAttendeeIds();
        booking4.setRoomId("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        booking4.setIsCheckedIn((java.lang.Boolean) false);
        booking4.setName("b6952f00-19ed-471e-a77c-5ac86038da89");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = booking4.getRoomId();
        java.lang.String[] strArray19 = new java.lang.String[] { "fb0ea706-77b6-4282-b952-8013cf849ac4", "40e1ffec-196b-4a90-af80-8a4381451585" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList20);
        java.time.LocalDateTime localDateTime23 = booking4.getStartTime();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole24 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double25 = booking4.calculateTotalPrice(accountRole24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "fb0ea706-77b6-4282-b952-8013cf849ac4", "40e1ffec-196b-4a90-af80-8a4381451585" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.lang.String str8 = booking4.getStudentOrOrganizationId();
        java.time.LocalDateTime localDateTime9 = booking4.getEndTime();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = booking4.calculateDepositPrice(accountRole10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Booking booking1 = new org.openjfx.EECS_3311_Project.model.Booking("fc014012-396f-4995-8464-7c1dd3ea2b8b");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        boolean boolean13 = booking4.isCancelled();
        java.lang.String str14 = booking4.getHostId();
        java.time.LocalDateTime localDateTime15 = booking4.getCheckInTime();
        java.util.List<java.lang.String> strList16 = booking4.getAttendeeIds();
        booking4.setRoomId("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        booking4.setIsCheckedIn((java.lang.Boolean) false);
        booking4.checkIn();
        java.time.LocalDateTime localDateTime22 = booking4.getStartTime();
        booking4.setRoomId("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        java.time.LocalDateTime localDateTime25 = booking4.getStartTime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localDateTime25);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.lang.String str8 = booking4.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList9 = booking4.getAttendeeIds();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking14 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime12, localDateTime13);
        java.lang.Boolean boolean15 = booking14.getIsCheckedIn();
        booking14.setRoomId("");
        java.time.LocalDateTime localDateTime18 = booking14.getEndTime();
        java.time.LocalDateTime localDateTime19 = booking14.getCheckInTime();
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking24 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime22, localDateTime23);
        java.lang.Boolean boolean25 = booking24.getIsCheckedIn();
        booking24.checkIn();
        java.time.LocalDateTime localDateTime27 = null;
        booking24.setCheckInTime(localDateTime27);
        booking24.setHostId("hi!");
        booking24.setRoomId("");
        boolean boolean33 = booking24.isCancelled();
        java.lang.String str34 = booking24.getHostId();
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking39 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime37, localDateTime38);
        boolean boolean40 = booking39.isCancelled();
        booking39.checkIn();
        java.time.LocalDateTime localDateTime42 = booking39.getCheckInTime();
        booking24.setStartTime(localDateTime42);
        booking14.setStartTime(localDateTime42);
        booking4.setStartTime(localDateTime42);
        java.lang.String str46 = booking4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(localDateTime42);
// flaky "6) test064(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "d1bec03c-448f-43c1-a00f-04dd67b97b4d" + "'", str46, "d1bec03c-448f-43c1-a00f-04dd67b97b4d");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.lang.String str8 = booking4.getStudentOrOrganizationId();
        java.time.LocalDateTime localDateTime9 = booking4.getEndTime();
        java.lang.String str10 = booking4.getId();
        booking4.setCancelled(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDateTime9);
// flaky "7) test065(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "3af102af-2aea-4b76-86a1-eb2b8135446c" + "'", str10, "3af102af-2aea-4b76-86a1-eb2b8135446c");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        boolean boolean13 = booking4.isCancelled();
        java.lang.String str14 = booking4.getHostId();
        java.time.LocalDateTime localDateTime15 = booking4.getCheckInTime();
        java.time.LocalDateTime localDateTime16 = booking4.getStartTime();
        java.lang.String str17 = booking4.getName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "New Meeting" + "'", str17, "New Meeting");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList13);
        booking4.setHostId("hi!");
        booking4.setName("New Meeting");
        booking4.setStudentOrOrganizationId("48e65325-60ae-405e-a86f-48f78c4f6b56");
        java.lang.Class<?> wildcardClass22 = booking4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking6 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime4, localDateTime5);
        java.lang.String str7 = booking6.getRoomId();
        booking6.setRoomId("hi!");
        java.util.List<java.lang.String> strList10 = null;
        booking6.setAttendeeIds(strList10);
        booking6.setId("");
        java.lang.Boolean boolean14 = booking6.getIsCheckedIn();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking19 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime17, localDateTime18);
        java.lang.Boolean boolean20 = booking19.getIsCheckedIn();
        booking19.checkIn();
        java.time.LocalDateTime localDateTime22 = null;
        booking19.setCheckInTime(localDateTime22);
        booking19.setHostId("hi!");
        booking19.setRoomId("");
        boolean boolean28 = booking19.isCancelled();
        java.lang.String str29 = booking19.getHostId();
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking34 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime32, localDateTime33);
        boolean boolean35 = booking34.isCancelled();
        booking34.checkIn();
        java.time.LocalDateTime localDateTime37 = booking34.getCheckInTime();
        booking19.setStartTime(localDateTime37);
        booking6.setEndTime(localDateTime37);
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking44 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime42, localDateTime43);
        java.lang.Boolean boolean45 = booking44.getIsCheckedIn();
        booking44.setRoomId("");
        booking44.setHostId("b6952f00-19ed-471e-a77c-5ac86038da89");
        java.lang.String str50 = booking44.getName();
        java.time.LocalDateTime localDateTime53 = null;
        java.time.LocalDateTime localDateTime54 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking55 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime53, localDateTime54);
        java.lang.String str56 = booking55.getRoomId();
        booking55.setRoomId("hi!");
        java.lang.String str59 = booking55.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList60 = booking55.getAttendeeIds();
        java.time.LocalDateTime localDateTime63 = null;
        java.time.LocalDateTime localDateTime64 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking65 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime63, localDateTime64);
        java.lang.Boolean boolean66 = booking65.getIsCheckedIn();
        booking65.setRoomId("");
        java.time.LocalDateTime localDateTime69 = booking65.getEndTime();
        java.time.LocalDateTime localDateTime70 = booking65.getCheckInTime();
        java.time.LocalDateTime localDateTime73 = null;
        java.time.LocalDateTime localDateTime74 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking75 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime73, localDateTime74);
        java.lang.Boolean boolean76 = booking75.getIsCheckedIn();
        booking75.checkIn();
        java.time.LocalDateTime localDateTime78 = null;
        booking75.setCheckInTime(localDateTime78);
        booking75.setHostId("hi!");
        booking75.setRoomId("");
        boolean boolean84 = booking75.isCancelled();
        java.lang.String str85 = booking75.getHostId();
        java.time.LocalDateTime localDateTime88 = null;
        java.time.LocalDateTime localDateTime89 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking90 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime88, localDateTime89);
        boolean boolean91 = booking90.isCancelled();
        booking90.checkIn();
        java.time.LocalDateTime localDateTime93 = booking90.getCheckInTime();
        booking75.setStartTime(localDateTime93);
        booking65.setStartTime(localDateTime93);
        booking55.setStartTime(localDateTime93);
        booking44.setEndTime(localDateTime93);
        org.openjfx.EECS_3311_Project.model.Booking booking98 = new org.openjfx.EECS_3311_Project.model.Booking("New Meeting", "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff", localDateTime37, localDateTime93);
        java.lang.String str99 = booking98.getHostId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "New Meeting" + "'", str50, "New Meeting");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(localDateTime69);
        org.junit.Assert.assertNull(localDateTime70);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(localDateTime93);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff" + "'", str99, "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Booking booking1 = new org.openjfx.EECS_3311_Project.model.Booking("dacbd1e4-b01b-4af2-a5e2-41702233ed46");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        java.lang.Boolean boolean13 = booking4.getIsCheckedIn();
        java.lang.String str14 = booking4.getName();
        booking4.setIsCheckedIn((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "New Meeting" + "'", str14, "New Meeting");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.lang.String str7 = booking4.getRoomId();
        java.time.LocalDateTime localDateTime8 = booking4.getEndTime();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking13 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime11, localDateTime12);
        boolean boolean14 = booking13.isCancelled();
        booking13.checkIn();
        java.time.LocalDateTime localDateTime16 = booking13.getCheckInTime();
        booking4.setEndTime(localDateTime16);
        java.util.List<java.lang.String> strList18 = booking4.getAttendeeIds();
        boolean boolean19 = booking4.isCancelled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList13);
        booking4.setHostId("hi!");
        booking4.setName("New Meeting");
        booking4.setIsCheckedIn((java.lang.Boolean) false);
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking26 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime24, localDateTime25);
        java.lang.Boolean boolean27 = booking26.getIsCheckedIn();
        booking26.setRoomId("");
        booking26.setHostId("b6952f00-19ed-471e-a77c-5ac86038da89");
        java.lang.String str32 = booking26.getName();
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking37 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime35, localDateTime36);
        java.lang.String str38 = booking37.getRoomId();
        booking37.setRoomId("hi!");
        java.lang.String str41 = booking37.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList42 = booking37.getAttendeeIds();
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking47 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime45, localDateTime46);
        java.lang.Boolean boolean48 = booking47.getIsCheckedIn();
        booking47.setRoomId("");
        java.time.LocalDateTime localDateTime51 = booking47.getEndTime();
        java.time.LocalDateTime localDateTime52 = booking47.getCheckInTime();
        java.time.LocalDateTime localDateTime55 = null;
        java.time.LocalDateTime localDateTime56 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking57 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime55, localDateTime56);
        java.lang.Boolean boolean58 = booking57.getIsCheckedIn();
        booking57.checkIn();
        java.time.LocalDateTime localDateTime60 = null;
        booking57.setCheckInTime(localDateTime60);
        booking57.setHostId("hi!");
        booking57.setRoomId("");
        boolean boolean66 = booking57.isCancelled();
        java.lang.String str67 = booking57.getHostId();
        java.time.LocalDateTime localDateTime70 = null;
        java.time.LocalDateTime localDateTime71 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking72 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime70, localDateTime71);
        boolean boolean73 = booking72.isCancelled();
        booking72.checkIn();
        java.time.LocalDateTime localDateTime75 = booking72.getCheckInTime();
        booking57.setStartTime(localDateTime75);
        booking47.setStartTime(localDateTime75);
        booking37.setStartTime(localDateTime75);
        booking26.setEndTime(localDateTime75);
        java.time.LocalDateTime localDateTime82 = null;
        java.time.LocalDateTime localDateTime83 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking84 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime82, localDateTime83);
        java.lang.Boolean boolean85 = booking84.getIsCheckedIn();
        booking84.checkIn();
        java.lang.String str87 = booking84.getRoomId();
        java.time.LocalDateTime localDateTime88 = booking84.getEndTime();
        java.time.LocalDateTime localDateTime91 = null;
        java.time.LocalDateTime localDateTime92 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking93 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime91, localDateTime92);
        boolean boolean94 = booking93.isCancelled();
        booking93.checkIn();
        java.time.LocalDateTime localDateTime96 = booking93.getCheckInTime();
        booking84.setEndTime(localDateTime96);
        booking26.setCheckInTime(localDateTime96);
        booking4.setStartTime(localDateTime96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "New Meeting" + "'", str32, "New Meeting");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(localDateTime51);
        org.junit.Assert.assertNull(localDateTime52);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(localDateTime75);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
        org.junit.Assert.assertNull(localDateTime88);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(localDateTime96);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        boolean boolean13 = booking4.isCancelled();
        java.lang.String str14 = booking4.getHostId();
        java.time.LocalDateTime localDateTime15 = booking4.getCheckInTime();
        java.util.List<java.lang.String> strList16 = booking4.getAttendeeIds();
        booking4.setRoomId("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        booking4.setStudentOrOrganizationId("f7bf3244-6207-4ece-8a29-6d9134c107bd");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList13);
        booking4.setHostId("hi!");
        booking4.setName("New Meeting");
        java.lang.String str20 = booking4.getStudentOrOrganizationId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        boolean boolean13 = booking4.isCancelled();
        java.lang.String str14 = booking4.getHostId();
        java.time.LocalDateTime localDateTime15 = booking4.getCheckInTime();
        java.util.List<java.lang.String> strList16 = booking4.getAttendeeIds();
        booking4.setRoomId("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        booking4.setIsCheckedIn((java.lang.Boolean) false);
        booking4.checkIn();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole22 = null;
        java.time.Duration duration23 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double24 = booking4.calculateExtendPrice(accountRole22, duration23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.Duration.toHours()\" because \"extension\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        boolean boolean13 = booking4.isCancelled();
        java.lang.String str14 = booking4.getHostId();
        booking4.checkIn();
        java.lang.String str16 = booking4.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList17 = booking4.getAttendeeIds();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.lang.String str8 = booking4.getStudentOrOrganizationId();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking13 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime11, localDateTime12);
        java.lang.String str14 = booking13.getRoomId();
        booking13.setRoomId("hi!");
        java.util.List<java.lang.String> strList17 = null;
        booking13.setAttendeeIds(strList17);
        booking13.setId("");
        java.lang.Boolean boolean21 = booking13.getIsCheckedIn();
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking26 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime24, localDateTime25);
        java.lang.Boolean boolean27 = booking26.getIsCheckedIn();
        booking26.checkIn();
        java.time.LocalDateTime localDateTime29 = null;
        booking26.setCheckInTime(localDateTime29);
        booking26.setHostId("hi!");
        booking26.setRoomId("");
        boolean boolean35 = booking26.isCancelled();
        java.lang.String str36 = booking26.getHostId();
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking41 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime39, localDateTime40);
        boolean boolean42 = booking41.isCancelled();
        booking41.checkIn();
        java.time.LocalDateTime localDateTime44 = booking41.getCheckInTime();
        booking26.setStartTime(localDateTime44);
        booking13.setEndTime(localDateTime44);
        booking4.setEndTime(localDateTime44);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = booking4.toCSVRow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.toString()\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(localDateTime44);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.lang.String str8 = booking4.getStudentOrOrganizationId();
        booking4.setId("bce87b8a-ced2-4072-9574-e7ba451cf76a");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking17 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime15, localDateTime16);
        boolean boolean18 = booking17.isCancelled();
        booking17.checkIn();
        java.time.LocalDateTime localDateTime20 = booking17.getCheckInTime();
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking25 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime23, localDateTime24);
        boolean boolean26 = booking25.isCancelled();
        booking25.checkIn();
        java.time.LocalDateTime localDateTime28 = booking25.getCheckInTime();
        org.openjfx.EECS_3311_Project.model.Booking booking29 = new org.openjfx.EECS_3311_Project.model.Booking("fb0ea706-77b6-4282-b952-8013cf849ac4", "New Meeting", localDateTime20, localDateTime28);
        java.lang.String[] strArray37 = new java.lang.String[] { "New Meeting", "hi!", "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff", "48e65325-60ae-405e-a86f-48f78c4f6b56", "48e65325-60ae-405e-a86f-48f78c4f6b56", "bce87b8a-ced2-4072-9574-e7ba451cf76a", "New Meeting" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        booking29.setAttendeeIds((java.util.List<java.lang.String>) strList38);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = booking4.toCSVRow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.toString()\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "New Meeting", "hi!", "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff", "48e65325-60ae-405e-a86f-48f78c4f6b56", "48e65325-60ae-405e-a86f-48f78c4f6b56", "bce87b8a-ced2-4072-9574-e7ba451cf76a", "New Meeting" });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList13);
        booking4.setHostId("hi!");
        booking4.setName("New Meeting");
        booking4.setStudentOrOrganizationId("48e65325-60ae-405e-a86f-48f78c4f6b56");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole22 = null;
        java.time.Duration duration23 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double24 = booking4.calculateExtendPrice(accountRole22, duration23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.Duration.toHours()\" because \"extension\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        boolean boolean13 = booking4.isCancelled();
        java.lang.String str14 = booking4.getHostId();
        booking4.checkIn();
        java.lang.String str16 = booking4.getStudentOrOrganizationId();
        booking4.setCancelled(false);
        java.lang.String str19 = booking4.getId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
// flaky "8) test080(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "54497032-b00f-495c-b3e5-586651a6179c" + "'", str19, "54497032-b00f-495c-b3e5-586651a6179c");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        boolean boolean13 = booking4.isCancelled();
        java.lang.String str14 = booking4.getHostId();
        java.time.LocalDateTime localDateTime15 = booking4.getCheckInTime();
        java.util.List<java.lang.String> strList16 = booking4.getAttendeeIds();
        booking4.setRoomId("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        booking4.setHostId("dacbd1e4-b01b-4af2-a5e2-41702233ed46");
        boolean boolean21 = booking4.isCancelled();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole22 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double23 = booking4.calculateTotalPrice(accountRole22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList13);
        booking4.setHostId("hi!");
        booking4.setName("New Meeting");
        booking4.setStudentOrOrganizationId("48e65325-60ae-405e-a86f-48f78c4f6b56");
        booking4.setCancelled(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Booking booking1 = new org.openjfx.EECS_3311_Project.model.Booking("40e1ffec-196b-4a90-af80-8a4381451585");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.lang.String str8 = booking4.getStudentOrOrganizationId();
        java.time.LocalDateTime localDateTime9 = booking4.getEndTime();
        booking4.setRoomId("bce87b8a-ced2-4072-9574-e7ba451cf76a");
        boolean boolean12 = booking4.isCancelled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        java.lang.Boolean boolean13 = booking4.getIsCheckedIn();
        java.lang.String str14 = booking4.getName();
        java.lang.Boolean boolean15 = booking4.getIsCheckedIn();
        booking4.setRoomId("48e65325-60ae-405e-a86f-48f78c4f6b56");
        java.lang.String str18 = booking4.getHostId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "New Meeting" + "'", str14, "New Meeting");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.time.LocalDateTime localDateTime8 = null;
        booking4.setStartTime(localDateTime8);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking14 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime12, localDateTime13);
        java.lang.Boolean boolean15 = booking14.getIsCheckedIn();
        booking14.checkIn();
        java.time.LocalDateTime localDateTime17 = null;
        booking14.setCheckInTime(localDateTime17);
        booking14.setHostId("hi!");
        booking14.setRoomId("");
        boolean boolean23 = booking14.isCancelled();
        java.lang.String str24 = booking14.getHostId();
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking29 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime27, localDateTime28);
        boolean boolean30 = booking29.isCancelled();
        booking29.checkIn();
        java.time.LocalDateTime localDateTime32 = booking29.getCheckInTime();
        booking14.setStartTime(localDateTime32);
        booking4.setStartTime(localDateTime32);
        java.time.LocalDateTime localDateTime35 = booking4.getStartTime();
        booking4.setHostId("dacbd1e4-b01b-4af2-a5e2-41702233ed46");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime35);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        boolean boolean13 = booking4.isCancelled();
        java.lang.String str14 = booking4.getId();
        booking4.checkIn();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = booking4.calculateDepositPrice(accountRole16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "9) test087(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ccd6c693-6ee9-4204-9419-5feab19192c0" + "'", str14, "ccd6c693-6ee9-4204-9419-5feab19192c0");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.util.List<java.lang.String> strList8 = null;
        booking4.setAttendeeIds(strList8);
        booking4.setId("");
        boolean boolean12 = booking4.isCancelled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = booking4.getRoomId();
        java.lang.Boolean boolean17 = booking4.getIsCheckedIn();
        booking4.setRoomId("1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime2, localDateTime3);
        boolean boolean5 = booking4.isCancelled();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking11 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime9, localDateTime10);
        java.lang.String str12 = booking11.getRoomId();
        booking11.setRoomId("hi!");
        java.lang.String str15 = booking11.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList16 = booking11.getAttendeeIds();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking21 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime19, localDateTime20);
        java.lang.Boolean boolean22 = booking21.getIsCheckedIn();
        booking21.setRoomId("");
        java.time.LocalDateTime localDateTime25 = booking21.getEndTime();
        java.time.LocalDateTime localDateTime26 = booking21.getCheckInTime();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking31 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime29, localDateTime30);
        java.lang.Boolean boolean32 = booking31.getIsCheckedIn();
        booking31.checkIn();
        java.time.LocalDateTime localDateTime34 = null;
        booking31.setCheckInTime(localDateTime34);
        booking31.setHostId("hi!");
        booking31.setRoomId("");
        boolean boolean40 = booking31.isCancelled();
        java.lang.String str41 = booking31.getHostId();
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking46 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime44, localDateTime45);
        boolean boolean47 = booking46.isCancelled();
        booking46.checkIn();
        java.time.LocalDateTime localDateTime49 = booking46.getCheckInTime();
        booking31.setStartTime(localDateTime49);
        booking21.setStartTime(localDateTime49);
        booking11.setStartTime(localDateTime49);
        booking4.setCheckInTime(localDateTime49);
        java.time.LocalDateTime localDateTime56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking58 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime56, localDateTime57);
        java.lang.Boolean boolean59 = booking58.getIsCheckedIn();
        booking58.setRoomId("");
        java.time.LocalDateTime localDateTime62 = booking58.getEndTime();
        java.time.LocalDateTime localDateTime63 = booking58.getCheckInTime();
        java.time.LocalDateTime localDateTime66 = null;
        java.time.LocalDateTime localDateTime67 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking68 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime66, localDateTime67);
        java.lang.Boolean boolean69 = booking68.getIsCheckedIn();
        booking68.checkIn();
        java.time.LocalDateTime localDateTime71 = null;
        booking68.setCheckInTime(localDateTime71);
        booking68.setHostId("hi!");
        booking68.setRoomId("");
        boolean boolean77 = booking68.isCancelled();
        java.lang.String str78 = booking68.getHostId();
        java.time.LocalDateTime localDateTime81 = null;
        java.time.LocalDateTime localDateTime82 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking83 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime81, localDateTime82);
        boolean boolean84 = booking83.isCancelled();
        booking83.checkIn();
        java.time.LocalDateTime localDateTime86 = booking83.getCheckInTime();
        booking68.setStartTime(localDateTime86);
        booking58.setStartTime(localDateTime86);
        booking4.setEndTime(localDateTime86);
        booking4.setId("3af102af-2aea-4b76-86a1-eb2b8135446c");
        java.lang.Class<?> wildcardClass92 = booking4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(localDateTime62);
        org.junit.Assert.assertNull(localDateTime63);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(localDateTime86);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.lang.String str7 = booking4.getRoomId();
        java.time.LocalDateTime localDateTime8 = booking4.getEndTime();
        java.lang.String str9 = booking4.getStudentOrOrganizationId();
        booking4.setName("hi!");
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking16 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime14, localDateTime15);
        java.lang.String str17 = booking16.getRoomId();
        booking16.setStudentOrOrganizationId("fb0ea706-77b6-4282-b952-8013cf849ac4");
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking24 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime22, localDateTime23);
        java.lang.String str25 = booking24.getRoomId();
        booking24.setRoomId("hi!");
        java.lang.String str28 = booking24.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList29 = booking24.getAttendeeIds();
        booking16.setAttendeeIds(strList29);
        booking4.setAttendeeIds(strList29);
        java.lang.String str32 = booking4.getName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.lang.String str8 = booking4.getStudentOrOrganizationId();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking13 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime11, localDateTime12);
        java.lang.String str14 = booking13.getRoomId();
        booking13.setRoomId("hi!");
        java.util.List<java.lang.String> strList17 = null;
        booking13.setAttendeeIds(strList17);
        booking13.setId("");
        java.lang.Boolean boolean21 = booking13.getIsCheckedIn();
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking26 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime24, localDateTime25);
        java.lang.Boolean boolean27 = booking26.getIsCheckedIn();
        booking26.checkIn();
        java.time.LocalDateTime localDateTime29 = null;
        booking26.setCheckInTime(localDateTime29);
        booking26.setHostId("hi!");
        booking26.setRoomId("");
        boolean boolean35 = booking26.isCancelled();
        java.lang.String str36 = booking26.getHostId();
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking41 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime39, localDateTime40);
        boolean boolean42 = booking41.isCancelled();
        booking41.checkIn();
        java.time.LocalDateTime localDateTime44 = booking41.getCheckInTime();
        booking26.setStartTime(localDateTime44);
        booking13.setEndTime(localDateTime44);
        booking4.setEndTime(localDateTime44);
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking52 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime50, localDateTime51);
        java.lang.Boolean boolean53 = booking52.getIsCheckedIn();
        booking52.checkIn();
        java.time.LocalDateTime localDateTime57 = null;
        java.time.LocalDateTime localDateTime58 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking59 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime57, localDateTime58);
        java.lang.Boolean boolean60 = booking59.getIsCheckedIn();
        booking59.checkIn();
        java.time.LocalDateTime localDateTime62 = null;
        booking59.setCheckInTime(localDateTime62);
        booking59.setHostId("hi!");
        java.lang.String[] strArray67 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        booking59.setAttendeeIds((java.util.List<java.lang.String>) strList68);
        booking52.setAttendeeIds((java.util.List<java.lang.String>) strList68);
        java.time.LocalDateTime localDateTime76 = null;
        java.time.LocalDateTime localDateTime77 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking78 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime76, localDateTime77);
        boolean boolean79 = booking78.isCancelled();
        booking78.checkIn();
        java.time.LocalDateTime localDateTime81 = booking78.getCheckInTime();
        java.time.LocalDateTime localDateTime84 = null;
        java.time.LocalDateTime localDateTime85 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking86 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime84, localDateTime85);
        boolean boolean87 = booking86.isCancelled();
        booking86.checkIn();
        java.time.LocalDateTime localDateTime89 = booking86.getCheckInTime();
        org.openjfx.EECS_3311_Project.model.Booking booking90 = new org.openjfx.EECS_3311_Project.model.Booking("fb0ea706-77b6-4282-b952-8013cf849ac4", "New Meeting", localDateTime81, localDateTime89);
        booking52.setCheckInTime(localDateTime89);
        booking4.setStartTime(localDateTime89);
        booking4.setHostId("bce87b8a-ced2-4072-9574-e7ba451cf76a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(localDateTime81);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(localDateTime89);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setStudentOrOrganizationId("b6952f00-19ed-471e-a77c-5ac86038da89");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setName("hi!");
        java.time.LocalDateTime localDateTime13 = booking4.getStartTime();
        booking4.setId("2d328734-7239-456f-85a0-7f62b3b43caf");
        java.lang.Class<?> wildcardClass16 = booking4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList9);
        java.lang.String str12 = booking4.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.setHostId("bce87b8a-ced2-4072-9574-e7ba451cf76a");
        java.time.LocalDateTime localDateTime8 = booking4.getStartTime();
        booking4.setName("40e1ffec-196b-4a90-af80-8a4381451585");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = booking4.toCSVRow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.toString()\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.setRoomId("");
        booking4.setName("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        java.lang.String str10 = booking4.getId();
        booking4.setCancelled(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "10) test097(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2afae645-dce6-4037-92f8-4771d5058b06" + "'", str10, "2afae645-dce6-4037-92f8-4771d5058b06");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Booking booking1 = new org.openjfx.EECS_3311_Project.model.Booking("48e65325-60ae-405e-a86f-48f78c4f6b56");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime2, localDateTime3);
        boolean boolean5 = booking4.isCancelled();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking11 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime9, localDateTime10);
        java.lang.String str12 = booking11.getRoomId();
        booking11.setRoomId("hi!");
        java.lang.String str15 = booking11.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList16 = booking11.getAttendeeIds();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking21 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime19, localDateTime20);
        java.lang.Boolean boolean22 = booking21.getIsCheckedIn();
        booking21.setRoomId("");
        java.time.LocalDateTime localDateTime25 = booking21.getEndTime();
        java.time.LocalDateTime localDateTime26 = booking21.getCheckInTime();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking31 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime29, localDateTime30);
        java.lang.Boolean boolean32 = booking31.getIsCheckedIn();
        booking31.checkIn();
        java.time.LocalDateTime localDateTime34 = null;
        booking31.setCheckInTime(localDateTime34);
        booking31.setHostId("hi!");
        booking31.setRoomId("");
        boolean boolean40 = booking31.isCancelled();
        java.lang.String str41 = booking31.getHostId();
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking46 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime44, localDateTime45);
        boolean boolean47 = booking46.isCancelled();
        booking46.checkIn();
        java.time.LocalDateTime localDateTime49 = booking46.getCheckInTime();
        booking31.setStartTime(localDateTime49);
        booking21.setStartTime(localDateTime49);
        booking11.setStartTime(localDateTime49);
        booking4.setCheckInTime(localDateTime49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = booking4.toCSVRow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.toString()\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(localDateTime49);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "", localDateTime2, localDateTime3);
        booking4.setStudentOrOrganizationId("b6952f00-19ed-471e-a77c-5ac86038da89");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking13 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime11, localDateTime12);
        boolean boolean14 = booking13.isCancelled();
        booking13.checkIn();
        java.time.LocalDateTime localDateTime16 = booking13.getCheckInTime();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking21 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime19, localDateTime20);
        boolean boolean22 = booking21.isCancelled();
        booking21.checkIn();
        java.time.LocalDateTime localDateTime24 = booking21.getCheckInTime();
        org.openjfx.EECS_3311_Project.model.Booking booking25 = new org.openjfx.EECS_3311_Project.model.Booking("fb0ea706-77b6-4282-b952-8013cf849ac4", "New Meeting", localDateTime16, localDateTime24);
        booking4.setStartTime(localDateTime16);
        booking4.setRoomId("hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        java.lang.Boolean boolean13 = booking4.getIsCheckedIn();
        java.lang.String str14 = booking4.getName();
        java.lang.Boolean boolean15 = booking4.getIsCheckedIn();
        booking4.setRoomId("48e65325-60ae-405e-a86f-48f78c4f6b56");
        booking4.setIsCheckedIn((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "New Meeting" + "'", str14, "New Meeting");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.setRoomId("");
        booking4.setHostId("b6952f00-19ed-471e-a77c-5ac86038da89");
        booking4.setCancelled(false);
        boolean boolean12 = booking4.isCancelled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setStudentOrOrganizationId("fb0ea706-77b6-4282-b952-8013cf849ac4");
        booking4.setCancelled(true);
        java.lang.Boolean boolean10 = booking4.getIsCheckedIn();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        boolean boolean5 = booking4.isCancelled();
        booking4.setName("");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking12 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime10, localDateTime11);
        java.lang.Boolean boolean13 = booking12.getIsCheckedIn();
        booking12.checkIn();
        java.time.LocalDateTime localDateTime15 = null;
        booking12.setCheckInTime(localDateTime15);
        booking12.setHostId("hi!");
        booking12.setRoomId("");
        boolean boolean21 = booking12.isCancelled();
        java.lang.String str22 = booking12.getHostId();
        java.time.LocalDateTime localDateTime23 = booking12.getCheckInTime();
        java.util.List<java.lang.String> strList24 = booking12.getAttendeeIds();
        booking4.setAttendeeIds(strList24);
        java.lang.String str26 = booking4.getStudentOrOrganizationId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.lang.String str7 = booking4.getRoomId();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime9 = booking4.getCheckInTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = booking4.toCSVRow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.toString()\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getId();
        boolean boolean6 = booking4.isCancelled();
        java.lang.String str7 = booking4.getStudentOrOrganizationId();
// flaky "11) test106(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d825b773-526a-44bb-aee8-0e23c712ebce" + "'", str5, "d825b773-526a-44bb-aee8-0e23c712ebce");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.setHostId("bce87b8a-ced2-4072-9574-e7ba451cf76a");
        java.time.LocalDateTime localDateTime8 = booking4.getStartTime();
        booking4.setName("40e1ffec-196b-4a90-af80-8a4381451585");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking17 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime15, localDateTime16);
        java.lang.String str18 = booking17.getRoomId();
        booking17.setRoomId("hi!");
        java.lang.String str21 = booking17.getStudentOrOrganizationId();
        booking17.setId("bce87b8a-ced2-4072-9574-e7ba451cf76a");
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking30 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime28, localDateTime29);
        boolean boolean31 = booking30.isCancelled();
        booking30.checkIn();
        java.time.LocalDateTime localDateTime33 = booking30.getCheckInTime();
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking38 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime36, localDateTime37);
        boolean boolean39 = booking38.isCancelled();
        booking38.checkIn();
        java.time.LocalDateTime localDateTime41 = booking38.getCheckInTime();
        org.openjfx.EECS_3311_Project.model.Booking booking42 = new org.openjfx.EECS_3311_Project.model.Booking("fb0ea706-77b6-4282-b952-8013cf849ac4", "New Meeting", localDateTime33, localDateTime41);
        booking17.setCheckInTime(localDateTime33);
        java.time.LocalDateTime localDateTime44 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking45 = new org.openjfx.EECS_3311_Project.model.Booking("bce87b8a-ced2-4072-9574-e7ba451cf76a", "New Meeting", localDateTime33, localDateTime44);
        booking4.setCheckInTime(localDateTime33);
        java.time.LocalDateTime localDateTime47 = booking4.getCheckInTime();
        booking4.setHostId("1769c7fb-fb90-48af-99cd-b3e5c45c90cb");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime47);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.time.LocalDateTime localDateTime8 = null;
        booking4.setStartTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = booking4.getEndTime();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = booking4.calculateDepositPrice(accountRole11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList13);
        java.lang.Boolean boolean16 = booking4.getIsCheckedIn();
        java.time.LocalDateTime localDateTime17 = booking4.getEndTime();
        booking4.setCancelled(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = booking4.toCSVRow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.toString()\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = booking4.getRoomId();
        java.lang.String[] strArray19 = new java.lang.String[] { "fb0ea706-77b6-4282-b952-8013cf849ac4", "40e1ffec-196b-4a90-af80-8a4381451585" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList20);
        java.time.LocalDateTime localDateTime23 = booking4.getStartTime();
        booking4.setStudentOrOrganizationId("d825b773-526a-44bb-aee8-0e23c712ebce");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "fb0ea706-77b6-4282-b952-8013cf849ac4", "40e1ffec-196b-4a90-af80-8a4381451585" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Booking booking1 = new org.openjfx.EECS_3311_Project.model.Booking("3af102af-2aea-4b76-86a1-eb2b8135446c");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        boolean boolean13 = booking4.isCancelled();
        java.lang.String str14 = booking4.getHostId();
        java.time.LocalDateTime localDateTime15 = booking4.getCheckInTime();
        java.util.List<java.lang.String> strList16 = booking4.getAttendeeIds();
        booking4.setRoomId("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        booking4.setIsCheckedIn((java.lang.Boolean) false);
        booking4.checkIn();
        java.time.LocalDateTime localDateTime22 = booking4.getStartTime();
        java.lang.String str23 = booking4.getRoomId();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole24 = null;
        java.time.Duration duration25 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double26 = booking4.calculateExtendPrice(accountRole24, duration25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.Duration.toHours()\" because \"extension\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "7bdec8d4-a361-4af8-b39d-e7334e644fd8" + "'", str23, "7bdec8d4-a361-4af8-b39d-e7334e644fd8");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking6 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime4, localDateTime5);
        boolean boolean7 = booking6.isCancelled();
        booking6.checkIn();
        java.time.LocalDateTime localDateTime9 = booking6.getCheckInTime();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking14 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime12, localDateTime13);
        boolean boolean15 = booking14.isCancelled();
        booking14.checkIn();
        java.time.LocalDateTime localDateTime17 = booking14.getCheckInTime();
        org.openjfx.EECS_3311_Project.model.Booking booking18 = new org.openjfx.EECS_3311_Project.model.Booking("fb0ea706-77b6-4282-b952-8013cf849ac4", "New Meeting", localDateTime9, localDateTime17);
        booking18.setName("b6952f00-19ed-471e-a77c-5ac86038da89");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.setRoomId("");
        booking4.setHostId("b6952f00-19ed-471e-a77c-5ac86038da89");
        java.lang.String str10 = booking4.getName();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking15 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime13, localDateTime14);
        java.lang.String str16 = booking15.getRoomId();
        booking15.setRoomId("hi!");
        java.lang.String str19 = booking15.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList20 = booking15.getAttendeeIds();
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking25 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime23, localDateTime24);
        java.lang.Boolean boolean26 = booking25.getIsCheckedIn();
        booking25.setRoomId("");
        java.time.LocalDateTime localDateTime29 = booking25.getEndTime();
        java.time.LocalDateTime localDateTime30 = booking25.getCheckInTime();
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking35 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime33, localDateTime34);
        java.lang.Boolean boolean36 = booking35.getIsCheckedIn();
        booking35.checkIn();
        java.time.LocalDateTime localDateTime38 = null;
        booking35.setCheckInTime(localDateTime38);
        booking35.setHostId("hi!");
        booking35.setRoomId("");
        boolean boolean44 = booking35.isCancelled();
        java.lang.String str45 = booking35.getHostId();
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking50 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime48, localDateTime49);
        boolean boolean51 = booking50.isCancelled();
        booking50.checkIn();
        java.time.LocalDateTime localDateTime53 = booking50.getCheckInTime();
        booking35.setStartTime(localDateTime53);
        booking25.setStartTime(localDateTime53);
        booking15.setStartTime(localDateTime53);
        booking4.setEndTime(localDateTime53);
        java.lang.String str58 = booking4.getStudentOrOrganizationId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "New Meeting" + "'", str10, "New Meeting");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(localDateTime29);
        org.junit.Assert.assertNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getId();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = booking4.getEndTime();
        java.lang.Boolean boolean8 = booking4.getIsCheckedIn();
// flaky "12) test115(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "56fa2f01-8357-4ce2-845e-238c9ebd1f20" + "'", str5, "56fa2f01-8357-4ce2-845e-238c9ebd1f20");
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        boolean boolean13 = booking4.isCancelled();
        java.lang.String str14 = booking4.getHostId();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking22 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime20, localDateTime21);
        boolean boolean23 = booking22.isCancelled();
        booking22.checkIn();
        java.time.LocalDateTime localDateTime25 = booking22.getCheckInTime();
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking30 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime28, localDateTime29);
        boolean boolean31 = booking30.isCancelled();
        booking30.checkIn();
        java.time.LocalDateTime localDateTime33 = booking30.getCheckInTime();
        org.openjfx.EECS_3311_Project.model.Booking booking34 = new org.openjfx.EECS_3311_Project.model.Booking("fb0ea706-77b6-4282-b952-8013cf849ac4", "New Meeting", localDateTime25, localDateTime33);
        booking4.setEndTime(localDateTime25);
        boolean boolean36 = booking4.isCancelled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        boolean boolean5 = booking4.isCancelled();
        booking4.setName("");
        java.lang.String str8 = booking4.getId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "13) test117(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10c414e9-8a74-4e57-8912-e979f7226ad9" + "'", str8, "10c414e9-8a74-4e57-8912-e979f7226ad9");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking6 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime4, localDateTime5);
        boolean boolean7 = booking6.isCancelled();
        booking6.checkIn();
        java.time.LocalDateTime localDateTime9 = booking6.getCheckInTime();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking14 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime12, localDateTime13);
        boolean boolean15 = booking14.isCancelled();
        booking14.checkIn();
        java.time.LocalDateTime localDateTime17 = booking14.getCheckInTime();
        org.openjfx.EECS_3311_Project.model.Booking booking18 = new org.openjfx.EECS_3311_Project.model.Booking("fb0ea706-77b6-4282-b952-8013cf849ac4", "New Meeting", localDateTime9, localDateTime17);
        java.lang.String[] strArray26 = new java.lang.String[] { "New Meeting", "hi!", "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff", "48e65325-60ae-405e-a86f-48f78c4f6b56", "48e65325-60ae-405e-a86f-48f78c4f6b56", "bce87b8a-ced2-4072-9574-e7ba451cf76a", "New Meeting" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        booking18.setAttendeeIds((java.util.List<java.lang.String>) strList27);
        booking18.checkIn();
        booking18.checkIn();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "New Meeting", "hi!", "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff", "48e65325-60ae-405e-a86f-48f78c4f6b56", "48e65325-60ae-405e-a86f-48f78c4f6b56", "bce87b8a-ced2-4072-9574-e7ba451cf76a", "New Meeting" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime2, localDateTime3);
        boolean boolean5 = booking4.isCancelled();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking11 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime9, localDateTime10);
        java.lang.String str12 = booking11.getRoomId();
        booking11.setRoomId("hi!");
        java.lang.String str15 = booking11.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList16 = booking11.getAttendeeIds();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking21 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime19, localDateTime20);
        java.lang.Boolean boolean22 = booking21.getIsCheckedIn();
        booking21.setRoomId("");
        java.time.LocalDateTime localDateTime25 = booking21.getEndTime();
        java.time.LocalDateTime localDateTime26 = booking21.getCheckInTime();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking31 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime29, localDateTime30);
        java.lang.Boolean boolean32 = booking31.getIsCheckedIn();
        booking31.checkIn();
        java.time.LocalDateTime localDateTime34 = null;
        booking31.setCheckInTime(localDateTime34);
        booking31.setHostId("hi!");
        booking31.setRoomId("");
        boolean boolean40 = booking31.isCancelled();
        java.lang.String str41 = booking31.getHostId();
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking46 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime44, localDateTime45);
        boolean boolean47 = booking46.isCancelled();
        booking46.checkIn();
        java.time.LocalDateTime localDateTime49 = booking46.getCheckInTime();
        booking31.setStartTime(localDateTime49);
        booking21.setStartTime(localDateTime49);
        booking11.setStartTime(localDateTime49);
        booking4.setCheckInTime(localDateTime49);
        booking4.setIsCheckedIn((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(localDateTime49);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.lang.String str8 = booking4.getStudentOrOrganizationId();
        java.time.LocalDateTime localDateTime9 = booking4.getEndTime();
        booking4.setRoomId("bce87b8a-ced2-4072-9574-e7ba451cf76a");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = booking4.calculateDepositPrice(accountRole12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.time.LocalDateTime localDateTime8 = null;
        booking4.setStartTime(localDateTime8);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking14 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime12, localDateTime13);
        java.lang.Boolean boolean15 = booking14.getIsCheckedIn();
        booking14.checkIn();
        java.time.LocalDateTime localDateTime17 = null;
        booking14.setCheckInTime(localDateTime17);
        booking14.setHostId("hi!");
        booking14.setRoomId("");
        boolean boolean23 = booking14.isCancelled();
        java.lang.String str24 = booking14.getHostId();
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking29 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime27, localDateTime28);
        boolean boolean30 = booking29.isCancelled();
        booking29.checkIn();
        java.time.LocalDateTime localDateTime32 = booking29.getCheckInTime();
        booking14.setStartTime(localDateTime32);
        booking4.setStartTime(localDateTime32);
        java.time.LocalDateTime localDateTime35 = booking4.getStartTime();
        booking4.setHostId("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime35);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = booking4.getEndTime();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = booking4.calculateTotalPrice(accountRole10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        boolean boolean13 = booking4.isCancelled();
        java.lang.String str14 = booking4.getHostId();
        java.time.LocalDateTime localDateTime15 = booking4.getCheckInTime();
        java.util.List<java.lang.String> strList16 = booking4.getAttendeeIds();
        booking4.setRoomId("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        java.lang.String str19 = booking4.getStudentOrOrganizationId();
        boolean boolean20 = booking4.isCancelled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking11 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime9, localDateTime10);
        java.lang.Boolean boolean12 = booking11.getIsCheckedIn();
        booking11.checkIn();
        java.time.LocalDateTime localDateTime14 = null;
        booking11.setCheckInTime(localDateTime14);
        booking11.setHostId("hi!");
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        booking11.setAttendeeIds((java.util.List<java.lang.String>) strList20);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList20);
        java.time.LocalDateTime localDateTime24 = booking4.getEndTime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(localDateTime24);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = booking4.getRoomId();
        booking4.setIsCheckedIn((java.lang.Boolean) true);
        booking4.setRoomId("New Meeting");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole21 = null;
        java.time.Duration duration22 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double23 = booking4.calculateExtendPrice(accountRole21, duration22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.Duration.toHours()\" because \"extension\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.setRoomId("");
        java.time.LocalDateTime localDateTime8 = booking4.getEndTime();
        java.time.LocalDateTime localDateTime9 = booking4.getCheckInTime();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking14 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime12, localDateTime13);
        java.lang.Boolean boolean15 = booking14.getIsCheckedIn();
        booking14.checkIn();
        java.time.LocalDateTime localDateTime17 = null;
        booking14.setCheckInTime(localDateTime17);
        booking14.setHostId("hi!");
        booking14.setRoomId("");
        boolean boolean23 = booking14.isCancelled();
        java.lang.String str24 = booking14.getHostId();
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking29 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime27, localDateTime28);
        boolean boolean30 = booking29.isCancelled();
        booking29.checkIn();
        java.time.LocalDateTime localDateTime32 = booking29.getCheckInTime();
        booking14.setStartTime(localDateTime32);
        booking4.setStartTime(localDateTime32);
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole35 = null;
        java.time.Duration duration36 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double37 = booking4.calculateExtendPrice(accountRole35, duration36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.Duration.toHours()\" because \"extension\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localDateTime32);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setStudentOrOrganizationId("fb0ea706-77b6-4282-b952-8013cf849ac4");
        booking4.setHostId("48e65325-60ae-405e-a86f-48f78c4f6b56");
        booking4.setIsCheckedIn((java.lang.Boolean) true);
        java.time.LocalDateTime localDateTime12 = booking4.getCheckInTime();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.util.List<java.lang.String> strList8 = null;
        booking4.setAttendeeIds(strList8);
        booking4.setIsCheckedIn((java.lang.Boolean) false);
        java.lang.Boolean boolean12 = booking4.getIsCheckedIn();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.setRoomId("");
        booking4.setName("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        booking4.setHostId("fb0ea706-77b6-4282-b952-8013cf849ac4");
        booking4.setRoomId("dacbd1e4-b01b-4af2-a5e2-41702233ed46");
        java.lang.String str14 = booking4.getName();
        java.lang.Class<?> wildcardClass15 = booking4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "7bdec8d4-a361-4af8-b39d-e7334e644fd8" + "'", str14, "7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.time.LocalDateTime localDateTime8 = null;
        booking4.setStartTime(localDateTime8);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking14 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime12, localDateTime13);
        java.lang.Boolean boolean15 = booking14.getIsCheckedIn();
        booking14.checkIn();
        java.time.LocalDateTime localDateTime17 = null;
        booking14.setCheckInTime(localDateTime17);
        booking14.setHostId("hi!");
        booking14.setRoomId("");
        boolean boolean23 = booking14.isCancelled();
        java.lang.String str24 = booking14.getHostId();
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking29 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime27, localDateTime28);
        boolean boolean30 = booking29.isCancelled();
        booking29.checkIn();
        java.time.LocalDateTime localDateTime32 = booking29.getCheckInTime();
        booking14.setStartTime(localDateTime32);
        booking4.setStartTime(localDateTime32);
        java.lang.Boolean boolean35 = booking4.getIsCheckedIn();
        booking4.setCancelled(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.lang.String str8 = booking4.getStudentOrOrganizationId();
        booking4.setId("bce87b8a-ced2-4072-9574-e7ba451cf76a");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking17 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime15, localDateTime16);
        boolean boolean18 = booking17.isCancelled();
        booking17.checkIn();
        java.time.LocalDateTime localDateTime20 = booking17.getCheckInTime();
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking25 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime23, localDateTime24);
        boolean boolean26 = booking25.isCancelled();
        booking25.checkIn();
        java.time.LocalDateTime localDateTime28 = booking25.getCheckInTime();
        org.openjfx.EECS_3311_Project.model.Booking booking29 = new org.openjfx.EECS_3311_Project.model.Booking("fb0ea706-77b6-4282-b952-8013cf849ac4", "New Meeting", localDateTime20, localDateTime28);
        java.lang.String[] strArray37 = new java.lang.String[] { "New Meeting", "hi!", "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff", "48e65325-60ae-405e-a86f-48f78c4f6b56", "48e65325-60ae-405e-a86f-48f78c4f6b56", "bce87b8a-ced2-4072-9574-e7ba451cf76a", "New Meeting" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        booking29.setAttendeeIds((java.util.List<java.lang.String>) strList38);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList38);
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking46 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime44, localDateTime45);
        boolean boolean47 = booking46.isCancelled();
        booking46.checkIn();
        java.time.LocalDateTime localDateTime51 = null;
        java.time.LocalDateTime localDateTime52 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking53 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime51, localDateTime52);
        java.lang.String str54 = booking53.getRoomId();
        booking53.setRoomId("hi!");
        java.lang.String str57 = booking53.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList58 = booking53.getAttendeeIds();
        java.time.LocalDateTime localDateTime61 = null;
        java.time.LocalDateTime localDateTime62 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking63 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime61, localDateTime62);
        java.lang.Boolean boolean64 = booking63.getIsCheckedIn();
        booking63.setRoomId("");
        java.time.LocalDateTime localDateTime67 = booking63.getEndTime();
        java.time.LocalDateTime localDateTime68 = booking63.getCheckInTime();
        java.time.LocalDateTime localDateTime71 = null;
        java.time.LocalDateTime localDateTime72 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking73 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime71, localDateTime72);
        java.lang.Boolean boolean74 = booking73.getIsCheckedIn();
        booking73.checkIn();
        java.time.LocalDateTime localDateTime76 = null;
        booking73.setCheckInTime(localDateTime76);
        booking73.setHostId("hi!");
        booking73.setRoomId("");
        boolean boolean82 = booking73.isCancelled();
        java.lang.String str83 = booking73.getHostId();
        java.time.LocalDateTime localDateTime86 = null;
        java.time.LocalDateTime localDateTime87 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking88 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime86, localDateTime87);
        boolean boolean89 = booking88.isCancelled();
        booking88.checkIn();
        java.time.LocalDateTime localDateTime91 = booking88.getCheckInTime();
        booking73.setStartTime(localDateTime91);
        booking63.setStartTime(localDateTime91);
        booking53.setStartTime(localDateTime91);
        booking46.setCheckInTime(localDateTime91);
        java.time.LocalDateTime localDateTime96 = booking46.getCheckInTime();
        booking4.setStartTime(localDateTime96);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "New Meeting", "hi!", "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff", "48e65325-60ae-405e-a86f-48f78c4f6b56", "48e65325-60ae-405e-a86f-48f78c4f6b56", "bce87b8a-ced2-4072-9574-e7ba451cf76a", "New Meeting" });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(localDateTime67);
        org.junit.Assert.assertNull(localDateTime68);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(localDateTime91);
        org.junit.Assert.assertNotNull(localDateTime96);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setHostId("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        booking4.setStudentOrOrganizationId("b6952f00-19ed-471e-a77c-5ac86038da89");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.setHostId("bce87b8a-ced2-4072-9574-e7ba451cf76a");
        java.time.LocalDateTime localDateTime8 = booking4.getStartTime();
        booking4.setName("40e1ffec-196b-4a90-af80-8a4381451585");
        boolean boolean11 = booking4.isCancelled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        boolean boolean13 = booking4.isCancelled();
        java.lang.String str14 = booking4.getHostId();
        java.time.LocalDateTime localDateTime15 = booking4.getCheckInTime();
        java.util.List<java.lang.String> strList16 = booking4.getAttendeeIds();
        booking4.setRoomId("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        booking4.setIsCheckedIn((java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass21 = booking4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.util.List<java.lang.String> strList8 = booking4.getAttendeeIds();
        booking4.setHostId("5ac1f678-3e49-4f90-9760-5884d8e09d2e");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = booking4.getEndTime();
        booking4.setIsCheckedIn((java.lang.Boolean) false);
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking16 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime14, localDateTime15);
        java.lang.String str17 = booking16.getRoomId();
        booking16.setRoomId("hi!");
        java.lang.String str20 = booking16.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList21 = booking16.getAttendeeIds();
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking26 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime24, localDateTime25);
        java.lang.Boolean boolean27 = booking26.getIsCheckedIn();
        booking26.setRoomId("");
        java.time.LocalDateTime localDateTime30 = booking26.getEndTime();
        java.time.LocalDateTime localDateTime31 = booking26.getCheckInTime();
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking36 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime34, localDateTime35);
        java.lang.Boolean boolean37 = booking36.getIsCheckedIn();
        booking36.checkIn();
        java.time.LocalDateTime localDateTime39 = null;
        booking36.setCheckInTime(localDateTime39);
        booking36.setHostId("hi!");
        booking36.setRoomId("");
        boolean boolean45 = booking36.isCancelled();
        java.lang.String str46 = booking36.getHostId();
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking51 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime49, localDateTime50);
        boolean boolean52 = booking51.isCancelled();
        booking51.checkIn();
        java.time.LocalDateTime localDateTime54 = booking51.getCheckInTime();
        booking36.setStartTime(localDateTime54);
        booking26.setStartTime(localDateTime54);
        booking16.setStartTime(localDateTime54);
        booking4.setEndTime(localDateTime54);
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole59 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double60 = booking4.calculateDepositPrice(accountRole59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(localDateTime30);
        org.junit.Assert.assertNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(localDateTime54);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.setRoomId("");
        java.time.LocalDateTime localDateTime8 = booking4.getEndTime();
        java.time.LocalDateTime localDateTime9 = booking4.getCheckInTime();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking14 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime12, localDateTime13);
        java.lang.Boolean boolean15 = booking14.getIsCheckedIn();
        booking14.checkIn();
        java.time.LocalDateTime localDateTime17 = null;
        booking14.setCheckInTime(localDateTime17);
        booking14.setHostId("hi!");
        booking14.setRoomId("");
        boolean boolean23 = booking14.isCancelled();
        java.lang.String str24 = booking14.getHostId();
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking29 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime27, localDateTime28);
        boolean boolean30 = booking29.isCancelled();
        booking29.checkIn();
        java.time.LocalDateTime localDateTime32 = booking29.getCheckInTime();
        booking14.setStartTime(localDateTime32);
        booking4.setStartTime(localDateTime32);
        booking4.setHostId("2d328734-7239-456f-85a0-7f62b3b43caf");
        java.lang.Boolean boolean37 = booking4.getIsCheckedIn();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList13);
        booking4.setHostId("hi!");
        booking4.setName("New Meeting");
        booking4.setStudentOrOrganizationId("48e65325-60ae-405e-a86f-48f78c4f6b56");
        java.lang.String str22 = booking4.getId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky "14) test138(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "b0278128-bf90-4999-ba78-593a61e1d319" + "'", str22, "b0278128-bf90-4999-ba78-593a61e1d319");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Booking booking1 = new org.openjfx.EECS_3311_Project.model.Booking("2afae645-dce6-4037-92f8-4771d5058b06");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        boolean boolean13 = booking4.isCancelled();
        java.lang.String str14 = booking4.getHostId();
        java.time.LocalDateTime localDateTime15 = booking4.getCheckInTime();
        java.util.List<java.lang.String> strList16 = booking4.getAttendeeIds();
        booking4.setRoomId("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        booking4.setHostId("dacbd1e4-b01b-4af2-a5e2-41702233ed46");
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking25 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime23, localDateTime24);
        java.lang.Boolean boolean26 = booking25.getIsCheckedIn();
        booking25.checkIn();
        java.lang.String str28 = booking25.getRoomId();
        java.time.LocalDateTime localDateTime29 = booking25.getEndTime();
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking34 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime32, localDateTime33);
        boolean boolean35 = booking34.isCancelled();
        booking34.checkIn();
        java.time.LocalDateTime localDateTime37 = booking34.getCheckInTime();
        booking25.setEndTime(localDateTime37);
        booking4.setEndTime(localDateTime37);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(localDateTime37);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking6 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime4, localDateTime5);
        java.lang.String str7 = booking6.getRoomId();
        booking6.setRoomId("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        booking6.setStartTime(localDateTime10);
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking16 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime14, localDateTime15);
        java.lang.Boolean boolean17 = booking16.getIsCheckedIn();
        booking16.checkIn();
        java.time.LocalDateTime localDateTime19 = null;
        booking16.setCheckInTime(localDateTime19);
        booking16.setHostId("hi!");
        booking16.setRoomId("");
        boolean boolean25 = booking16.isCancelled();
        java.lang.String str26 = booking16.getHostId();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking31 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime29, localDateTime30);
        boolean boolean32 = booking31.isCancelled();
        booking31.checkIn();
        java.time.LocalDateTime localDateTime34 = booking31.getCheckInTime();
        booking16.setStartTime(localDateTime34);
        booking6.setStartTime(localDateTime34);
        java.time.LocalDateTime localDateTime37 = booking6.getStartTime();
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking42 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime40, localDateTime41);
        java.lang.Boolean boolean43 = booking42.getIsCheckedIn();
        booking42.checkIn();
        java.lang.String str45 = booking42.getRoomId();
        booking42.checkIn();
        java.time.LocalDateTime localDateTime47 = booking42.getCheckInTime();
        org.openjfx.EECS_3311_Project.model.Booking booking48 = new org.openjfx.EECS_3311_Project.model.Booking("fb0ea706-77b6-4282-b952-8013cf849ac4", "bce87b8a-ced2-4072-9574-e7ba451cf76a", localDateTime37, localDateTime47);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(localDateTime47);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.util.List<java.lang.String> strList8 = null;
        booking4.setAttendeeIds(strList8);
        booking4.setIsCheckedIn((java.lang.Boolean) false);
        booking4.setStudentOrOrganizationId("dacbd1e4-b01b-4af2-a5e2-41702233ed46");
        java.lang.Class<?> wildcardClass14 = booking4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("bce87b8a-ced2-4072-9574-e7ba451cf76a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = booking4.getEndTime();
        booking4.setId("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        boolean boolean13 = booking4.isCancelled();
        java.lang.String str14 = booking4.getHostId();
        java.time.LocalDateTime localDateTime15 = booking4.getCheckInTime();
        java.util.List<java.lang.String> strList16 = booking4.getAttendeeIds();
        booking4.setRoomId("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        booking4.setIsCheckedIn((java.lang.Boolean) true);
        java.lang.String str21 = booking4.getName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "New Meeting" + "'", str21, "New Meeting");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking6 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime4, localDateTime5);
        boolean boolean7 = booking6.isCancelled();
        booking6.checkIn();
        java.time.LocalDateTime localDateTime9 = booking6.getCheckInTime();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking14 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime12, localDateTime13);
        boolean boolean15 = booking14.isCancelled();
        booking14.checkIn();
        java.time.LocalDateTime localDateTime17 = booking14.getCheckInTime();
        org.openjfx.EECS_3311_Project.model.Booking booking18 = new org.openjfx.EECS_3311_Project.model.Booking("fb0ea706-77b6-4282-b952-8013cf849ac4", "New Meeting", localDateTime9, localDateTime17);
        java.lang.String[] strArray26 = new java.lang.String[] { "New Meeting", "hi!", "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff", "48e65325-60ae-405e-a86f-48f78c4f6b56", "48e65325-60ae-405e-a86f-48f78c4f6b56", "bce87b8a-ced2-4072-9574-e7ba451cf76a", "New Meeting" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        booking18.setAttendeeIds((java.util.List<java.lang.String>) strList27);
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole30 = null;
        java.time.Duration duration31 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double32 = booking18.calculateExtendPrice(accountRole30, duration31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.Duration.toHours()\" because \"extension\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "New Meeting", "hi!", "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff", "48e65325-60ae-405e-a86f-48f78c4f6b56", "48e65325-60ae-405e-a86f-48f78c4f6b56", "bce87b8a-ced2-4072-9574-e7ba451cf76a", "New Meeting" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.util.List<java.lang.String> strList8 = null;
        booking4.setAttendeeIds(strList8);
        booking4.setId("");
        java.lang.Boolean boolean12 = booking4.getIsCheckedIn();
        booking4.setIsCheckedIn((java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = booking4.getRoomId();
        java.lang.String[] strArray19 = new java.lang.String[] { "fb0ea706-77b6-4282-b952-8013cf849ac4", "40e1ffec-196b-4a90-af80-8a4381451585" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList20);
        java.time.LocalDateTime localDateTime23 = booking4.getStartTime();
        java.time.LocalDateTime localDateTime24 = booking4.getEndTime();
        booking4.setName("");
        java.time.LocalDateTime localDateTime27 = booking4.getStartTime();
        boolean boolean28 = booking4.isCancelled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "fb0ea706-77b6-4282-b952-8013cf849ac4", "40e1ffec-196b-4a90-af80-8a4381451585" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = booking4.getRoomId();
        java.lang.String[] strArray19 = new java.lang.String[] { "fb0ea706-77b6-4282-b952-8013cf849ac4", "40e1ffec-196b-4a90-af80-8a4381451585" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList20);
        java.time.LocalDateTime localDateTime23 = booking4.getStartTime();
        booking4.setCancelled(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "fb0ea706-77b6-4282-b952-8013cf849ac4", "40e1ffec-196b-4a90-af80-8a4381451585" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime2, localDateTime3);
        boolean boolean5 = booking4.isCancelled();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = booking4.getCheckInTime();
        java.lang.String str8 = booking4.getHostId();
        booking4.setHostId("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        booking4.setHostId("f7bf3244-6207-4ece-8a29-6d9134c107bd");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.util.List<java.lang.String> strList8 = null;
        booking4.setAttendeeIds(strList8);
        booking4.setId("");
        java.util.List<java.lang.String> strList12 = booking4.getAttendeeIds();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking17 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime15, localDateTime16);
        java.lang.Boolean boolean18 = booking17.getIsCheckedIn();
        booking17.setRoomId("");
        booking17.setHostId("b6952f00-19ed-471e-a77c-5ac86038da89");
        java.lang.String str23 = booking17.getName();
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking28 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime26, localDateTime27);
        java.lang.String str29 = booking28.getRoomId();
        booking28.setRoomId("hi!");
        java.lang.String str32 = booking28.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList33 = booking28.getAttendeeIds();
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking38 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime36, localDateTime37);
        java.lang.Boolean boolean39 = booking38.getIsCheckedIn();
        booking38.setRoomId("");
        java.time.LocalDateTime localDateTime42 = booking38.getEndTime();
        java.time.LocalDateTime localDateTime43 = booking38.getCheckInTime();
        java.time.LocalDateTime localDateTime46 = null;
        java.time.LocalDateTime localDateTime47 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking48 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime46, localDateTime47);
        java.lang.Boolean boolean49 = booking48.getIsCheckedIn();
        booking48.checkIn();
        java.time.LocalDateTime localDateTime51 = null;
        booking48.setCheckInTime(localDateTime51);
        booking48.setHostId("hi!");
        booking48.setRoomId("");
        boolean boolean57 = booking48.isCancelled();
        java.lang.String str58 = booking48.getHostId();
        java.time.LocalDateTime localDateTime61 = null;
        java.time.LocalDateTime localDateTime62 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking63 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime61, localDateTime62);
        boolean boolean64 = booking63.isCancelled();
        booking63.checkIn();
        java.time.LocalDateTime localDateTime66 = booking63.getCheckInTime();
        booking48.setStartTime(localDateTime66);
        booking38.setStartTime(localDateTime66);
        booking28.setStartTime(localDateTime66);
        booking17.setEndTime(localDateTime66);
        java.time.LocalDateTime localDateTime73 = null;
        java.time.LocalDateTime localDateTime74 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking75 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime73, localDateTime74);
        java.lang.Boolean boolean76 = booking75.getIsCheckedIn();
        booking75.checkIn();
        java.lang.String str78 = booking75.getRoomId();
        java.time.LocalDateTime localDateTime79 = booking75.getEndTime();
        java.time.LocalDateTime localDateTime82 = null;
        java.time.LocalDateTime localDateTime83 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking84 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime82, localDateTime83);
        boolean boolean85 = booking84.isCancelled();
        booking84.checkIn();
        java.time.LocalDateTime localDateTime87 = booking84.getCheckInTime();
        booking75.setEndTime(localDateTime87);
        booking17.setCheckInTime(localDateTime87);
        booking4.setStartTime(localDateTime87);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "New Meeting" + "'", str23, "New Meeting");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(localDateTime42);
        org.junit.Assert.assertNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertNull(localDateTime79);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(localDateTime87);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime2, localDateTime3);
        boolean boolean5 = booking4.isCancelled();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = booking4.getCheckInTime();
        booking4.setName("fb0ea706-77b6-4282-b952-8013cf849ac4");
        booking4.setName("");
        java.time.LocalDateTime localDateTime12 = booking4.getCheckInTime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        boolean boolean13 = booking4.isCancelled();
        java.lang.String str14 = booking4.getHostId();
        java.lang.Boolean boolean15 = booking4.getIsCheckedIn();
        booking4.setHostId("40e1ffec-196b-4a90-af80-8a4381451585");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setName("hi!");
        java.time.LocalDateTime localDateTime13 = booking4.getStartTime();
        java.time.LocalDateTime localDateTime14 = booking4.getCheckInTime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "", localDateTime2, localDateTime3);
        booking4.setStudentOrOrganizationId("b6952f00-19ed-471e-a77c-5ac86038da89");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking13 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime11, localDateTime12);
        boolean boolean14 = booking13.isCancelled();
        booking13.checkIn();
        java.time.LocalDateTime localDateTime16 = booking13.getCheckInTime();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking21 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime19, localDateTime20);
        boolean boolean22 = booking21.isCancelled();
        booking21.checkIn();
        java.time.LocalDateTime localDateTime24 = booking21.getCheckInTime();
        org.openjfx.EECS_3311_Project.model.Booking booking25 = new org.openjfx.EECS_3311_Project.model.Booking("fb0ea706-77b6-4282-b952-8013cf849ac4", "New Meeting", localDateTime16, localDateTime24);
        java.lang.String[] strArray33 = new java.lang.String[] { "New Meeting", "hi!", "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff", "48e65325-60ae-405e-a86f-48f78c4f6b56", "48e65325-60ae-405e-a86f-48f78c4f6b56", "bce87b8a-ced2-4072-9574-e7ba451cf76a", "New Meeting" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        booking25.setAttendeeIds((java.util.List<java.lang.String>) strList34);
        java.time.LocalDateTime localDateTime37 = booking25.getEndTime();
        booking4.setStartTime(localDateTime37);
        java.lang.String str39 = booking4.getName();
        java.lang.String str40 = booking4.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "New Meeting", "hi!", "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff", "48e65325-60ae-405e-a86f-48f78c4f6b56", "48e65325-60ae-405e-a86f-48f78c4f6b56", "bce87b8a-ced2-4072-9574-e7ba451cf76a", "New Meeting" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "New Meeting" + "'", str39, "New Meeting");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking6 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime4, localDateTime5);
        boolean boolean7 = booking6.isCancelled();
        booking6.checkIn();
        java.time.LocalDateTime localDateTime9 = booking6.getCheckInTime();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking14 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime12, localDateTime13);
        boolean boolean15 = booking14.isCancelled();
        booking14.checkIn();
        java.time.LocalDateTime localDateTime17 = booking14.getCheckInTime();
        org.openjfx.EECS_3311_Project.model.Booking booking18 = new org.openjfx.EECS_3311_Project.model.Booking("fb0ea706-77b6-4282-b952-8013cf849ac4", "New Meeting", localDateTime9, localDateTime17);
        java.lang.String[] strArray26 = new java.lang.String[] { "New Meeting", "hi!", "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff", "48e65325-60ae-405e-a86f-48f78c4f6b56", "48e65325-60ae-405e-a86f-48f78c4f6b56", "bce87b8a-ced2-4072-9574-e7ba451cf76a", "New Meeting" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        booking18.setAttendeeIds((java.util.List<java.lang.String>) strList27);
        boolean boolean30 = booking18.isCancelled();
        java.lang.String str31 = booking18.getHostId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "New Meeting", "hi!", "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff", "48e65325-60ae-405e-a86f-48f78c4f6b56", "48e65325-60ae-405e-a86f-48f78c4f6b56", "bce87b8a-ced2-4072-9574-e7ba451cf76a", "New Meeting" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "New Meeting" + "'", str31, "New Meeting");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.setRoomId("");
        booking4.setHostId("b6952f00-19ed-471e-a77c-5ac86038da89");
        booking4.setCancelled(false);
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole12 = null;
        java.time.Duration duration13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = booking4.calculateExtendPrice(accountRole12, duration13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.Duration.toHours()\" because \"extension\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        java.lang.Boolean boolean13 = booking4.getIsCheckedIn();
        java.time.LocalDateTime localDateTime14 = null;
        booking4.setStartTime(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "", localDateTime2, localDateTime3);
        booking4.setName("bce87b8a-ced2-4072-9574-e7ba451cf76a");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking11 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime9, localDateTime10);
        java.lang.String str12 = booking11.getId();
        booking11.checkIn();
        java.util.List<java.lang.String> strList14 = booking11.getAttendeeIds();
        java.util.List<java.lang.String> strList15 = booking11.getAttendeeIds();
        booking4.setAttendeeIds(strList15);
// flaky "15) test159(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "439482f7-1bfe-4107-a20e-547c34ae05e4" + "'", str12, "439482f7-1bfe-4107-a20e-547c34ae05e4");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getId();
        boolean boolean6 = booking4.isCancelled();
        booking4.setName("");
// flaky "16) test160(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36303ce6-95c7-4f15-b06e-a5ab1d10cb6d" + "'", str5, "36303ce6-95c7-4f15-b06e-a5ab1d10cb6d");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.lang.String str7 = booking4.getRoomId();
        java.time.LocalDateTime localDateTime8 = booking4.getEndTime();
        java.lang.String str9 = booking4.getStudentOrOrganizationId();
        booking4.setName("hi!");
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking16 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime14, localDateTime15);
        java.lang.String str17 = booking16.getRoomId();
        booking16.setStudentOrOrganizationId("fb0ea706-77b6-4282-b952-8013cf849ac4");
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking24 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime22, localDateTime23);
        java.lang.String str25 = booking24.getRoomId();
        booking24.setRoomId("hi!");
        java.lang.String str28 = booking24.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList29 = booking24.getAttendeeIds();
        booking16.setAttendeeIds(strList29);
        booking4.setAttendeeIds(strList29);
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole32 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double33 = booking4.calculateTotalPrice(accountRole32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strList29);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setName("hi!");
        java.lang.String str13 = booking4.getName();
        java.time.LocalDateTime localDateTime14 = booking4.getEndTime();
        java.lang.Boolean boolean15 = booking4.getIsCheckedIn();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.time.LocalDateTime localDateTime8 = null;
        booking4.setStartTime(localDateTime8);
        booking4.setName("fc014012-396f-4995-8464-7c1dd3ea2b8b");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList9);
        java.lang.String str12 = booking4.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList13 = booking4.getAttendeeIds();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setName("hi!");
        java.time.LocalDateTime localDateTime13 = booking4.getStartTime();
        booking4.setRoomId("5ac1f678-3e49-4f90-9760-5884d8e09d2e");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime2, localDateTime3);
        boolean boolean5 = booking4.isCancelled();
        java.time.LocalDateTime localDateTime6 = booking4.getCheckInTime();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = booking4.calculateTotalPrice(accountRole7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(localDateTime6);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        boolean boolean13 = booking4.isCancelled();
        java.lang.String str14 = booking4.getHostId();
        java.time.LocalDateTime localDateTime15 = booking4.getCheckInTime();
        java.util.List<java.lang.String> strList16 = booking4.getAttendeeIds();
        booking4.setRoomId("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        booking4.setHostId("dacbd1e4-b01b-4af2-a5e2-41702233ed46");
        booking4.setRoomId("hi!");
        booking4.setCancelled(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.lang.String str8 = booking4.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList9 = booking4.getAttendeeIds();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking14 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime12, localDateTime13);
        java.lang.Boolean boolean15 = booking14.getIsCheckedIn();
        booking14.setRoomId("");
        java.time.LocalDateTime localDateTime18 = booking14.getEndTime();
        java.time.LocalDateTime localDateTime19 = booking14.getCheckInTime();
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking24 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime22, localDateTime23);
        java.lang.Boolean boolean25 = booking24.getIsCheckedIn();
        booking24.checkIn();
        java.time.LocalDateTime localDateTime27 = null;
        booking24.setCheckInTime(localDateTime27);
        booking24.setHostId("hi!");
        booking24.setRoomId("");
        boolean boolean33 = booking24.isCancelled();
        java.lang.String str34 = booking24.getHostId();
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking39 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime37, localDateTime38);
        boolean boolean40 = booking39.isCancelled();
        booking39.checkIn();
        java.time.LocalDateTime localDateTime42 = booking39.getCheckInTime();
        booking24.setStartTime(localDateTime42);
        booking14.setStartTime(localDateTime42);
        booking4.setStartTime(localDateTime42);
        booking4.checkIn();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(localDateTime42);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList13);
        booking4.setHostId("hi!");
        java.time.LocalDateTime localDateTime18 = booking4.getCheckInTime();
        java.util.List<java.lang.String> strList19 = booking4.getAttendeeIds();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(localDateTime18);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime2, localDateTime3);
        boolean boolean5 = booking4.isCancelled();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = booking4.getCheckInTime();
        booking4.setId("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        booking4.checkIn();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.time.LocalDateTime localDateTime8 = null;
        booking4.setStartTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = booking4.getEndTime();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking15 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime13, localDateTime14);
        java.lang.Boolean boolean16 = booking15.getIsCheckedIn();
        booking15.setRoomId("");
        booking15.setHostId("b6952f00-19ed-471e-a77c-5ac86038da89");
        java.lang.String str21 = booking15.getName();
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking26 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime24, localDateTime25);
        java.lang.String str27 = booking26.getRoomId();
        booking26.setRoomId("hi!");
        java.lang.String str30 = booking26.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList31 = booking26.getAttendeeIds();
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking36 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime34, localDateTime35);
        java.lang.Boolean boolean37 = booking36.getIsCheckedIn();
        booking36.setRoomId("");
        java.time.LocalDateTime localDateTime40 = booking36.getEndTime();
        java.time.LocalDateTime localDateTime41 = booking36.getCheckInTime();
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking46 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime44, localDateTime45);
        java.lang.Boolean boolean47 = booking46.getIsCheckedIn();
        booking46.checkIn();
        java.time.LocalDateTime localDateTime49 = null;
        booking46.setCheckInTime(localDateTime49);
        booking46.setHostId("hi!");
        booking46.setRoomId("");
        boolean boolean55 = booking46.isCancelled();
        java.lang.String str56 = booking46.getHostId();
        java.time.LocalDateTime localDateTime59 = null;
        java.time.LocalDateTime localDateTime60 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking61 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime59, localDateTime60);
        boolean boolean62 = booking61.isCancelled();
        booking61.checkIn();
        java.time.LocalDateTime localDateTime64 = booking61.getCheckInTime();
        booking46.setStartTime(localDateTime64);
        booking36.setStartTime(localDateTime64);
        booking26.setStartTime(localDateTime64);
        booking15.setEndTime(localDateTime64);
        java.time.LocalDateTime localDateTime71 = null;
        java.time.LocalDateTime localDateTime72 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking73 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime71, localDateTime72);
        java.lang.Boolean boolean74 = booking73.getIsCheckedIn();
        booking73.checkIn();
        java.lang.String str76 = booking73.getRoomId();
        java.time.LocalDateTime localDateTime77 = booking73.getEndTime();
        java.time.LocalDateTime localDateTime80 = null;
        java.time.LocalDateTime localDateTime81 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking82 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime80, localDateTime81);
        boolean boolean83 = booking82.isCancelled();
        booking82.checkIn();
        java.time.LocalDateTime localDateTime85 = booking82.getCheckInTime();
        booking73.setEndTime(localDateTime85);
        booking15.setCheckInTime(localDateTime85);
        booking4.setEndTime(localDateTime85);
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole89 = null;
        java.time.Duration duration90 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double91 = booking4.calculateExtendPrice(accountRole89, duration90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.Duration.toHours()\" because \"extension\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "New Meeting" + "'", str21, "New Meeting");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(localDateTime40);
        org.junit.Assert.assertNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertNull(localDateTime77);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(localDateTime85);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList13);
        booking4.setHostId("hi!");
        booking4.setName("New Meeting");
        booking4.setIsCheckedIn((java.lang.Boolean) false);
        java.lang.String str22 = booking4.getRoomId();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole23 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double24 = booking4.calculateTotalPrice(accountRole23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.lang.String str7 = booking4.getRoomId();
        java.time.LocalDateTime localDateTime8 = booking4.getEndTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = localDateTime8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.util.List<java.lang.String> strList8 = null;
        booking4.setAttendeeIds(strList8);
        booking4.setId("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = booking4.toCSVRow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.isEmpty()\" because \"this.attendeeIds\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.time.LocalDateTime localDateTime8 = null;
        booking4.setStartTime(localDateTime8);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking14 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime12, localDateTime13);
        java.lang.Boolean boolean15 = booking14.getIsCheckedIn();
        booking14.checkIn();
        java.time.LocalDateTime localDateTime17 = null;
        booking14.setCheckInTime(localDateTime17);
        booking14.setHostId("hi!");
        booking14.setRoomId("");
        boolean boolean23 = booking14.isCancelled();
        java.lang.String str24 = booking14.getHostId();
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking29 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime27, localDateTime28);
        boolean boolean30 = booking29.isCancelled();
        booking29.checkIn();
        java.time.LocalDateTime localDateTime32 = booking29.getCheckInTime();
        booking14.setStartTime(localDateTime32);
        booking4.setStartTime(localDateTime32);
        java.lang.Boolean boolean35 = booking4.getIsCheckedIn();
        booking4.setStudentOrOrganizationId("04a59002-9ff9-4a5b-8629-b20d1bbe2a88");
        java.lang.String str38 = booking4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "New Meeting" + "'", str38, "New Meeting");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getId();
        booking4.checkIn();
        boolean boolean7 = booking4.isCancelled();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = booking4.toCSVRow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.toString()\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky "17) test176(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "bf02ed5e-26b8-4af2-8c08-cd30243292e7" + "'", str5, "bf02ed5e-26b8-4af2-8c08-cd30243292e7");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.lang.String str7 = booking4.getRoomId();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking12 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime10, localDateTime11);
        java.lang.Boolean boolean13 = booking12.getIsCheckedIn();
        booking12.checkIn();
        java.time.LocalDateTime localDateTime15 = null;
        booking12.setCheckInTime(localDateTime15);
        booking12.setHostId("hi!");
        booking12.setRoomId("");
        boolean boolean21 = booking12.isCancelled();
        java.lang.String str22 = booking12.getHostId();
        java.time.LocalDateTime localDateTime23 = booking12.getCheckInTime();
        java.util.List<java.lang.String> strList24 = booking12.getAttendeeIds();
        booking12.setRoomId("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        booking12.setHostId("2d328734-7239-456f-85a0-7f62b3b43caf");
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking33 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime31, localDateTime32);
        java.lang.String str34 = booking33.getRoomId();
        booking33.setStudentOrOrganizationId("fb0ea706-77b6-4282-b952-8013cf849ac4");
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking41 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime39, localDateTime40);
        java.lang.String str42 = booking41.getRoomId();
        booking41.setRoomId("hi!");
        java.lang.String str45 = booking41.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList46 = booking41.getAttendeeIds();
        booking33.setAttendeeIds(strList46);
        booking12.setAttendeeIds(strList46);
        booking4.setAttendeeIds(strList46);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(strList46);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.setRoomId("");
        booking4.setHostId("b6952f00-19ed-471e-a77c-5ac86038da89");
        java.lang.String str10 = booking4.getName();
        boolean boolean11 = booking4.isCancelled();
        java.lang.String str12 = booking4.getHostId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "New Meeting" + "'", str10, "New Meeting");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "b6952f00-19ed-471e-a77c-5ac86038da89" + "'", str12, "b6952f00-19ed-471e-a77c-5ac86038da89");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime2, localDateTime3);
        boolean boolean5 = booking4.isCancelled();
        booking4.checkIn();
        booking4.setHostId("b6952f00-19ed-471e-a77c-5ac86038da89");
        booking4.setHostId("3af102af-2aea-4b76-86a1-eb2b8135446c");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.lang.String str8 = booking4.getStudentOrOrganizationId();
        java.time.LocalDateTime localDateTime9 = booking4.getEndTime();
        java.lang.String str10 = booking4.getId();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = booking4.calculateTotalPrice(accountRole11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDateTime9);
// flaky "18) test180(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4ef72ebc-e28c-4cae-8db7-82732bfdbb4b" + "'", str10, "4ef72ebc-e28c-4cae-8db7-82732bfdbb4b");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.util.List<java.lang.String> strList8 = null;
        booking4.setAttendeeIds(strList8);
        booking4.setId("");
        java.lang.Boolean boolean12 = booking4.getIsCheckedIn();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = booking4.calculateDepositPrice(accountRole13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        boolean boolean13 = booking4.isCancelled();
        java.lang.String str14 = booking4.getHostId();
        java.lang.Boolean boolean15 = booking4.getIsCheckedIn();
        java.time.LocalDateTime localDateTime16 = booking4.getCheckInTime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking15 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime13, localDateTime14);
        boolean boolean16 = booking15.isCancelled();
        booking15.checkIn();
        java.time.LocalDateTime localDateTime18 = booking15.getCheckInTime();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking23 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime21, localDateTime22);
        boolean boolean24 = booking23.isCancelled();
        booking23.checkIn();
        java.time.LocalDateTime localDateTime26 = booking23.getCheckInTime();
        org.openjfx.EECS_3311_Project.model.Booking booking27 = new org.openjfx.EECS_3311_Project.model.Booking("fb0ea706-77b6-4282-b952-8013cf849ac4", "New Meeting", localDateTime18, localDateTime26);
        java.lang.String[] strArray35 = new java.lang.String[] { "New Meeting", "hi!", "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff", "48e65325-60ae-405e-a86f-48f78c4f6b56", "48e65325-60ae-405e-a86f-48f78c4f6b56", "bce87b8a-ced2-4072-9574-e7ba451cf76a", "New Meeting" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        booking27.setAttendeeIds((java.util.List<java.lang.String>) strList36);
        java.time.LocalDateTime localDateTime39 = booking27.getEndTime();
        booking4.setEndTime(localDateTime39);
        java.util.List<java.lang.String> strList41 = booking4.getAttendeeIds();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "New Meeting", "hi!", "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff", "48e65325-60ae-405e-a86f-48f78c4f6b56", "48e65325-60ae-405e-a86f-48f78c4f6b56", "bce87b8a-ced2-4072-9574-e7ba451cf76a", "New Meeting" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(strList41);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.time.LocalDateTime localDateTime8 = null;
        booking4.setStartTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = booking4.getEndTime();
        java.time.LocalDateTime localDateTime11 = booking4.getCheckInTime();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking16 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime14, localDateTime15);
        java.lang.Boolean boolean17 = booking16.getIsCheckedIn();
        booking16.checkIn();
        java.time.LocalDateTime localDateTime19 = null;
        booking16.setCheckInTime(localDateTime19);
        booking16.setHostId("hi!");
        booking16.setRoomId("");
        boolean boolean25 = booking16.isCancelled();
        java.lang.String str26 = booking16.getHostId();
        java.time.LocalDateTime localDateTime27 = booking16.getCheckInTime();
        java.util.List<java.lang.String> strList28 = booking16.getAttendeeIds();
        booking16.setRoomId("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        booking16.setHostId("2d328734-7239-456f-85a0-7f62b3b43caf");
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking37 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime35, localDateTime36);
        java.lang.String str38 = booking37.getRoomId();
        booking37.setStudentOrOrganizationId("fb0ea706-77b6-4282-b952-8013cf849ac4");
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking45 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime43, localDateTime44);
        java.lang.String str46 = booking45.getRoomId();
        booking45.setRoomId("hi!");
        java.lang.String str49 = booking45.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList50 = booking45.getAttendeeIds();
        booking37.setAttendeeIds(strList50);
        booking16.setAttendeeIds(strList50);
        booking4.setAttendeeIds(strList50);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(strList50);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking10 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime8, localDateTime9);
        java.lang.Boolean boolean11 = booking10.getIsCheckedIn();
        booking10.checkIn();
        java.time.LocalDateTime localDateTime13 = null;
        booking10.setCheckInTime(localDateTime13);
        booking10.setHostId("hi!");
        booking10.setRoomId("");
        boolean boolean19 = booking10.isCancelled();
        java.lang.String str20 = booking10.getHostId();
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking25 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime23, localDateTime24);
        boolean boolean26 = booking25.isCancelled();
        booking25.checkIn();
        java.time.LocalDateTime localDateTime28 = booking25.getCheckInTime();
        booking10.setStartTime(localDateTime28);
        booking4.setStartTime(localDateTime28);
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole31 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double32 = booking4.calculateTotalPrice(accountRole31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: temporal");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDateTime28);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.util.List<java.lang.String> strList8 = null;
        booking4.setAttendeeIds(strList8);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking14 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime12, localDateTime13);
        java.lang.String str15 = booking14.getRoomId();
        booking14.setRoomId("hi!");
        java.util.List<java.lang.String> strList18 = booking14.getAttendeeIds();
        booking4.setAttendeeIds(strList18);
        booking4.setId("5ac1f678-3e49-4f90-9760-5884d8e09d2e");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        java.lang.Boolean boolean13 = booking4.getIsCheckedIn();
        java.lang.String str14 = booking4.getName();
        java.lang.Boolean boolean15 = booking4.getIsCheckedIn();
        booking4.setRoomId("48e65325-60ae-405e-a86f-48f78c4f6b56");
        java.time.LocalDateTime localDateTime18 = booking4.getStartTime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "New Meeting" + "'", str14, "New Meeting");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.time.LocalDateTime localDateTime8 = null;
        booking4.setStartTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = booking4.getEndTime();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking15 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime13, localDateTime14);
        java.lang.Boolean boolean16 = booking15.getIsCheckedIn();
        booking15.setRoomId("");
        booking15.setHostId("b6952f00-19ed-471e-a77c-5ac86038da89");
        java.lang.String str21 = booking15.getName();
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking26 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime24, localDateTime25);
        java.lang.String str27 = booking26.getRoomId();
        booking26.setRoomId("hi!");
        java.lang.String str30 = booking26.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList31 = booking26.getAttendeeIds();
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking36 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime34, localDateTime35);
        java.lang.Boolean boolean37 = booking36.getIsCheckedIn();
        booking36.setRoomId("");
        java.time.LocalDateTime localDateTime40 = booking36.getEndTime();
        java.time.LocalDateTime localDateTime41 = booking36.getCheckInTime();
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking46 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime44, localDateTime45);
        java.lang.Boolean boolean47 = booking46.getIsCheckedIn();
        booking46.checkIn();
        java.time.LocalDateTime localDateTime49 = null;
        booking46.setCheckInTime(localDateTime49);
        booking46.setHostId("hi!");
        booking46.setRoomId("");
        boolean boolean55 = booking46.isCancelled();
        java.lang.String str56 = booking46.getHostId();
        java.time.LocalDateTime localDateTime59 = null;
        java.time.LocalDateTime localDateTime60 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking61 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime59, localDateTime60);
        boolean boolean62 = booking61.isCancelled();
        booking61.checkIn();
        java.time.LocalDateTime localDateTime64 = booking61.getCheckInTime();
        booking46.setStartTime(localDateTime64);
        booking36.setStartTime(localDateTime64);
        booking26.setStartTime(localDateTime64);
        booking15.setEndTime(localDateTime64);
        java.time.LocalDateTime localDateTime71 = null;
        java.time.LocalDateTime localDateTime72 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking73 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime71, localDateTime72);
        java.lang.Boolean boolean74 = booking73.getIsCheckedIn();
        booking73.checkIn();
        java.lang.String str76 = booking73.getRoomId();
        java.time.LocalDateTime localDateTime77 = booking73.getEndTime();
        java.time.LocalDateTime localDateTime80 = null;
        java.time.LocalDateTime localDateTime81 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking82 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime80, localDateTime81);
        boolean boolean83 = booking82.isCancelled();
        booking82.checkIn();
        java.time.LocalDateTime localDateTime85 = booking82.getCheckInTime();
        booking73.setEndTime(localDateTime85);
        booking15.setCheckInTime(localDateTime85);
        booking4.setEndTime(localDateTime85);
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole89 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double90 = booking4.calculateTotalPrice(accountRole89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "New Meeting" + "'", str21, "New Meeting");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(localDateTime40);
        org.junit.Assert.assertNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(localDateTime64);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertNull(localDateTime77);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(localDateTime85);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        booking4.checkIn();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getId();
        java.lang.String str6 = booking4.getStudentOrOrganizationId();
        booking4.setName("bce87b8a-ced2-4072-9574-e7ba451cf76a");
// flaky "19) test190(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "c3f2b004-32ff-4751-914e-6b02c315e7cc" + "'", str5, "c3f2b004-32ff-4751-914e-6b02c315e7cc");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        boolean boolean13 = booking4.isCancelled();
        java.lang.Boolean boolean14 = booking4.getIsCheckedIn();
        boolean boolean15 = booking4.isCancelled();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Booking booking1 = new org.openjfx.EECS_3311_Project.model.Booking("f7bf3244-6207-4ece-8a29-6d9134c107bd");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = booking4.getRoomId();
        java.lang.Boolean boolean17 = booking4.getIsCheckedIn();
        booking4.setId("fc014012-396f-4995-8464-7c1dd3ea2b8b");
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking24 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime22, localDateTime23);
        java.lang.Boolean boolean25 = booking24.getIsCheckedIn();
        booking24.checkIn();
        java.time.LocalDateTime localDateTime27 = null;
        booking24.setCheckInTime(localDateTime27);
        booking24.setHostId("hi!");
        booking24.setRoomId("");
        boolean boolean33 = booking24.isCancelled();
        java.lang.String str34 = booking24.getHostId();
        java.time.LocalDateTime localDateTime35 = booking24.getCheckInTime();
        booking24.setStudentOrOrganizationId("2afae645-dce6-4037-92f8-4771d5058b06");
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking42 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime40, localDateTime41);
        java.lang.Boolean boolean43 = booking42.getIsCheckedIn();
        booking42.checkIn();
        java.time.LocalDateTime localDateTime45 = null;
        booking42.setCheckInTime(localDateTime45);
        booking42.setHostId("hi!");
        booking42.setRoomId("");
        boolean boolean51 = booking42.isCancelled();
        java.lang.String str52 = booking42.getHostId();
        booking42.checkIn();
        java.time.LocalDateTime localDateTime56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking58 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime56, localDateTime57);
        boolean boolean59 = booking58.isCancelled();
        booking58.checkIn();
        java.time.LocalDateTime localDateTime61 = booking58.getCheckInTime();
        booking42.setCheckInTime(localDateTime61);
        booking24.setCheckInTime(localDateTime61);
        booking4.setStartTime(localDateTime61);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(localDateTime61);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.setRoomId("");
        booking4.setHostId("b6952f00-19ed-471e-a77c-5ac86038da89");
        booking4.setHostId("bce87b8a-ced2-4072-9574-e7ba451cf76a");
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking16 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime14, localDateTime15);
        boolean boolean17 = booking16.isCancelled();
        booking16.checkIn();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking23 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime21, localDateTime22);
        java.lang.String str24 = booking23.getRoomId();
        booking23.setRoomId("hi!");
        java.lang.String str27 = booking23.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList28 = booking23.getAttendeeIds();
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking33 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime31, localDateTime32);
        java.lang.Boolean boolean34 = booking33.getIsCheckedIn();
        booking33.setRoomId("");
        java.time.LocalDateTime localDateTime37 = booking33.getEndTime();
        java.time.LocalDateTime localDateTime38 = booking33.getCheckInTime();
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking43 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime41, localDateTime42);
        java.lang.Boolean boolean44 = booking43.getIsCheckedIn();
        booking43.checkIn();
        java.time.LocalDateTime localDateTime46 = null;
        booking43.setCheckInTime(localDateTime46);
        booking43.setHostId("hi!");
        booking43.setRoomId("");
        boolean boolean52 = booking43.isCancelled();
        java.lang.String str53 = booking43.getHostId();
        java.time.LocalDateTime localDateTime56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking58 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime56, localDateTime57);
        boolean boolean59 = booking58.isCancelled();
        booking58.checkIn();
        java.time.LocalDateTime localDateTime61 = booking58.getCheckInTime();
        booking43.setStartTime(localDateTime61);
        booking33.setStartTime(localDateTime61);
        booking23.setStartTime(localDateTime61);
        booking16.setCheckInTime(localDateTime61);
        booking4.setCheckInTime(localDateTime61);
        java.lang.Class<?> wildcardClass67 = booking4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.setHostId("bce87b8a-ced2-4072-9574-e7ba451cf76a");
        java.time.LocalDateTime localDateTime8 = booking4.getStartTime();
        booking4.setName("40e1ffec-196b-4a90-af80-8a4381451585");
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking17 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime15, localDateTime16);
        java.lang.String str18 = booking17.getRoomId();
        booking17.setRoomId("hi!");
        java.lang.String str21 = booking17.getStudentOrOrganizationId();
        booking17.setId("bce87b8a-ced2-4072-9574-e7ba451cf76a");
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking30 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime28, localDateTime29);
        boolean boolean31 = booking30.isCancelled();
        booking30.checkIn();
        java.time.LocalDateTime localDateTime33 = booking30.getCheckInTime();
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking38 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime36, localDateTime37);
        boolean boolean39 = booking38.isCancelled();
        booking38.checkIn();
        java.time.LocalDateTime localDateTime41 = booking38.getCheckInTime();
        org.openjfx.EECS_3311_Project.model.Booking booking42 = new org.openjfx.EECS_3311_Project.model.Booking("fb0ea706-77b6-4282-b952-8013cf849ac4", "New Meeting", localDateTime33, localDateTime41);
        booking17.setCheckInTime(localDateTime33);
        java.time.LocalDateTime localDateTime44 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking45 = new org.openjfx.EECS_3311_Project.model.Booking("bce87b8a-ced2-4072-9574-e7ba451cf76a", "New Meeting", localDateTime33, localDateTime44);
        booking4.setCheckInTime(localDateTime33);
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole47 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double48 = booking4.calculateDepositPrice(accountRole47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(localDateTime41);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking6 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime4, localDateTime5);
        java.lang.String str7 = booking6.getRoomId();
        booking6.setRoomId("hi!");
        java.lang.String str10 = booking6.getStudentOrOrganizationId();
        booking6.setId("bce87b8a-ced2-4072-9574-e7ba451cf76a");
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking19 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime17, localDateTime18);
        boolean boolean20 = booking19.isCancelled();
        booking19.checkIn();
        java.time.LocalDateTime localDateTime22 = booking19.getCheckInTime();
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking27 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime25, localDateTime26);
        boolean boolean28 = booking27.isCancelled();
        booking27.checkIn();
        java.time.LocalDateTime localDateTime30 = booking27.getCheckInTime();
        org.openjfx.EECS_3311_Project.model.Booking booking31 = new org.openjfx.EECS_3311_Project.model.Booking("fb0ea706-77b6-4282-b952-8013cf849ac4", "New Meeting", localDateTime22, localDateTime30);
        booking6.setCheckInTime(localDateTime22);
        java.time.LocalDateTime localDateTime33 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking34 = new org.openjfx.EECS_3311_Project.model.Booking("bce87b8a-ced2-4072-9574-e7ba451cf76a", "New Meeting", localDateTime22, localDateTime33);
        java.lang.Boolean boolean35 = booking34.getIsCheckedIn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.time.LocalDateTime localDateTime8 = null;
        booking4.setStartTime(localDateTime8);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking14 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime12, localDateTime13);
        java.lang.Boolean boolean15 = booking14.getIsCheckedIn();
        booking14.checkIn();
        java.time.LocalDateTime localDateTime17 = null;
        booking14.setCheckInTime(localDateTime17);
        booking14.setHostId("hi!");
        booking14.setRoomId("");
        boolean boolean23 = booking14.isCancelled();
        java.lang.String str24 = booking14.getHostId();
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking29 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime27, localDateTime28);
        boolean boolean30 = booking29.isCancelled();
        booking29.checkIn();
        java.time.LocalDateTime localDateTime32 = booking29.getCheckInTime();
        booking14.setStartTime(localDateTime32);
        booking4.setStartTime(localDateTime32);
        java.lang.String str35 = booking4.getRoomId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime2, localDateTime3);
        boolean boolean5 = booking4.isCancelled();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = booking4.getCheckInTime();
        java.lang.String str8 = booking4.getHostId();
        booking4.setHostId("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        booking4.setStudentOrOrganizationId("fc014012-396f-4995-8464-7c1dd3ea2b8b");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.setRoomId("");
        booking4.setName("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        booking4.setHostId("fb0ea706-77b6-4282-b952-8013cf849ac4");
        java.util.List<java.lang.String> strList12 = booking4.getAttendeeIds();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = booking4.calculateTotalPrice(accountRole13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.util.List<java.lang.String> strList8 = null;
        booking4.setAttendeeIds(strList8);
        booking4.setId("");
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking16 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime14, localDateTime15);
        java.lang.Boolean boolean17 = booking16.getIsCheckedIn();
        booking16.checkIn();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking23 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime21, localDateTime22);
        java.lang.Boolean boolean24 = booking23.getIsCheckedIn();
        booking23.checkIn();
        java.time.LocalDateTime localDateTime26 = null;
        booking23.setCheckInTime(localDateTime26);
        booking23.setHostId("hi!");
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        booking23.setAttendeeIds((java.util.List<java.lang.String>) strList32);
        booking16.setAttendeeIds((java.util.List<java.lang.String>) strList32);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = booking4.toCSVRow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.toString()\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.setRoomId("");
        java.lang.String str8 = booking4.getHostId();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole9 = null;
        java.time.Duration duration10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = booking4.calculateExtendPrice(accountRole9, duration10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.Duration.toHours()\" because \"extension\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking8 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime6, localDateTime7);
        boolean boolean9 = booking8.isCancelled();
        booking8.checkIn();
        java.time.LocalDateTime localDateTime11 = booking8.getCheckInTime();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking16 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime14, localDateTime15);
        boolean boolean17 = booking16.isCancelled();
        booking16.checkIn();
        java.time.LocalDateTime localDateTime19 = booking16.getCheckInTime();
        org.openjfx.EECS_3311_Project.model.Booking booking20 = new org.openjfx.EECS_3311_Project.model.Booking("fb0ea706-77b6-4282-b952-8013cf849ac4", "New Meeting", localDateTime11, localDateTime19);
        java.lang.String[] strArray28 = new java.lang.String[] { "New Meeting", "hi!", "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff", "48e65325-60ae-405e-a86f-48f78c4f6b56", "48e65325-60ae-405e-a86f-48f78c4f6b56", "bce87b8a-ced2-4072-9574-e7ba451cf76a", "New Meeting" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        booking20.setAttendeeIds((java.util.List<java.lang.String>) strList29);
        java.time.LocalDateTime localDateTime32 = booking20.getEndTime();
        java.time.LocalDateTime localDateTime33 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking34 = new org.openjfx.EECS_3311_Project.model.Booking("10c414e9-8a74-4e57-8912-e979f7226ad9", "d825b773-526a-44bb-aee8-0e23c712ebce", localDateTime32, localDateTime33);
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking39 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime37, localDateTime38);
        java.lang.Boolean boolean40 = booking39.getIsCheckedIn();
        booking39.checkIn();
        java.lang.String str42 = booking39.getRoomId();
        java.time.LocalDateTime localDateTime43 = booking39.getEndTime();
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking50 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime48, localDateTime49);
        boolean boolean51 = booking50.isCancelled();
        booking50.checkIn();
        java.time.LocalDateTime localDateTime53 = booking50.getCheckInTime();
        java.time.LocalDateTime localDateTime56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking58 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime56, localDateTime57);
        boolean boolean59 = booking58.isCancelled();
        booking58.checkIn();
        java.time.LocalDateTime localDateTime61 = booking58.getCheckInTime();
        org.openjfx.EECS_3311_Project.model.Booking booking62 = new org.openjfx.EECS_3311_Project.model.Booking("fb0ea706-77b6-4282-b952-8013cf849ac4", "New Meeting", localDateTime53, localDateTime61);
        java.lang.String[] strArray70 = new java.lang.String[] { "New Meeting", "hi!", "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff", "48e65325-60ae-405e-a86f-48f78c4f6b56", "48e65325-60ae-405e-a86f-48f78c4f6b56", "bce87b8a-ced2-4072-9574-e7ba451cf76a", "New Meeting" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        booking62.setAttendeeIds((java.util.List<java.lang.String>) strList71);
        booking39.setAttendeeIds((java.util.List<java.lang.String>) strList71);
        booking34.setAttendeeIds((java.util.List<java.lang.String>) strList71);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "New Meeting", "hi!", "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff", "48e65325-60ae-405e-a86f-48f78c4f6b56", "48e65325-60ae-405e-a86f-48f78c4f6b56", "bce87b8a-ced2-4072-9574-e7ba451cf76a", "New Meeting" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "New Meeting", "hi!", "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff", "48e65325-60ae-405e-a86f-48f78c4f6b56", "48e65325-60ae-405e-a86f-48f78c4f6b56", "bce87b8a-ced2-4072-9574-e7ba451cf76a", "New Meeting" });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.lang.String str7 = booking4.getRoomId();
        java.time.LocalDateTime localDateTime8 = booking4.getEndTime();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking13 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime11, localDateTime12);
        boolean boolean14 = booking13.isCancelled();
        booking13.checkIn();
        java.time.LocalDateTime localDateTime16 = booking13.getCheckInTime();
        booking4.setEndTime(localDateTime16);
        java.util.List<java.lang.String> strList18 = booking4.getAttendeeIds();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole19 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = booking4.calculateTotalPrice(accountRole19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = booking4.getRoomId();
        java.lang.String str17 = booking4.getId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
// flaky "20) test204(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1aa7e2f6-3cc8-4a83-b091-a37c6af5fa40" + "'", str17, "1aa7e2f6-3cc8-4a83-b091-a37c6af5fa40");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        boolean boolean13 = booking4.isCancelled();
        java.lang.String str14 = booking4.getHostId();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking19 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime17, localDateTime18);
        boolean boolean20 = booking19.isCancelled();
        booking19.checkIn();
        java.time.LocalDateTime localDateTime22 = booking19.getCheckInTime();
        booking4.setStartTime(localDateTime22);
        java.lang.Class<?> wildcardClass24 = booking4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.lang.String str8 = booking4.getStudentOrOrganizationId();
        java.time.LocalDateTime localDateTime9 = booking4.getEndTime();
        booking4.setName("f7bf3244-6207-4ece-8a29-6d9134c107bd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        boolean boolean13 = booking4.isCancelled();
        java.lang.String str14 = booking4.getHostId();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking19 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime17, localDateTime18);
        boolean boolean20 = booking19.isCancelled();
        booking19.checkIn();
        java.time.LocalDateTime localDateTime22 = booking19.getCheckInTime();
        booking4.setStartTime(localDateTime22);
        booking4.setHostId("36303ce6-95c7-4f15-b06e-a5ab1d10cb6d");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime2, localDateTime3);
        boolean boolean5 = booking4.isCancelled();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking11 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime9, localDateTime10);
        java.lang.String str12 = booking11.getRoomId();
        booking11.setRoomId("hi!");
        java.lang.String str15 = booking11.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList16 = booking11.getAttendeeIds();
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking21 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime19, localDateTime20);
        java.lang.Boolean boolean22 = booking21.getIsCheckedIn();
        booking21.setRoomId("");
        java.time.LocalDateTime localDateTime25 = booking21.getEndTime();
        java.time.LocalDateTime localDateTime26 = booking21.getCheckInTime();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking31 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime29, localDateTime30);
        java.lang.Boolean boolean32 = booking31.getIsCheckedIn();
        booking31.checkIn();
        java.time.LocalDateTime localDateTime34 = null;
        booking31.setCheckInTime(localDateTime34);
        booking31.setHostId("hi!");
        booking31.setRoomId("");
        boolean boolean40 = booking31.isCancelled();
        java.lang.String str41 = booking31.getHostId();
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking46 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime44, localDateTime45);
        boolean boolean47 = booking46.isCancelled();
        booking46.checkIn();
        java.time.LocalDateTime localDateTime49 = booking46.getCheckInTime();
        booking31.setStartTime(localDateTime49);
        booking21.setStartTime(localDateTime49);
        booking11.setStartTime(localDateTime49);
        booking4.setCheckInTime(localDateTime49);
        java.time.LocalDateTime localDateTime56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking58 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime56, localDateTime57);
        java.lang.Boolean boolean59 = booking58.getIsCheckedIn();
        booking58.setRoomId("");
        java.time.LocalDateTime localDateTime62 = booking58.getEndTime();
        java.time.LocalDateTime localDateTime63 = booking58.getCheckInTime();
        java.time.LocalDateTime localDateTime66 = null;
        java.time.LocalDateTime localDateTime67 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking68 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime66, localDateTime67);
        java.lang.Boolean boolean69 = booking68.getIsCheckedIn();
        booking68.checkIn();
        java.time.LocalDateTime localDateTime71 = null;
        booking68.setCheckInTime(localDateTime71);
        booking68.setHostId("hi!");
        booking68.setRoomId("");
        boolean boolean77 = booking68.isCancelled();
        java.lang.String str78 = booking68.getHostId();
        java.time.LocalDateTime localDateTime81 = null;
        java.time.LocalDateTime localDateTime82 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking83 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime81, localDateTime82);
        boolean boolean84 = booking83.isCancelled();
        booking83.checkIn();
        java.time.LocalDateTime localDateTime86 = booking83.getCheckInTime();
        booking68.setStartTime(localDateTime86);
        booking58.setStartTime(localDateTime86);
        booking4.setEndTime(localDateTime86);
        booking4.setIsCheckedIn((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(localDateTime62);
        org.junit.Assert.assertNull(localDateTime63);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(localDateTime86);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.setRoomId("");
        java.time.LocalDateTime localDateTime8 = booking4.getEndTime();
        java.time.LocalDateTime localDateTime9 = booking4.getCheckInTime();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking14 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime12, localDateTime13);
        java.lang.Boolean boolean15 = booking14.getIsCheckedIn();
        booking14.checkIn();
        java.time.LocalDateTime localDateTime17 = null;
        booking14.setCheckInTime(localDateTime17);
        booking14.setHostId("hi!");
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        booking14.setAttendeeIds((java.util.List<java.lang.String>) strList23);
        java.lang.String str26 = booking14.getRoomId();
        java.lang.String[] strArray29 = new java.lang.String[] { "fb0ea706-77b6-4282-b952-8013cf849ac4", "40e1ffec-196b-4a90-af80-8a4381451585" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        booking14.setAttendeeIds((java.util.List<java.lang.String>) strList30);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList30);
        booking4.setHostId("8eb9aff4-29dc-4d92-b195-7c69a874f90f");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "fb0ea706-77b6-4282-b952-8013cf849ac4", "40e1ffec-196b-4a90-af80-8a4381451585" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.setRoomId("");
        booking4.setName("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        booking4.setHostId("fb0ea706-77b6-4282-b952-8013cf849ac4");
        java.util.List<java.lang.String> strList12 = booking4.getAttendeeIds();
        java.lang.String str13 = booking4.getHostId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "fb0ea706-77b6-4282-b952-8013cf849ac4" + "'", str13, "fb0ea706-77b6-4282-b952-8013cf849ac4");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking15 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime13, localDateTime14);
        boolean boolean16 = booking15.isCancelled();
        booking15.checkIn();
        java.time.LocalDateTime localDateTime18 = booking15.getCheckInTime();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking23 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime21, localDateTime22);
        boolean boolean24 = booking23.isCancelled();
        booking23.checkIn();
        java.time.LocalDateTime localDateTime26 = booking23.getCheckInTime();
        org.openjfx.EECS_3311_Project.model.Booking booking27 = new org.openjfx.EECS_3311_Project.model.Booking("fb0ea706-77b6-4282-b952-8013cf849ac4", "New Meeting", localDateTime18, localDateTime26);
        java.lang.String[] strArray35 = new java.lang.String[] { "New Meeting", "hi!", "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff", "48e65325-60ae-405e-a86f-48f78c4f6b56", "48e65325-60ae-405e-a86f-48f78c4f6b56", "bce87b8a-ced2-4072-9574-e7ba451cf76a", "New Meeting" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        booking27.setAttendeeIds((java.util.List<java.lang.String>) strList36);
        java.time.LocalDateTime localDateTime39 = booking27.getEndTime();
        booking4.setEndTime(localDateTime39);
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking45 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime43, localDateTime44);
        boolean boolean46 = booking45.isCancelled();
        booking45.checkIn();
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking52 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime50, localDateTime51);
        java.lang.String str53 = booking52.getRoomId();
        booking52.setRoomId("hi!");
        java.lang.String str56 = booking52.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList57 = booking52.getAttendeeIds();
        java.time.LocalDateTime localDateTime60 = null;
        java.time.LocalDateTime localDateTime61 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking62 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime60, localDateTime61);
        java.lang.Boolean boolean63 = booking62.getIsCheckedIn();
        booking62.setRoomId("");
        java.time.LocalDateTime localDateTime66 = booking62.getEndTime();
        java.time.LocalDateTime localDateTime67 = booking62.getCheckInTime();
        java.time.LocalDateTime localDateTime70 = null;
        java.time.LocalDateTime localDateTime71 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking72 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime70, localDateTime71);
        java.lang.Boolean boolean73 = booking72.getIsCheckedIn();
        booking72.checkIn();
        java.time.LocalDateTime localDateTime75 = null;
        booking72.setCheckInTime(localDateTime75);
        booking72.setHostId("hi!");
        booking72.setRoomId("");
        boolean boolean81 = booking72.isCancelled();
        java.lang.String str82 = booking72.getHostId();
        java.time.LocalDateTime localDateTime85 = null;
        java.time.LocalDateTime localDateTime86 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking87 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime85, localDateTime86);
        boolean boolean88 = booking87.isCancelled();
        booking87.checkIn();
        java.time.LocalDateTime localDateTime90 = booking87.getCheckInTime();
        booking72.setStartTime(localDateTime90);
        booking62.setStartTime(localDateTime90);
        booking52.setStartTime(localDateTime90);
        booking45.setCheckInTime(localDateTime90);
        booking4.setCheckInTime(localDateTime90);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "New Meeting", "hi!", "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff", "48e65325-60ae-405e-a86f-48f78c4f6b56", "48e65325-60ae-405e-a86f-48f78c4f6b56", "bce87b8a-ced2-4072-9574-e7ba451cf76a", "New Meeting" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(localDateTime66);
        org.junit.Assert.assertNull(localDateTime67);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(localDateTime90);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.time.LocalDateTime localDateTime8 = null;
        booking4.setStartTime(localDateTime8);
        java.lang.String str10 = booking4.getStudentOrOrganizationId();
        java.lang.String str11 = booking4.getStudentOrOrganizationId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Booking booking1 = new org.openjfx.EECS_3311_Project.model.Booking("bf1fa428-38ab-42bb-abe4-d1f7fee5da1b");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.time.LocalDateTime localDateTime8 = null;
        booking4.setStartTime(localDateTime8);
        java.lang.String str10 = booking4.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList11 = booking4.getAttendeeIds();
        booking4.setCancelled(true);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking18 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime16, localDateTime17);
        boolean boolean19 = booking18.isCancelled();
        booking18.setStudentOrOrganizationId("dacbd1e4-b01b-4af2-a5e2-41702233ed46");
        java.lang.String str22 = booking18.getStudentOrOrganizationId();
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking27 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime25, localDateTime26);
        java.lang.String str28 = booking27.getRoomId();
        booking27.setRoomId("hi!");
        java.time.LocalDateTime localDateTime31 = null;
        booking27.setStartTime(localDateTime31);
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking37 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime35, localDateTime36);
        java.lang.Boolean boolean38 = booking37.getIsCheckedIn();
        booking37.checkIn();
        java.time.LocalDateTime localDateTime40 = null;
        booking37.setCheckInTime(localDateTime40);
        booking37.setHostId("hi!");
        booking37.setRoomId("");
        boolean boolean46 = booking37.isCancelled();
        java.lang.String str47 = booking37.getHostId();
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking52 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime50, localDateTime51);
        boolean boolean53 = booking52.isCancelled();
        booking52.checkIn();
        java.time.LocalDateTime localDateTime55 = booking52.getCheckInTime();
        booking37.setStartTime(localDateTime55);
        booking27.setStartTime(localDateTime55);
        java.time.LocalDateTime localDateTime58 = booking27.getStartTime();
        booking18.setStartTime(localDateTime58);
        booking4.setEndTime(localDateTime58);
        booking4.setName("439482f7-1bfe-4107-a20e-547c34ae05e4");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "dacbd1e4-b01b-4af2-a5e2-41702233ed46" + "'", str22, "dacbd1e4-b01b-4af2-a5e2-41702233ed46");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(localDateTime58);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.util.List<java.lang.String> strList8 = null;
        booking4.setAttendeeIds(strList8);
        booking4.setId("");
        java.util.List<java.lang.String> strList12 = booking4.getAttendeeIds();
        boolean boolean13 = booking4.isCancelled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getId();
        java.lang.String str6 = booking4.getStudentOrOrganizationId();
        booking4.checkIn();
// flaky "21) test216(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "df8d7999-3021-4197-ace2-b280519fb8cd" + "'", str5, "df8d7999-3021-4197-ace2-b280519fb8cd");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking6 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime4, localDateTime5);
        java.lang.String str7 = booking6.getRoomId();
        booking6.setRoomId("hi!");
        java.util.List<java.lang.String> strList10 = null;
        booking6.setAttendeeIds(strList10);
        booking6.setId("");
        java.lang.Boolean boolean14 = booking6.getIsCheckedIn();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking19 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime17, localDateTime18);
        java.lang.Boolean boolean20 = booking19.getIsCheckedIn();
        booking19.checkIn();
        java.time.LocalDateTime localDateTime22 = null;
        booking19.setCheckInTime(localDateTime22);
        booking19.setHostId("hi!");
        booking19.setRoomId("");
        boolean boolean28 = booking19.isCancelled();
        java.lang.String str29 = booking19.getHostId();
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking34 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime32, localDateTime33);
        boolean boolean35 = booking34.isCancelled();
        booking34.checkIn();
        java.time.LocalDateTime localDateTime37 = booking34.getCheckInTime();
        booking19.setStartTime(localDateTime37);
        booking6.setEndTime(localDateTime37);
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking44 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime42, localDateTime43);
        java.lang.Boolean boolean45 = booking44.getIsCheckedIn();
        booking44.setRoomId("");
        booking44.setHostId("b6952f00-19ed-471e-a77c-5ac86038da89");
        java.lang.String str50 = booking44.getName();
        java.time.LocalDateTime localDateTime53 = null;
        java.time.LocalDateTime localDateTime54 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking55 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime53, localDateTime54);
        java.lang.String str56 = booking55.getRoomId();
        booking55.setRoomId("hi!");
        java.lang.String str59 = booking55.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList60 = booking55.getAttendeeIds();
        java.time.LocalDateTime localDateTime63 = null;
        java.time.LocalDateTime localDateTime64 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking65 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime63, localDateTime64);
        java.lang.Boolean boolean66 = booking65.getIsCheckedIn();
        booking65.setRoomId("");
        java.time.LocalDateTime localDateTime69 = booking65.getEndTime();
        java.time.LocalDateTime localDateTime70 = booking65.getCheckInTime();
        java.time.LocalDateTime localDateTime73 = null;
        java.time.LocalDateTime localDateTime74 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking75 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime73, localDateTime74);
        java.lang.Boolean boolean76 = booking75.getIsCheckedIn();
        booking75.checkIn();
        java.time.LocalDateTime localDateTime78 = null;
        booking75.setCheckInTime(localDateTime78);
        booking75.setHostId("hi!");
        booking75.setRoomId("");
        boolean boolean84 = booking75.isCancelled();
        java.lang.String str85 = booking75.getHostId();
        java.time.LocalDateTime localDateTime88 = null;
        java.time.LocalDateTime localDateTime89 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking90 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime88, localDateTime89);
        boolean boolean91 = booking90.isCancelled();
        booking90.checkIn();
        java.time.LocalDateTime localDateTime93 = booking90.getCheckInTime();
        booking75.setStartTime(localDateTime93);
        booking65.setStartTime(localDateTime93);
        booking55.setStartTime(localDateTime93);
        booking44.setEndTime(localDateTime93);
        org.openjfx.EECS_3311_Project.model.Booking booking98 = new org.openjfx.EECS_3311_Project.model.Booking("New Meeting", "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff", localDateTime37, localDateTime93);
        booking98.checkIn();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "New Meeting" + "'", str50, "New Meeting");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(localDateTime69);
        org.junit.Assert.assertNull(localDateTime70);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(localDateTime93);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setHostId("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        booking4.setId("New Meeting");
        java.time.LocalDateTime localDateTime10 = booking4.getCheckInTime();
        booking4.setRoomId("04a59002-9ff9-4a5b-8629-b20d1bbe2a88");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.util.List<java.lang.String> strList8 = null;
        booking4.setAttendeeIds(strList8);
        booking4.setId("");
        java.lang.Boolean boolean12 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime14 = booking4.getEndTime();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        java.time.LocalDateTime localDateTime6 = booking4.getEndTime();
        java.time.LocalDateTime localDateTime7 = booking4.getStartTime();
        java.lang.String str8 = booking4.getStudentOrOrganizationId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(localDateTime6);
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.time.LocalDateTime localDateTime8 = null;
        booking4.setStartTime(localDateTime8);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking14 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime12, localDateTime13);
        java.lang.Boolean boolean15 = booking14.getIsCheckedIn();
        booking14.checkIn();
        java.time.LocalDateTime localDateTime17 = null;
        booking14.setCheckInTime(localDateTime17);
        booking14.setHostId("hi!");
        booking14.setRoomId("");
        boolean boolean23 = booking14.isCancelled();
        java.lang.String str24 = booking14.getHostId();
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking29 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime27, localDateTime28);
        boolean boolean30 = booking29.isCancelled();
        booking29.checkIn();
        java.time.LocalDateTime localDateTime32 = booking29.getCheckInTime();
        booking14.setStartTime(localDateTime32);
        booking4.setStartTime(localDateTime32);
        booking4.setIsCheckedIn((java.lang.Boolean) false);
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole37 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double38 = booking4.calculateTotalPrice(accountRole37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: temporal");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localDateTime32);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking6 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime4, localDateTime5);
        java.lang.String str7 = booking6.getRoomId();
        booking6.setRoomId("hi!");
        java.lang.String str10 = booking6.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList11 = booking6.getAttendeeIds();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking16 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime14, localDateTime15);
        java.lang.Boolean boolean17 = booking16.getIsCheckedIn();
        booking16.setRoomId("");
        java.time.LocalDateTime localDateTime20 = booking16.getEndTime();
        java.time.LocalDateTime localDateTime21 = booking16.getCheckInTime();
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking26 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime24, localDateTime25);
        java.lang.Boolean boolean27 = booking26.getIsCheckedIn();
        booking26.checkIn();
        java.time.LocalDateTime localDateTime29 = null;
        booking26.setCheckInTime(localDateTime29);
        booking26.setHostId("hi!");
        booking26.setRoomId("");
        boolean boolean35 = booking26.isCancelled();
        java.lang.String str36 = booking26.getHostId();
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking41 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime39, localDateTime40);
        boolean boolean42 = booking41.isCancelled();
        booking41.checkIn();
        java.time.LocalDateTime localDateTime44 = booking41.getCheckInTime();
        booking26.setStartTime(localDateTime44);
        booking16.setStartTime(localDateTime44);
        booking6.setStartTime(localDateTime44);
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking52 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime50, localDateTime51);
        java.lang.String str53 = booking52.getRoomId();
        booking52.setRoomId("hi!");
        java.lang.String str56 = booking52.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList57 = booking52.getAttendeeIds();
        java.time.LocalDateTime localDateTime60 = null;
        java.time.LocalDateTime localDateTime61 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking62 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime60, localDateTime61);
        java.lang.Boolean boolean63 = booking62.getIsCheckedIn();
        booking62.setRoomId("");
        java.time.LocalDateTime localDateTime66 = booking62.getEndTime();
        java.time.LocalDateTime localDateTime67 = booking62.getCheckInTime();
        java.time.LocalDateTime localDateTime70 = null;
        java.time.LocalDateTime localDateTime71 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking72 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime70, localDateTime71);
        java.lang.Boolean boolean73 = booking72.getIsCheckedIn();
        booking72.checkIn();
        java.time.LocalDateTime localDateTime75 = null;
        booking72.setCheckInTime(localDateTime75);
        booking72.setHostId("hi!");
        booking72.setRoomId("");
        boolean boolean81 = booking72.isCancelled();
        java.lang.String str82 = booking72.getHostId();
        java.time.LocalDateTime localDateTime85 = null;
        java.time.LocalDateTime localDateTime86 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking87 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime85, localDateTime86);
        boolean boolean88 = booking87.isCancelled();
        booking87.checkIn();
        java.time.LocalDateTime localDateTime90 = booking87.getCheckInTime();
        booking72.setStartTime(localDateTime90);
        booking62.setStartTime(localDateTime90);
        booking52.setStartTime(localDateTime90);
        org.openjfx.EECS_3311_Project.model.Booking booking94 = new org.openjfx.EECS_3311_Project.model.Booking("c3f2b004-32ff-4751-914e-6b02c315e7cc", "54497032-b00f-495c-b3e5-586651a6179c", localDateTime44, localDateTime90);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(localDateTime66);
        org.junit.Assert.assertNull(localDateTime67);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(localDateTime90);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setName("hi!");
        java.lang.String str13 = booking4.getName();
        booking4.setRoomId("2d328734-7239-456f-85a0-7f62b3b43caf");
        java.lang.Boolean boolean16 = booking4.getIsCheckedIn();
        java.lang.String str17 = booking4.getHostId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = booking4.getEndTime();
        booking4.checkIn();
        java.util.List<java.lang.String> strList11 = booking4.getAttendeeIds();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.setRoomId("");
        booking4.setHostId("b6952f00-19ed-471e-a77c-5ac86038da89");
        java.lang.String str10 = booking4.getName();
        java.lang.Boolean boolean11 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.lang.String str13 = booking4.getStudentOrOrganizationId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "New Meeting" + "'", str10, "New Meeting");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking6 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime4, localDateTime5);
        boolean boolean7 = booking6.isCancelled();
        booking6.checkIn();
        java.time.LocalDateTime localDateTime9 = booking6.getCheckInTime();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking14 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime12, localDateTime13);
        boolean boolean15 = booking14.isCancelled();
        booking14.checkIn();
        java.time.LocalDateTime localDateTime17 = booking14.getCheckInTime();
        org.openjfx.EECS_3311_Project.model.Booking booking18 = new org.openjfx.EECS_3311_Project.model.Booking("fb0ea706-77b6-4282-b952-8013cf849ac4", "New Meeting", localDateTime9, localDateTime17);
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking23 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime21, localDateTime22);
        java.lang.String str24 = booking23.getRoomId();
        booking23.setRoomId("hi!");
        java.time.LocalDateTime localDateTime27 = null;
        booking23.setStartTime(localDateTime27);
        java.lang.String str29 = booking23.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList30 = booking23.getAttendeeIds();
        booking23.setCancelled(true);
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking37 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime35, localDateTime36);
        boolean boolean38 = booking37.isCancelled();
        booking37.setStudentOrOrganizationId("dacbd1e4-b01b-4af2-a5e2-41702233ed46");
        java.lang.String str41 = booking37.getStudentOrOrganizationId();
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking46 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime44, localDateTime45);
        java.lang.String str47 = booking46.getRoomId();
        booking46.setRoomId("hi!");
        java.time.LocalDateTime localDateTime50 = null;
        booking46.setStartTime(localDateTime50);
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking56 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime54, localDateTime55);
        java.lang.Boolean boolean57 = booking56.getIsCheckedIn();
        booking56.checkIn();
        java.time.LocalDateTime localDateTime59 = null;
        booking56.setCheckInTime(localDateTime59);
        booking56.setHostId("hi!");
        booking56.setRoomId("");
        boolean boolean65 = booking56.isCancelled();
        java.lang.String str66 = booking56.getHostId();
        java.time.LocalDateTime localDateTime69 = null;
        java.time.LocalDateTime localDateTime70 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking71 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime69, localDateTime70);
        boolean boolean72 = booking71.isCancelled();
        booking71.checkIn();
        java.time.LocalDateTime localDateTime74 = booking71.getCheckInTime();
        booking56.setStartTime(localDateTime74);
        booking46.setStartTime(localDateTime74);
        java.time.LocalDateTime localDateTime77 = booking46.getStartTime();
        booking37.setStartTime(localDateTime77);
        booking23.setEndTime(localDateTime77);
        booking18.setStartTime(localDateTime77);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "dacbd1e4-b01b-4af2-a5e2-41702233ed46" + "'", str41, "dacbd1e4-b01b-4af2-a5e2-41702233ed46");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(localDateTime74);
        org.junit.Assert.assertNotNull(localDateTime77);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.lang.String str7 = booking4.getId();
        java.time.LocalDateTime localDateTime8 = booking4.getEndTime();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = booking4.calculateDepositPrice(accountRole9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "22) test227(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9ac65260-7fbe-4f90-8490-c94ac53c671e" + "'", str7, "9ac65260-7fbe-4f90-8490-c94ac53c671e");
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.lang.String str7 = booking4.getRoomId();
        booking4.checkIn();
        booking4.setCancelled(false);
        booking4.setId("bce87b8a-ced2-4072-9574-e7ba451cf76a");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setName("hi!");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = booking4.calculateDepositPrice(accountRole13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = booking4.getStartTime();
        booking4.setName("40e1ffec-196b-4a90-af80-8a4381451585");
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking16 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime14, localDateTime15);
        java.lang.Boolean boolean17 = booking16.getIsCheckedIn();
        booking16.checkIn();
        java.time.LocalDateTime localDateTime19 = null;
        booking16.setCheckInTime(localDateTime19);
        booking16.setHostId("hi!");
        booking16.setRoomId("");
        boolean boolean25 = booking16.isCancelled();
        java.lang.String str26 = booking16.getHostId();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking31 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime29, localDateTime30);
        boolean boolean32 = booking31.isCancelled();
        booking31.checkIn();
        java.time.LocalDateTime localDateTime34 = booking31.getCheckInTime();
        booking16.setStartTime(localDateTime34);
        booking4.setCheckInTime(localDateTime34);
        java.lang.Class<?> wildcardClass37 = localDateTime34.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.util.List<java.lang.String> strList8 = null;
        booking4.setAttendeeIds(strList8);
        booking4.setId("");
        java.lang.Boolean boolean12 = booking4.getIsCheckedIn();
        java.lang.Class<?> wildcardClass13 = booking4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.setRoomId("");
        java.lang.String str8 = booking4.getStudentOrOrganizationId();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking13 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime11, localDateTime12);
        java.lang.Boolean boolean14 = booking13.getIsCheckedIn();
        booking13.checkIn();
        java.time.LocalDateTime localDateTime16 = null;
        booking13.setCheckInTime(localDateTime16);
        booking13.setHostId("hi!");
        booking13.setRoomId("");
        boolean boolean22 = booking13.isCancelled();
        java.lang.String str23 = booking13.getHostId();
        booking13.checkIn();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking31 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime29, localDateTime30);
        boolean boolean32 = booking31.isCancelled();
        booking31.checkIn();
        java.time.LocalDateTime localDateTime34 = booking31.getCheckInTime();
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking39 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime37, localDateTime38);
        boolean boolean40 = booking39.isCancelled();
        booking39.checkIn();
        java.time.LocalDateTime localDateTime42 = booking39.getCheckInTime();
        org.openjfx.EECS_3311_Project.model.Booking booking43 = new org.openjfx.EECS_3311_Project.model.Booking("fb0ea706-77b6-4282-b952-8013cf849ac4", "New Meeting", localDateTime34, localDateTime42);
        booking13.setEndTime(localDateTime34);
        booking4.setStartTime(localDateTime34);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(localDateTime42);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList13);
        java.lang.Boolean boolean16 = booking4.getIsCheckedIn();
        java.time.LocalDateTime localDateTime17 = booking4.getEndTime();
        booking4.checkIn();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole19 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = booking4.calculateTotalPrice(accountRole19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        booking4.setName("3af102af-2aea-4b76-86a1-eb2b8135446c");
        booking4.setId("04a59002-9ff9-4a5b-8629-b20d1bbe2a88");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.time.LocalDateTime localDateTime8 = null;
        booking4.setStartTime(localDateTime8);
        java.lang.String str10 = booking4.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList11 = booking4.getAttendeeIds();
        booking4.setCancelled(true);
        booking4.checkIn();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.util.List<java.lang.String> strList8 = null;
        booking4.setAttendeeIds(strList8);
        booking4.setIsCheckedIn((java.lang.Boolean) false);
        java.lang.String str12 = booking4.getId();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking17 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime15, localDateTime16);
        boolean boolean18 = booking17.isCancelled();
        booking17.checkIn();
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking24 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime22, localDateTime23);
        java.lang.String str25 = booking24.getRoomId();
        booking24.setRoomId("hi!");
        java.lang.String str28 = booking24.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList29 = booking24.getAttendeeIds();
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking34 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime32, localDateTime33);
        java.lang.Boolean boolean35 = booking34.getIsCheckedIn();
        booking34.setRoomId("");
        java.time.LocalDateTime localDateTime38 = booking34.getEndTime();
        java.time.LocalDateTime localDateTime39 = booking34.getCheckInTime();
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking44 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime42, localDateTime43);
        java.lang.Boolean boolean45 = booking44.getIsCheckedIn();
        booking44.checkIn();
        java.time.LocalDateTime localDateTime47 = null;
        booking44.setCheckInTime(localDateTime47);
        booking44.setHostId("hi!");
        booking44.setRoomId("");
        boolean boolean53 = booking44.isCancelled();
        java.lang.String str54 = booking44.getHostId();
        java.time.LocalDateTime localDateTime57 = null;
        java.time.LocalDateTime localDateTime58 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking59 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime57, localDateTime58);
        boolean boolean60 = booking59.isCancelled();
        booking59.checkIn();
        java.time.LocalDateTime localDateTime62 = booking59.getCheckInTime();
        booking44.setStartTime(localDateTime62);
        booking34.setStartTime(localDateTime62);
        booking24.setStartTime(localDateTime62);
        booking17.setCheckInTime(localDateTime62);
        java.time.LocalDateTime localDateTime67 = booking17.getCheckInTime();
        booking4.setStartTime(localDateTime67);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "23) test236(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "848e4b8d-d366-498a-943a-3529e0a4a9f0" + "'", str12, "848e4b8d-d366-498a-943a-3529e0a4a9f0");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(localDateTime38);
        org.junit.Assert.assertNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(localDateTime62);
        org.junit.Assert.assertNotNull(localDateTime67);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.setRoomId("");
        booking4.setName("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        java.lang.String str10 = booking4.getId();
        java.time.LocalDateTime localDateTime11 = booking4.getStartTime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky "24) test237(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "8dafd9c4-4bba-4a25-b1c5-c529e8b7c593" + "'", str10, "8dafd9c4-4bba-4a25-b1c5-c529e8b7c593");
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setStudentOrOrganizationId("fb0ea706-77b6-4282-b952-8013cf849ac4");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking12 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime10, localDateTime11);
        java.lang.String str13 = booking12.getRoomId();
        booking12.setRoomId("hi!");
        java.lang.String str16 = booking12.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList17 = booking12.getAttendeeIds();
        booking4.setAttendeeIds(strList17);
        java.lang.String str19 = booking4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "New Meeting" + "'", str19, "New Meeting");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.lang.String str7 = booking4.getRoomId();
        java.time.LocalDateTime localDateTime8 = booking4.getEndTime();
        java.lang.String str9 = booking4.getStudentOrOrganizationId();
        booking4.setName("hi!");
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking16 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime14, localDateTime15);
        java.lang.String str17 = booking16.getRoomId();
        booking16.setStudentOrOrganizationId("fb0ea706-77b6-4282-b952-8013cf849ac4");
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking24 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime22, localDateTime23);
        java.lang.String str25 = booking24.getRoomId();
        booking24.setRoomId("hi!");
        java.lang.String str28 = booking24.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList29 = booking24.getAttendeeIds();
        booking16.setAttendeeIds(strList29);
        booking4.setAttendeeIds(strList29);
        java.time.LocalDateTime localDateTime32 = booking4.getCheckInTime();
        java.lang.String str33 = booking4.getStudentOrOrganizationId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.lang.String str8 = booking4.getStudentOrOrganizationId();
        java.time.LocalDateTime localDateTime9 = booking4.getEndTime();
        java.lang.String str10 = booking4.getRoomId();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking15 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime13, localDateTime14);
        java.lang.String str16 = booking15.getRoomId();
        booking15.setRoomId("hi!");
        java.lang.String str19 = booking15.getStudentOrOrganizationId();
        booking15.setId("bce87b8a-ced2-4072-9574-e7ba451cf76a");
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking28 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime26, localDateTime27);
        boolean boolean29 = booking28.isCancelled();
        booking28.checkIn();
        java.time.LocalDateTime localDateTime31 = booking28.getCheckInTime();
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking36 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime34, localDateTime35);
        boolean boolean37 = booking36.isCancelled();
        booking36.checkIn();
        java.time.LocalDateTime localDateTime39 = booking36.getCheckInTime();
        org.openjfx.EECS_3311_Project.model.Booking booking40 = new org.openjfx.EECS_3311_Project.model.Booking("fb0ea706-77b6-4282-b952-8013cf849ac4", "New Meeting", localDateTime31, localDateTime39);
        java.lang.String[] strArray48 = new java.lang.String[] { "New Meeting", "hi!", "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff", "48e65325-60ae-405e-a86f-48f78c4f6b56", "48e65325-60ae-405e-a86f-48f78c4f6b56", "bce87b8a-ced2-4072-9574-e7ba451cf76a", "New Meeting" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        booking40.setAttendeeIds((java.util.List<java.lang.String>) strList49);
        booking15.setAttendeeIds((java.util.List<java.lang.String>) strList49);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList49);
        java.time.LocalDateTime localDateTime54 = booking4.getStartTime();
        java.time.LocalDateTime localDateTime55 = booking4.getCheckInTime();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "New Meeting", "hi!", "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff", "48e65325-60ae-405e-a86f-48f78c4f6b56", "48e65325-60ae-405e-a86f-48f78c4f6b56", "bce87b8a-ced2-4072-9574-e7ba451cf76a", "New Meeting" });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(localDateTime54);
        org.junit.Assert.assertNull(localDateTime55);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.util.List<java.lang.String> strList8 = null;
        booking4.setAttendeeIds(strList8);
        booking4.setId("");
        booking4.setHostId("10c414e9-8a74-4e57-8912-e979f7226ad9");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Booking booking1 = new org.openjfx.EECS_3311_Project.model.Booking("1692f504-8608-4364-9492-b6af5e3652d8");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.time.LocalDateTime localDateTime8 = null;
        booking4.setStartTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = booking4.getEndTime();
        booking4.setStudentOrOrganizationId("439482f7-1bfe-4107-a20e-547c34ae05e4");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        boolean boolean13 = booking4.isCancelled();
        java.lang.String str14 = booking4.getHostId();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking20 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime18, localDateTime19);
        boolean boolean21 = booking20.isCancelled();
        booking20.checkIn();
        java.time.LocalDateTime localDateTime23 = booking20.getCheckInTime();
        booking4.setCheckInTime(localDateTime23);
        java.util.List<java.lang.String> strList25 = booking4.getAttendeeIds();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(strList25);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.setRoomId("");
        booking4.setHostId("b6952f00-19ed-471e-a77c-5ac86038da89");
        java.lang.String str10 = booking4.getHostId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "b6952f00-19ed-471e-a77c-5ac86038da89" + "'", str10, "b6952f00-19ed-471e-a77c-5ac86038da89");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.setRoomId("");
        java.time.LocalDateTime localDateTime8 = booking4.getEndTime();
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole9 = null;
        java.time.Duration duration10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = booking4.calculateExtendPrice(accountRole9, duration10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.Duration.toHours()\" because \"extension\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        boolean boolean13 = booking4.isCancelled();
        java.lang.String str14 = booking4.getHostId();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking22 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime20, localDateTime21);
        boolean boolean23 = booking22.isCancelled();
        booking22.checkIn();
        java.time.LocalDateTime localDateTime25 = booking22.getCheckInTime();
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking30 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime28, localDateTime29);
        boolean boolean31 = booking30.isCancelled();
        booking30.checkIn();
        java.time.LocalDateTime localDateTime33 = booking30.getCheckInTime();
        org.openjfx.EECS_3311_Project.model.Booking booking34 = new org.openjfx.EECS_3311_Project.model.Booking("fb0ea706-77b6-4282-b952-8013cf849ac4", "New Meeting", localDateTime25, localDateTime33);
        booking4.setEndTime(localDateTime25);
        java.time.LocalDateTime localDateTime36 = booking4.getStartTime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNull(localDateTime36);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.setRoomId("");
        booking4.setName("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        booking4.setHostId("fb0ea706-77b6-4282-b952-8013cf849ac4");
        java.lang.Boolean boolean12 = booking4.getIsCheckedIn();
        java.lang.Boolean boolean13 = booking4.getIsCheckedIn();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.setRoomId("");
        booking4.setName("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        booking4.setHostId("fb0ea706-77b6-4282-b952-8013cf849ac4");
        java.util.List<java.lang.String> strList12 = booking4.getAttendeeIds();
        booking4.setStudentOrOrganizationId("5ac1f678-3e49-4f90-9760-5884d8e09d2e");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        boolean boolean13 = booking4.isCancelled();
        java.lang.String str14 = booking4.getHostId();
        java.time.LocalDateTime localDateTime15 = booking4.getCheckInTime();
        booking4.setStudentOrOrganizationId("2afae645-dce6-4037-92f8-4771d5058b06");
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking22 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime20, localDateTime21);
        java.lang.Boolean boolean23 = booking22.getIsCheckedIn();
        booking22.checkIn();
        java.time.LocalDateTime localDateTime25 = null;
        booking22.setCheckInTime(localDateTime25);
        booking22.setHostId("hi!");
        booking22.setRoomId("");
        boolean boolean31 = booking22.isCancelled();
        java.lang.String str32 = booking22.getHostId();
        booking22.checkIn();
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking38 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime36, localDateTime37);
        boolean boolean39 = booking38.isCancelled();
        booking38.checkIn();
        java.time.LocalDateTime localDateTime41 = booking38.getCheckInTime();
        booking22.setCheckInTime(localDateTime41);
        booking4.setCheckInTime(localDateTime41);
        java.lang.String str44 = booking4.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setName("hi!");
        java.lang.String str13 = booking4.getName();
        booking4.setRoomId("2d328734-7239-456f-85a0-7f62b3b43caf");
        booking4.setRoomId("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.lang.String str8 = booking4.getStudentOrOrganizationId();
        java.time.LocalDateTime localDateTime9 = booking4.getEndTime();
        java.lang.String str10 = booking4.getRoomId();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking15 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime13, localDateTime14);
        java.lang.String str16 = booking15.getRoomId();
        booking15.setRoomId("hi!");
        java.lang.String str19 = booking15.getStudentOrOrganizationId();
        booking15.setId("bce87b8a-ced2-4072-9574-e7ba451cf76a");
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking28 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime26, localDateTime27);
        boolean boolean29 = booking28.isCancelled();
        booking28.checkIn();
        java.time.LocalDateTime localDateTime31 = booking28.getCheckInTime();
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking36 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime34, localDateTime35);
        boolean boolean37 = booking36.isCancelled();
        booking36.checkIn();
        java.time.LocalDateTime localDateTime39 = booking36.getCheckInTime();
        org.openjfx.EECS_3311_Project.model.Booking booking40 = new org.openjfx.EECS_3311_Project.model.Booking("fb0ea706-77b6-4282-b952-8013cf849ac4", "New Meeting", localDateTime31, localDateTime39);
        java.lang.String[] strArray48 = new java.lang.String[] { "New Meeting", "hi!", "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff", "48e65325-60ae-405e-a86f-48f78c4f6b56", "48e65325-60ae-405e-a86f-48f78c4f6b56", "bce87b8a-ced2-4072-9574-e7ba451cf76a", "New Meeting" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        booking40.setAttendeeIds((java.util.List<java.lang.String>) strList49);
        booking15.setAttendeeIds((java.util.List<java.lang.String>) strList49);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = booking4.toCSVRow();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.toString()\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "New Meeting", "hi!", "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff", "48e65325-60ae-405e-a86f-48f78c4f6b56", "48e65325-60ae-405e-a86f-48f78c4f6b56", "bce87b8a-ced2-4072-9574-e7ba451cf76a", "New Meeting" });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        java.lang.Boolean boolean13 = booking4.getIsCheckedIn();
        java.lang.String str14 = booking4.getName();
        java.lang.Boolean boolean15 = booking4.getIsCheckedIn();
        booking4.setIsCheckedIn((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "New Meeting" + "'", str14, "New Meeting");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList9);
        java.lang.String str12 = booking4.getName();
        java.lang.String str13 = booking4.getName();
        java.lang.String str14 = booking4.getName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "New Meeting" + "'", str12, "New Meeting");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "New Meeting" + "'", str13, "New Meeting");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "New Meeting" + "'", str14, "New Meeting");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        java.lang.Boolean boolean9 = booking4.getIsCheckedIn();
        booking4.setName("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        booking4.setId("c3f2b004-32ff-4751-914e-6b02c315e7cc");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking12 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime10, localDateTime11);
        java.lang.Boolean boolean13 = booking12.getIsCheckedIn();
        java.time.LocalDateTime localDateTime14 = booking12.getEndTime();
        java.time.LocalDateTime localDateTime15 = booking12.getStartTime();
        java.util.List<java.lang.String> strList16 = booking12.getAttendeeIds();
        booking4.setAttendeeIds(strList16);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.util.List<java.lang.String> strList8 = null;
        booking4.setAttendeeIds(strList8);
        booking4.setId("");
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking16 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime14, localDateTime15);
        java.lang.Boolean boolean17 = booking16.getIsCheckedIn();
        booking16.checkIn();
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking23 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime21, localDateTime22);
        java.lang.Boolean boolean24 = booking23.getIsCheckedIn();
        booking23.checkIn();
        java.time.LocalDateTime localDateTime26 = null;
        booking23.setCheckInTime(localDateTime26);
        booking23.setHostId("hi!");
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        booking23.setAttendeeIds((java.util.List<java.lang.String>) strList32);
        booking16.setAttendeeIds((java.util.List<java.lang.String>) strList32);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList32);
        booking4.setId("bf1fa428-38ab-42bb-abe4-d1f7fee5da1b");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        java.time.LocalDateTime localDateTime9 = booking4.getEndTime();
        booking4.checkIn();
        java.lang.Class<?> wildcardClass11 = booking4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.util.List<java.lang.String> strList8 = null;
        booking4.setAttendeeIds(strList8);
        booking4.setId("");
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking16 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime14, localDateTime15);
        java.lang.String str17 = booking16.getRoomId();
        booking16.setRoomId("hi!");
        java.util.List<java.lang.String> strList20 = null;
        booking16.setAttendeeIds(strList20);
        booking16.setId("");
        java.lang.Boolean boolean24 = booking16.getIsCheckedIn();
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking29 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime27, localDateTime28);
        java.lang.Boolean boolean30 = booking29.getIsCheckedIn();
        booking29.checkIn();
        java.time.LocalDateTime localDateTime32 = null;
        booking29.setCheckInTime(localDateTime32);
        booking29.setHostId("hi!");
        booking29.setRoomId("");
        boolean boolean38 = booking29.isCancelled();
        java.lang.String str39 = booking29.getHostId();
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking44 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime42, localDateTime43);
        boolean boolean45 = booking44.isCancelled();
        booking44.checkIn();
        java.time.LocalDateTime localDateTime47 = booking44.getCheckInTime();
        booking29.setStartTime(localDateTime47);
        booking16.setEndTime(localDateTime47);
        booking4.setCheckInTime(localDateTime47);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(localDateTime47);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        booking4.setRoomId("");
        boolean boolean13 = booking4.isCancelled();
        java.lang.String str14 = booking4.getHostId();
        java.time.LocalDateTime localDateTime15 = booking4.getCheckInTime();
        java.util.List<java.lang.String> strList16 = booking4.getAttendeeIds();
        booking4.setRoomId("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        booking4.setIsCheckedIn((java.lang.Boolean) true);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking25 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime23, localDateTime24);
        boolean boolean26 = booking25.isCancelled();
        booking25.checkIn();
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking32 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime30, localDateTime31);
        java.lang.String str33 = booking32.getRoomId();
        booking32.setRoomId("hi!");
        java.lang.String str36 = booking32.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList37 = booking32.getAttendeeIds();
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking42 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime40, localDateTime41);
        java.lang.Boolean boolean43 = booking42.getIsCheckedIn();
        booking42.setRoomId("");
        java.time.LocalDateTime localDateTime46 = booking42.getEndTime();
        java.time.LocalDateTime localDateTime47 = booking42.getCheckInTime();
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking52 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime50, localDateTime51);
        java.lang.Boolean boolean53 = booking52.getIsCheckedIn();
        booking52.checkIn();
        java.time.LocalDateTime localDateTime55 = null;
        booking52.setCheckInTime(localDateTime55);
        booking52.setHostId("hi!");
        booking52.setRoomId("");
        boolean boolean61 = booking52.isCancelled();
        java.lang.String str62 = booking52.getHostId();
        java.time.LocalDateTime localDateTime65 = null;
        java.time.LocalDateTime localDateTime66 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking67 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime65, localDateTime66);
        boolean boolean68 = booking67.isCancelled();
        booking67.checkIn();
        java.time.LocalDateTime localDateTime70 = booking67.getCheckInTime();
        booking52.setStartTime(localDateTime70);
        booking42.setStartTime(localDateTime70);
        booking32.setStartTime(localDateTime70);
        booking25.setCheckInTime(localDateTime70);
        java.time.LocalDateTime localDateTime75 = booking25.getCheckInTime();
        booking4.setEndTime(localDateTime75);
        java.lang.Class<?> wildcardClass77 = localDateTime75.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(localDateTime46);
        org.junit.Assert.assertNull(localDateTime47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertNotNull(localDateTime75);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setStudentOrOrganizationId("7bdec8d4-a361-4af8-b39d-e7334e644fd8");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole11 = null;
        java.time.Duration duration12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = booking4.calculateExtendPrice(accountRole11, duration12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.Duration.toHours()\" because \"extension\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking6 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime4, localDateTime5);
        java.lang.Boolean boolean7 = booking6.getIsCheckedIn();
        booking6.checkIn();
        java.time.LocalDateTime localDateTime9 = null;
        booking6.setCheckInTime(localDateTime9);
        booking6.setHostId("hi!");
        booking6.setRoomId("");
        boolean boolean15 = booking6.isCancelled();
        java.lang.String str16 = booking6.getHostId();
        booking6.checkIn();
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking22 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime20, localDateTime21);
        boolean boolean23 = booking22.isCancelled();
        booking22.checkIn();
        java.time.LocalDateTime localDateTime25 = booking22.getCheckInTime();
        booking6.setCheckInTime(localDateTime25);
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking31 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime29, localDateTime30);
        java.lang.Boolean boolean32 = booking31.getIsCheckedIn();
        booking31.checkIn();
        java.time.LocalDateTime localDateTime34 = null;
        booking31.setCheckInTime(localDateTime34);
        java.time.LocalDateTime localDateTime36 = booking31.getEndTime();
        booking31.setIsCheckedIn((java.lang.Boolean) false);
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking43 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime41, localDateTime42);
        java.lang.String str44 = booking43.getRoomId();
        booking43.setRoomId("hi!");
        java.lang.String str47 = booking43.getStudentOrOrganizationId();
        java.util.List<java.lang.String> strList48 = booking43.getAttendeeIds();
        java.time.LocalDateTime localDateTime51 = null;
        java.time.LocalDateTime localDateTime52 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking53 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime51, localDateTime52);
        java.lang.Boolean boolean54 = booking53.getIsCheckedIn();
        booking53.setRoomId("");
        java.time.LocalDateTime localDateTime57 = booking53.getEndTime();
        java.time.LocalDateTime localDateTime58 = booking53.getCheckInTime();
        java.time.LocalDateTime localDateTime61 = null;
        java.time.LocalDateTime localDateTime62 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking63 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime61, localDateTime62);
        java.lang.Boolean boolean64 = booking63.getIsCheckedIn();
        booking63.checkIn();
        java.time.LocalDateTime localDateTime66 = null;
        booking63.setCheckInTime(localDateTime66);
        booking63.setHostId("hi!");
        booking63.setRoomId("");
        boolean boolean72 = booking63.isCancelled();
        java.lang.String str73 = booking63.getHostId();
        java.time.LocalDateTime localDateTime76 = null;
        java.time.LocalDateTime localDateTime77 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking78 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime76, localDateTime77);
        boolean boolean79 = booking78.isCancelled();
        booking78.checkIn();
        java.time.LocalDateTime localDateTime81 = booking78.getCheckInTime();
        booking63.setStartTime(localDateTime81);
        booking53.setStartTime(localDateTime81);
        booking43.setStartTime(localDateTime81);
        booking31.setEndTime(localDateTime81);
        org.openjfx.EECS_3311_Project.model.Booking booking86 = new org.openjfx.EECS_3311_Project.model.Booking("", "bce87b8a-ced2-4072-9574-e7ba451cf76a", localDateTime25, localDateTime81);
        booking86.setHostId("");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(localDateTime57);
        org.junit.Assert.assertNull(localDateTime58);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(localDateTime81);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.Boolean boolean5 = booking4.getIsCheckedIn();
        booking4.checkIn();
        java.time.LocalDateTime localDateTime7 = null;
        booking4.setCheckInTime(localDateTime7);
        booking4.setHostId("hi!");
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList13);
        java.lang.String str16 = booking4.getRoomId();
        java.lang.String[] strArray19 = new java.lang.String[] { "fb0ea706-77b6-4282-b952-8013cf849ac4", "40e1ffec-196b-4a90-af80-8a4381451585" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        booking4.setAttendeeIds((java.util.List<java.lang.String>) strList20);
        java.time.LocalDateTime localDateTime23 = booking4.getStartTime();
        java.time.LocalDateTime localDateTime24 = booking4.getEndTime();
        booking4.setName("");
        java.time.LocalDateTime localDateTime27 = booking4.getStartTime();
        booking4.setName("48e65325-60ae-405e-a86f-48f78c4f6b56");
        booking4.setStudentOrOrganizationId("d1bec03c-448f-43c1-a00f-04dd67b97b4d");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "fb0ea706-77b6-4282-b952-8013cf849ac4", "40e1ffec-196b-4a90-af80-8a4381451585" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertNull(localDateTime27);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking6 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime4, localDateTime5);
        boolean boolean7 = booking6.isCancelled();
        booking6.checkIn();
        java.time.LocalDateTime localDateTime9 = booking6.getCheckInTime();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking14 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime12, localDateTime13);
        boolean boolean15 = booking14.isCancelled();
        booking14.checkIn();
        java.time.LocalDateTime localDateTime17 = booking14.getCheckInTime();
        org.openjfx.EECS_3311_Project.model.Booking booking18 = new org.openjfx.EECS_3311_Project.model.Booking("fb0ea706-77b6-4282-b952-8013cf849ac4", "New Meeting", localDateTime9, localDateTime17);
        java.lang.String[] strArray26 = new java.lang.String[] { "New Meeting", "hi!", "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff", "48e65325-60ae-405e-a86f-48f78c4f6b56", "48e65325-60ae-405e-a86f-48f78c4f6b56", "bce87b8a-ced2-4072-9574-e7ba451cf76a", "New Meeting" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        booking18.setAttendeeIds((java.util.List<java.lang.String>) strList27);
        booking18.checkIn();
        java.lang.String str31 = booking18.getId();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "New Meeting", "hi!", "1fe2c1cb-6ce8-496a-a8ef-39c2c5aa23ff", "48e65325-60ae-405e-a86f-48f78c4f6b56", "48e65325-60ae-405e-a86f-48f78c4f6b56", "bce87b8a-ced2-4072-9574-e7ba451cf76a", "New Meeting" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
// flaky "25) test264(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "854c9885-de2e-4883-8faf-86ce02022493" + "'", str31, "854c9885-de2e-4883-8faf-86ce02022493");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        boolean boolean5 = booking4.isCancelled();
        booking4.setStudentOrOrganizationId("dacbd1e4-b01b-4af2-a5e2-41702233ed46");
        java.lang.String str8 = booking4.getStudentOrOrganizationId();
        java.time.LocalDateTime localDateTime9 = booking4.getCheckInTime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "dacbd1e4-b01b-4af2-a5e2-41702233ed46" + "'", str8, "dacbd1e4-b01b-4af2-a5e2-41702233ed46");
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.time.LocalDateTime localDateTime8 = null;
        booking4.setStartTime(localDateTime8);
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking14 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime12, localDateTime13);
        java.lang.Boolean boolean15 = booking14.getIsCheckedIn();
        booking14.checkIn();
        java.time.LocalDateTime localDateTime17 = null;
        booking14.setCheckInTime(localDateTime17);
        booking14.setHostId("hi!");
        booking14.setRoomId("");
        boolean boolean23 = booking14.isCancelled();
        java.lang.String str24 = booking14.getHostId();
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking29 = new org.openjfx.EECS_3311_Project.model.Booking("", "hi!", localDateTime27, localDateTime28);
        boolean boolean30 = booking29.isCancelled();
        booking29.checkIn();
        java.time.LocalDateTime localDateTime32 = booking29.getCheckInTime();
        booking14.setStartTime(localDateTime32);
        booking4.setStartTime(localDateTime32);
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole35 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double36 = booking4.calculateDepositPrice(accountRole35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: temporal");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localDateTime32);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        org.openjfx.EECS_3311_Project.model.Booking booking4 = new org.openjfx.EECS_3311_Project.model.Booking("hi!", "", localDateTime2, localDateTime3);
        java.lang.String str5 = booking4.getRoomId();
        booking4.setRoomId("hi!");
        java.util.List<java.lang.String> strList8 = null;
        booking4.setAttendeeIds(strList8);
        booking4.setId("");
        java.util.List<java.lang.String> strList12 = booking4.getAttendeeIds();
        java.lang.String str13 = booking4.getId();
        boolean boolean14 = booking4.isCancelled();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }
}
