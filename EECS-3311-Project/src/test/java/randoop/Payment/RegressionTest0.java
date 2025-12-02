package randoop.Payment;

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
            org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        payment4.setBookingId("hi!");
        java.lang.String str10 = payment4.toCSVRow();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "1) test004(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!" + "'", str10, "3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        payment4.setBookingId("hi!");
        payment4.setBookingId("");
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("c7110c25-55e6-43b4-b006-afc57fc68908");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 100.0d, "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!", "hi!", "0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,,");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setId("");
        java.lang.String str7 = payment4.getId();
        java.lang.String str8 = payment4.getCardNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        payment4.setBookingId("hi!");
        java.lang.String str10 = payment4.toCSVRow();
        payment4.setId("");
        java.lang.String str13 = payment4.getCardNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "2) test010(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "88ec654e-cbcc-4256-8997-514e19c91dcb,0.0,hi!,,hi!" + "'", str10, "88ec654e-cbcc-4256-8997-514e19c91dcb,0.0,hi!,,hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        java.lang.String str8 = payment4.getId();
        payment4.setId("hi!");
        payment4.setAmount((java.lang.Double) (-1.0d));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "3) test011(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "75318a4b-7b6a-4b6d-9cc9-f77a274eb17a" + "'", str8, "75318a4b-7b6a-4b6d-9cc9-f77a274eb17a");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("fb72516a-20ee-45ef-8ab8-13727ba66291,0.0,hi!,,hi!");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("f06721cf-535b-47dc-8053-9fcdf5d55d2e");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "4) test014(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "222a044d-92a7-4073-a601-f038f4aebe2c" + "'", str9, "222a044d-92a7-4073-a601-f038f4aebe2c");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        payment4.setUserId("a52c5b93-0845-4182-b3ca-86d54eab0011");
        java.lang.String str12 = payment4.getUserId();
        payment4.setBookingId("25a13c2a-00f0-401b-8033-0654b2ec65a4");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a52c5b93-0845-4182-b3ca-86d54eab0011" + "'", str12, "a52c5b93-0845-4182-b3ca-86d54eab0011");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        double double5 = payment4.getAmount();
        double double6 = payment4.getAmount();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        payment1.setId("dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        java.lang.String str4 = payment1.getUserId();
        double double5 = payment1.getAmount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        java.lang.String str8 = payment4.getId();
        payment4.setId("hi!");
        java.lang.String str11 = payment4.getId();
        payment4.setAmount((java.lang.Double) 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "5) test018(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "05eb5e89-cc2f-4118-9ba4-751528233c20" + "'", str8, "05eb5e89-cc2f-4118-9ba4-751528233c20");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("e3781ee8-b350-4d2a-90f0-a2e5c7b1945a");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        double double5 = payment4.getAmount();
        payment4.setBookingId("dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        payment4.setBookingId("hi!");
        payment4.setBookingId("");
        java.lang.String str12 = payment4.getCardNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        java.lang.String str11 = payment4.getId();
        payment4.setId("a52c5b93-0845-4182-b3ca-86d54eab0011");
        payment4.setUserId("a52c5b93-0845-4182-b3ca-86d54eab0011,0.0,hi!,,");
        payment4.setId("b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,");
        java.lang.Class<?> wildcardClass18 = payment4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "6) test022(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "406cdb1f-7c87-4435-a917-2ae3dd8810d1,0.0,hi!,," + "'", str10, "406cdb1f-7c87-4435-a917-2ae3dd8810d1,0.0,hi!,,");
// flaky "1) test022(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "406cdb1f-7c87-4435-a917-2ae3dd8810d1" + "'", str11, "406cdb1f-7c87-4435-a917-2ae3dd8810d1");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 10.0d, "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!", "b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,", "3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        payment4.setAmount((java.lang.Double) 1.0d);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setBookingId("");
        java.lang.String str7 = payment4.getUserId();
        java.lang.String str8 = payment4.getBookingId();
        java.lang.String str9 = payment4.getUserId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setBookingId("");
        java.lang.String str7 = payment4.toCSVRow();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
// flaky "7) test025(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a8eb815f-138d-450b-8479-dab00ba0af5c,0.0,hi!,," + "'", str7, "a8eb815f-138d-450b-8479-dab00ba0af5c,0.0,hi!,,");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        payment4.setBookingId("hi!");
        payment4.setBookingId("");
        payment4.setUserId("c028d231-fda0-43a5-a08e-1b4ed603915a,0.0,hi!,,hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("a52c5b93-0845-4182-b3ca-86d54eab0011");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setBookingId("b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,");
        payment4.setBookingId("dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        payment4.setBookingId("91e800ef-5c17-4771-8783-1a8be3e39310,0.0,hi!,,");
        java.lang.String str11 = payment4.getCardNumber();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("ad34eda5-18b7-4a04-a86d-58b299e2b7ef,0.0,hi!,,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setBookingId("");
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        java.lang.String str11 = payment4.getId();
        payment4.setId("a52c5b93-0845-4182-b3ca-86d54eab0011");
        payment4.setUserId("a52c5b93-0845-4182-b3ca-86d54eab0011,0.0,hi!,,");
        java.lang.Class<?> wildcardClass16 = payment4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "8) test031(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "6e1f7f3c-4086-45db-9010-db67d13fde2b,0.0,hi!,," + "'", str10, "6e1f7f3c-4086-45db-9010-db67d13fde2b,0.0,hi!,,");
// flaky "2) test031(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6e1f7f3c-4086-45db-9010-db67d13fde2b" + "'", str11, "6e1f7f3c-4086-45db-9010-db67d13fde2b");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setId("");
        java.lang.String str7 = payment4.getId();
        java.lang.String str8 = payment4.toCSVRow();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",0.0,hi!,," + "'", str8, ",0.0,hi!,,");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("d3259a34-3c43-4841-b700-7500987b5a3f,0.0,hi!,,hi!");
        java.lang.String str2 = payment1.getId();
        java.lang.String str3 = payment1.getBookingId();
        java.lang.Class<?> wildcardClass4 = payment1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d3259a34-3c43-4841-b700-7500987b5a3f" + "'", str2, "d3259a34-3c43-4841-b700-7500987b5a3f");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("d3259a34-3c43-4841-b700-7500987b5a3f,0.0,hi!,,hi!");
        double double2 = payment1.getAmount();
        java.lang.String str3 = payment1.getCardNumber();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        double double11 = payment4.getAmount();
        java.lang.String str12 = payment4.getBookingId();
        java.lang.String str13 = payment4.toCSVRow();
        payment4.setAmount((java.lang.Double) 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "9) test035(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "7db6587d-3129-4442-b655-ff8c407fd50e,0.0,hi!,," + "'", str10, "7db6587d-3129-4442-b655-ff8c407fd50e,0.0,hi!,,");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky "3) test035(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7db6587d-3129-4442-b655-ff8c407fd50e,0.0,hi!,," + "'", str13, "7db6587d-3129-4442-b655-ff8c407fd50e,0.0,hi!,,");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        payment4.setBookingId("hi!");
        java.lang.String str10 = payment4.toCSVRow();
        java.lang.String str11 = payment4.getBookingId();
        java.lang.String str12 = payment4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "10) test036(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "b3a79cc5-8b9e-407c-af71-37af8d100f31,0.0,hi!,,hi!" + "'", str10, "b3a79cc5-8b9e-407c-af71-37af8d100f31,0.0,hi!,,hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setId("");
        java.lang.String str7 = payment4.toCSVRow();
        payment4.setId("ad34eda5-18b7-4a04-a86d-58b299e2b7ef,0.0,hi!,,");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",0.0,hi!,," + "'", str7, ",0.0,hi!,,");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("ab3bc5de-da03-45c5-96e2-7f24191dc33a");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("d3259a34-3c43-4841-b700-7500987b5a3f,0.0,hi!,,hi!");
        java.lang.Class<?> wildcardClass2 = payment1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setBookingId("");
        double double7 = payment4.getAmount();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("c2d7b5bf-5bf9-4490-9b7a-d453897592a9,0.0,hi!,,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        double double11 = payment4.getAmount();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "11) test042(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "5e01199b-e38e-4b1e-81e2-218ef258c681,0.0,hi!,," + "'", str10, "5e01199b-e38e-4b1e-81e2-218ef258c681,0.0,hi!,,");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        payment4.setBookingId("hi!");
        java.lang.String str10 = payment4.toCSVRow();
        payment4.setId("");
        payment4.setBookingId("ab3bc5de-da03-45c5-96e2-7f24191dc33a,0.0,hi!,,");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "12) test043(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "f5cb83a3-df22-4a75-a399-f910b9a3c8dd,0.0,hi!,,hi!" + "'", str10, "f5cb83a3-df22-4a75-a399-f910b9a3c8dd,0.0,hi!,,hi!");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 10.0d, "a30eef03-5d0d-4df8-80f7-2eca44520aea", "84717e4c-3d78-4e94-817c-36f94240de68", "74dbb949-a243-4aca-a31f-d489781172a7");
        java.lang.String str5 = payment4.getId();
// flaky "13) test044(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "670de2d3-2f4e-4f2a-9be0-b55cf91b4fe5" + "'", str5, "670de2d3-2f4e-4f2a-9be0-b55cf91b4fe5");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,,", "75318a4b-7b6a-4b6d-9cc9-f77a274eb17a", "");
        java.lang.String str5 = payment4.getId();
// flaky "14) test045(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "c55b60eb-e259-4ba4-9214-fb9abd084bf5" + "'", str5, "c55b60eb-e259-4ba4-9214-fb9abd084bf5");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setBookingId("b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,");
        payment4.setBookingId("dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        java.lang.String str9 = payment4.getUserId();
        java.lang.String str10 = payment4.getBookingId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!" + "'", str10, "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "a52c5b93-0845-4182-b3ca-86d54eab0011", "8f4c0e7d-bed8-49c1-8702-105839816ffc", "38452afa-27af-48d7-a279-411eefd466a0");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("d3259a34-3c43-4841-b700-7500987b5a3f,0.0,hi!,,hi!");
        java.lang.String str2 = payment1.getId();
        payment1.setAmount((java.lang.Double) 10.0d);
        java.lang.String str5 = payment1.getId();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d3259a34-3c43-4841-b700-7500987b5a3f" + "'", str2, "d3259a34-3c43-4841-b700-7500987b5a3f");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d3259a34-3c43-4841-b700-7500987b5a3f" + "'", str5, "d3259a34-3c43-4841-b700-7500987b5a3f");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setBookingId("b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,");
        payment4.setBookingId("dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        java.lang.String str9 = payment4.getId();
        java.lang.String str10 = payment4.getId();
// flaky "15) test049(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fa0a97c7-4047-47f6-a7c9-0880e421f15b" + "'", str9, "fa0a97c7-4047-47f6-a7c9-0880e421f15b");
// flaky "4) test049(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fa0a97c7-4047-47f6-a7c9-0880e421f15b" + "'", str10, "fa0a97c7-4047-47f6-a7c9-0880e421f15b");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        payment4.setAmount((java.lang.Double) 100.0d);
        java.lang.String str10 = payment4.getUserId();
        java.lang.String str11 = payment4.getCardNumber();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        java.lang.String str8 = payment4.getId();
        payment4.setId("hi!");
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "16) test051(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2b3400be-c825-4673-b77b-a852c54d316d" + "'", str8, "2b3400be-c825-4673-b77b-a852c54d316d");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        java.lang.String str8 = payment4.getId();
        payment4.setId("hi!");
        java.lang.String str11 = payment4.getId();
        payment4.setAmount((java.lang.Double) 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "17) test052(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "86a190db-812d-4ade-89c1-a54c4917f0e9" + "'", str8, "86a190db-812d-4ade-89c1-a54c4917f0e9");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 100.0d, "c7110c25-55e6-43b4-b006-afc57fc68908", "4181b998-7ac7-4aa1-bed1-8928558e3152", "0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,,");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setAmount((java.lang.Double) 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "c7110c25-55e6-43b4-b006-afc57fc68908" + "'", str5, "c7110c25-55e6-43b4-b006-afc57fc68908");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("af5d7198-8bf2-467a-99b5-c3b1e92d30e1,0.0,hi!,,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        java.lang.String str11 = payment4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "18) test055(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "97a0afbd-cb5b-4bcf-9f51-70c7896ed29c,0.0,hi!,," + "'", str10, "97a0afbd-cb5b-4bcf-9f51-70c7896ed29c,0.0,hi!,,");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment(",0.0,hi!,,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        java.lang.String str8 = payment4.getCardNumber();
        payment4.setUserId("c028d231-fda0-43a5-a08e-1b4ed603915a,0.0,hi!,,hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("387781ea-eb7c-495c-96f6-6d09fac35acc");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 1.0d, "a47505e4-4f64-4fc4-b64f-9bbc87c93c3d", "09f96ec4-d27b-4a2f-a55e-8579a7ba499b", "d3259a34-3c43-4841-b700-7500987b5a3f");
        java.lang.String str5 = payment4.getBookingId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d3259a34-3c43-4841-b700-7500987b5a3f" + "'", str5, "d3259a34-3c43-4841-b700-7500987b5a3f");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "", "0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,,", "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        payment4.setAmount((java.lang.Double) 1.0d);
        payment4.setBookingId("2b3400be-c825-4673-b77b-a852c54d316d");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("d3259a34-3c43-4841-b700-7500987b5a3f,0.0,hi!,,hi!");
        double double2 = payment1.getAmount();
        java.lang.String str3 = payment1.getId();
        java.lang.String str4 = payment1.getBookingId();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "d3259a34-3c43-4841-b700-7500987b5a3f" + "'", str3, "d3259a34-3c43-4841-b700-7500987b5a3f");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        double double11 = payment4.getAmount();
        java.lang.String str12 = payment4.getId();
        java.lang.String str13 = payment4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "19) test062(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "44463e9e-c930-4175-b404-7ea6e1a861c7,0.0,hi!,," + "'", str10, "44463e9e-c930-4175-b404-7ea6e1a861c7,0.0,hi!,,");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "5) test062(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "44463e9e-c930-4175-b404-7ea6e1a861c7" + "'", str12, "44463e9e-c930-4175-b404-7ea6e1a861c7");
// flaky "1) test062(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "44463e9e-c930-4175-b404-7ea6e1a861c7" + "'", str13, "44463e9e-c930-4175-b404-7ea6e1a861c7");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 1.0d, "84717e4c-3d78-4e94-817c-36f94240de68", "91e800ef-5c17-4771-8783-1a8be3e39310,0.0,hi!,,", "e030b8a2-7779-4790-848a-46d508c4b431");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        java.lang.String str11 = payment4.getCardNumber();
        payment4.setUserId("74dbb949-a243-4aca-a31f-d489781172a7");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "20) test064(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "35c34c03-962d-4ba3-8afd-1d9783865866,0.0,hi!,," + "'", str10, "35c34c03-962d-4ba3-8afd-1d9783865866,0.0,hi!,,");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 10.0d, "a30eef03-5d0d-4df8-80f7-2eca44520aea", "84717e4c-3d78-4e94-817c-36f94240de68", "74dbb949-a243-4aca-a31f-d489781172a7");
        payment4.setUserId("af5d7198-8bf2-467a-99b5-c3b1e92d30e1,0.0,hi!,,");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        payment4.setBookingId("hi!");
        payment4.setUserId("25a13c2a-00f0-401b-8033-0654b2ec65a4");
        java.lang.String str12 = payment4.getBookingId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("38452afa-27af-48d7-a279-411eefd466a0");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getUserId();
        double double10 = payment4.getAmount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 1.0d, "09f96ec4-d27b-4a2f-a55e-8579a7ba499b", "6e1f7f3c-4086-45db-9010-db67d13fde2b,0.0,hi!,,", "44463e9e-c930-4175-b404-7ea6e1a861c7,0.0,hi!,,");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) (-1.0d), "8f4c0e7d-bed8-49c1-8702-105839816ffc,0.0,hi!,,", "hi!", "84717e4c-3d78-4e94-817c-36f94240de68");
        payment4.setId("387781ea-eb7c-495c-96f6-6d09fac35acc");
        java.lang.String str7 = payment4.getCardNumber();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8f4c0e7d-bed8-49c1-8702-105839816ffc,0.0,hi!,," + "'", str7, "8f4c0e7d-bed8-49c1-8702-105839816ffc,0.0,hi!,,");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "406cdb1f-7c87-4435-a917-2ae3dd8810d1,0.0,hi!,,", "28b9df0b-a301-4229-91a2-0f055bf2ddab,0.0,hi!,,", "ab3bc5de-da03-45c5-96e2-7f24191dc33a,0.0,hi!,,");
        payment4.setId("88ec654e-cbcc-4256-8997-514e19c91dcb,0.0,hi!,,hi!");
        payment4.setAmount((java.lang.Double) 100.0d);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getUserId();
        java.lang.String str10 = payment4.getBookingId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        double double11 = payment4.getAmount();
        java.lang.String str12 = payment4.getBookingId();
        payment4.setBookingId("e030b8a2-7779-4790-848a-46d508c4b431");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "21) test073(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "f7c8c2cd-2a68-4662-9d1e-3e69fd2d0638,0.0,hi!,," + "'", str10, "f7c8c2cd-2a68-4662-9d1e-3e69fd2d0638,0.0,hi!,,");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setBookingId("b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,");
        payment4.setBookingId("dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        payment4.setAmount((java.lang.Double) 0.0d);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setId("");
        java.lang.String str7 = payment4.getId();
        java.lang.String str8 = payment4.getBookingId();
        java.lang.String str9 = payment4.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setBookingId("b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,");
        payment4.setBookingId("dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        java.lang.String str9 = payment4.getBookingId();
        payment4.setUserId("727a9d21-4e96-403c-a5b5-f9913fb9dd12");
        java.lang.String str12 = payment4.getCardNumber();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!" + "'", str9, "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,,", "75318a4b-7b6a-4b6d-9cc9-f77a274eb17a", "");
        payment4.setAmount((java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setBookingId("b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,");
        payment4.setBookingId("dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        java.lang.String str9 = payment4.getId();
        payment4.setAmount((java.lang.Double) 100.0d);
// flaky "22) test078(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "946caa9b-b39c-4d05-b529-ec9e39e7e3d5" + "'", str9, "946caa9b-b39c-4d05-b529-ec9e39e7e3d5");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        java.lang.String str11 = payment4.getId();
        payment4.setId("a52c5b93-0845-4182-b3ca-86d54eab0011");
        payment4.setUserId("a52c5b93-0845-4182-b3ca-86d54eab0011,0.0,hi!,,");
        payment4.setId("b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,");
        payment4.setId("74dbb949-a243-4aca-a31f-d489781172a7");
        double double20 = payment4.getAmount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "23) test079(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "042fdfd6-b3dd-4dbc-bd6a-f7576d9e9ca9,0.0,hi!,," + "'", str10, "042fdfd6-b3dd-4dbc-bd6a-f7576d9e9ca9,0.0,hi!,,");
// flaky "6) test079(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "042fdfd6-b3dd-4dbc-bd6a-f7576d9e9ca9" + "'", str11, "042fdfd6-b3dd-4dbc-bd6a-f7576d9e9ca9");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setId("");
        payment4.setId("0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,,");
        java.lang.String str9 = payment4.getId();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,," + "'", str9, "0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,,");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        java.lang.String str6 = payment4.getId();
        payment4.setUserId("e3781ee8-b350-4d2a-90f0-a2e5c7b1945a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "24) test081(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "678fd614-20f2-4ea5-812c-6de4184ef198" + "'", str6, "678fd614-20f2-4ea5-812c-6de4184ef198");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 1.0d, "f06721cf-535b-47dc-8053-9fcdf5d55d2e,0.0,hi!,,", "4181b998-7ac7-4aa1-bed1-8928558e3152", "a30eef03-5d0d-4df8-80f7-2eca44520aea");
        java.lang.String str5 = payment4.getId();
        java.lang.String str6 = payment4.toCSVRow();
// flaky "25) test082(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d5e21388-c4bd-4665-963c-2563e1ac46da" + "'", str5, "d5e21388-c4bd-4665-963c-2563e1ac46da");
// flaky "7) test082(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "d5e21388-c4bd-4665-963c-2563e1ac46da,1.0,f06721cf-535b-47dc-8053-9fcdf5d55d2e,0.0,hi!,,,4181b998-7ac7-4aa1-bed1-8928558e3152,a30eef03-5d0d-4df8-80f7-2eca44520aea" + "'", str6, "d5e21388-c4bd-4665-963c-2563e1ac46da,1.0,f06721cf-535b-47dc-8053-9fcdf5d55d2e,0.0,hi!,,,4181b998-7ac7-4aa1-bed1-8928558e3152,a30eef03-5d0d-4df8-80f7-2eca44520aea");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("d5e21388-c4bd-4665-963c-2563e1ac46da");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        payment4.setBookingId("hi!");
        java.lang.String str10 = payment4.toCSVRow();
        payment4.setId("");
        java.lang.String str13 = payment4.getUserId();
        java.lang.String str14 = payment4.getCardNumber();
        java.lang.String str15 = payment4.getBookingId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "26) test084(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32ce125f-8ed8-46a0-98c6-9890b4a85ae1,0.0,hi!,,hi!" + "'", str10, "32ce125f-8ed8-46a0-98c6-9890b4a85ae1,0.0,hi!,,hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "", "0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,,", "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        java.lang.String str5 = payment4.getUserId();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,," + "'", str5, "0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,,");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 100.0d, "c7110c25-55e6-43b4-b006-afc57fc68908", "4181b998-7ac7-4aa1-bed1-8928558e3152", "0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,,");
        double double5 = payment4.getAmount();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        payment4.setBookingId("hi!");
        java.lang.String str10 = payment4.toCSVRow();
        payment4.setId("");
        java.lang.String str13 = payment4.getUserId();
        payment4.setId("db23f4fa-409b-4b43-b823-68d59e454ca6,0.0,hi!,,");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "27) test087(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "56bb4d31-6a1a-427d-a3a9-b6b07f84706f,0.0,hi!,,hi!" + "'", str10, "56bb4d31-6a1a-427d-a3a9-b6b07f84706f,0.0,hi!,,hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        payment4.setUserId("a52c5b93-0845-4182-b3ca-86d54eab0011");
        java.lang.String str12 = payment4.getUserId();
        double double13 = payment4.getAmount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a52c5b93-0845-4182-b3ca-86d54eab0011" + "'", str12, "a52c5b93-0845-4182-b3ca-86d54eab0011");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "a30eef03-5d0d-4df8-80f7-2eca44520aea,0.0,hi!,,", "a52c5b93-0845-4182-b3ca-86d54eab0011", "222a044d-92a7-4073-a601-f038f4aebe2c");
        java.lang.String str5 = payment4.toCSVRow();
// flaky "28) test089(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6b2347c3-ccfc-4cd0-a605-7100495814d3,0.0,a30eef03-5d0d-4df8-80f7-2eca44520aea,0.0,hi!,,,a52c5b93-0845-4182-b3ca-86d54eab0011,222a044d-92a7-4073-a601-f038f4aebe2c" + "'", str5, "6b2347c3-ccfc-4cd0-a605-7100495814d3,0.0,a30eef03-5d0d-4df8-80f7-2eca44520aea,0.0,hi!,,,a52c5b93-0845-4182-b3ca-86d54eab0011,222a044d-92a7-4073-a601-f038f4aebe2c");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("a96c4c6f-cf7b-46f3-b5ff-fc1ede2a4b0f");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setBookingId("b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,");
        payment4.setBookingId("dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        java.lang.String str9 = payment4.getBookingId();
        payment4.setUserId("727a9d21-4e96-403c-a5b5-f9913fb9dd12");
        java.lang.String str12 = payment4.toCSVRow();
        payment4.setAmount((java.lang.Double) 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!" + "'", str9, "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
// flaky "29) test091(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "44d684e5-fdf4-4bd6-a9be-db56ff8b9f27,0.0,hi!,727a9d21-4e96-403c-a5b5-f9913fb9dd12,dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!" + "'", str12, "44d684e5-fdf4-4bd6-a9be-db56ff8b9f27,0.0,hi!,727a9d21-4e96-403c-a5b5-f9913fb9dd12,dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setId("");
        payment4.setId("0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,,");
        java.lang.String str9 = payment4.getId();
        payment4.setAmount((java.lang.Double) 100.0d);
        payment4.setId("387781ea-eb7c-495c-96f6-6d09fac35acc");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,," + "'", str9, "0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,,");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        payment4.setBookingId("hi!");
        java.lang.String str10 = payment4.toCSVRow();
        payment4.setId("");
        java.lang.String str13 = payment4.getUserId();
        payment4.setBookingId("d3259a34-3c43-4841-b700-7500987b5a3f");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "30) test093(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "6f7c1d00-2b2c-4fa7-83d3-e1503459b2d4,0.0,hi!,,hi!" + "'", str10, "6f7c1d00-2b2c-4fa7-83d3-e1503459b2d4,0.0,hi!,,hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setBookingId("b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,");
        payment4.setBookingId("dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        java.lang.String str9 = payment4.getBookingId();
        payment4.setUserId("727a9d21-4e96-403c-a5b5-f9913fb9dd12");
        double double12 = payment4.getAmount();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!" + "'", str9, "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "406cdb1f-7c87-4435-a917-2ae3dd8810d1,0.0,hi!,,", "28b9df0b-a301-4229-91a2-0f055bf2ddab,0.0,hi!,,", "ab3bc5de-da03-45c5-96e2-7f24191dc33a,0.0,hi!,,");
        payment4.setId("88ec654e-cbcc-4256-8997-514e19c91dcb,0.0,hi!,,hi!");
        payment4.setUserId("7db6587d-3129-4442-b655-ff8c407fd50e,0.0,hi!,,");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        double double5 = payment4.getAmount();
        java.lang.String str6 = payment4.getCardNumber();
        payment4.setUserId("d3259a34-3c43-4841-b700-7500987b5a3f,0.0,hi!,,hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        payment1.setBookingId("406cdb1f-7c87-4435-a917-2ae3dd8810d1");
        java.lang.String str4 = payment1.getBookingId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "406cdb1f-7c87-4435-a917-2ae3dd8810d1" + "'", str4, "406cdb1f-7c87-4435-a917-2ae3dd8810d1");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        payment4.setAmount((java.lang.Double) 1.0d);
        java.lang.String str10 = payment4.getId();
        payment4.setBookingId("727a9d21-4e96-403c-a5b5-f9913fb9dd12,0.0,hi!,,");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "31) test098(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "3ff6d1df-4782-49db-b0f6-b8c1a4d46037" + "'", str10, "3ff6d1df-4782-49db-b0f6-b8c1a4d46037");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "33d343a4-b687-4e2f-a628-dfdc5c907959,0.0,hi!,3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!,", "28b9df0b-a301-4229-91a2-0f055bf2ddab,0.0,hi!,,", "a30eef03-5d0d-4df8-80f7-2eca44520aea,0.0,hi!,,");
        payment4.setUserId("678fd614-20f2-4ea5-812c-6de4184ef198");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        double double11 = payment4.getAmount();
        java.lang.String str12 = payment4.getId();
        java.lang.String str13 = payment4.getCardNumber();
        payment4.setId("222a044d-92a7-4073-a601-f038f4aebe2c");
        java.lang.String str16 = payment4.toCSVRow();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "32) test100(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "c79e7d79-240a-4972-bba0-dc97fb8536ac,0.0,hi!,," + "'", str10, "c79e7d79-240a-4972-bba0-dc97fb8536ac,0.0,hi!,,");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "8) test100(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "c79e7d79-240a-4972-bba0-dc97fb8536ac" + "'", str12, "c79e7d79-240a-4972-bba0-dc97fb8536ac");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "222a044d-92a7-4073-a601-f038f4aebe2c,0.0,hi!,," + "'", str16, "222a044d-92a7-4073-a601-f038f4aebe2c,0.0,hi!,,");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("7b59b3f8-3a21-4c9e-99e8-b619d9e75280,100.0,c7110c25-55e6-43b4-b006-afc57fc68908,4181b998-7ac7-4aa1-bed1-8928558e3152,0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,,");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        payment4.setBookingId("hi!");
        java.lang.String str10 = payment4.toCSVRow();
        java.lang.String str11 = payment4.getBookingId();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "33) test102(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "955e403d-180a-4d68-b0bb-f5de1f6d52b3,0.0,hi!,,hi!" + "'", str10, "955e403d-180a-4d68-b0bb-f5de1f6d52b3,0.0,hi!,,hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setId("");
        java.lang.String str7 = payment4.getId();
        java.lang.String str8 = payment4.getBookingId();
        payment4.setId("a52c5b93-0845-4182-b3ca-86d54eab0011");
        double double11 = payment4.getAmount();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 10.0d, "a30eef03-5d0d-4df8-80f7-2eca44520aea", "84717e4c-3d78-4e94-817c-36f94240de68", "74dbb949-a243-4aca-a31f-d489781172a7");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setId("");
        java.lang.String str7 = payment4.getId();
        java.lang.String str8 = payment4.getBookingId();
        payment4.setAmount((java.lang.Double) 1.0d);
        java.lang.String str11 = payment4.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 1.0d, "727a9d21-4e96-403c-a5b5-f9913fb9dd12", "c2d7b5bf-5bf9-4490-9b7a-d453897592a9,0.0,hi!,,", "74dbb949-a243-4aca-a31f-d489781172a7");
        payment4.setBookingId("c79e7d79-240a-4972-bba0-dc97fb8536ac");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getBookingId();
        java.lang.String str10 = payment4.getCardNumber();
        payment4.setAmount((java.lang.Double) 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        java.lang.String str8 = payment4.getBookingId();
        payment4.setBookingId("b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,");
        double double11 = payment4.getAmount();
        payment4.setAmount((java.lang.Double) 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        java.lang.String str8 = payment4.getCardNumber();
        double double9 = payment4.getAmount();
        payment4.setBookingId("222a044d-92a7-4073-a601-f038f4aebe2c");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        payment4.setBookingId("hi!");
        payment4.setId("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        payment4.setUserId("91e800ef-5c17-4771-8783-1a8be3e39310,0.0,hi!,,");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setId("");
        java.lang.String str7 = payment4.getUserId();
        payment4.setId("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setBookingId("b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,");
        payment4.setBookingId("dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        java.lang.String str9 = payment4.getUserId();
        double double10 = payment4.getAmount();
        java.lang.String str11 = payment4.toCSVRow();
        java.lang.String str12 = payment4.toCSVRow();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
// flaky "34) test112(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "a71e7fed-00a2-4f92-8a1a-c4408dc0a50a,0.0,hi!,,dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!" + "'", str11, "a71e7fed-00a2-4f92-8a1a-c4408dc0a50a,0.0,hi!,,dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
// flaky "9) test112(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a71e7fed-00a2-4f92-8a1a-c4408dc0a50a,0.0,hi!,,dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!" + "'", str12, "a71e7fed-00a2-4f92-8a1a-c4408dc0a50a,0.0,hi!,,dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        java.lang.String str11 = payment4.getId();
        payment4.setAmount((java.lang.Double) 100.0d);
        payment4.setBookingId("91e800ef-5c17-4771-8783-1a8be3e39310,0.0,hi!,,");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "35) test113(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "086b0ce9-d17e-495f-b1bc-98ef880c5ead,0.0,hi!,," + "'", str10, "086b0ce9-d17e-495f-b1bc-98ef880c5ead,0.0,hi!,,");
// flaky "10) test113(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "086b0ce9-d17e-495f-b1bc-98ef880c5ead" + "'", str11, "086b0ce9-d17e-495f-b1bc-98ef880c5ead");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        java.lang.String str11 = payment4.getId();
        payment4.setId("a52c5b93-0845-4182-b3ca-86d54eab0011");
        payment4.setUserId("a52c5b93-0845-4182-b3ca-86d54eab0011,0.0,hi!,,");
        payment4.setId("b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,");
        payment4.setBookingId("382e1776-b536-473a-8838-755ce694f955,0.0,hi!,,hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "36) test114(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "f7e8ea0f-2bb1-4354-ab93-f07e1a84f75a,0.0,hi!,," + "'", str10, "f7e8ea0f-2bb1-4354-ab93-f07e1a84f75a,0.0,hi!,,");
// flaky "11) test114(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "f7e8ea0f-2bb1-4354-ab93-f07e1a84f75a" + "'", str11, "f7e8ea0f-2bb1-4354-ab93-f07e1a84f75a");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        double double11 = payment4.getAmount();
        java.lang.String str12 = payment4.getBookingId();
        payment4.setUserId("44463e9e-c930-4175-b404-7ea6e1a861c7");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "37) test115(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "11b48f31-b2ea-466b-b642-71e82951beff,0.0,hi!,," + "'", str10, "11b48f31-b2ea-466b-b642-71e82951beff,0.0,hi!,,");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("d3259a34-3c43-4841-b700-7500987b5a3f,0.0,hi!,,hi!");
        payment1.setId("c028d231-fda0-43a5-a08e-1b4ed603915a,0.0,hi!,,hi!");
        java.lang.String str4 = payment1.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "c028d231-fda0-43a5-a08e-1b4ed603915a,0.0,hi!,,hi!" + "'", str4, "c028d231-fda0-43a5-a08e-1b4ed603915a,0.0,hi!,,hi!");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 1.0d, "727a9d21-4e96-403c-a5b5-f9913fb9dd12,0.0,hi!,,", "0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,,", "8f4c0e7d-bed8-49c1-8702-105839816ffc,0.0,hi!,,");
        java.lang.String str5 = payment4.getUserId();
        payment4.setAmount((java.lang.Double) 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,," + "'", str5, "0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,,");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        java.lang.String str11 = payment4.getId();
        java.lang.String str12 = payment4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "38) test118(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "8d231537-6d0d-47a9-9053-23d701f8f35f,0.0,hi!,," + "'", str10, "8d231537-6d0d-47a9-9053-23d701f8f35f,0.0,hi!,,");
// flaky "12) test118(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "8d231537-6d0d-47a9-9053-23d701f8f35f" + "'", str11, "8d231537-6d0d-47a9-9053-23d701f8f35f");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        payment1.setAmount((java.lang.Double) 100.0d);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        java.lang.String str11 = payment4.getId();
        payment4.setId("a52c5b93-0845-4182-b3ca-86d54eab0011");
        payment4.setUserId("a52c5b93-0845-4182-b3ca-86d54eab0011,0.0,hi!,,");
        payment4.setAmount((java.lang.Double) 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "39) test120(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "c94f943c-47b8-42b8-8435-0612a47114ed,0.0,hi!,," + "'", str10, "c94f943c-47b8-42b8-8435-0612a47114ed,0.0,hi!,,");
// flaky "13) test120(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "c94f943c-47b8-42b8-8435-0612a47114ed" + "'", str11, "c94f943c-47b8-42b8-8435-0612a47114ed");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        java.lang.String str11 = payment4.toCSVRow();
        payment4.setAmount((java.lang.Double) 100.0d);
        payment4.setUserId("c69f1250-6f67-4062-91ea-9a5f18a96693,0.0,hi!,,");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "40) test121(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "77bdc337-0b50-4c17-b2e1-c870d2e8d07e,0.0,hi!,," + "'", str10, "77bdc337-0b50-4c17-b2e1-c870d2e8d07e,0.0,hi!,,");
// flaky "14) test121(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "77bdc337-0b50-4c17-b2e1-c870d2e8d07e,0.0,hi!,," + "'", str11, "77bdc337-0b50-4c17-b2e1-c870d2e8d07e,0.0,hi!,,");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("d3259a34-3c43-4841-b700-7500987b5a3f,0.0,hi!,,hi!");
        java.lang.String str2 = payment1.getId();
        java.lang.String str3 = payment1.getUserId();
        payment1.setId("c1809a31-ec7f-47d2-a7dd-a17e28bde480,0.0,hi!,,");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d3259a34-3c43-4841-b700-7500987b5a3f" + "'", str2, "d3259a34-3c43-4841-b700-7500987b5a3f");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) (-1.0d), "382e1776-b536-473a-8838-755ce694f955,0.0,hi!,,hi!", "9bd34861-a03a-4146-9921-d0b4b87b0f17,0.0,hi!,,dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!", "a30eef03-5d0d-4df8-80f7-2eca44520aea,0.0,hi!,,");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("d3259a34-3c43-4841-b700-7500987b5a3f,0.0,hi!,,hi!");
        java.lang.String str2 = payment1.getId();
        payment1.setId("c79e7d79-240a-4972-bba0-dc97fb8536ac");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d3259a34-3c43-4841-b700-7500987b5a3f" + "'", str2, "d3259a34-3c43-4841-b700-7500987b5a3f");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) (-1.0d), "a52c5b93-0845-4182-b3ca-86d54eab0011", "44463e9e-c930-4175-b404-7ea6e1a861c7", "3232d946-bada-4389-bccb-906766db9d95");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("d3259a34-3c43-4841-b700-7500987b5a3f,0.0,hi!,,hi!");
        java.lang.String str2 = payment1.getId();
        java.lang.String str3 = payment1.getBookingId();
        payment1.setUserId("c94f943c-47b8-42b8-8435-0612a47114ed,0.0,hi!,,");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d3259a34-3c43-4841-b700-7500987b5a3f" + "'", str2, "d3259a34-3c43-4841-b700-7500987b5a3f");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        payment1.setId("dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        payment1.setBookingId("ab3bc5de-da03-45c5-96e2-7f24191dc33a");
        payment1.setBookingId("727a9d21-4e96-403c-a5b5-f9913fb9dd12,0.0,hi!,,");
        java.lang.String str8 = payment1.getId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!" + "'", str8, "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("042fdfd6-b3dd-4dbc-bd6a-f7576d9e9ca9,0.0,hi!,,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        java.lang.String str8 = payment4.getId();
        payment4.setId("hi!");
        java.lang.String str11 = payment4.getId();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "41) test129(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7a44869f-6325-4e9b-b089-42ba8743a29f" + "'", str8, "7a44869f-6325-4e9b-b089-42ba8743a29f");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "406cdb1f-7c87-4435-a917-2ae3dd8810d1,0.0,hi!,,", "28b9df0b-a301-4229-91a2-0f055bf2ddab,0.0,hi!,,", "ab3bc5de-da03-45c5-96e2-7f24191dc33a,0.0,hi!,,");
        payment4.setId("88ec654e-cbcc-4256-8997-514e19c91dcb,0.0,hi!,,hi!");
        java.lang.String str7 = payment4.getCardNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "406cdb1f-7c87-4435-a917-2ae3dd8810d1,0.0,hi!,," + "'", str7, "406cdb1f-7c87-4435-a917-2ae3dd8810d1,0.0,hi!,,");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("3ff6d1df-4782-49db-b0f6-b8c1a4d46037");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 10.0d, "75318a4b-7b6a-4b6d-9cc9-f77a274eb17a", "a52c5b93-0845-4182-b3ca-86d54eab0011,0.0,hi!,,", "a96c4c6f-cf7b-46f3-b5ff-fc1ede2a4b0f");
        payment4.setId("d3259a34-3c43-4841-b700-7500987b5a3f,0.0,hi!,,hi!");
        payment4.setAmount((java.lang.Double) 10.0d);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "c028d231-fda0-43a5-a08e-1b4ed603915a,0.0,hi!,,hi!", "6b2347c3-ccfc-4cd0-a605-7100495814d3,0.0,a30eef03-5d0d-4df8-80f7-2eca44520aea,0.0,hi!,,,a52c5b93-0845-4182-b3ca-86d54eab0011,222a044d-92a7-4073-a601-f038f4aebe2c", "7c9bcf89-363a-4218-9348-907195b79b1e");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 10.0d, "4181b998-7ac7-4aa1-bed1-8928558e3152", "ab3bc5de-da03-45c5-96e2-7f24191dc33a,0.0,hi!,,", "09f96ec4-d27b-4a2f-a55e-8579a7ba499b");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "406cdb1f-7c87-4435-a917-2ae3dd8810d1,0.0,hi!,,", "28b9df0b-a301-4229-91a2-0f055bf2ddab,0.0,hi!,,", "ab3bc5de-da03-45c5-96e2-7f24191dc33a,0.0,hi!,,");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 1.0d, "4181b998-7ac7-4aa1-bed1-8928558e3152", "b3a79cc5-8b9e-407c-af71-37af8d100f31,0.0,hi!,,hi!", "727a9d21-4e96-403c-a5b5-f9913fb9dd12");
        java.lang.String str5 = payment4.getId();
        java.lang.String str6 = payment4.getBookingId();
// flaky "42) test136(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "8127b3e5-3a39-4f58-879b-6d2ab729fe05" + "'", str5, "8127b3e5-3a39-4f58-879b-6d2ab729fe05");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "727a9d21-4e96-403c-a5b5-f9913fb9dd12" + "'", str6, "727a9d21-4e96-403c-a5b5-f9913fb9dd12");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 10.0d, "75318a4b-7b6a-4b6d-9cc9-f77a274eb17a", "a52c5b93-0845-4182-b3ca-86d54eab0011,0.0,hi!,,", "a96c4c6f-cf7b-46f3-b5ff-fc1ede2a4b0f");
        java.lang.String str5 = payment4.getCardNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "75318a4b-7b6a-4b6d-9cc9-f77a274eb17a" + "'", str5, "75318a4b-7b6a-4b6d-9cc9-f77a274eb17a");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        java.lang.String str11 = payment4.getId();
        payment4.setId("a52c5b93-0845-4182-b3ca-86d54eab0011");
        payment4.setUserId("a52c5b93-0845-4182-b3ca-86d54eab0011,0.0,hi!,,");
        payment4.setId("b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,");
        payment4.setId("74dbb949-a243-4aca-a31f-d489781172a7");
        java.lang.Class<?> wildcardClass20 = payment4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "43) test138(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "262207ef-cf59-4385-b113-17de75ffd5e2,0.0,hi!,," + "'", str10, "262207ef-cf59-4385-b113-17de75ffd5e2,0.0,hi!,,");
// flaky "15) test138(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "262207ef-cf59-4385-b113-17de75ffd5e2" + "'", str11, "262207ef-cf59-4385-b113-17de75ffd5e2");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setId("");
        payment4.setId("0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,,");
        java.lang.String str9 = payment4.getId();
        payment4.setId("222a044d-92a7-4073-a601-f038f4aebe2c");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,," + "'", str9, "0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,,");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        java.lang.String str6 = payment4.getId();
        payment4.setBookingId("8d231537-6d0d-47a9-9053-23d701f8f35f,0.0,hi!,,");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "44) test140(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bc1dfd23-89fb-4105-977e-cc4e7b44a103" + "'", str6, "bc1dfd23-89fb-4105-977e-cc4e7b44a103");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "", "0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,,", "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        payment4.setAmount((java.lang.Double) 1.0d);
        java.lang.String str7 = payment4.getBookingId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!" + "'", str7, "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        java.lang.String str8 = payment4.getBookingId();
        double double9 = payment4.getAmount();
        java.lang.String str10 = payment4.toCSVRow();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "45) test142(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1c01e880-f8ce-4d27-afde-102534a5ce4a,0.0,hi!,3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!," + "'", str10, "1c01e880-f8ce-4d27-afde-102534a5ce4a,0.0,hi!,3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!,");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "27e28f9d-b238-4d7d-8513-acc1174a8735", "ab3bc5de-da03-45c5-96e2-7f24191dc33a", "f06721cf-535b-47dc-8053-9fcdf5d55d2e,0.0,hi!,,");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        java.lang.String str8 = payment4.getCardNumber();
        java.lang.String str9 = payment4.toCSVRow();
        double double10 = payment4.getAmount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "46) test144(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "30eb21f2-95da-489b-9901-eb125548403d,0.0,hi!,3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!," + "'", str9, "30eb21f2-95da-489b-9901-eb125548403d,0.0,hi!,3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        payment4.setAmount((java.lang.Double) 100.0d);
        java.lang.String str10 = payment4.getUserId();
        java.lang.String str11 = payment4.getCardNumber();
        java.lang.String str12 = payment4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
// flaky "47) test145(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "3f26fbdc-3928-46a0-8ec1-aaa03e33407b" + "'", str12, "3f26fbdc-3928-46a0-8ec1-aaa03e33407b");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("d3259a34-3c43-4841-b700-7500987b5a3f,0.0,hi!,,hi!");
        payment1.setUserId("086b0ce9-d17e-495f-b1bc-98ef880c5ead");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 10.0d, "fc39bb43-a042-49ec-b67a-41123f37e812", "ce2b1ea8-e998-4300-8b4d-1052c15fa2bd", "0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,,");
        java.lang.String str5 = payment4.getId();
// flaky "48) test147(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d8dce4e3-962d-47af-950e-fe18306b4ac2" + "'", str5, "d8dce4e3-962d-47af-950e-fe18306b4ac2");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        java.lang.String str8 = payment4.getBookingId();
        payment4.setBookingId("b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,");
        java.lang.String str11 = payment4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "49) test148(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "e3138398-544a-4ff0-a38a-fc309d53ed8a" + "'", str11, "e3138398-544a-4ff0-a38a-fc309d53ed8a");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setBookingId("");
        payment4.setId("4181b998-7ac7-4aa1-bed1-8928558e3152");
        java.lang.String str9 = payment4.getCardNumber();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 100.0d, "", "a8eb815f-138d-450b-8479-dab00ba0af5c,0.0,hi!,,", "7db6587d-3129-4442-b655-ff8c407fd50e,0.0,hi!,,");
        payment4.setBookingId("6f7c1d00-2b2c-4fa7-83d3-e1503459b2d4,0.0,hi!,,hi!");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("c1809a31-ec7f-47d2-a7dd-a17e28bde480,0.0,hi!,,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 10.0d, "a30eef03-5d0d-4df8-80f7-2eca44520aea", "84717e4c-3d78-4e94-817c-36f94240de68", "74dbb949-a243-4aca-a31f-d489781172a7");
        payment4.setId("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        java.lang.String str7 = payment4.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!" + "'", str7, "3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("d3259a34-3c43-4841-b700-7500987b5a3f,0.0,hi!,,hi!");
        java.lang.String str2 = payment1.getId();
        java.lang.String str3 = payment1.getUserId();
        java.lang.String str4 = payment1.getBookingId();
        java.lang.String str5 = payment1.getCardNumber();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d3259a34-3c43-4841-b700-7500987b5a3f" + "'", str2, "d3259a34-3c43-4841-b700-7500987b5a3f");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setBookingId("b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,");
        payment4.setBookingId("dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        java.lang.String str9 = payment4.getBookingId();
        java.lang.String str10 = payment4.getUserId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!" + "'", str9, "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 10.0d, "75318a4b-7b6a-4b6d-9cc9-f77a274eb17a", "a52c5b93-0845-4182-b3ca-86d54eab0011,0.0,hi!,,", "a96c4c6f-cf7b-46f3-b5ff-fc1ede2a4b0f");
        payment4.setId("d3259a34-3c43-4841-b700-7500987b5a3f,0.0,hi!,,hi!");
        java.lang.String str7 = payment4.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d3259a34-3c43-4841-b700-7500987b5a3f,0.0,hi!,,hi!" + "'", str7, "d3259a34-3c43-4841-b700-7500987b5a3f,0.0,hi!,,hi!");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 1.0d, "727a9d21-4e96-403c-a5b5-f9913fb9dd12,0.0,hi!,,", "0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,,", "8f4c0e7d-bed8-49c1-8702-105839816ffc,0.0,hi!,,");
        java.lang.String str5 = payment4.getUserId();
        java.lang.String str6 = payment4.toCSVRow();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,," + "'", str5, "0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,,");
// flaky "50) test156(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ebe8d597-3a64-42d3-a430-2f98ad92ac0e,1.0,727a9d21-4e96-403c-a5b5-f9913fb9dd12,0.0,hi!,,,0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,,,8f4c0e7d-bed8-49c1-8702-105839816ffc,0.0,hi!,," + "'", str6, "ebe8d597-3a64-42d3-a430-2f98ad92ac0e,1.0,727a9d21-4e96-403c-a5b5-f9913fb9dd12,0.0,hi!,,,0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,,,8f4c0e7d-bed8-49c1-8702-105839816ffc,0.0,hi!,,");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setBookingId("b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,");
        payment4.setBookingId("dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        payment4.setBookingId("91e800ef-5c17-4771-8783-1a8be3e39310,0.0,hi!,,");
        double double11 = payment4.getAmount();
        java.lang.String str12 = payment4.getBookingId();
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "91e800ef-5c17-4771-8783-1a8be3e39310,0.0,hi!,," + "'", str12, "91e800ef-5c17-4771-8783-1a8be3e39310,0.0,hi!,,");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("d3259a34-3c43-4841-b700-7500987b5a3f,0.0,hi!,,hi!");
        java.lang.String str2 = payment1.getId();
        payment1.setId("fa0a97c7-4047-47f6-a7c9-0880e421f15b");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d3259a34-3c43-4841-b700-7500987b5a3f" + "'", str2, "d3259a34-3c43-4841-b700-7500987b5a3f");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        payment4.setBookingId("hi!");
        java.lang.String str10 = payment4.getBookingId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        java.lang.String str8 = payment4.getId();
        payment4.setId("hi!");
        payment4.setUserId("fb72516a-20ee-45ef-8ab8-13727ba66291,0.0,hi!,,hi!");
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "51) test160(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "aa19e3e4-0537-4ba4-b79b-29574fc466ba" + "'", str8, "aa19e3e4-0537-4ba4-b79b-29574fc466ba");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        java.lang.String str8 = payment4.getId();
        payment4.setAmount((java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "52) test161(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "220c9f29-1191-4874-b451-f19c3c47c983" + "'", str8, "220c9f29-1191-4874-b451-f19c3c47c983");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setId("");
        java.lang.String str7 = payment4.toCSVRow();
        double double8 = payment4.getAmount();
        java.lang.String str9 = payment4.toCSVRow();
        double double10 = payment4.getAmount();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",0.0,hi!,," + "'", str7, ",0.0,hi!,,");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",0.0,hi!,," + "'", str9, ",0.0,hi!,,");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 1.0d, "727a9d21-4e96-403c-a5b5-f9913fb9dd12", "c2d7b5bf-5bf9-4490-9b7a-d453897592a9,0.0,hi!,,", "74dbb949-a243-4aca-a31f-d489781172a7");
        payment4.setAmount((java.lang.Double) 10.0d);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setId("");
        java.lang.String str7 = payment4.toCSVRow();
        java.lang.String str8 = payment4.getId();
        payment4.setAmount((java.lang.Double) 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",0.0,hi!,," + "'", str7, ",0.0,hi!,,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        payment4.setBookingId("hi!");
        payment4.setBookingId("");
        java.lang.String str12 = payment4.getUserId();
        payment4.setAmount((java.lang.Double) 100.0d);
        java.lang.String str15 = payment4.getBookingId();
        double double16 = payment4.getAmount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "fb72516a-20ee-45ef-8ab8-13727ba66291,0.0,hi!,,hi!", "d8dce4e3-962d-47af-950e-fe18306b4ac2", "382e1776-b536-473a-8838-755ce694f955,0.0,hi!,,hi!");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) (-1.0d), "f5cb83a3-df22-4a75-a399-f910b9a3c8dd,0.0,hi!,,hi!", "09f96ec4-d27b-4a2f-a55e-8579a7ba499b", "25a13c2a-00f0-401b-8033-0654b2ec65a4");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        java.lang.String str11 = payment4.toCSVRow();
        payment4.setBookingId("ad34eda5-18b7-4a04-a86d-58b299e2b7ef,0.0,hi!,,");
        java.lang.String str14 = payment4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "53) test168(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4b49a6dc-3a07-456f-b166-6ad8ba05552c,0.0,hi!,," + "'", str10, "4b49a6dc-3a07-456f-b166-6ad8ba05552c,0.0,hi!,,");
