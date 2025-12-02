package randoop.Room;

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
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("hi!", "", (int) 'a', false);
        java.lang.Class<?> wildcardClass5 = room4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor6 = null;
        room5.attachScanner(sensor6);
        java.lang.Class<?> wildcardClass8 = room5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor6 = null;
        room5.attachScanner(sensor6);
        room5.setCapacity((int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = room5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        java.lang.String str10 = room5.getId();
        room5.setRoomId("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        org.openjfx.EECS_3311_Project.model.Sensor sensor10 = null;
        room5.update(sensor10, "c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setActive(true);
        java.lang.Class<?> wildcardClass15 = room5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor6 = null;
        room5.attachScanner(sensor6);
        java.lang.String str8 = room5.getRoomId();
        room5.setRoomName("");
        room5.isActive = false;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor6 = null;
        room5.attachScanner(sensor6);
        boolean boolean8 = room5.isActive;
        java.lang.Class<?> wildcardClass9 = room5.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        boolean boolean10 = room5.isActive;
        room5.isActive = true;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        org.openjfx.EECS_3311_Project.model.Sensor sensor8 = null;
        room5.attachScanner(sensor8);
        java.lang.String str10 = room5.toCSVRow();
        room5.setCapacity(1);
        java.lang.String str13 = room5.toCSVRow();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",,true,97,hi!" + "'", str10, ",,true,97,hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ",,true,1,hi!" + "'", str13, ",,true,1,hi!");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor6 = null;
        room5.attachScanner(sensor6);
        java.lang.String str8 = room5.getRoomId();
        room5.setRoomName("");
        room5.setActive(true);
        java.lang.Class<?> wildcardClass13 = room5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        java.lang.String str10 = room5.getRoomId();
        org.openjfx.EECS_3311_Project.model.Sensor sensor11 = null;
        room5.attachScanner(sensor11);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room(",,true,97,hi!", "", (int) (short) 100, false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        org.openjfx.EECS_3311_Project.model.Sensor sensor8 = null;
        room5.attachScanner(sensor8);
        java.lang.String str10 = room5.toCSVRow();
        int int11 = room5.getCapacity();
        room5.setRoomName("c971b2a8-38c6-404a-84f6-acd93d662573");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",,true,97,hi!" + "'", str10, ",,true,97,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("c971b2a8-38c6-404a-84f6-acd93d662573", "hi!", "c971b2a8-38c6-404a-84f6-acd93d662573", (int) (byte) 0, false);
        boolean boolean6 = room5.isActive;
        boolean boolean7 = room5.isActive();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor6 = null;
        room5.attachScanner(sensor6);
        room5.setCapacity((int) (byte) -1);
        org.openjfx.EECS_3311_Project.model.Sensor sensor10 = null;
        room5.attachScanner(sensor10);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        java.lang.Class<?> wildcardClass8 = room5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        java.lang.String str11 = room5.getBuildingName();
        java.lang.String str12 = room5.getBuildingName();
        boolean boolean13 = room5.isActive();
        int int14 = room5.getCapacity();
        room5.isActive = false;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("hi!", "", "c971b2a8-38c6-404a-84f6-acd93d662573", (int) '4', true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        java.lang.String str11 = room5.getBuildingName();
        java.lang.String str12 = room5.getId();
        boolean boolean13 = room5.isActive();
        boolean boolean14 = room5.isActive;
        org.openjfx.EECS_3311_Project.model.Sensor sensor15 = null;
        room5.attachScanner(sensor15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573" + "'", str12, "c971b2a8-38c6-404a-84f6-acd93d662573");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room(",,true,1,hi!", "", "hi!", (int) (short) 100, false);
        java.lang.String str6 = room5.getRoomId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",,true,1,hi!" + "'", str6, ",,true,1,hi!");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomName("");
        int int9 = room5.getOccupancy();
        org.openjfx.EECS_3311_Project.model.Sensor sensor10 = null;
        room5.update(sensor10, "hi!");
        room5.setBuildingName("c971b2a8-38c6-404a-84f6-acd93d662573");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("hi!", "", (int) 'a', false);
        org.openjfx.EECS_3311_Project.model.Sensor sensor5 = null;
        room4.attachScanner(sensor5);
        org.openjfx.EECS_3311_Project.model.Sensor sensor7 = null;
        room4.attachScanner(sensor7);
        room4.setBuildingName(",,true,1,hi!");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room(",,true,1,hi!", "", (int) 'a', false);
        room4.setOccupancy((int) '#');
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("c971b2a8-38c6-404a-84f6-acd93d662573", "hi!", "c971b2a8-38c6-404a-84f6-acd93d662573", (int) (byte) 0, false);
        boolean boolean6 = room5.isActive;
        java.lang.Class<?> wildcardClass7 = room5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        java.lang.String str11 = room5.getBuildingName();
        java.lang.String str12 = room5.getId();
        room5.setCapacity((int) ' ');
        int int15 = room5.getOccupancy();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573" + "'", str12, "c971b2a8-38c6-404a-84f6-acd93d662573");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        java.lang.String str10 = room5.getRoomName();
        org.openjfx.EECS_3311_Project.model.Sensor sensor11 = null;
        room5.update(sensor11, "c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setBuildingName(",,false,97,hi!");
        org.openjfx.EECS_3311_Project.model.Sensor sensor16 = null;
        room5.update(sensor16, ",,false,97,hi!");
        room5.setBuildingName(",,true,97,hi!");
        org.openjfx.EECS_3311_Project.model.Sensor sensor21 = null;
        room5.update(sensor21, ",,true,97,hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor6 = null;
        room5.attachScanner(sensor6);
        java.lang.String str8 = room5.getRoomId();
        room5.setRoomName("");
        room5.setActive(false);
        room5.setOccupancy(0);
        org.openjfx.EECS_3311_Project.model.Sensor sensor15 = null;
        room5.attachScanner(sensor15);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Room room1 = new org.openjfx.EECS_3311_Project.model.Room("c971b2a8-38c6-404a-84f6-acd93d662573");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        boolean boolean10 = room5.isActive;
        int int11 = room5.getCapacity();
        boolean boolean12 = room5.isActive();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("hi!", "", (int) 'a', false);
        org.openjfx.EECS_3311_Project.model.Sensor sensor5 = null;
        room4.attachScanner(sensor5);
        room4.setActive(true);
        boolean boolean9 = room4.isActive;
        java.lang.String str10 = room4.getId();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky "1) test030(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2d7ece6e-4ef5-4627-a00d-90e311e10960" + "'", str10, "2d7ece6e-4ef5-4627-a00d-90e311e10960");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        org.openjfx.EECS_3311_Project.model.Sensor sensor10 = null;
        room5.update(sensor10, "c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setBuildingName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room(",,true,97,hi!", "c971b2a8-38c6-404a-84f6-acd93d662573", "hi!", 97, true);
        int int6 = room5.getCapacity();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        java.lang.String str10 = room5.getRoomName();
        room5.setOccupancy((int) 'a');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        room5.setActive(true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor13 = null;
        room5.attachScanner(sensor13);
        boolean boolean15 = room5.isActive();
        int int16 = room5.getOccupancy();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        java.lang.String str11 = room5.getBuildingName();
        java.lang.String str12 = room5.getBuildingName();
        java.lang.Class<?> wildcardClass13 = room5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor6 = null;
        room5.attachScanner(sensor6);
        boolean boolean8 = room5.isActive;
        java.lang.String str9 = room5.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        java.lang.String str10 = room5.getRoomName();
        org.openjfx.EECS_3311_Project.model.Sensor sensor11 = null;
        room5.update(sensor11, "c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setOccupancy((int) (short) 100);
        java.lang.String str16 = room5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Room room1 = new org.openjfx.EECS_3311_Project.model.Room("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room(",,true,97,hi!", "hi!", 100, true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        java.lang.String str11 = room5.getBuildingName();
        room5.setRoomId(",,true,97,hi!");
        room5.setCapacity((int) '#');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("hi!", "2d7ece6e-4ef5-4627-a00d-90e311e10960", "", (int) ' ', false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setRoomName("c971b2a8-38c6-404a-84f6-acd93d662573");
        boolean boolean10 = room5.isActive();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        java.lang.String str10 = room5.getRoomId();
        java.lang.Class<?> wildcardClass11 = room5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        java.lang.String str10 = room5.getRoomName();
        java.lang.String str11 = room5.toCSVRow();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",,false,97,hi!" + "'", str11, ",,false,97,hi!");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.openjfx.EECS_3311_Project.model.Room room1 = new org.openjfx.EECS_3311_Project.model.Room(",,true,1,hi!");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("hi!", ",,false,97,hi!", ",,true,97,hi!", (int) (short) 0, false);
        boolean boolean6 = room5.isActive;
        int int7 = room5.getCapacity();
        room5.setRoomName("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room(",,true,97,hi!", "c971b2a8-38c6-404a-84f6-acd93d662573", "hi!", 97, true);
        java.lang.Class<?> wildcardClass6 = room5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("hi!", "", (int) 'a', false);
        java.lang.String str5 = room4.getRoomId();
        java.lang.String str6 = room4.getId();
// flaky "2) test048(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "43530db9-a7bb-4e56-a787-2e03a04c20f4" + "'", str5, "43530db9-a7bb-4e56-a787-2e03a04c20f4");
// flaky "1) test048(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "43530db9-a7bb-4e56-a787-2e03a04c20f4" + "'", str6, "43530db9-a7bb-4e56-a787-2e03a04c20f4");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        java.lang.String str11 = room5.getBuildingName();
        java.lang.String str12 = room5.getBuildingName();
        boolean boolean13 = room5.isActive();
        int int14 = room5.getCapacity();
        room5.setRoomName(",,true,97,hi!");
        java.lang.Class<?> wildcardClass17 = room5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        java.lang.String str11 = room5.getBuildingName();
        java.lang.String str12 = room5.getId();
        room5.isActive = true;
        org.openjfx.EECS_3311_Project.model.Sensor sensor15 = null;
        room5.attachScanner(sensor15);
        room5.setBuildingName("hi!");
        boolean boolean19 = room5.isActive;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573" + "'", str12, "c971b2a8-38c6-404a-84f6-acd93d662573");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room(",,true,97,hi!", "c971b2a8-38c6-404a-84f6-acd93d662573", (int) 'a', false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomName("");
        int int9 = room5.getOccupancy();
        int int10 = room5.getOccupancy();
        boolean boolean11 = room5.isActive();
        room5.setActive(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        java.lang.String str11 = room5.getBuildingName();
        room5.setRoomId(",,true,97,hi!");
        room5.setRoomId("e6b615bd-b0d8-463a-b5cf-6a07fad27d55");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        java.lang.String str10 = room5.getId();
        java.lang.String str11 = room5.getRoomName();
        java.lang.String str12 = room5.getRoomId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        org.openjfx.EECS_3311_Project.model.Sensor sensor8 = null;
        room5.attachScanner(sensor8);
        int int10 = room5.getOccupancy();
        room5.setOccupancy(97);
        java.lang.String str13 = room5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        java.lang.String str11 = room5.getBuildingName();
        java.lang.String str12 = room5.getId();
        room5.isActive = true;
        org.openjfx.EECS_3311_Project.model.Sensor sensor15 = null;
        room5.attachScanner(sensor15);
        room5.setBuildingName("hi!");
        room5.setBuildingName(",,false,97,hi!");
        room5.setRoomId("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573" + "'", str12, "c971b2a8-38c6-404a-84f6-acd93d662573");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        java.lang.String str10 = room5.getId();
        java.lang.String str11 = room5.getRoomName();
        room5.setActive(true);
        java.lang.String str14 = room5.getRoomName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        java.lang.String str10 = room5.getRoomId();
        int int11 = room5.getCapacity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        boolean boolean10 = room5.isActive;
        room5.setBuildingName(",,true,1,hi!");
        org.openjfx.EECS_3311_Project.model.Sensor sensor13 = null;
        room5.update(sensor13, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        int int7 = room5.getCapacity();
        java.lang.String str8 = room5.getRoomId();
        java.lang.String str9 = room5.getRoomId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        java.lang.String str11 = room5.getBuildingName();
        java.lang.String str12 = room5.getId();
        room5.isActive = true;
        org.openjfx.EECS_3311_Project.model.Sensor sensor15 = null;
        room5.attachScanner(sensor15);
        room5.setBuildingName("hi!");
        room5.setBuildingName(",,false,97,hi!");
        int int21 = room5.getOccupancy();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573" + "'", str12, "c971b2a8-38c6-404a-84f6-acd93d662573");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room(",,false,97,hi!", "c971b2a8-38c6-404a-84f6-acd93d662573", (int) '4', true);
        int int5 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        org.openjfx.EECS_3311_Project.model.Sensor sensor8 = null;
        room5.attachScanner(sensor8);
        int int10 = room5.getOccupancy();
        java.lang.String str11 = room5.toCSVRow();
        room5.setActive(true);
        java.lang.String str14 = room5.toCSVRow();
        room5.setOccupancy((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",,true,97,hi!" + "'", str11, ",,true,97,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",,true,97,hi!" + "'", str14, ",,true,97,hi!");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Room room1 = new org.openjfx.EECS_3311_Project.model.Room("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        org.openjfx.EECS_3311_Project.model.Sensor sensor8 = null;
        room5.attachScanner(sensor8);
        java.lang.String str10 = room5.toCSVRow();
        java.lang.Class<?> wildcardClass11 = room5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",,true,97,hi!" + "'", str10, ",,true,97,hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room(",,true,1,hi!", "", (int) 'a', false);
        room4.setOccupancy((int) (short) 10);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        int int7 = room5.getCapacity();
        java.lang.String str8 = room5.getRoomId();
        org.openjfx.EECS_3311_Project.model.Sensor sensor9 = null;
        room5.attachScanner(sensor9);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        org.openjfx.EECS_3311_Project.model.Sensor sensor8 = null;
        room5.attachScanner(sensor8);
        room5.isActive = false;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        int int7 = room5.getOccupancy();
        java.lang.String str8 = room5.getRoomId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Room room1 = new org.openjfx.EECS_3311_Project.model.Room("e6b615bd-b0d8-463a-b5cf-6a07fad27d55");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("c971b2a8-38c6-404a-84f6-acd93d662573", "hi!", "c971b2a8-38c6-404a-84f6-acd93d662573", (int) (byte) 0, false);
        boolean boolean6 = room5.isActive;
        org.openjfx.EECS_3311_Project.model.Sensor sensor7 = null;
        room5.attachScanner(sensor7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("c971b2a8-38c6-404a-84f6-acd93d662573", ",,false,97,hi!", (int) (byte) 10, true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomName("");
        int int9 = room5.getCapacity();
        room5.setOccupancy((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        java.lang.String str11 = room5.getBuildingName();
        java.lang.String str12 = room5.getBuildingName();
        boolean boolean13 = room5.isActive();
        room5.setBuildingName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomName("");
        int int9 = room5.getCapacity();
        int int10 = room5.getOccupancy();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        room5.setActive(true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor13 = null;
        room5.attachScanner(sensor13);
        java.lang.String str15 = room5.getRoomId();
        int int16 = room5.getOccupancy();
        room5.setBuildingName("e6b615bd-b0d8-463a-b5cf-6a07fad27d55");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573" + "'", str15, "c971b2a8-38c6-404a-84f6-acd93d662573");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("", "c971b2a8-38c6-404a-84f6-acd93d662573", 100, false);
        room4.setCapacity((int) (short) 100);
        room4.setRoomId(",,true,97,hi!");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("hi!", ",,false,97,hi!", ",,true,97,hi!", (int) (short) 0, false);
        boolean boolean6 = room5.isActive;
        int int7 = room5.getCapacity();
        int int8 = room5.getOccupancy();
        boolean boolean9 = room5.isActive();
        room5.setOccupancy(52);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("hi!", "", (int) 'a', false);
        org.openjfx.EECS_3311_Project.model.Sensor sensor5 = null;
        room4.attachScanner(sensor5);
        org.openjfx.EECS_3311_Project.model.Sensor sensor7 = null;
        room4.attachScanner(sensor7);
        java.lang.String str9 = room4.toCSVRow();
// flaky "3) test079(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4f4cdb3a-bcc7-423c-9a68-27cadc9b0b9f,,true,97,hi!" + "'", str9, "4f4cdb3a-bcc7-423c-9a68-27cadc9b0b9f,,true,97,hi!");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        room5.setActive(true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor13 = null;
        room5.attachScanner(sensor13);
        java.lang.String str15 = room5.getRoomId();
        java.lang.String str16 = room5.toCSVRow();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573" + "'", str15, "c971b2a8-38c6-404a-84f6-acd93d662573");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573,,true,97,hi!" + "'", str16, "c971b2a8-38c6-404a-84f6-acd93d662573,,true,97,hi!");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Room room1 = new org.openjfx.EECS_3311_Project.model.Room("ed986422-a267-4e08-8c75-7ec40a059f59");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        java.lang.String str9 = room5.getId();
        java.lang.String str10 = room5.getBuildingName();
        java.lang.String str11 = room5.toCSVRow();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573" + "'", str9, "c971b2a8-38c6-404a-84f6-acd93d662573");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573,,true,97,hi!" + "'", str11, "c971b2a8-38c6-404a-84f6-acd93d662573,,true,97,hi!");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        boolean boolean10 = room5.isActive;
        room5.setOccupancy((int) '4');
        room5.setRoomId(",,true,1,hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.openjfx.EECS_3311_Project.model.Room room1 = new org.openjfx.EECS_3311_Project.model.Room(",,true,97,hi!");
        java.lang.String str2 = room1.getRoomId();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor6 = null;
        room5.attachScanner(sensor6);
        java.lang.String str8 = room5.getRoomId();
        room5.setRoomName("");
        org.openjfx.EECS_3311_Project.model.Sensor sensor11 = null;
        room5.update(sensor11, "hi!");
        room5.setBuildingName("e6b615bd-b0d8-463a-b5cf-6a07fad27d55");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        java.lang.String str10 = room5.getRoomId();
        java.lang.String str11 = room5.getRoomName();
        room5.setActive(false);
        org.openjfx.EECS_3311_Project.model.Sensor sensor14 = null;
        room5.update(sensor14, "43530db9-a7bb-4e56-a787-2e03a04c20f4");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        java.lang.String str11 = room5.getBuildingName();
        java.lang.String str12 = room5.getId();
        room5.isActive = true;
        room5.setActive(true);
        room5.setActive(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573" + "'", str12, "c971b2a8-38c6-404a-84f6-acd93d662573");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("c971b2a8-38c6-404a-84f6-acd93d662573", ",,true,1,hi!", (int) (short) 0, true);
        boolean boolean5 = room4.isActive;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        java.lang.String str10 = room5.getRoomName();
        org.openjfx.EECS_3311_Project.model.Sensor sensor11 = null;
        room5.update(sensor11, "c971b2a8-38c6-404a-84f6-acd93d662573");
        java.lang.String str14 = room5.getBuildingName();
        java.lang.String str15 = room5.toCSVRow();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",,false,97,hi!" + "'", str15, ",,false,97,hi!");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room(",,true,97,hi!", ",,true,97,hi!", 100, false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room(",,true,1,hi!", "", "", 0, false);
        room5.setBuildingName(",,true,1,hi!");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        room5.setActive(true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor13 = null;
        room5.attachScanner(sensor13);
        java.lang.String str15 = room5.getRoomId();
        boolean boolean16 = room5.isActive;
        java.lang.String str17 = room5.getBuildingName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573" + "'", str15, "c971b2a8-38c6-404a-84f6-acd93d662573");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("hi!", "", (int) 'a', false);
        org.openjfx.EECS_3311_Project.model.Sensor sensor5 = null;
        room4.attachScanner(sensor5);
        boolean boolean7 = room4.isActive;
        room4.setOccupancy((int) (short) 1);
        java.lang.Class<?> wildcardClass10 = room4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        room5.setActive(true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor13 = null;
        room5.attachScanner(sensor13);
        room5.setRoomName(",,false,97,hi!");
        room5.setActive(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("", ",,false,97,hi!", (int) (short) 0, false);
        room4.setCapacity((int) (byte) 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("c971b2a8-38c6-404a-84f6-acd93d662573", "hi!", "c971b2a8-38c6-404a-84f6-acd93d662573", (int) (byte) 0, false);
        boolean boolean6 = room5.isActive();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        room5.setActive(true);
        int int13 = room5.getCapacity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomName("");
        int int9 = room5.getOccupancy();
        int int10 = room5.getOccupancy();
        boolean boolean11 = room5.isActive();
        room5.isActive = true;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        room5.setActive(true);
        room5.setRoomName("hi!");
        int int14 = room5.getOccupancy();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        org.openjfx.EECS_3311_Project.model.Sensor sensor8 = null;
        room5.attachScanner(sensor8);
        int int10 = room5.getOccupancy();
        java.lang.String str11 = room5.toCSVRow();
        room5.setActive(true);
        java.lang.String str14 = room5.getRoomId();
        org.openjfx.EECS_3311_Project.model.Sensor sensor15 = null;
        room5.attachScanner(sensor15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",,true,97,hi!" + "'", str11, ",,true,97,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        java.lang.String str10 = room5.getRoomName();
        org.openjfx.EECS_3311_Project.model.Sensor sensor11 = null;
        room5.update(sensor11, "e6b615bd-b0d8-463a-b5cf-6a07fad27d55");
        room5.isActive = false;
        java.lang.Class<?> wildcardClass16 = room5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        org.openjfx.EECS_3311_Project.model.Sensor sensor8 = null;
        room5.attachScanner(sensor8);
        java.lang.String str10 = room5.toCSVRow();
        room5.isActive = false;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",,true,97,hi!" + "'", str10, ",,true,97,hi!");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        java.lang.String str10 = room5.getRoomName();
        org.openjfx.EECS_3311_Project.model.Sensor sensor11 = null;
        room5.update(sensor11, "c971b2a8-38c6-404a-84f6-acd93d662573");
        java.lang.String str14 = room5.getBuildingName();
        room5.setRoomId(",,false,97,hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor6 = null;
        room5.attachScanner(sensor6);
        java.lang.String str8 = room5.getRoomId();
        room5.setRoomName("");
        room5.setActive(false);
        java.lang.String str13 = room5.toCSVRow();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ",,false,97,hi!" + "'", str13, ",,false,97,hi!");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Room room1 = new org.openjfx.EECS_3311_Project.model.Room("1c680c53-bd18-4f40-ac36-6e1e8064f8fc");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor6 = null;
        room5.attachScanner(sensor6);
        java.lang.String str8 = room5.getRoomId();
        room5.setRoomName("");
        room5.setActive(false);
        room5.setOccupancy(0);
        room5.setActive(false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("c971b2a8-38c6-404a-84f6-acd93d662573", ",,true,1,hi!", (int) (short) 0, true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor5 = null;
        room4.update(sensor5, "2d7ece6e-4ef5-4627-a00d-90e311e10960");
        room4.isActive = true;
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        org.openjfx.EECS_3311_Project.model.Sensor sensor8 = null;
        room5.attachScanner(sensor8);
        java.lang.String str10 = room5.toCSVRow();
        int int11 = room5.getCapacity();
        room5.setCapacity((int) ' ');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",,true,97,hi!" + "'", str10, ",,true,97,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        org.openjfx.EECS_3311_Project.model.Sensor sensor8 = null;
        room5.attachScanner(sensor8);
        org.openjfx.EECS_3311_Project.model.Sensor sensor10 = null;
        room5.attachScanner(sensor10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("c971b2a8-38c6-404a-84f6-acd93d662573", "hi!", "c971b2a8-38c6-404a-84f6-acd93d662573", (int) (byte) 0, false);
        int int6 = room5.getOccupancy();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor6 = null;
        room5.attachScanner(sensor6);
        java.lang.String str8 = room5.getRoomId();
        room5.setRoomName("");
        org.openjfx.EECS_3311_Project.model.Sensor sensor11 = null;
        room5.update(sensor11, "hi!");
        int int14 = room5.getCapacity();
        int int15 = room5.getOccupancy();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor6 = null;
        room5.attachScanner(sensor6);
        java.lang.String str8 = room5.getRoomId();
        room5.setRoomName("");
        org.openjfx.EECS_3311_Project.model.Sensor sensor11 = null;
        room5.update(sensor11, "hi!");
        int int14 = room5.getCapacity();
        java.lang.String str15 = room5.getId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("ed986422-a267-4e08-8c75-7ec40a059f59", "", 10, false);
        room4.setCapacity(1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.openjfx.EECS_3311_Project.model.Room room1 = new org.openjfx.EECS_3311_Project.model.Room("c971b2a8-38c6-404a-84f6-acd93d662573,,true,97,hi!");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor6 = null;
        room5.attachScanner(sensor6);
        java.lang.String str8 = room5.getRoomId();
        room5.setRoomName("");
        java.lang.String str11 = room5.getBuildingName();
        room5.setActive(true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("c971b2a8-38c6-404a-84f6-acd93d662573,,true,97,hi!", "e6b615bd-b0d8-463a-b5cf-6a07fad27d55", ",,true,1,hi!", (int) (byte) 1, true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("c971b2a8-38c6-404a-84f6-acd93d662573,,,false,97,hi!,true,97,hi!", "c971b2a8-38c6-404a-84f6-acd93d662573,,,false,97,hi!,true,97,hi!", 52, true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        int int7 = room5.getOccupancy();
        org.openjfx.EECS_3311_Project.model.Sensor sensor8 = null;
        room5.attachScanner(sensor8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        room5.setActive(true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor13 = null;
        room5.attachScanner(sensor13);
        java.lang.String str15 = room5.getRoomId();
        boolean boolean16 = room5.isActive;
        boolean boolean17 = room5.isActive();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573" + "'", str15, "c971b2a8-38c6-404a-84f6-acd93d662573");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("hi!", ",,false,97,hi!", ",,true,97,hi!", (int) (short) 0, false);
        boolean boolean6 = room5.isActive;
        int int7 = room5.getCapacity();
        int int8 = room5.getOccupancy();
        java.lang.String str9 = room5.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        org.openjfx.EECS_3311_Project.model.Sensor sensor10 = null;
        room5.update(sensor10, "c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setActive(true);
        room5.setOccupancy(100);
        room5.setActive(true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor19 = null;
        room5.update(sensor19, "e6b615bd-b0d8-463a-b5cf-6a07fad27d55");
        int int22 = room5.getOccupancy();
        room5.setActive(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        org.openjfx.EECS_3311_Project.model.Sensor sensor10 = null;
        room5.update(sensor10, "c971b2a8-38c6-404a-84f6-acd93d662573");
        java.lang.Class<?> wildcardClass13 = room5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        org.openjfx.EECS_3311_Project.model.Sensor sensor10 = null;
        room5.update(sensor10, "c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setActive(true);
        room5.setOccupancy(100);
        room5.setCapacity(0);
        room5.setRoomId("2d7ece6e-4ef5-4627-a00d-90e311e10960");
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573,,true,97,hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "1c680c53-bd18-4f40-ac36-6e1e8064f8fc", ",,true,1,hi!", (int) (byte) 1, true);
        room5.setActive(false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        java.lang.String str10 = room5.getRoomName();
        org.openjfx.EECS_3311_Project.model.Sensor sensor11 = null;
        room5.update(sensor11, "c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setBuildingName(",,false,97,hi!");
        room5.setOccupancy(97);
        java.lang.String str18 = room5.getBuildingName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ",,false,97,hi!" + "'", str18, ",,false,97,hi!");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        org.openjfx.EECS_3311_Project.model.Sensor sensor10 = null;
        room5.update(sensor10, "c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setActive(true);
        room5.setOccupancy(100);
        room5.setCapacity(0);
        room5.setRoomId("2d7ece6e-4ef5-4627-a00d-90e311e10960");
        java.lang.String str21 = room5.getRoomId();
        org.openjfx.EECS_3311_Project.model.Sensor sensor22 = null;
        room5.update(sensor22, "43530db9-a7bb-4e56-a787-2e03a04c20f4");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2d7ece6e-4ef5-4627-a00d-90e311e10960" + "'", str21, "2d7ece6e-4ef5-4627-a00d-90e311e10960");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        room5.setActive(true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor13 = null;
        room5.attachScanner(sensor13);
        room5.setRoomName(",,false,97,hi!");
        org.openjfx.EECS_3311_Project.model.Sensor sensor17 = null;
        room5.attachScanner(sensor17);
        java.lang.Class<?> wildcardClass19 = room5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        org.openjfx.EECS_3311_Project.model.Sensor sensor8 = null;
        room5.attachScanner(sensor8);
        java.lang.String str10 = room5.toCSVRow();
        room5.setCapacity(1);
        boolean boolean13 = room5.isActive();
        room5.setActive(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",,true,97,hi!" + "'", str10, ",,true,97,hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        org.openjfx.EECS_3311_Project.model.Sensor sensor8 = null;
        room5.attachScanner(sensor8);
        int int10 = room5.getOccupancy();
        java.lang.String str11 = room5.toCSVRow();
        room5.setActive(true);
        java.lang.String str14 = room5.getRoomId();
        room5.setRoomName("c971b2a8-38c6-404a-84f6-acd93d662573,,true,97,hi!");
        java.lang.String str17 = room5.getRoomId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",,true,97,hi!" + "'", str11, ",,true,97,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Room room1 = new org.openjfx.EECS_3311_Project.model.Room("c971b2a8-38c6-404a-84f6-acd93d662573,,,false,97,hi!,true,97,hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"false\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("hi!", ",,false,97,hi!", ",,true,97,hi!", (int) (short) 0, false);
        boolean boolean6 = room5.isActive;
        java.lang.Class<?> wildcardClass7 = room5.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "", ",,true,97,hi!", (int) (byte) 100, false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("hi!", ",,false,97,hi!", ",,true,97,hi!", (int) (short) 0, false);
        java.lang.String str6 = room5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        java.lang.String str10 = room5.getRoomName();
        org.openjfx.EECS_3311_Project.model.Sensor sensor11 = null;
        room5.update(sensor11, "c971b2a8-38c6-404a-84f6-acd93d662573");
        java.lang.String str14 = room5.getBuildingName();
        room5.setOccupancy((int) 'a');
        boolean boolean17 = room5.isActive;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor6 = null;
        room5.attachScanner(sensor6);
        java.lang.String str8 = room5.getRoomId();
        room5.setRoomName("");
        room5.setActive(false);
        room5.setOccupancy(97);
        boolean boolean15 = room5.isActive();
        boolean boolean16 = room5.isActive;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        java.lang.String str10 = room5.getRoomName();
        org.openjfx.EECS_3311_Project.model.Sensor sensor11 = null;
        room5.update(sensor11, "c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setOccupancy((int) 'a');
        boolean boolean16 = room5.isActive;
        java.lang.String str17 = room5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room(",,true,97,hi!", "e6b615bd-b0d8-463a-b5cf-6a07fad27d55", (int) (byte) 0, true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor5 = null;
        room4.update(sensor5, ",,true,97,hi!");
        room4.setRoomName("c971b2a8-38c6-404a-84f6-acd93d662573,,true,97,hi!");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        java.lang.String str7 = room5.getBuildingName();
        boolean boolean8 = room5.isActive();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("hi!", "c971b2a8-38c6-404a-84f6-acd93d662573,,true,97,hi!", (int) (byte) 100, true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("hi!", "", (int) 'a', false);
        org.openjfx.EECS_3311_Project.model.Sensor sensor5 = null;
        room4.attachScanner(sensor5);
        room4.setActive(true);
        boolean boolean9 = room4.isActive;
        boolean boolean10 = room4.isActive();
        java.lang.String str11 = room4.getRoomId();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "4) test140(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "f3da6933-827e-4c8e-a65e-4a674c398257" + "'", str11, "f3da6933-827e-4c8e-a65e-4a674c398257");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("hi!", "", (int) 'a', false);
        org.openjfx.EECS_3311_Project.model.Sensor sensor5 = null;
        room4.attachScanner(sensor5);
        boolean boolean7 = room4.isActive();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor6 = null;
        room5.attachScanner(sensor6);
        java.lang.String str8 = room5.getRoomId();
        room5.setRoomName("");
        room5.setActive(false);
        room5.setOccupancy(97);
        boolean boolean15 = room5.isActive();
        room5.setRoomName("c971b2a8-38c6-404a-84f6-acd93d662573,,true,97,hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomName("");
        boolean boolean9 = room5.isActive();
        room5.setBuildingName("f3da6933-827e-4c8e-a65e-4a674c398257");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomName("");
        int int9 = room5.getOccupancy();
        int int10 = room5.getOccupancy();
        java.lang.String str11 = room5.toCSVRow();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",,true,97,hi!" + "'", str11, ",,true,97,hi!");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        boolean boolean10 = room5.isActive;
        room5.setOccupancy((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = room5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomName("");
        int int9 = room5.getCapacity();
        java.lang.String str10 = room5.toCSVRow();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",,true,97,hi!" + "'", str10, ",,true,97,hi!");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        room5.setActive(true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor13 = null;
        room5.attachScanner(sensor13);
        room5.setRoomName(",,false,97,hi!");
        java.lang.String str17 = room5.toCSVRow();
        room5.setOccupancy((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573,,,false,97,hi!,true,97,hi!" + "'", str17, "c971b2a8-38c6-404a-84f6-acd93d662573,,,false,97,hi!,true,97,hi!");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("43530db9-a7bb-4e56-a787-2e03a04c20f4", ",,true,1,hi!", (int) (byte) 10, false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("hi!", "", (int) 'a', false);
        org.openjfx.EECS_3311_Project.model.Sensor sensor5 = null;
        room4.attachScanner(sensor5);
        boolean boolean7 = room4.isActive;
        room4.setOccupancy((int) (short) 1);
        boolean boolean10 = room4.isActive();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        java.lang.String str10 = room5.getRoomName();
        org.openjfx.EECS_3311_Project.model.Sensor sensor11 = null;
        room5.update(sensor11, "c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setBuildingName(",,false,97,hi!");
        org.openjfx.EECS_3311_Project.model.Sensor sensor16 = null;
        room5.update(sensor16, ",,false,97,hi!");
        room5.setBuildingName(",,true,97,hi!");
        room5.setActive(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("", "c971b2a8-38c6-404a-84f6-acd93d662573", 100, false);
        org.openjfx.EECS_3311_Project.model.Sensor sensor5 = null;
        room4.update(sensor5, "c971b2a8-38c6-404a-84f6-acd93d662573");
        org.openjfx.EECS_3311_Project.model.Sensor sensor8 = null;
        room4.attachScanner(sensor8);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("hi!", ",,false,97,hi!", ",,true,97,hi!", (int) (short) 0, false);
        boolean boolean6 = room5.isActive;
        int int7 = room5.getCapacity();
        int int8 = room5.getOccupancy();
        room5.isActive = true;
        boolean boolean11 = room5.isActive;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("hi!", "", (int) 'a', false);
        boolean boolean5 = room4.isActive();
        org.openjfx.EECS_3311_Project.model.Sensor sensor6 = null;
        room4.attachScanner(sensor6);
        org.openjfx.EECS_3311_Project.model.Sensor sensor8 = null;
        room4.update(sensor8, ",,false,97,hi!");
        room4.isActive = false;
        room4.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573,,true,97,");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        org.openjfx.EECS_3311_Project.model.Sensor sensor7 = null;
        room5.update(sensor7, "ed986422-a267-4e08-8c75-7ec40a059f59");
        room5.setOccupancy((int) (short) 10);
        java.lang.String str12 = room5.getBuildingName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        room5.setActive(true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor13 = null;
        room5.attachScanner(sensor13);
        room5.setRoomName(",,false,97,hi!");
        org.openjfx.EECS_3311_Project.model.Sensor sensor17 = null;
        room5.attachScanner(sensor17);
        java.lang.String str19 = room5.toCSVRow();
        room5.setBuildingName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573,,,false,97,hi!,true,97,hi!" + "'", str19, "c971b2a8-38c6-404a-84f6-acd93d662573,,,false,97,hi!,true,97,hi!");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("hi!", "", (int) 'a', false);
        boolean boolean5 = room4.isActive();
        org.openjfx.EECS_3311_Project.model.Sensor sensor6 = null;
        room4.attachScanner(sensor6);
        boolean boolean8 = room4.isActive();
        java.lang.String str9 = room4.toCSVRow();
        org.openjfx.EECS_3311_Project.model.Sensor sensor10 = null;
        room4.update(sensor10, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "5) test156(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fa58fa5b-a426-4dd2-b374-40b34b78bf49,,true,97,hi!" + "'", str9, "fa58fa5b-a426-4dd2-b374-40b34b78bf49,,true,97,hi!");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        java.lang.String str11 = room5.getBuildingName();
        java.lang.String str12 = room5.getId();
        int int13 = room5.getCapacity();
        room5.setActive(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573" + "'", str12, "c971b2a8-38c6-404a-84f6-acd93d662573");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        java.lang.String str10 = room5.getRoomName();
        org.openjfx.EECS_3311_Project.model.Sensor sensor11 = null;
        room5.update(sensor11, "c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setBuildingName(",,false,97,hi!");
        org.openjfx.EECS_3311_Project.model.Sensor sensor16 = null;
        room5.update(sensor16, ",,false,97,hi!");
        room5.setBuildingName(",,true,97,hi!");
        room5.isActive = false;
        boolean boolean23 = room5.isActive();
        room5.setActive(true);
        boolean boolean26 = room5.isActive;
        int int27 = room5.getCapacity();
        java.lang.Class<?> wildcardClass28 = room5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("c971b2a8-38c6-404a-84f6-acd93d662573,,true,97,hi!", "ed986422-a267-4e08-8c75-7ec40a059f59", 0, false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        org.openjfx.EECS_3311_Project.model.Sensor sensor8 = null;
        room5.attachScanner(sensor8);
        java.lang.String str10 = room5.toCSVRow();
        int int11 = room5.getCapacity();
        org.openjfx.EECS_3311_Project.model.Sensor sensor12 = null;
        room5.attachScanner(sensor12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",,true,97,hi!" + "'", str10, ",,true,97,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room(",,false,97,hi!", ",,true,1,hi!", "2d7ece6e-4ef5-4627-a00d-90e311e10960", (int) (byte) 100, false);
        java.lang.String str6 = room5.toCSVRow();
        boolean boolean7 = room5.isActive();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",,false,97,hi!,2d7ece6e-4ef5-4627-a00d-90e311e10960,true,100,,,true,1,hi!" + "'", str6, ",,false,97,hi!,2d7ece6e-4ef5-4627-a00d-90e311e10960,true,100,,,true,1,hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        room5.setActive(true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor13 = null;
        room5.attachScanner(sensor13);
        java.lang.String str15 = room5.getRoomId();
        int int16 = room5.getOccupancy();
        org.openjfx.EECS_3311_Project.model.Sensor sensor17 = null;
        room5.update(sensor17, "1c680c53-bd18-4f40-ac36-6e1e8064f8fc");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573" + "'", str15, "c971b2a8-38c6-404a-84f6-acd93d662573");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("hi!", "", (int) 'a', false);
        org.openjfx.EECS_3311_Project.model.Sensor sensor5 = null;
        room4.attachScanner(sensor5);
        java.lang.String str7 = room4.getRoomId();
        room4.setRoomName("c971b2a8-38c6-404a-84f6-acd93d662573");
        room4.setBuildingName("43530db9-a7bb-4e56-a787-2e03a04c20f4");
// flaky "6) test163(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8d63e37e-704d-4b36-86ee-133e86d386dc" + "'", str7, "8d63e37e-704d-4b36-86ee-133e86d386dc");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("fa58fa5b-a426-4dd2-b374-40b34b78bf49,,true,97,hi!", "f3da6933-827e-4c8e-a65e-4a674c398257", (int) (byte) 0, true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        java.lang.String str10 = room5.getRoomName();
        org.openjfx.EECS_3311_Project.model.Sensor sensor11 = null;
        room5.update(sensor11, "e6b615bd-b0d8-463a-b5cf-6a07fad27d55");
        java.lang.String str14 = room5.getRoomName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomName("");
        int int9 = room5.getOccupancy();
        int int10 = room5.getOccupancy();
        boolean boolean11 = room5.isActive();
        java.lang.String str12 = room5.toCSVRow();
        int int13 = room5.getCapacity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",,true,97,hi!" + "'", str12, ",,true,97,hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        java.lang.String str11 = room5.getBuildingName();
        java.lang.String str12 = room5.getId();
        room5.isActive = true;
        org.openjfx.EECS_3311_Project.model.Sensor sensor15 = null;
        room5.attachScanner(sensor15);
        room5.setBuildingName("hi!");
        int int19 = room5.getCapacity();
        org.openjfx.EECS_3311_Project.model.Sensor sensor20 = null;
        room5.update(sensor20, ",,true,1,hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573" + "'", str12, "c971b2a8-38c6-404a-84f6-acd93d662573");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        java.lang.String str11 = room5.getBuildingName();
        java.lang.String str12 = room5.getBuildingName();
        boolean boolean13 = room5.isActive();
        int int14 = room5.getCapacity();
        room5.setRoomName(",,true,97,hi!");
        room5.setRoomId("e6b615bd-b0d8-463a-b5cf-6a07fad27d55");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        org.openjfx.EECS_3311_Project.model.Sensor sensor8 = null;
        room5.attachScanner(sensor8);
        java.lang.String str10 = room5.toCSVRow();
        room5.setRoomName("c971b2a8-38c6-404a-84f6-acd93d662573,,true,97,");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",,true,97,hi!" + "'", str10, ",,true,97,hi!");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        org.openjfx.EECS_3311_Project.model.Sensor sensor8 = null;
        room5.attachScanner(sensor8);
        java.lang.String str10 = room5.toCSVRow();
        room5.setBuildingName(",,true,1,hi!");
        java.lang.String str13 = room5.toCSVRow();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",,true,97,hi!" + "'", str10, ",,true,97,hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ",,true,97,,,true,1,hi!" + "'", str13, ",,true,97,,,true,1,hi!");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor6 = null;
        room5.attachScanner(sensor6);
        java.lang.String str8 = room5.getRoomId();
        java.lang.String str9 = room5.getRoomId();
        room5.setActive(false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        org.openjfx.EECS_3311_Project.model.Sensor sensor10 = null;
        room5.update(sensor10, "c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setActive(true);
        boolean boolean15 = room5.isActive;
        java.lang.String str16 = room5.getBuildingName();
        java.lang.String str17 = room5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        java.lang.String str10 = room5.getRoomName();
        org.openjfx.EECS_3311_Project.model.Sensor sensor11 = null;
        room5.update(sensor11, "c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setBuildingName(",,false,97,hi!");
        org.openjfx.EECS_3311_Project.model.Sensor sensor16 = null;
        room5.update(sensor16, ",,false,97,hi!");
        org.openjfx.EECS_3311_Project.model.Sensor sensor19 = null;
        room5.update(sensor19, "07d022bf-1228-4c36-afa4-ab88248928bf");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        java.lang.String str11 = room5.getBuildingName();
        java.lang.String str12 = room5.getId();
        room5.setActive(false);
        java.lang.Class<?> wildcardClass15 = room5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573" + "'", str12, "c971b2a8-38c6-404a-84f6-acd93d662573");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        java.lang.String str7 = room5.getBuildingName();
        java.lang.String str8 = room5.getRoomName();
        room5.setOccupancy(52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        java.lang.String str10 = room5.getRoomName();
        org.openjfx.EECS_3311_Project.model.Sensor sensor11 = null;
        room5.update(sensor11, "c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setOccupancy((int) (short) 100);
        int int16 = room5.getOccupancy();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("", "c971b2a8-38c6-404a-84f6-acd93d662573", 100, false);
        room4.setRoomName("4f4cdb3a-bcc7-423c-9a68-27cadc9b0b9f,,true,97,hi!");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        java.lang.String str11 = room5.getBuildingName();
        java.lang.String str12 = room5.getId();
        boolean boolean13 = room5.isActive();
        boolean boolean14 = room5.isActive;
        room5.setBuildingName("");
        java.lang.String str17 = room5.toCSVRow();
        java.lang.String str18 = room5.getRoomName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573" + "'", str12, "c971b2a8-38c6-404a-84f6-acd93d662573");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573,,true,97," + "'", str17, "c971b2a8-38c6-404a-84f6-acd93d662573,,true,97,");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("07d022bf-1228-4c36-afa4-ab88248928bf", "e6b615bd-b0d8-463a-b5cf-6a07fad27d55", (int) (short) 0, true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("hi!", "", (int) 'a', false);
        org.openjfx.EECS_3311_Project.model.Sensor sensor5 = null;
        room4.attachScanner(sensor5);
        room4.setActive(true);
        boolean boolean9 = room4.isActive;
        boolean boolean10 = room4.isActive();
        java.lang.String str11 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("c971b2a8-38c6-404a-84f6-acd93d662573", "hi!", "c971b2a8-38c6-404a-84f6-acd93d662573", (int) (byte) 0, false);
        boolean boolean6 = room5.isActive;
        org.openjfx.EECS_3311_Project.model.Sensor sensor7 = null;
        room5.update(sensor7, ",,true,1,hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("c971b2a8-38c6-404a-84f6-acd93d662573", ",,true,1,hi!", (int) (short) 0, true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor5 = null;
        room4.update(sensor5, "2d7ece6e-4ef5-4627-a00d-90e311e10960");
        java.lang.String str8 = room4.getId();
// flaky "7) test182(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1c150261-5052-4777-b9b9-03d912a7a99a" + "'", str8, "1c150261-5052-4777-b9b9-03d912a7a99a");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("hi!", ",,false,97,hi!", ",,true,97,hi!", (int) (short) 0, false);
        boolean boolean6 = room5.isActive;
        int int7 = room5.getCapacity();
        int int8 = room5.getOccupancy();
        room5.isActive = true;
        int int11 = room5.getOccupancy();
        room5.setRoomId(",,false,97,hi!,2d7ece6e-4ef5-4627-a00d-90e311e10960,true,100,,,true,1,hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        room5.setActive(true);
        java.lang.String str13 = room5.getRoomId();
        java.lang.String str14 = room5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573" + "'", str13, "c971b2a8-38c6-404a-84f6-acd93d662573");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573" + "'", str14, "c971b2a8-38c6-404a-84f6-acd93d662573");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room(",,true,1,hi!", "c971b2a8-38c6-404a-84f6-acd93d662573,,true,97,hi!", "c971b2a8-38c6-404a-84f6-acd93d662573,,,false,97,hi!,true,97,hi!", (int) ' ', true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        java.lang.String str10 = room5.getRoomName();
        org.openjfx.EECS_3311_Project.model.Sensor sensor11 = null;
        room5.update(sensor11, "c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setBuildingName(",,false,97,hi!");
        org.openjfx.EECS_3311_Project.model.Sensor sensor16 = null;
        room5.update(sensor16, ",,false,97,hi!");
        room5.setBuildingName(",,true,97,hi!");
        room5.isActive = false;
        room5.setBuildingName("c971b2a8-38c6-404a-84f6-acd93d662573,,true,97,");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("", "e6b615bd-b0d8-463a-b5cf-6a07fad27d55", (int) (byte) 100, false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        java.lang.String str11 = room5.getBuildingName();
        java.lang.String str12 = room5.getBuildingName();
        boolean boolean13 = room5.isActive();
        java.lang.String str14 = room5.getRoomId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573" + "'", str14, "c971b2a8-38c6-404a-84f6-acd93d662573");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("", "c971b2a8-38c6-404a-84f6-acd93d662573", 100, false);
        org.openjfx.EECS_3311_Project.model.Sensor sensor5 = null;
        room4.attachScanner(sensor5);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        org.openjfx.EECS_3311_Project.model.Sensor sensor8 = null;
        room5.attachScanner(sensor8);
        java.lang.String str10 = room5.toCSVRow();
        boolean boolean11 = room5.isActive;
        room5.setBuildingName(",,true,1,hi!");
        java.lang.String str14 = room5.getRoomId();
        java.lang.String str15 = room5.toCSVRow();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",,true,97,hi!" + "'", str10, ",,true,97,hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",,true,97,,,true,1,hi!" + "'", str15, ",,true,97,,,true,1,hi!");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        java.lang.String str11 = room5.getBuildingName();
        java.lang.String str12 = room5.getId();
        room5.isActive = true;
        org.openjfx.EECS_3311_Project.model.Sensor sensor15 = null;
        room5.attachScanner(sensor15);
        room5.setBuildingName("hi!");
        int int19 = room5.getCapacity();
        boolean boolean20 = room5.isActive;
        java.lang.String str21 = room5.getRoomName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573" + "'", str12, "c971b2a8-38c6-404a-84f6-acd93d662573");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        room5.setActive(true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor13 = null;
        room5.attachScanner(sensor13);
        org.openjfx.EECS_3311_Project.model.Sensor sensor15 = null;
        room5.attachScanner(sensor15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        org.openjfx.EECS_3311_Project.model.Sensor sensor8 = null;
        room5.attachScanner(sensor8);
        int int10 = room5.getOccupancy();
        java.lang.String str11 = room5.toCSVRow();
        room5.setActive(true);
        java.lang.String str14 = room5.getRoomId();
        room5.setRoomName("c971b2a8-38c6-404a-84f6-acd93d662573,,true,97,hi!");
        java.lang.String str17 = room5.getId();
        java.lang.String str18 = room5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",,true,97,hi!" + "'", str11, ",,true,97,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        java.lang.String str11 = room5.getBuildingName();
        room5.setRoomId(",,true,97,hi!");
        java.lang.String str14 = room5.toCSVRow();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",,true,97,hi!,,true,97,hi!" + "'", str14, ",,true,97,hi!,,true,97,hi!");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        org.openjfx.EECS_3311_Project.model.Sensor sensor8 = null;
        room5.attachScanner(sensor8);
        java.lang.String str10 = room5.toCSVRow();
        boolean boolean11 = room5.isActive;
        room5.setBuildingName(",,true,1,hi!");
        int int14 = room5.getCapacity();
        int int15 = room5.getCapacity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",,true,97,hi!" + "'", str10, ",,true,97,hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        room5.setBuildingName("c971b2a8-38c6-404a-84f6-acd93d662573,,,false,97,hi!,true,97,hi!");
        room5.setRoomId("ed986422-a267-4e08-8c75-7ec40a059f59");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        org.openjfx.EECS_3311_Project.model.Sensor sensor10 = null;
        room5.update(sensor10, "c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setActive(true);
        java.lang.String str15 = room5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        int int7 = room5.getCapacity();
        java.lang.String str8 = room5.getRoomId();
        room5.setCapacity(0);
        room5.setRoomName("43ebcc21-8930-4b49-996a-076ab8992b32");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        java.lang.String str11 = room5.getBuildingName();
        java.lang.String str12 = room5.getId();
        room5.isActive = true;
        room5.setActive(true);
        java.lang.Class<?> wildcardClass17 = room5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573" + "'", str12, "c971b2a8-38c6-404a-84f6-acd93d662573");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("hi!", "", (int) 'a', false);
        org.openjfx.EECS_3311_Project.model.Sensor sensor5 = null;
        room4.attachScanner(sensor5);
        room4.setOccupancy((-1));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("e6b615bd-b0d8-463a-b5cf-6a07fad27d55", "e6b615bd-b0d8-463a-b5cf-6a07fad27d55", 100, true);
        boolean boolean5 = room4.isActive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("hi!", "", (int) 'a', false);
        org.openjfx.EECS_3311_Project.model.Sensor sensor5 = null;
        room4.attachScanner(sensor5);
        room4.setActive(true);
        room4.setActive(false);
        room4.setActive(true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("hi!", "", (int) 'a', false);
        org.openjfx.EECS_3311_Project.model.Sensor sensor5 = null;
        room4.attachScanner(sensor5);
        org.openjfx.EECS_3311_Project.model.Sensor sensor7 = null;
        room4.attachScanner(sensor7);
        room4.setActive(true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        java.lang.String str7 = room5.getBuildingName();
        java.lang.String str8 = room5.getRoomName();
        room5.setRoomId(",,true,1,hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        int int8 = room5.getCapacity();
        room5.isActive = false;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        java.lang.String str10 = room5.getRoomName();
        org.openjfx.EECS_3311_Project.model.Sensor sensor11 = null;
        room5.update(sensor11, "c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomName("");
        int int9 = room5.getCapacity();
        room5.setRoomId(",,true,97,hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("43530db9-a7bb-4e56-a787-2e03a04c20f4", "4f4cdb3a-bcc7-423c-9a68-27cadc9b0b9f,,true,97,hi!", 52, false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("hi!", ",,false,97,hi!", ",,true,97,hi!", (int) (short) 0, false);
        boolean boolean6 = room5.isActive;
        room5.setActive(true);
        boolean boolean9 = room5.isActive;
        java.lang.String str10 = room5.getRoomName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",,true,97,hi!" + "'", str10, ",,true,97,hi!");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        java.lang.String str10 = room5.getRoomName();
        org.openjfx.EECS_3311_Project.model.Sensor sensor11 = null;
        room5.update(sensor11, "c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setBuildingName(",,false,97,hi!");
        org.openjfx.EECS_3311_Project.model.Sensor sensor16 = null;
        room5.update(sensor16, ",,false,97,hi!");
        room5.setBuildingName(",,true,97,hi!");
        room5.isActive = false;
        java.lang.String str23 = room5.getRoomName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.openjfx.EECS_3311_Project.model.Room room1 = new org.openjfx.EECS_3311_Project.model.Room(",,true,97,hi!");
        boolean boolean2 = room1.isActive;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("hi!", "", (int) 'a', false);
        org.openjfx.EECS_3311_Project.model.Sensor sensor5 = null;
        room4.attachScanner(sensor5);
        room4.setActive(true);
        boolean boolean9 = room4.isActive;
        int int10 = room4.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("hi!", "", (int) 'a', false);
        java.lang.String str5 = room4.toCSVRow();
// flaky "8) test213(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "50963bc0-2725-49e8-ad5f-aed3dade45ea,,true,97,hi!" + "'", str5, "50963bc0-2725-49e8-ad5f-aed3dade45ea,,true,97,hi!");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        java.lang.String str7 = room5.getBuildingName();
        java.lang.String str8 = room5.getRoomName();
        boolean boolean9 = room5.isActive;
        room5.setCapacity((int) (byte) 0);
        boolean boolean12 = room5.isActive();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("c971b2a8-38c6-404a-84f6-acd93d662573", "c971b2a8-38c6-404a-84f6-acd93d662573", (int) (short) 100, true);
        boolean boolean5 = room4.isActive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.openjfx.EECS_3311_Project.model.Room room1 = new org.openjfx.EECS_3311_Project.model.Room("4f4cdb3a-bcc7-423c-9a68-27cadc9b0b9f,,true,97,hi!");
        boolean boolean2 = room1.isActive;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("hi!", ",,false,97,hi!", ",,true,97,hi!", (int) (short) 0, false);
        boolean boolean6 = room5.isActive;
        room5.setActive(true);
        room5.setCapacity(0);
        int int11 = room5.getCapacity();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("43530db9-a7bb-4e56-a787-2e03a04c20f4", "c971b2a8-38c6-404a-84f6-acd93d662573,,true,97,", "", (-1), false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        org.openjfx.EECS_3311_Project.model.Sensor sensor8 = null;
        room5.attachScanner(sensor8);
        java.lang.String str10 = room5.toCSVRow();
        room5.setRoomId("");
        room5.setRoomName("2d7ece6e-4ef5-4627-a00d-90e311e10960");
        room5.setRoomName("43530db9-a7bb-4e56-a787-2e03a04c20f4");
        int int17 = room5.getCapacity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",,true,97,hi!" + "'", str10, ",,true,97,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        java.lang.String str10 = room5.getRoomName();
        org.openjfx.EECS_3311_Project.model.Sensor sensor11 = null;
        room5.update(sensor11, "e6b615bd-b0d8-463a-b5cf-6a07fad27d55");
        room5.isActive = false;
        org.openjfx.EECS_3311_Project.model.Sensor sensor16 = null;
        room5.attachScanner(sensor16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room(",,true,97,hi!", "c971b2a8-38c6-404a-84f6-acd93d662573", "hi!", 97, true);
        java.lang.String str6 = room5.getRoomName();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room(",,true,97,hi!", "c971b2a8-38c6-404a-84f6-acd93d662573", "hi!", 97, true);
        java.lang.String str6 = room5.getBuildingName();
        room5.setBuildingName("1c680c53-bd18-4f40-ac36-6e1e8064f8fc");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573" + "'", str6, "c971b2a8-38c6-404a-84f6-acd93d662573");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("hi!", "", (int) 'a', false);
        org.openjfx.EECS_3311_Project.model.Sensor sensor5 = null;
        room4.attachScanner(sensor5);
        room4.setActive(true);
        boolean boolean9 = room4.isActive;
        room4.setRoomId("1c150261-5052-4777-b9b9-03d912a7a99a");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        org.openjfx.EECS_3311_Project.model.Sensor sensor10 = null;
        room5.update(sensor10, "c971b2a8-38c6-404a-84f6-acd93d662573");
        java.lang.String str13 = room5.toCSVRow();
        java.lang.String str14 = room5.getRoomId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ",,false,97,hi!" + "'", str13, ",,false,97,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        java.lang.String str10 = room5.getId();
        java.lang.String str11 = room5.getRoomName();
        org.openjfx.EECS_3311_Project.model.Sensor sensor12 = null;
        room5.attachScanner(sensor12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor6 = null;
        room5.attachScanner(sensor6);
        java.lang.String str8 = room5.getBuildingName();
        java.lang.String str9 = room5.getBuildingName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        java.lang.String str10 = room5.getRoomName();
        org.openjfx.EECS_3311_Project.model.Sensor sensor11 = null;
        room5.update(sensor11, "c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setBuildingName(",,false,97,hi!");
        org.openjfx.EECS_3311_Project.model.Sensor sensor16 = null;
        room5.update(sensor16, ",,false,97,hi!");
        room5.setBuildingName(",,true,97,hi!");
        room5.isActive = false;
        boolean boolean23 = room5.isActive();
        org.openjfx.EECS_3311_Project.model.Sensor sensor24 = null;
        room5.attachScanner(sensor24);
        java.lang.String str26 = room5.getBuildingName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",,true,97,hi!" + "'", str26, ",,true,97,hi!");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        room5.setOccupancy((int) (short) 10);
        java.lang.String str13 = room5.getBuildingName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("hi!", ",,false,97,hi!", ",,true,97,hi!", (int) (short) 0, false);
        boolean boolean6 = room5.isActive;
        room5.setActive(true);
        boolean boolean9 = room5.isActive;
        org.openjfx.EECS_3311_Project.model.Sensor sensor10 = null;
        room5.attachScanner(sensor10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomName("");
        int int9 = room5.getOccupancy();
        int int10 = room5.getOccupancy();
        boolean boolean11 = room5.isActive();
        java.lang.String str12 = room5.getBuildingName();
        room5.setOccupancy((int) (short) 0);
        room5.setActive(false);
        java.lang.String str17 = room5.getRoomId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room(",,true,1,hi!", "", "", 0, false);
        room5.setRoomName(",,true,97,hi!");
        room5.setRoomId("");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        int int10 = room5.getOccupancy();
        room5.setRoomId("d05a351a-8576-418e-85ef-c0260e156d7e");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        room5.isActive = false;
        int int8 = room5.getCapacity();
        room5.setRoomId("8bbbfd06-d33c-400e-8a4d-2cc387e5ad99");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        int int7 = room5.getCapacity();
        room5.setBuildingName(",,true,97,hi!");
        org.openjfx.EECS_3311_Project.model.Sensor sensor10 = null;
        room5.update(sensor10, ",,false,97,hi!");
        org.openjfx.EECS_3311_Project.model.Sensor sensor13 = null;
        room5.update(sensor13, ",,false,97,hi!,2d7ece6e-4ef5-4627-a00d-90e311e10960,true,100,,,true,1,hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("d05a351a-8576-418e-85ef-c0260e156d7e", ",,false,97,hi!,2d7ece6e-4ef5-4627-a00d-90e311e10960,true,100,,,true,1,hi!", (int) (byte) 0, true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("hi!", "", (int) 'a', false);
        org.openjfx.EECS_3311_Project.model.Sensor sensor5 = null;
        room4.attachScanner(sensor5);
        room4.setActive(true);
        boolean boolean9 = room4.isActive;
        java.lang.String str10 = room4.getRoomName();
        java.lang.String str11 = room4.toCSVRow();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky "9) test236(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "bde52ba6-afc1-4d83-8fdc-b5fbb27787a5,,true,97,hi!" + "'", str11, "bde52ba6-afc1-4d83-8fdc-b5fbb27787a5,,true,97,hi!");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.openjfx.EECS_3311_Project.model.Room room1 = new org.openjfx.EECS_3311_Project.model.Room(",,true,97,,,true,1,hi!");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomName("");
        boolean boolean9 = room5.isActive();
        java.lang.String str10 = room5.getId();
        room5.setCapacity((int) '#');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        room5.setActive(true);
        room5.setRoomName("hi!");
        boolean boolean14 = room5.isActive;
        java.lang.String str15 = room5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", (int) (byte) 0, false);
        room4.setBuildingName("");
        java.lang.String str7 = room4.getId();
        room4.setActive(false);
// flaky "10) test240(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "f8653d06-edb7-4138-947e-6c10aaa46f92" + "'", str7, "f8653d06-edb7-4138-947e-6c10aaa46f92");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomName("");
        int int9 = room5.getOccupancy();
        int int10 = room5.getOccupancy();
        room5.setCapacity((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room(",,true,97,hi!", "c971b2a8-38c6-404a-84f6-acd93d662573", "hi!", 97, true);
        boolean boolean6 = room5.isActive;
        room5.setRoomId("ed986422-a267-4e08-8c75-7ec40a059f59");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        java.lang.String str11 = room5.getBuildingName();
        java.lang.String str12 = room5.getId();
        boolean boolean13 = room5.isActive();
        room5.setActive(false);
        room5.isActive = false;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573" + "'", str12, "c971b2a8-38c6-404a-84f6-acd93d662573");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        java.lang.String str11 = room5.getBuildingName();
        java.lang.String str12 = room5.getId();
        room5.isActive = true;
        org.openjfx.EECS_3311_Project.model.Sensor sensor15 = null;
        room5.attachScanner(sensor15);
        room5.setBuildingName("hi!");
        room5.setBuildingName(",,false,97,hi!");
        java.lang.String str21 = room5.getRoomId();
        room5.setActive(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573" + "'", str12, "c971b2a8-38c6-404a-84f6-acd93d662573");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573" + "'", str21, "c971b2a8-38c6-404a-84f6-acd93d662573");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomName("");
        int int9 = room5.getOccupancy();
        int int10 = room5.getOccupancy();
        boolean boolean11 = room5.isActive();
        java.lang.String str12 = room5.toCSVRow();
        java.lang.String str13 = room5.getRoomId();
        room5.setRoomName("1c680c53-bd18-4f40-ac36-6e1e8064f8fc");
        boolean boolean16 = room5.isActive();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",,true,97,hi!" + "'", str12, ",,true,97,hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room(",,true,97,hi!,,true,97,hi!", ",,true,97,hi!,,true,97,hi!", (int) 'a', false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor6 = null;
        room5.attachScanner(sensor6);
        java.lang.String str8 = room5.getRoomId();
        room5.setRoomName("");
        room5.setActive(false);
        room5.setOccupancy(0);
        int int15 = room5.getOccupancy();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("hi!", "", (int) 'a', false);
        org.openjfx.EECS_3311_Project.model.Sensor sensor5 = null;
        room4.attachScanner(sensor5);
        java.lang.String str7 = room4.getRoomId();
        room4.setRoomName("c971b2a8-38c6-404a-84f6-acd93d662573");
        java.lang.String str10 = room4.getBuildingName();
        room4.setBuildingName("8d63e37e-704d-4b36-86ee-133e86d386dc");
        room4.setActive(false);
// flaky "11) test248(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0a36855f-933c-45fd-b657-270893a591f2" + "'", str7, "0a36855f-933c-45fd-b657-270893a591f2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        org.openjfx.EECS_3311_Project.model.Sensor sensor8 = null;
        room5.attachScanner(sensor8);
        room5.setBuildingName("8d63e37e-704d-4b36-86ee-133e86d386dc");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("hi!", "", (int) 'a', false);
        boolean boolean5 = room4.isActive();
        org.openjfx.EECS_3311_Project.model.Sensor sensor6 = null;
        room4.attachScanner(sensor6);
        java.lang.String str8 = room4.getRoomId();
        room4.setActive(false);
        java.lang.String str11 = room4.getBuildingName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky "12) test250(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "727e63f0-7911-4dd5-a317-61ff428f5f32" + "'", str8, "727e63f0-7911-4dd5-a317-61ff428f5f32");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room(",,true,1,hi!", "", "", (int) ' ', true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor6 = null;
        room5.update(sensor6, "f3da6933-827e-4c8e-a65e-4a674c398257");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("hi!", "", (int) 'a', false);
        org.openjfx.EECS_3311_Project.model.Sensor sensor5 = null;
        room4.attachScanner(sensor5);
        room4.setActive(true);
        boolean boolean9 = room4.isActive;
        int int10 = room4.getOccupancy();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room(",,true,97,hi!", "", (int) (short) 10, false);
        java.lang.String str5 = room4.getRoomName();
        java.lang.String str6 = room4.getRoomName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        room5.isActive = true;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor6 = null;
        room5.attachScanner(sensor6);
        java.lang.String str8 = room5.getRoomId();
        room5.setActive(false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room(",,false,97,hi!,2d7ece6e-4ef5-4627-a00d-90e311e10960,true,100,,,true,1,hi!", "c971b2a8-38c6-404a-84f6-acd93d662573,,,false,97,hi!,true,97,hi!", "", 10, false);
        room5.setActive(true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        org.openjfx.EECS_3311_Project.model.Sensor sensor8 = null;
        room5.attachScanner(sensor8);
        java.lang.String str10 = room5.toCSVRow();
        boolean boolean11 = room5.isActive;
        room5.setBuildingName(",,true,1,hi!");
        int int14 = room5.getCapacity();
        room5.setBuildingName("e308c2df-fa01-4076-a3c3-bc34608bda32,,true,97,hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",,true,97,hi!" + "'", str10, ",,true,97,hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("43ebcc21-8930-4b49-996a-076ab8992b32", "hi!", (int) (byte) -1, false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("0a36855f-933c-45fd-b657-270893a591f2", "bde52ba6-afc1-4d83-8fdc-b5fbb27787a5,,true,97,hi!", "e308c2df-fa01-4076-a3c3-bc34608bda32,,true,97,hi!", (int) ' ', false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Room room1 = new org.openjfx.EECS_3311_Project.model.Room("727e63f0-7911-4dd5-a317-61ff428f5f32");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        int int7 = room5.getCapacity();
        org.openjfx.EECS_3311_Project.model.Sensor sensor8 = null;
        room5.update(sensor8, "fa58fa5b-a426-4dd2-b374-40b34b78bf49,,true,97,hi!");
        room5.setBuildingName("1c680c53-bd18-4f40-ac36-6e1e8064f8fc");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        int int7 = room5.getOccupancy();
        int int8 = room5.getOccupancy();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        room5.setRoomId("c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setRoomName("");
        java.lang.String str11 = room5.getBuildingName();
        java.lang.String str12 = room5.getId();
        boolean boolean13 = room5.isActive();
        boolean boolean14 = room5.isActive;
        java.lang.String str15 = room5.getRoomId();
        java.lang.String str16 = room5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573" + "'", str12, "c971b2a8-38c6-404a-84f6-acd93d662573");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573" + "'", str15, "c971b2a8-38c6-404a-84f6-acd93d662573");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "c971b2a8-38c6-404a-84f6-acd93d662573" + "'", str16, "c971b2a8-38c6-404a-84f6-acd93d662573");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("2d7ece6e-4ef5-4627-a00d-90e311e10960", "", "hi!", (int) (byte) 10, false);
        int int6 = room5.getOccupancy();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room("43530db9-a7bb-4e56-a787-2e03a04c20f4", "4f4cdb3a-bcc7-423c-9a68-27cadc9b0b9f,,true,97,hi!", 10, false);
        boolean boolean5 = room4.isActive();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        java.lang.String str6 = room5.getRoomId();
        boolean boolean7 = room5.isActive;
        room5.setActive(false);
        java.lang.String str10 = room5.getRoomName();
        org.openjfx.EECS_3311_Project.model.Sensor sensor11 = null;
        room5.update(sensor11, "c971b2a8-38c6-404a-84f6-acd93d662573");
        room5.setBuildingName(",,false,97,hi!");
        org.openjfx.EECS_3311_Project.model.Sensor sensor16 = null;
        room5.update(sensor16, ",,false,97,hi!");
        room5.setBuildingName(",,true,97,hi!");
        room5.isActive = false;
        boolean boolean23 = room5.isActive();
        room5.setActive(true);
        boolean boolean26 = room5.isActive;
        int int27 = room5.getCapacity();
        room5.isActive = false;
        room5.setRoomName("50963bc0-2725-49e8-ad5f-aed3dade45ea,,true,97,hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.openjfx.EECS_3311_Project.model.Room room5 = new org.openjfx.EECS_3311_Project.model.Room("", "hi!", "", (int) 'a', true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor6 = null;
        room5.attachScanner(sensor6);
        java.lang.String str8 = room5.getRoomId();
        int int9 = room5.getOccupancy();
        org.openjfx.EECS_3311_Project.model.Sensor sensor10 = null;
        room5.attachScanner(sensor10);
        java.lang.String str12 = room5.getRoomId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.openjfx.EECS_3311_Project.model.Room room4 = new org.openjfx.EECS_3311_Project.model.Room(",,true,97,hi!", "e6b615bd-b0d8-463a-b5cf-6a07fad27d55", (int) (byte) 0, true);
        org.openjfx.EECS_3311_Project.model.Sensor sensor5 = null;
        room4.update(sensor5, ",,true,97,hi!");
        boolean boolean8 = room4.isActive;
        int int9 = room4.getOccupancy();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }
}