// flaky "16) test168(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4b49a6dc-3a07-456f-b166-6ad8ba05552c,0.0,hi!,," + "'", str11, "4b49a6dc-3a07-456f-b166-6ad8ba05552c,0.0,hi!,,");
// flaky "2) test168(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4b49a6dc-3a07-456f-b166-6ad8ba05552c" + "'", str14, "4b49a6dc-3a07-456f-b166-6ad8ba05552c");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 1.0d, "75318a4b-7b6a-4b6d-9cc9-f77a274eb17a", "a96c4c6f-cf7b-46f3-b5ff-fc1ede2a4b0f", "74dbb949-a243-4aca-a31f-d489781172a7");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "a52c5b93-0845-4182-b3ca-86d54eab0011,0.0,hi!,,", "38452afa-27af-48d7-a279-411eefd466a0", "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        payment4.setBookingId("");
        payment4.setId("33d343a4-b687-4e2f-a628-dfdc5c907959,0.0,hi!,3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!,");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        payment4.setBookingId("hi!");
        payment4.setUserId("25a13c2a-00f0-401b-8033-0654b2ec65a4");
        payment4.setUserId("d5e21388-c4bd-4665-963c-2563e1ac46da,1.0,f06721cf-535b-47dc-8053-9fcdf5d55d2e,0.0,hi!,,,4181b998-7ac7-4aa1-bed1-8928558e3152,a30eef03-5d0d-4df8-80f7-2eca44520aea");
        double double14 = payment4.getAmount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        java.lang.String str8 = payment4.getId();
        payment4.setAmount((java.lang.Double) 1.0d);
        java.lang.String str11 = payment4.getBookingId();
        payment4.setBookingId("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "54) test172(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "04ca3c12-0156-4712-bb59-d6be9faca94f" + "'", str8, "04ca3c12-0156-4712-bb59-d6be9faca94f");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        java.lang.String str6 = payment4.getId();
        java.lang.String str7 = payment4.getId();
        java.lang.String str8 = payment4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "55) test173(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "66af5e25-64c4-4f56-9c92-22930d1bb51a" + "'", str6, "66af5e25-64c4-4f56-9c92-22930d1bb51a");
// flaky "17) test173(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66af5e25-64c4-4f56-9c92-22930d1bb51a" + "'", str7, "66af5e25-64c4-4f56-9c92-22930d1bb51a");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        double double11 = payment4.getAmount();
        java.lang.String str12 = payment4.getId();
        java.lang.String str13 = payment4.getCardNumber();
        payment4.setId("222a044d-92a7-4073-a601-f038f4aebe2c");
        payment4.setId("f06721cf-535b-47dc-8053-9fcdf5d55d2e");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "56) test174(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "93a4837d-918c-4b46-a159-33d9a1f87acf,0.0,hi!,," + "'", str10, "93a4837d-918c-4b46-a159-33d9a1f87acf,0.0,hi!,,");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "18) test174(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "93a4837d-918c-4b46-a159-33d9a1f87acf" + "'", str12, "93a4837d-918c-4b46-a159-33d9a1f87acf");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("042fdfd6-b3dd-4dbc-bd6a-f7576d9e9ca9");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "91e800ef-5c17-4771-8783-1a8be3e39310,0.0,hi!,,", "9bd34861-a03a-4146-9921-d0b4b87b0f17,0.0,hi!,,dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!", "91e800ef-5c17-4771-8783-1a8be3e39310,0.0,hi!,,");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setId("");
        java.lang.String str7 = payment4.getId();
        java.lang.String str8 = payment4.getBookingId();
        payment4.setId("a52c5b93-0845-4182-b3ca-86d54eab0011");
        payment4.setBookingId("8fb87ccb-c69d-4934-bf45-f4f2d8f95efe");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        java.lang.String str8 = payment4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!" + "'", str8, "3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("d3259a34-3c43-4841-b700-7500987b5a3f,0.0,hi!,,hi!");
        java.lang.String str2 = payment1.getId();
        java.lang.String str3 = payment1.getCardNumber();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d3259a34-3c43-4841-b700-7500987b5a3f" + "'", str2, "d3259a34-3c43-4841-b700-7500987b5a3f");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 100.0d, "", "a52c5b93-0845-4182-b3ca-86d54eab0011", "");
        payment4.setUserId("600a5c73-67c7-449b-8475-3ae4885750e4");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("5e01199b-e38e-4b1e-81e2-218ef258c681,0.0,hi!,,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        java.lang.String str8 = payment4.getCardNumber();
        double double9 = payment4.getAmount();
        java.lang.String str10 = payment4.getBookingId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setBookingId("");
        java.lang.String str7 = payment4.getId();
        double double8 = payment4.getAmount();
// flaky "57) test183(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a6466424-ccb9-4465-a814-1fbd504033c5" + "'", str7, "a6466424-ccb9-4465-a814-1fbd504033c5");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) (-1.0d), "", "8127b3e5-3a39-4f58-879b-6d2ab729fe05", "25a13c2a-00f0-401b-8033-0654b2ec65a4");
        payment4.setBookingId("c64d13c1-e824-4664-a3ea-e0a1136b08af");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setId("");
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 10.0d, "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!", "b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,", "3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("88ec654e-cbcc-4256-8997-514e19c91dcb,0.0,hi!,,hi!");
        java.lang.String str2 = payment1.getId();
        payment1.setBookingId("fb72516a-20ee-45ef-8ab8-13727ba66291,0.0,hi!,,hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "88ec654e-cbcc-4256-8997-514e19c91dcb" + "'", str2, "88ec654e-cbcc-4256-8997-514e19c91dcb");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("c64d13c1-e824-4664-a3ea-e0a1136b08af,0.0,hi!,,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("05eb5e89-cc2f-4118-9ba4-751528233c20");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        java.lang.String str8 = payment4.getId();
        payment4.setAmount((java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "58) test190(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "9c5371b7-266f-43ee-8cde-202457bde95e" + "'", str8, "9c5371b7-266f-43ee-8cde-202457bde95e");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        java.lang.String str8 = payment4.toCSVRow();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "59) test191(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a0197ea1-8edf-4257-a3c4-5c03322b5767,0.0,hi!,3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!," + "'", str8, "a0197ea1-8edf-4257-a3c4-5c03322b5767,0.0,hi!,3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!,");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 100.0d, "c94f943c-47b8-42b8-8435-0612a47114ed,0.0,hi!,,", "", "9ce535c1-d59a-4f57-bf39-8e6b7204c22a");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "406cdb1f-7c87-4435-a917-2ae3dd8810d1,0.0,hi!,,", "28b9df0b-a301-4229-91a2-0f055bf2ddab,0.0,hi!,,", "ab3bc5de-da03-45c5-96e2-7f24191dc33a,0.0,hi!,,");
        payment4.setId("88ec654e-cbcc-4256-8997-514e19c91dcb,0.0,hi!,,hi!");
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setBookingId("");
        java.lang.String str7 = payment4.toCSVRow();
        java.lang.String str8 = payment4.getId();
// flaky "60) test194(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8db1ffa0-8b24-4cd8-b0ee-ed1b6fafefbe,0.0,hi!,," + "'", str7, "8db1ffa0-8b24-4cd8-b0ee-ed1b6fafefbe,0.0,hi!,,");
// flaky "19) test194(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "8db1ffa0-8b24-4cd8-b0ee-ed1b6fafefbe" + "'", str8, "8db1ffa0-8b24-4cd8-b0ee-ed1b6fafefbe");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 10.0d, "75318a4b-7b6a-4b6d-9cc9-f77a274eb17a", "a52c5b93-0845-4182-b3ca-86d54eab0011,0.0,hi!,,", "a96c4c6f-cf7b-46f3-b5ff-fc1ede2a4b0f");
        java.lang.String str5 = payment4.getId();
// flaky "61) test195(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a4a6e57d-8600-4a4c-8988-71991c8a18dc" + "'", str5, "a4a6e57d-8600-4a4c-8988-71991c8a18dc");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        payment4.setAmount((java.lang.Double) 1.0d);
        java.lang.String str10 = payment4.getBookingId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "c2d7b5bf-5bf9-4490-9b7a-d453897592a9,0.0,hi!,,", "25a13c2a-00f0-401b-8033-0654b2ec65a4", "c2d7b5bf-5bf9-4490-9b7a-d453897592a9,0.0,hi!,,");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("d3259a34-3c43-4841-b700-7500987b5a3f,0.0,hi!,,hi!");
        java.lang.String str2 = payment1.getId();
        payment1.setBookingId("ce2b1ea8-e998-4300-8b4d-1052c15fa2bd");
        double double5 = payment1.getAmount();
        java.lang.String str6 = payment1.toCSVRow();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d3259a34-3c43-4841-b700-7500987b5a3f" + "'", str2, "d3259a34-3c43-4841-b700-7500987b5a3f");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "d3259a34-3c43-4841-b700-7500987b5a3f,0.0,hi!,,ce2b1ea8-e998-4300-8b4d-1052c15fa2bd" + "'", str6, "d3259a34-3c43-4841-b700-7500987b5a3f,0.0,hi!,,ce2b1ea8-e998-4300-8b4d-1052c15fa2bd");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 1.0d, "4181b998-7ac7-4aa1-bed1-8928558e3152", "b3a79cc5-8b9e-407c-af71-37af8d100f31,0.0,hi!,,hi!", "727a9d21-4e96-403c-a5b5-f9913fb9dd12");
        payment4.setUserId("a52c5b93-0845-4182-b3ca-86d54eab0011");
        java.lang.String str7 = payment4.getCardNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4181b998-7ac7-4aa1-bed1-8928558e3152" + "'", str7, "4181b998-7ac7-4aa1-bed1-8928558e3152");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 100.0d, "670de2d3-2f4e-4f2a-9be0-b55cf91b4fe5", "ee2c0e56-7120-47e9-996d-86514ce02728,0.0,hi!,,", "9bd34861-a03a-4146-9921-d0b4b87b0f17,0.0,hi!,,dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("a47505e4-4f64-4fc4-b64f-9bbc87c93c3d,0.0,hi!,,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        java.lang.String str11 = payment4.getId();
        payment4.setId("a52c5b93-0845-4182-b3ca-86d54eab0011");
        payment4.setUserId("a96c4c6f-cf7b-46f3-b5ff-fc1ede2a4b0f");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "62) test202(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "3be8f584-b942-408b-80ea-8c6076557fcc,0.0,hi!,," + "'", str10, "3be8f584-b942-408b-80ea-8c6076557fcc,0.0,hi!,,");
// flaky "20) test202(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3be8f584-b942-408b-80ea-8c6076557fcc" + "'", str11, "3be8f584-b942-408b-80ea-8c6076557fcc");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setId("");
        java.lang.String str7 = payment4.getId();
        java.lang.String str8 = payment4.getBookingId();
        payment4.setId("a52c5b93-0845-4182-b3ca-86d54eab0011");
        java.lang.String str11 = payment4.getCardNumber();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        java.lang.String str11 = payment4.toCSVRow();
        double double12 = payment4.getAmount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "63) test204(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "e99be0e8-90bb-43dd-bfb0-c425d68d6030,0.0,hi!,," + "'", str10, "e99be0e8-90bb-43dd-bfb0-c425d68d6030,0.0,hi!,,");
// flaky "21) test204(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "e99be0e8-90bb-43dd-bfb0-c425d68d6030,0.0,hi!,," + "'", str11, "e99be0e8-90bb-43dd-bfb0-c425d68d6030,0.0,hi!,,");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setBookingId("b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,");
        payment4.setBookingId("dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        java.lang.String str9 = payment4.getUserId();
        java.lang.String str10 = payment4.getId();
        java.lang.String str11 = payment4.getBookingId();
        payment4.setAmount((java.lang.Double) 1.0d);
        java.lang.String str14 = payment4.getCardNumber();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "64) test205(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1f0edf94-cc0e-43a5-8056-e0c7e1fda40e" + "'", str10, "1f0edf94-cc0e-43a5-8056-e0c7e1fda40e");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!" + "'", str11, "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        java.lang.String str11 = payment4.getId();
        payment4.setId("a52c5b93-0845-4182-b3ca-86d54eab0011");
        payment4.setUserId("a52c5b93-0845-4182-b3ca-86d54eab0011,0.0,hi!,,");
        java.lang.String str16 = payment4.getCardNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "65) test206(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ee10a6d5-afe3-4349-9b30-a1cb717dfe48,0.0,hi!,," + "'", str10, "ee10a6d5-afe3-4349-9b30-a1cb717dfe48,0.0,hi!,,");
// flaky "22) test206(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ee10a6d5-afe3-4349-9b30-a1cb717dfe48" + "'", str11, "ee10a6d5-afe3-4349-9b30-a1cb717dfe48");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("88ec654e-cbcc-4256-8997-514e19c91dcb,0.0,hi!,,hi!");
        java.lang.String str2 = payment1.getId();
        payment1.setBookingId("387781ea-eb7c-495c-96f6-6d09fac35acc");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "88ec654e-cbcc-4256-8997-514e19c91dcb" + "'", str2, "88ec654e-cbcc-4256-8997-514e19c91dcb");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 1.0d, "44463e9e-c930-4175-b404-7ea6e1a861c7,0.0,hi!,,", "f7e8ea0f-2bb1-4354-ab93-f07e1a84f75a", "91e800ef-5c17-4771-8783-1a8be3e39310,0.0,hi!,,");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("d3259a34-3c43-4841-b700-7500987b5a3f,0.0,hi!,,hi!");
        java.lang.String str2 = payment1.getId();
        payment1.setBookingId("ce2b1ea8-e998-4300-8b4d-1052c15fa2bd");
        double double5 = payment1.getAmount();
        payment1.setId("caba895e-7dc1-48c4-8f57-4dc9b18e6741,0.0,hi!,,");
        java.lang.Class<?> wildcardClass8 = payment1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d3259a34-3c43-4841-b700-7500987b5a3f" + "'", str2, "d3259a34-3c43-4841-b700-7500987b5a3f");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        payment1.setId("dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        payment1.setBookingId("ab3bc5de-da03-45c5-96e2-7f24191dc33a");
        payment1.setBookingId("727a9d21-4e96-403c-a5b5-f9913fb9dd12,0.0,hi!,,");
        payment1.setId("c64d13c1-e824-4664-a3ea-e0a1136b08af,0.0,hi!,,");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) (-1.0d), "56bb4d31-6a1a-427d-a3a9-b6b07f84706f,0.0,hi!,,hi!", "25a13c2a-00f0-401b-8033-0654b2ec65a4", "c69f1250-6f67-4062-91ea-9a5f18a96693");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("fc39bb43-a042-49ec-b67a-41123f37e812,0.0,hi!,,hi!");
        java.lang.String str2 = payment1.getId();
        payment1.setUserId("");
        java.lang.String str5 = payment1.getBookingId();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fc39bb43-a042-49ec-b67a-41123f37e812" + "'", str2, "fc39bb43-a042-49ec-b67a-41123f37e812");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("955e403d-180a-4d68-b0bb-f5de1f6d52b3,0.0,hi!,,hi!");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setBookingId("b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,");
        payment4.setBookingId("dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        java.lang.String str9 = payment4.getBookingId();
        java.lang.String str10 = payment4.getId();
        payment4.setId("91e800ef-5c17-4771-8783-1a8be3e39310");
        payment4.setUserId("c028d231-fda0-43a5-a08e-1b4ed603915a,0.0,hi!,,hi!");
        payment4.setBookingId("a30eef03-5d0d-4df8-80f7-2eca44520aea,0.0,hi!,,");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!" + "'", str9, "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
// flaky "66) test214(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "13ab227d-c49d-4a52-9d91-250ec96fc558" + "'", str10, "13ab227d-c49d-4a52-9d91-250ec96fc558");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("d3259a34-3c43-4841-b700-7500987b5a3f,0.0,hi!,,hi!");
        java.lang.String str2 = payment1.getId();
        payment1.setBookingId("ce2b1ea8-e998-4300-8b4d-1052c15fa2bd");
        double double5 = payment1.getAmount();
        payment1.setUserId("38452afa-27af-48d7-a279-411eefd466a0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d3259a34-3c43-4841-b700-7500987b5a3f" + "'", str2, "d3259a34-3c43-4841-b700-7500987b5a3f");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 1.0d, "", "955e403d-180a-4d68-b0bb-f5de1f6d52b3,0.0,hi!,,hi!", "a47505e4-4f64-4fc4-b64f-9bbc87c93c3d,0.0,hi!,,");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getBookingId();
        payment4.setAmount((java.lang.Double) 100.0d);
        double double11 = payment4.getAmount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 1.0d, "222a044d-92a7-4073-a601-f038f4aebe2c", "d3259a34-3c43-4841-b700-7500987b5a3f,0.0,hi!,,hi!", "0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,,");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "406cdb1f-7c87-4435-a917-2ae3dd8810d1,0.0,hi!,,", "28b9df0b-a301-4229-91a2-0f055bf2ddab,0.0,hi!,,", "ab3bc5de-da03-45c5-96e2-7f24191dc33a,0.0,hi!,,");
        payment4.setUserId("c2d7b5bf-5bf9-4490-9b7a-d453897592a9,0.0,hi!,,");
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        payment4.setBookingId("hi!");
        java.lang.String str10 = payment4.toCSVRow();
        java.lang.String str11 = payment4.getUserId();
        payment4.setUserId("c7110c25-55e6-43b4-b006-afc57fc68908");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "67) test220(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "363fc4fd-52f5-48c2-b34f-cb9324a306a0,0.0,hi!,,hi!" + "'", str10, "363fc4fd-52f5-48c2-b34f-cb9324a306a0,0.0,hi!,,hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        java.lang.String str8 = payment4.getId();
        payment4.setId("hi!");
        java.lang.String str11 = payment4.getId();
        payment4.setId("f06721cf-535b-47dc-8053-9fcdf5d55d2e,0.0,hi!,,");
        java.lang.String str14 = payment4.toCSVRow();
        payment4.setAmount((java.lang.Double) 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "68) test221(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a5362938-c67b-4461-a99b-79676b3a23ae" + "'", str8, "a5362938-c67b-4461-a99b-79676b3a23ae");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "f06721cf-535b-47dc-8053-9fcdf5d55d2e,0.0,hi!,,,0.0,hi!,3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!," + "'", str14, "f06721cf-535b-47dc-8053-9fcdf5d55d2e,0.0,hi!,,,0.0,hi!,3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!,");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "69) test222(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "14b09fec-2a6f-4586-9d0f-d90b5d5a675f" + "'", str8, "14b09fec-2a6f-4586-9d0f-d90b5d5a675f");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        java.lang.String str8 = payment4.getId();
        payment4.setAmount((java.lang.Double) 100.0d);
        payment4.setId("fb72516a-20ee-45ef-8ab8-13727ba66291,0.0,hi!,,hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "70) test223(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "78f5d39f-0fb2-44a9-9112-538d1ac0c2ff" + "'", str8, "78f5d39f-0fb2-44a9-9112-538d1ac0c2ff");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 1.0d, "75318a4b-7b6a-4b6d-9cc9-f77a274eb17a", "a96c4c6f-cf7b-46f3-b5ff-fc1ede2a4b0f", "74dbb949-a243-4aca-a31f-d489781172a7");
        payment4.setId("086b0ce9-d17e-495f-b1bc-98ef880c5ead");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setBookingId("b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,");
        payment4.setBookingId("dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        java.lang.String str9 = payment4.getBookingId();
        java.lang.String str10 = payment4.getId();
        payment4.setAmount((java.lang.Double) 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!" + "'", str9, "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
// flaky "71) test225(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "dc6cf42c-b22b-4b7a-a92d-6c1586fbd422" + "'", str10, "dc6cf42c-b22b-4b7a-a92d-6c1586fbd422");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 10.0d, "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!", "b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,", "3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        payment4.setUserId("0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,,");
        java.lang.String str7 = payment4.getUserId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,," + "'", str7, "0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,,");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        java.lang.String str11 = payment4.getId();
        payment4.setId("a52c5b93-0845-4182-b3ca-86d54eab0011");
        double double14 = payment4.getAmount();
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "72) test227(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4c7265b7-33ad-4db5-bdb4-8ca013a79f67,0.0,hi!,," + "'", str10, "4c7265b7-33ad-4db5-bdb4-8ca013a79f67,0.0,hi!,,");
// flaky "23) test227(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4c7265b7-33ad-4db5-bdb4-8ca013a79f67" + "'", str11, "4c7265b7-33ad-4db5-bdb4-8ca013a79f67");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        java.lang.String str11 = payment4.getId();
        payment4.setAmount((java.lang.Double) 100.0d);
        double double14 = payment4.getAmount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "73) test228(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ca0896d8-83c6-4dce-a136-e7271c856fbd,0.0,hi!,," + "'", str10, "ca0896d8-83c6-4dce-a136-e7271c856fbd,0.0,hi!,,");
// flaky "24) test228(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ca0896d8-83c6-4dce-a136-e7271c856fbd" + "'", str11, "ca0896d8-83c6-4dce-a136-e7271c856fbd");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setBookingId("b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,");
        payment4.setBookingId("dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        java.lang.String str9 = payment4.getBookingId();
        java.lang.String str10 = payment4.getId();
        payment4.setId("91e800ef-5c17-4771-8783-1a8be3e39310");
        payment4.setUserId("9ce535c1-d59a-4f57-bf39-8e6b7204c22a");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!" + "'", str9, "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
// flaky "74) test229(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "3fff8f7b-a913-448d-ad9e-a46e8f4305ed" + "'", str10, "3fff8f7b-a913-448d-ad9e-a46e8f4305ed");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("8f4c0e7d-bed8-49c1-8702-105839816ffc");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 1.0d, "4c222007-960c-4a62-9be1-eb14b02b15c7,0.0,hi!,727a9d21-4e96-403c-a5b5-f9913fb9dd12,dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!", "74dbb949-a243-4aca-a31f-d489781172a7", "3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("35c34c03-962d-4ba3-8afd-1d9783865866,0.0,hi!,,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("542ed34d-b3b7-43dc-9366-c4d15fb56773,0.0,hi!,,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        payment1.setBookingId("2b3400be-c825-4673-b77b-a852c54d316d");
        java.lang.String str4 = payment1.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3dfc1a73-97f8-4f2a-81b0-026077a476ea" + "'", str4, "3dfc1a73-97f8-4f2a-81b0-026077a476ea");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) (-1.0d), "d3259a34-3c43-4841-b700-7500987b5a3f", "c64d13c1-e824-4664-a3ea-e0a1136b08af,0.0,hi!,,", "05eb5e89-cc2f-4118-9ba4-751528233c20");
        double double5 = payment4.getAmount();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 10.0d, "4181b998-7ac7-4aa1-bed1-8928558e3152", "ab3bc5de-da03-45c5-96e2-7f24191dc33a,0.0,hi!,,", "09f96ec4-d27b-4a2f-a55e-8579a7ba499b");
        payment4.setId("8db1ffa0-8b24-4cd8-b0ee-ed1b6fafefbe");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) (-1.0d), "6e1f7f3c-4086-45db-9010-db67d13fde2b", "35c34c03-962d-4ba3-8afd-1d9783865866,0.0,hi!,,", "e3138398-544a-4ff0-a38a-fc309d53ed8a");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        payment1.setId("dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        payment1.setBookingId("ab3bc5de-da03-45c5-96e2-7f24191dc33a");
        payment1.setBookingId("727a9d21-4e96-403c-a5b5-f9913fb9dd12,0.0,hi!,,");
        java.lang.String str8 = payment1.getUserId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) (-1.0d), "8f4c0e7d-bed8-49c1-8702-105839816ffc,0.0,hi!,,", "hi!", "84717e4c-3d78-4e94-817c-36f94240de68");
        java.lang.String str5 = payment4.getId();
// flaky "75) test239(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "9d4c9a60-4139-4b6c-baec-56215ba0a34c" + "'", str5, "9d4c9a60-4139-4b6c-baec-56215ba0a34c");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        java.lang.String str8 = payment4.getBookingId();
        payment4.setBookingId("b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,");
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "387781ea-eb7c-495c-96f6-6d09fac35acc", "a96c4c6f-cf7b-46f3-b5ff-fc1ede2a4b0f", "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        double double5 = payment4.getAmount();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        payment4.setAmount((java.lang.Double) 100.0d);
        java.lang.String str10 = payment4.getUserId();
        java.lang.String str11 = payment4.getCardNumber();
        payment4.setId("c79e7d79-240a-4972-bba0-dc97fb8536ac");
        java.lang.String str14 = payment4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "c79e7d79-240a-4972-bba0-dc97fb8536ac" + "'", str14, "c79e7d79-240a-4972-bba0-dc97fb8536ac");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 100.0d, "", "a8eb815f-138d-450b-8479-dab00ba0af5c,0.0,hi!,,", "7db6587d-3129-4442-b655-ff8c407fd50e,0.0,hi!,,");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        payment4.setAmount((java.lang.Double) 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 1.0d, "4181b998-7ac7-4aa1-bed1-8928558e3152", "b3a79cc5-8b9e-407c-af71-37af8d100f31,0.0,hi!,,hi!", "727a9d21-4e96-403c-a5b5-f9913fb9dd12");
        payment4.setUserId("a52c5b93-0845-4182-b3ca-86d54eab0011");
        java.lang.String str7 = payment4.toCSVRow();
// flaky "76) test244(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "e0fb436d-6344-4418-b12b-71b255b80b39,1.0,4181b998-7ac7-4aa1-bed1-8928558e3152,a52c5b93-0845-4182-b3ca-86d54eab0011,727a9d21-4e96-403c-a5b5-f9913fb9dd12" + "'", str7, "e0fb436d-6344-4418-b12b-71b255b80b39,1.0,4181b998-7ac7-4aa1-bed1-8928558e3152,a52c5b93-0845-4182-b3ca-86d54eab0011,727a9d21-4e96-403c-a5b5-f9913fb9dd12");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        java.lang.String str11 = payment4.getId();
        payment4.setId("a52c5b93-0845-4182-b3ca-86d54eab0011");
        java.lang.String str14 = payment4.getId();
        double double15 = payment4.getAmount();
        java.lang.String str16 = payment4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "77) test245(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "78de17fa-13af-4610-8c18-cd7ce95aef44,0.0,hi!,," + "'", str10, "78de17fa-13af-4610-8c18-cd7ce95aef44,0.0,hi!,,");
// flaky "25) test245(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "78de17fa-13af-4610-8c18-cd7ce95aef44" + "'", str11, "78de17fa-13af-4610-8c18-cd7ce95aef44");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "a52c5b93-0845-4182-b3ca-86d54eab0011" + "'", str14, "a52c5b93-0845-4182-b3ca-86d54eab0011");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 1.0d, "f06721cf-535b-47dc-8053-9fcdf5d55d2e,0.0,hi!,,", "4181b998-7ac7-4aa1-bed1-8928558e3152", "a30eef03-5d0d-4df8-80f7-2eca44520aea");
        payment4.setUserId("7db6587d-3129-4442-b655-ff8c407fd50e,0.0,hi!,,");
        java.lang.String str7 = payment4.toCSVRow();
// flaky "78) test246(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9a53ee4a-c964-4ec2-820d-b8a438d1c0e3,1.0,f06721cf-535b-47dc-8053-9fcdf5d55d2e,0.0,hi!,,,7db6587d-3129-4442-b655-ff8c407fd50e,0.0,hi!,,,a30eef03-5d0d-4df8-80f7-2eca44520aea" + "'", str7, "9a53ee4a-c964-4ec2-820d-b8a438d1c0e3,1.0,f06721cf-535b-47dc-8053-9fcdf5d55d2e,0.0,hi!,,,7db6587d-3129-4442-b655-ff8c407fd50e,0.0,hi!,,,a30eef03-5d0d-4df8-80f7-2eca44520aea");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "406cdb1f-7c87-4435-a917-2ae3dd8810d1,0.0,hi!,,", "28b9df0b-a301-4229-91a2-0f055bf2ddab,0.0,hi!,,", "ab3bc5de-da03-45c5-96e2-7f24191dc33a,0.0,hi!,,");
        payment4.setId("88ec654e-cbcc-4256-8997-514e19c91dcb,0.0,hi!,,hi!");
        java.lang.String str7 = payment4.getUserId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "28b9df0b-a301-4229-91a2-0f055bf2ddab,0.0,hi!,," + "'", str7, "28b9df0b-a301-4229-91a2-0f055bf2ddab,0.0,hi!,,");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 1.0d, "4181b998-7ac7-4aa1-bed1-8928558e3152", "b3a79cc5-8b9e-407c-af71-37af8d100f31,0.0,hi!,,hi!", "727a9d21-4e96-403c-a5b5-f9913fb9dd12");
        java.lang.String str5 = payment4.getId();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
// flaky "79) test248(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "64fe0157-398e-412b-a877-5da42151b2e7" + "'", str5, "64fe0157-398e-412b-a877-5da42151b2e7");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 1.0d, "f06721cf-535b-47dc-8053-9fcdf5d55d2e,0.0,hi!,,", "4181b998-7ac7-4aa1-bed1-8928558e3152", "a30eef03-5d0d-4df8-80f7-2eca44520aea");
        double double5 = payment4.getAmount();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "7b59b3f8-3a21-4c9e-99e8-b619d9e75280,100.0,c7110c25-55e6-43b4-b006-afc57fc68908,4181b998-7ac7-4aa1-bed1-8928558e3152,0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,,", "406cdb1f-7c87-4435-a917-2ae3dd8810d1", "e246b6f9-bf18-4485-8df8-e2300a2331ea,0.0,hi!,,");
        payment4.setId("d3259a34-3c43-4841-b700-7500987b5a3f");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        payment4.setBookingId("hi!");
        java.lang.String str10 = payment4.toCSVRow();
        java.lang.String str11 = payment4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "80) test251(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "7809d03e-c579-4e30-b9dd-3cde0c79a570,0.0,hi!,,hi!" + "'", str10, "7809d03e-c579-4e30-b9dd-3cde0c79a570,0.0,hi!,,hi!");
// flaky "26) test251(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7809d03e-c579-4e30-b9dd-3cde0c79a570" + "'", str11, "7809d03e-c579-4e30-b9dd-3cde0c79a570");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 10.0d, "a30eef03-5d0d-4df8-80f7-2eca44520aea", "84717e4c-3d78-4e94-817c-36f94240de68", "74dbb949-a243-4aca-a31f-d489781172a7");
        payment4.setId("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        java.lang.String str7 = payment4.getUserId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "84717e4c-3d78-4e94-817c-36f94240de68" + "'", str7, "84717e4c-3d78-4e94-817c-36f94240de68");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("25a13c2a-00f0-401b-8033-0654b2ec65a4");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("97a0afbd-cb5b-4bcf-9f51-70c7896ed29c,0.0,hi!,,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "670de2d3-2f4e-4f2a-9be0-b55cf91b4fe5", "7809d03e-c579-4e30-b9dd-3cde0c79a570,0.0,hi!,,hi!", "6f7c1d00-2b2c-4fa7-83d3-e1503459b2d4,0.0,hi!,,hi!");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 100.0d, "c7110c25-55e6-43b4-b006-afc57fc68908", "4181b998-7ac7-4aa1-bed1-8928558e3152", "0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,,");
        java.lang.String str5 = payment4.getCardNumber();
        java.lang.String str6 = payment4.toCSVRow();
        payment4.setBookingId("ca0896d8-83c6-4dce-a136-e7271c856fbd");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "c7110c25-55e6-43b4-b006-afc57fc68908" + "'", str5, "c7110c25-55e6-43b4-b006-afc57fc68908");
// flaky "81) test256(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "482d3518-b517-4181-a308-3f7975bed232,100.0,c7110c25-55e6-43b4-b006-afc57fc68908,4181b998-7ac7-4aa1-bed1-8928558e3152,0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,," + "'", str6, "482d3518-b517-4181-a308-3f7975bed232,100.0,c7110c25-55e6-43b4-b006-afc57fc68908,4181b998-7ac7-4aa1-bed1-8928558e3152,0bb64a48-d218-4dab-b5ca-bd40f415b2f2,0.0,hi!,,");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setBookingId("b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,");
        payment4.setBookingId("dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        payment4.setBookingId("91e800ef-5c17-4771-8783-1a8be3e39310,0.0,hi!,,");
        double double11 = payment4.getAmount();
        java.lang.String str12 = payment4.toCSVRow();
        java.lang.String str13 = payment4.getBookingId();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "82) test257(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "94ae56ef-88d7-4391-b42c-9ecafc00b6ce,0.0,hi!,,91e800ef-5c17-4771-8783-1a8be3e39310,0.0,hi!,," + "'", str12, "94ae56ef-88d7-4391-b42c-9ecafc00b6ce,0.0,hi!,,91e800ef-5c17-4771-8783-1a8be3e39310,0.0,hi!,,");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "91e800ef-5c17-4771-8783-1a8be3e39310,0.0,hi!,," + "'", str13, "91e800ef-5c17-4771-8783-1a8be3e39310,0.0,hi!,,");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        java.lang.String str11 = payment4.getId();
        payment4.setId("a52c5b93-0845-4182-b3ca-86d54eab0011");
        payment4.setUserId("a52c5b93-0845-4182-b3ca-86d54eab0011,0.0,hi!,,");
        payment4.setAmount((java.lang.Double) 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "83) test258(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "b1d29b50-b3a3-4d4e-a6ed-a0342426dd54,0.0,hi!,," + "'", str10, "b1d29b50-b3a3-4d4e-a6ed-a0342426dd54,0.0,hi!,,");
// flaky "27) test258(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "b1d29b50-b3a3-4d4e-a6ed-a0342426dd54" + "'", str11, "b1d29b50-b3a3-4d4e-a6ed-a0342426dd54");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("363fc4fd-52f5-48c2-b34f-cb9324a306a0,0.0,hi!,,hi!");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        java.lang.String str11 = payment4.toCSVRow();
        java.lang.String str12 = payment4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "84) test260(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2649dfab-51a0-409f-8afa-b657ba769c9b,0.0,hi!,," + "'", str10, "2649dfab-51a0-409f-8afa-b657ba769c9b,0.0,hi!,,");
// flaky "28) test260(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2649dfab-51a0-409f-8afa-b657ba769c9b,0.0,hi!,," + "'", str11, "2649dfab-51a0-409f-8afa-b657ba769c9b,0.0,hi!,,");
// flaky "3) test260(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2649dfab-51a0-409f-8afa-b657ba769c9b" + "'", str12, "2649dfab-51a0-409f-8afa-b657ba769c9b");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setBookingId("b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,");
        payment4.setBookingId("dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        java.lang.String str9 = payment4.getUserId();
        payment4.setAmount((java.lang.Double) 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setBookingId("b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,");
        payment4.setBookingId("dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        payment4.setBookingId("91e800ef-5c17-4771-8783-1a8be3e39310,0.0,hi!,,");
        double double11 = payment4.getAmount();
        java.lang.String str12 = payment4.toCSVRow();
        double double13 = payment4.getAmount();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "85) test262(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "431ff774-bc96-456d-8f05-720b885f7e28,0.0,hi!,,91e800ef-5c17-4771-8783-1a8be3e39310,0.0,hi!,," + "'", str12, "431ff774-bc96-456d-8f05-720b885f7e28,0.0,hi!,,91e800ef-5c17-4771-8783-1a8be3e39310,0.0,hi!,,");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        double double2 = payment1.getAmount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 10.0d, "406cdb1f-7c87-4435-a917-2ae3dd8810d1", "05eb5e89-cc2f-4118-9ba4-751528233c20", "74dbb949-a243-4aca-a31f-d489781172a7");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        java.lang.String str11 = payment4.getId();
        payment4.setId("a52c5b93-0845-4182-b3ca-86d54eab0011");
        java.lang.String str14 = payment4.getId();
        java.lang.String str15 = payment4.getId();
        payment4.setId("f7e8ea0f-2bb1-4354-ab93-f07e1a84f75a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "86) test265(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4da34d36-626b-42d5-ac73-e96da0f71996,0.0,hi!,," + "'", str10, "4da34d36-626b-42d5-ac73-e96da0f71996,0.0,hi!,,");
// flaky "29) test265(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4da34d36-626b-42d5-ac73-e96da0f71996" + "'", str11, "4da34d36-626b-42d5-ac73-e96da0f71996");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "a52c5b93-0845-4182-b3ca-86d54eab0011" + "'", str14, "a52c5b93-0845-4182-b3ca-86d54eab0011");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "a52c5b93-0845-4182-b3ca-86d54eab0011" + "'", str15, "a52c5b93-0845-4182-b3ca-86d54eab0011");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        double double11 = payment4.getAmount();
        java.lang.String str12 = payment4.getBookingId();
        java.lang.String str13 = payment4.toCSVRow();
        payment4.setId("56bb4d31-6a1a-427d-a3a9-b6b07f84706f,0.0,hi!,,hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "87) test266(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0e9d423c-c2a0-4e92-89f6-1959a88319fa,0.0,hi!,," + "'", str10, "0e9d423c-c2a0-4e92-89f6-1959a88319fa,0.0,hi!,,");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky "30) test266(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0e9d423c-c2a0-4e92-89f6-1959a88319fa,0.0,hi!,," + "'", str13, "0e9d423c-c2a0-4e92-89f6-1959a88319fa,0.0,hi!,,");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        double double11 = payment4.getAmount();
        java.lang.String str12 = payment4.getId();
        java.lang.String str13 = payment4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "88) test267(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "012ad04e-5113-4e61-bf61-962b4bd802d1,0.0,hi!,," + "'", str10, "012ad04e-5113-4e61-bf61-962b4bd802d1,0.0,hi!,,");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "31) test267(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "012ad04e-5113-4e61-bf61-962b4bd802d1" + "'", str12, "012ad04e-5113-4e61-bf61-962b4bd802d1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "89) test268(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "a154f14b-969e-492f-a10c-e5680b90dc3b,0.0,hi!,," + "'", str10, "a154f14b-969e-492f-a10c-e5680b90dc3b,0.0,hi!,,");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 1.0d, "222a044d-92a7-4073-a601-f038f4aebe2c", "cf99f685-14e3-4852-b7ab-a99bc4bc4106,0.0,hi!,,", "05eb5e89-cc2f-4118-9ba4-751528233c20");
        java.lang.String str5 = payment4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cf99f685-14e3-4852-b7ab-a99bc4bc4106,0.0,hi!,," + "'", str5, "cf99f685-14e3-4852-b7ab-a99bc4bc4106,0.0,hi!,,");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("d3259a34-3c43-4841-b700-7500987b5a3f,0.0,hi!,,hi!");
        java.lang.String str2 = payment1.getId();
        payment1.setBookingId("ce2b1ea8-e998-4300-8b4d-1052c15fa2bd");
        double double5 = payment1.getAmount();
        payment1.setId("caba895e-7dc1-48c4-8f57-4dc9b18e6741,0.0,hi!,,");
        payment1.setAmount((java.lang.Double) 100.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d3259a34-3c43-4841-b700-7500987b5a3f" + "'", str2, "d3259a34-3c43-4841-b700-7500987b5a3f");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "91e800ef-5c17-4771-8783-1a8be3e39310,0.0,hi!,,", "9bd34861-a03a-4146-9921-d0b4b87b0f17,0.0,hi!,,dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!", "91e800ef-5c17-4771-8783-1a8be3e39310,0.0,hi!,,");
        java.lang.String str5 = payment4.getCardNumber();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "91e800ef-5c17-4771-8783-1a8be3e39310,0.0,hi!,," + "'", str5, "91e800ef-5c17-4771-8783-1a8be3e39310,0.0,hi!,,");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        double double5 = payment4.getAmount();
        java.lang.String str6 = payment4.getId();
        java.lang.String str7 = payment4.getBookingId();
        payment4.setAmount((java.lang.Double) 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
// flaky "90) test272(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "115d893a-693b-49b4-b646-f5f685750d6e" + "'", str6, "115d893a-693b-49b4-b646-f5f685750d6e");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        payment4.setAmount((java.lang.Double) 100.0d);
        payment4.setUserId("f06721cf-535b-47dc-8053-9fcdf5d55d2e");
        java.lang.String str12 = payment4.getUserId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "f06721cf-535b-47dc-8053-9fcdf5d55d2e" + "'", str12, "f06721cf-535b-47dc-8053-9fcdf5d55d2e");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        java.lang.String str8 = payment4.getId();
        payment4.setAmount((java.lang.Double) 100.0d);
        payment4.setAmount((java.lang.Double) (-1.0d));
        java.lang.String str13 = payment4.toCSVRow();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "91) test274(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3f80eec8-2129-46dc-b8a2-f3b559bd4fcc" + "'", str8, "3f80eec8-2129-46dc-b8a2-f3b559bd4fcc");
// flaky "32) test274(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3f80eec8-2129-46dc-b8a2-f3b559bd4fcc,-1.0,hi!,3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!," + "'", str13, "3f80eec8-2129-46dc-b8a2-f3b559bd4fcc,-1.0,hi!,3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!,");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 10.0d, "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!", "b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,", "3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        double double5 = payment4.getAmount();
        payment4.setId("406cdb1f-7c87-4435-a917-2ae3dd8810d1,0.0,hi!,,");
        java.lang.String str8 = payment4.toCSVRow();
        java.lang.String str9 = payment4.getId();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "406cdb1f-7c87-4435-a917-2ae3dd8810d1,0.0,hi!,,,10.0,dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!,b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,,3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!" + "'", str8, "406cdb1f-7c87-4435-a917-2ae3dd8810d1,0.0,hi!,,,10.0,dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!,b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,,3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "406cdb1f-7c87-4435-a917-2ae3dd8810d1,0.0,hi!,," + "'", str9, "406cdb1f-7c87-4435-a917-2ae3dd8810d1,0.0,hi!,,");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        java.lang.String str8 = payment4.getId();
        payment4.setId("hi!");
        java.lang.String str11 = payment4.getId();
        payment4.setId("f06721cf-535b-47dc-8053-9fcdf5d55d2e,0.0,hi!,,");
        java.lang.String str14 = payment4.toCSVRow();
        payment4.setBookingId("7809d03e-c579-4e30-b9dd-3cde0c79a570");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "92) test276(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "acec066d-e57f-468e-abec-fd9cfc3ad9fa" + "'", str8, "acec066d-e57f-468e-abec-fd9cfc3ad9fa");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "f06721cf-535b-47dc-8053-9fcdf5d55d2e,0.0,hi!,,,0.0,hi!,3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!," + "'", str14, "f06721cf-535b-47dc-8053-9fcdf5d55d2e,0.0,hi!,,,0.0,hi!,3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!,");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        java.lang.String str11 = payment4.getId();
        payment4.setId("a52c5b93-0845-4182-b3ca-86d54eab0011");
        payment4.setUserId("a52c5b93-0845-4182-b3ca-86d54eab0011,0.0,hi!,,");
        double double16 = payment4.getAmount();
        double double17 = payment4.getAmount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "93) test277(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "633e61d1-a91f-4466-a048-7946179cac3c,0.0,hi!,," + "'", str10, "633e61d1-a91f-4466-a048-7946179cac3c,0.0,hi!,,");
// flaky "33) test277(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "633e61d1-a91f-4466-a048-7946179cac3c" + "'", str11, "633e61d1-a91f-4466-a048-7946179cac3c");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        payment4.setBookingId("hi!");
        payment4.setBookingId("");
        java.lang.String str12 = payment4.getUserId();
        payment4.setAmount((java.lang.Double) 100.0d);
        payment4.setId("9c5371b7-266f-43ee-8cde-202457bde95e");
        java.lang.Class<?> wildcardClass17 = payment4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 10.0d, "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!", "b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,", "3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        double double5 = payment4.getAmount();
        payment4.setId("406cdb1f-7c87-4435-a917-2ae3dd8810d1,0.0,hi!,,");
        java.lang.String str8 = payment4.getBookingId();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!" + "'", str8, "3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) (-1.0d), "44463e9e-c930-4175-b404-7ea6e1a861c7", "542ed34d-b3b7-43dc-9366-c4d15fb56773,0.0,hi!,,", "086b0ce9-d17e-495f-b1bc-98ef880c5ead");
        payment4.setBookingId("8f4c0e7d-bed8-49c1-8702-105839816ffc,0.0,hi!,,");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "93a4837d-918c-4b46-a159-33d9a1f87acf", "600a5c73-67c7-449b-8475-3ae4885750e4", "ee2c0e56-7120-47e9-996d-86514ce02728,0.0,hi!,,");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        java.lang.String str8 = payment4.getBookingId();
        payment4.setBookingId("b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,");
        payment4.setUserId("a6466424-ccb9-4465-a814-1fbd504033c5");
        payment4.setAmount((java.lang.Double) 1.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("b3a79cc5-8b9e-407c-af71-37af8d100f31,0.0,hi!,,hi!");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "387781ea-eb7c-495c-96f6-6d09fac35acc", "a96c4c6f-cf7b-46f3-b5ff-fc1ede2a4b0f", "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        payment4.setAmount((java.lang.Double) 100.0d);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.Payment payment1 = new org.openjfx.EECS_3311_Project.model.Payment("a8eb815f-138d-450b-8479-dab00ba0af5c,0.0,hi!,,");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getCardNumber();
        java.lang.String str10 = payment4.toCSVRow();
        double double11 = payment4.getAmount();
        payment4.setAmount((java.lang.Double) 1.0d);
        java.lang.String str14 = payment4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "94) test286(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00a5b20b-1236-4729-b9c6-d219179496a1,0.0,hi!,," + "'", str10, "00a5b20b-1236-4729-b9c6-d219179496a1,0.0,hi!,,");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "34) test286(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "00a5b20b-1236-4729-b9c6-d219179496a1" + "'", str14, "00a5b20b-1236-4729-b9c6-d219179496a1");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        payment4.setBookingId("b63a87ca-2d01-496a-881b-5d0fbc24786b,0.0,hi!,,");
        payment4.setBookingId("dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        java.lang.String str9 = payment4.getBookingId();
        payment4.setUserId("727a9d21-4e96-403c-a5b5-f9913fb9dd12");
        java.lang.String str12 = payment4.toCSVRow();
        java.lang.String str13 = payment4.getCardNumber();
        payment4.setAmount((java.lang.Double) 100.0d);
        java.lang.String str16 = payment4.getBookingId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!" + "'", str9, "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
// flaky "95) test287(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a263e74b-a509-4441-9517-f8be8f5d775a,0.0,hi!,727a9d21-4e96-403c-a5b5-f9913fb9dd12,dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!" + "'", str12, "a263e74b-a509-4441-9517-f8be8f5d775a,0.0,hi!,727a9d21-4e96-403c-a5b5-f9913fb9dd12,dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!" + "'", str16, "dbb79c0b-d09a-4ec9-a308-5b267297c166,0.0,hi!,,hi!");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 1.0d, "4181b998-7ac7-4aa1-bed1-8928558e3152", "b3a79cc5-8b9e-407c-af71-37af8d100f31,0.0,hi!,,hi!", "727a9d21-4e96-403c-a5b5-f9913fb9dd12");
        java.lang.String str5 = payment4.getId();
        payment4.setAmount((java.lang.Double) (-1.0d));
// flaky "96) test288(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "91d27d20-55c3-42b2-b7f2-17fb64d99c9d" + "'", str5, "91d27d20-55c3-42b2-b7f2-17fb64d99c9d");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 100.0d, "00a5b20b-1236-4729-b9c6-d219179496a1,0.0,hi!,,", "1f0edf94-cc0e-43a5-8056-e0c7e1fda40e", "91d27d20-55c3-42b2-b7f2-17fb64d99c9d");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!");
        java.lang.String str8 = payment4.getId();
        payment4.setId("hi!");
        double double11 = payment4.getAmount();
        java.lang.String str12 = payment4.toCSVRow();
        payment4.setBookingId(",0.0,hi!,,");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "97) test290(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "cce87659-ee72-4bd4-8789-aab1b35ca8d7" + "'", str8, "cce87659-ee72-4bd4-8789-aab1b35ca8d7");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!,0.0,hi!,3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!," + "'", str12, "hi!,0.0,hi!,3dfc1a73-97f8-4f2a-81b0-026077a476ea,0.0,hi!,,hi!,");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) (-1.0d), "f06721cf-535b-47dc-8053-9fcdf5d55d2e", "955e403d-180a-4d68-b0bb-f5de1f6d52b3,0.0,hi!,,hi!", "ad34eda5-18b7-4a04-a86d-58b299e2b7ef,0.0,hi!,,");
        payment4.setBookingId("86a190db-812d-4ade-89c1-a54c4917f0e9");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 1.0d, "8127b3e5-3a39-4f58-879b-6d2ab729fe05", "", "8127b3e5-3a39-4f58-879b-6d2ab729fe05");
        java.lang.String str5 = payment4.getId();
// flaky "98) test292(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "66ea9096-ec04-473a-9530-86b32e6d371d" + "'", str5, "66ea9096-ec04-473a-9530-86b32e6d371d");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 10.0d, "086b0ce9-d17e-495f-b1bc-98ef880c5ead", "c028d231-fda0-43a5-a08e-1b4ed603915a,0.0,hi!,,hi!", "e030b8a2-7779-4790-848a-46d508c4b431");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.openjfx.EECS_3311_Project.model.Payment payment4 = new org.openjfx.EECS_3311_Project.model.Payment((java.lang.Double) 0.0d, "hi!", "", "");
        java.lang.String str5 = payment4.getCardNumber();
        payment4.setUserId("");
        java.lang.String str8 = payment4.getUserId();
        java.lang.String str9 = payment4.getUserId();
        java.lang.String str10 = payment4.getUserId();
        java.lang.String str11 = payment4.getBookingId();
        payment4.setAmount((java.lang.Double) (-1.0d));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }
}
