package randoop.AccountRole;

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
            org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid CSV row for AccountRole: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "hi!", (java.lang.Double) 0.0d);
        java.lang.String str4 = accountRole3.getId();
        accountRole3.setHourlyRate((java.lang.Double) 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Class<?> wildcardClass6 = accountRole3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "hi!", (java.lang.Double) 0.0d);
        java.lang.String str4 = accountRole3.getId();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.String str6 = accountRole3.toCSVRow();
        java.lang.Class<?> wildcardClass7 = accountRole3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!,,0.0" + "'", str6, "hi!,,0.0");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Class<?> wildcardClass5 = accountRole3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        accountRole3.setRoleName("hi!");
        java.lang.Class<?> wildcardClass7 = accountRole3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!,,0.0", "hi!", (java.lang.Double) 100.0d);
        java.lang.Class<?> wildcardClass4 = accountRole3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        java.lang.String str5 = accountRole3.toCSVRow();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",,10.0" + "'", str5, ",,10.0");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!,,0.0");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getId();
        java.lang.String str5 = accountRole3.toString();
        java.lang.String str6 = accountRole3.toCSVRow();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",,10.0" + "'", str6, ",,10.0");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Empty CSV row for AccountRole");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,10.0");
        accountRole1.setId("");
        java.lang.String str4 = accountRole1.toString();
        accountRole1.setHourlyRate((java.lang.Double) (-1.0d));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!", "hi!,,0.0", (java.lang.Double) 1.0d);
        java.lang.Double double4 = accountRole3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        accountRole3.setRoleName(",,10.0");
        accountRole3.setHourlyRate((java.lang.Double) 10.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        accountRole3.setId(",,10.0");
        java.lang.String str10 = accountRole3.getRoleName();
        accountRole3.setRoleName(",,10.0");
        java.lang.Class<?> wildcardClass13 = accountRole3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        accountRole3.setRoleName("hi!");
        java.lang.Class<?> wildcardClass9 = accountRole3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        java.lang.String str5 = accountRole3.getRoleName();
        java.lang.String str6 = accountRole3.getRoleName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getId();
        java.lang.String str5 = accountRole3.toString();
        java.lang.Class<?> wildcardClass6 = accountRole3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!,,0.0", "hi!,,0.0", (java.lang.Double) 10.0d);
        java.lang.Double double4 = accountRole3.getHourlyRate();
        java.lang.String str5 = accountRole3.getRoleName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!,,0.0" + "'", str5, "hi!,,0.0");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole0 = new org.openjfx.EECS_3311_Project.model.AccountRole();
        java.lang.String str1 = accountRole0.toCSVRow();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null,null,null" + "'", str1, "null,null,null");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.Double double4 = accountRole3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole(",hi!,10.0", "hi!,,0.0", (java.lang.Double) 0.0d);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!,,0.0", "hi!,,0.0", (java.lang.Double) 10.0d);
        java.lang.Double double4 = accountRole3.getHourlyRate();
        java.lang.Class<?> wildcardClass5 = accountRole3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!,,0.0", "null,null,null", (java.lang.Double) 0.0d);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        accountRole3.setRoleName("hi!");
        java.lang.String str9 = accountRole3.getId();
        accountRole3.setHourlyRate((java.lang.Double) 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "hi!", (java.lang.Double) 0.0d);
        java.lang.String str4 = accountRole3.getId();
        java.lang.String str5 = accountRole3.getRoleName();
        java.lang.String str6 = accountRole3.toString();
        accountRole3.setId(",hi!,10.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        accountRole3.setHourlyRate((java.lang.Double) (-1.0d));
        java.lang.String str10 = accountRole3.getId();
        java.lang.String str11 = accountRole3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole("null,null,null");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid hourly rate: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!,,0.0", "hi!,,0.0", (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass4 = accountRole3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", ",,10.0", (java.lang.Double) 10.0d);
        accountRole3.setHourlyRate((java.lang.Double) 100.0d);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!", "hi!,,0.0", (java.lang.Double) 0.0d);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        accountRole3.setHourlyRate((java.lang.Double) (-1.0d));
        java.lang.Double double10 = accountRole3.getHourlyRate();
        accountRole3.setId("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,10.0");
        java.lang.String str2 = accountRole1.getId();
        accountRole1.setRoleName("hi!");
        java.lang.Class<?> wildcardClass5 = accountRole1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass4 = accountRole3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",hi!,10.0");
        accountRole1.setRoleName("null,null,null");
        accountRole1.setRoleName("hi!");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!,,0.0", "hi!,,0.0", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!,,0.0,hi!,,0.0,10.0" + "'", str4, "hi!,,0.0,hi!,,0.0,10.0");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",hi!,10.0");
        accountRole1.setHourlyRate((java.lang.Double) 10.0d);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("null,null,null", ",,10.0", (java.lang.Double) 10.0d);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,10.0", ",,10.0", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0,,,10.0,10.0" + "'", str4, ",,10.0,,,10.0,10.0");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        accountRole3.setRoleName("hi!");
        java.lang.String str9 = accountRole3.getId();
        accountRole3.setRoleName("null,null,null");
        java.lang.String str12 = accountRole3.getRoleName();
        accountRole3.setRoleName(",hi!,10.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null,null,null" + "'", str12, "null,null,null");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,10.0");
        accountRole1.setId("");
        java.lang.String str4 = accountRole1.toString();
        java.lang.String str5 = accountRole1.toCSVRow();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",,10.0" + "'", str5, ",,10.0");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,10.0");
        accountRole1.setId("");
        java.lang.String str4 = accountRole1.toString();
        java.lang.Class<?> wildcardClass5 = accountRole1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,10.0");
        accountRole1.setId("");
        java.lang.String str4 = accountRole1.toString();
        java.lang.String str5 = accountRole1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        accountRole3.setRoleName("hi!");
        java.lang.String str9 = accountRole3.getId();
        accountRole3.setHourlyRate((java.lang.Double) 10.0d);
        java.lang.Class<?> wildcardClass12 = accountRole3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        accountRole3.setId(",,10.0");
        java.lang.String str10 = accountRole3.getRoleName();
        accountRole3.setRoleName(",,10.0");
        java.lang.String str13 = accountRole3.toCSVRow();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ",,10.0,,,10.0,10.0" + "'", str13, ",,10.0,,,10.0,10.0");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        accountRole3.setRoleName("hi!");
        java.lang.String str7 = accountRole3.getRoleName();
        java.lang.Double double8 = accountRole3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,10.0", ",,10.0", (java.lang.Double) 10.0d);
        java.lang.Double double4 = accountRole3.getHourlyRate();
        accountRole3.setHourlyRate((java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        accountRole3.setRoleName("hi!");
        accountRole3.setId("hi!");
        java.lang.Class<?> wildcardClass11 = accountRole3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!,,0.0,hi!,,0.0,10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid CSV row for AccountRole: hi!,,0.0,hi!,,0.0,10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,10.0", ",,10.0", (java.lang.Double) 10.0d);
        accountRole3.setRoleName(",,-1.0");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,-1.0", ",hi!,10.0", (java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass4 = accountRole3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", ",,10.0", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getId();
        java.lang.String str5 = accountRole3.getRoleName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,10.0,,10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid CSV row for AccountRole: ,,10.0,,10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toString();
        accountRole3.setId("");
        accountRole3.setHourlyRate((java.lang.Double) 1.0d);
        accountRole3.setId(",,10.0,,10.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        accountRole3.setHourlyRate((java.lang.Double) (-1.0d));
        java.lang.String str10 = accountRole3.getId();
        accountRole3.setHourlyRate((java.lang.Double) 0.0d);
        java.lang.Double double13 = accountRole3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,10.0");
        accountRole1.setId("");
        java.lang.String str4 = accountRole1.toString();
        accountRole1.setId("hi!,,0.0,hi!,,0.0,10.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,10.0,,,10.0,10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid CSV row for AccountRole: ,,10.0,,,10.0,10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", ",,10.0", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getId();
        java.lang.String str5 = accountRole3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",,10.0" + "'", str5, ",,10.0");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        java.lang.String str8 = accountRole3.toCSVRow();
        accountRole3.setHourlyRate((java.lang.Double) 0.0d);
        accountRole3.setId(",,10.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",,10.0" + "'", str8, ",,10.0");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", ",hi!,10.0", (java.lang.Double) 10.0d);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        java.lang.Double double7 = accountRole3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        accountRole3.setRoleName("hi!");
        accountRole3.setId("hi!");
        java.lang.String str11 = accountRole3.getId();
        java.lang.String str12 = accountRole3.toString();
        accountRole3.setRoleName("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        accountRole3.setRoleName("hi!,,0.0");
        accountRole3.setId(",,10.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        accountRole3.setHourlyRate((java.lang.Double) (-1.0d));
        java.lang.String str7 = accountRole3.toCSVRow();
        java.lang.String str8 = accountRole3.toString();
        java.lang.Class<?> wildcardClass9 = accountRole3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",,-1.0" + "'", str7, ",,-1.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toString();
        accountRole3.setId("");
        accountRole3.setId(",,10.0,,,10.0,10.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        java.lang.String str8 = accountRole3.toCSVRow();
        accountRole3.setHourlyRate((java.lang.Double) 0.0d);
        java.lang.String str11 = accountRole3.getRoleName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",,10.0" + "'", str8, ",,10.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toString();
        accountRole3.setId("");
        accountRole3.setHourlyRate((java.lang.Double) 1.0d);
        accountRole3.setId(",,-1.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        accountRole3.setRoleName("hi!");
        java.lang.String str9 = accountRole3.getId();
        accountRole3.setRoleName("null,null,null");
        java.lang.String str12 = accountRole3.toString();
        accountRole3.setRoleName("hi!,,0.0,hi!,,0.0,10.0");
        accountRole3.setId(",,-1.0");
        java.lang.String str17 = accountRole3.toCSVRow();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null,null,null" + "'", str12, "null,null,null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ",,-1.0,hi!,,0.0,hi!,,0.0,10.0,10.0" + "'", str17, ",,-1.0,hi!,,0.0,hi!,,0.0,10.0,10.0");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        accountRole3.setId(",,10.0");
        java.lang.String str10 = accountRole3.getRoleName();
        accountRole3.setRoleName(",,10.0");
        accountRole3.setId("hi!");
        java.lang.Class<?> wildcardClass15 = accountRole3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        accountRole3.setRoleName("hi!");
        java.lang.String str7 = accountRole3.toString();
        accountRole3.setId("null,null,null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        accountRole3.setId(",,10.0");
        java.lang.String str10 = accountRole3.getRoleName();
        accountRole3.setHourlyRate((java.lang.Double) (-1.0d));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,-1.0,hi!,,0.0,hi!,,0.0,10.0,10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid CSV row for AccountRole: ,,-1.0,hi!,,0.0,hi!,,0.0,10.0,10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        accountRole3.setRoleName("hi!");
        java.lang.String str9 = accountRole3.getId();
        java.lang.String str10 = accountRole3.getRoleName();
        java.lang.String str11 = accountRole3.getId();
        accountRole3.setId("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,10.0");
        java.lang.String str2 = accountRole1.getId();
        accountRole1.setRoleName("hi!");
        java.lang.Double double5 = accountRole1.getHourlyRate();
        java.lang.Class<?> wildcardClass6 = accountRole1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!", "hi!,,0.0,hi!,,0.0,10.0", (java.lang.Double) 0.0d);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",hi!,10.0");
        accountRole1.setRoleName("null,null,null");
        accountRole1.setHourlyRate((java.lang.Double) 100.0d);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        accountRole3.setId(",,10.0");
        java.lang.String str10 = accountRole3.getRoleName();
        accountRole3.setRoleName(",,10.0");
        accountRole3.setId("hi!");
        accountRole3.setId("");
        java.lang.Class<?> wildcardClass17 = accountRole3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "hi!", (java.lang.Double) 0.0d);
        java.lang.String str4 = accountRole3.getId();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.String str6 = accountRole3.toCSVRow();
        java.lang.String str7 = accountRole3.toCSVRow();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!,,0.0" + "'", str6, "hi!,,0.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!,,0.0" + "'", str7, "hi!,,0.0");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        accountRole3.setId(",,10.0");
        java.lang.String str10 = accountRole3.getRoleName();
        java.lang.String str11 = accountRole3.getId();
        java.lang.String str12 = accountRole3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",,10.0" + "'", str11, ",,10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",,10.0" + "'", str12, ",,10.0");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getId();
        java.lang.String str5 = accountRole3.getId();
        java.lang.String str6 = accountRole3.toCSVRow();
        accountRole3.setId(",,-1.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",hi!,10.0" + "'", str6, ",hi!,10.0");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!", "", (java.lang.Double) (-1.0d));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!", ",,-1.0,hi!,,0.0,hi!,,0.0,10.0,10.0", (java.lang.Double) 1.0d);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        accountRole3.setRoleName("hi!");
        java.lang.String str9 = accountRole3.getId();
        accountRole3.setRoleName("null,null,null");
        accountRole3.setRoleName(",,-1.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,10.0");
        accountRole1.setId("");
        java.lang.String str4 = accountRole1.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!,,,10.0,10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid CSV row for AccountRole: hi!,,,10.0,10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("null,null,null", "hi!,,,10.0,10.0", (java.lang.Double) 0.0d);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        accountRole3.setRoleName("hi!");
        java.lang.String str7 = accountRole3.getRoleName();
        java.lang.String str8 = accountRole3.getId();
        accountRole3.setHourlyRate((java.lang.Double) 100.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        java.lang.String str8 = accountRole3.getRoleName();
        accountRole3.setRoleName("null,null,null");
        java.lang.String str11 = accountRole3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        accountRole3.setId(",,10.0");
        java.lang.String str10 = accountRole3.getRoleName();
        accountRole3.setRoleName(",,10.0");
        accountRole3.setId("hi!");
        java.lang.String str15 = accountRole3.toCSVRow();
        java.lang.String str16 = accountRole3.getRoleName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!,,,10.0,10.0" + "'", str15, "hi!,,,10.0,10.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",,10.0" + "'", str16, ",,10.0");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,10.0", ",,10.0", (java.lang.Double) 10.0d);
        java.lang.Double double4 = accountRole3.getHourlyRate();
        java.lang.String str5 = accountRole3.getRoleName();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",,10.0" + "'", str5, ",,10.0");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!,,0.0", ",,10.0,,10.0", (java.lang.Double) (-1.0d));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole0 = new org.openjfx.EECS_3311_Project.model.AccountRole();
        accountRole0.setRoleName("hi!,,,10.0,10.0");
        java.lang.String str3 = accountRole0.getRoleName();
        java.lang.String str4 = accountRole0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!,,,10.0,10.0" + "'", str3, "hi!,,,10.0,10.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!,,,10.0,10.0" + "'", str4, "hi!,,,10.0,10.0");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        accountRole3.setId(",,10.0");
        accountRole3.setRoleName("");
        accountRole3.setHourlyRate((java.lang.Double) 10.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toString();
        accountRole3.setRoleName("hi!,,0.0");
        java.lang.String str7 = accountRole3.getRoleName();
        java.lang.Class<?> wildcardClass8 = accountRole3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!,,0.0" + "'", str7, "hi!,,0.0");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        accountRole3.setRoleName("hi!,,0.0");
        java.lang.String str9 = accountRole3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        accountRole3.setRoleName("hi!");
        java.lang.String str9 = accountRole3.getId();
        accountRole3.setRoleName("null,null,null");
        java.lang.String str12 = accountRole3.toString();
        accountRole3.setRoleName("hi!,,0.0,hi!,,0.0,10.0");
        accountRole3.setId(",,-1.0");
        java.lang.String str17 = accountRole3.getId();
        accountRole3.setRoleName(",hi!,,0.0,10.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null,null,null" + "'", str12, "null,null,null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ",,-1.0" + "'", str17, ",,-1.0");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,10.0,,,10.0,10.0", ",hi!,10.0", (java.lang.Double) (-1.0d));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole0 = new org.openjfx.EECS_3311_Project.model.AccountRole();
        accountRole0.setRoleName("hi!,,,10.0,10.0");
        java.lang.String str3 = accountRole0.toString();
        java.lang.String str4 = accountRole0.toCSVRow();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!,,,10.0,10.0" + "'", str3, "hi!,,,10.0,10.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null,hi!,,,10.0,10.0,null" + "'", str4, "null,hi!,,,10.0,10.0,null");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        accountRole3.setId(",,10.0");
        java.lang.String str10 = accountRole3.getRoleName();
        accountRole3.setRoleName(",,10.0");
        java.lang.String str13 = accountRole3.toString();
        java.lang.Double double14 = accountRole3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ",,10.0" + "'", str13, ",,10.0");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!,,,10.0,10.0", ",,-1.0", (java.lang.Double) (-1.0d));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        accountRole3.setRoleName("hi!");
        java.lang.String str9 = accountRole3.getId();
        accountRole3.setHourlyRate((java.lang.Double) 10.0d);
        accountRole3.setId(",,-1.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        accountRole3.setId(",,10.0");
        java.lang.String str10 = accountRole3.getRoleName();
        accountRole3.setRoleName(",,10.0");
        accountRole3.setId("hi!");
        java.lang.String str15 = accountRole3.toString();
        java.lang.Class<?> wildcardClass16 = accountRole3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",,10.0" + "'", str15, ",,10.0");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        accountRole3.setRoleName("hi!");
        java.lang.String str9 = accountRole3.getId();
        java.lang.String str10 = accountRole3.getRoleName();
        accountRole3.setHourlyRate((java.lang.Double) 0.0d);
        java.lang.String str13 = accountRole3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",hi!,,0.0,10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid CSV row for AccountRole: ,hi!,,0.0,10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        accountRole3.setHourlyRate((java.lang.Double) (-1.0d));
        java.lang.String str10 = accountRole3.getId();
        java.lang.String str11 = accountRole3.toString();
        java.lang.String str12 = accountRole3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toString();
        accountRole3.setId("");
        java.lang.String str7 = accountRole3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        accountRole3.setId(",,10.0");
        java.lang.String str10 = accountRole3.getRoleName();
        accountRole3.setRoleName(",,10.0");
        accountRole3.setId("hi!");
        java.lang.String str15 = accountRole3.toString();
        accountRole3.setId("null,null,null");
        accountRole3.setId(",,-1.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",,10.0" + "'", str15, ",,10.0");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        accountRole3.setId(",,10.0");
        java.lang.Class<?> wildcardClass7 = accountRole3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        accountRole3.setId(",,10.0");
        java.lang.String str10 = accountRole3.getRoleName();
        accountRole3.setRoleName(",,10.0");
        accountRole3.setId("hi!");
        java.lang.String str15 = accountRole3.toCSVRow();
        java.lang.Double double16 = accountRole3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!,,,10.0,10.0" + "'", str15, "hi!,,,10.0,10.0");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "hi!", (java.lang.Double) 0.0d);
        java.lang.String str4 = accountRole3.getId();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("hi!,,0.0,hi!,,0.0,10.0");
        accountRole3.setRoleName(",hi!,10.0");
        java.lang.String str10 = accountRole3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", ",hi!,10.0", (java.lang.Double) 0.0d);
        accountRole3.setRoleName(",,100.0");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toString();
        accountRole3.setRoleName("hi!,,0.0");
        accountRole3.setHourlyRate((java.lang.Double) (-1.0d));
        java.lang.String str9 = accountRole3.toCSVRow();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",hi!,,0.0,-1.0" + "'", str9, ",hi!,,0.0,-1.0");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        accountRole3.setId(",,10.0");
        java.lang.String str10 = accountRole3.getId();
        java.lang.String str11 = accountRole3.getId();
        java.lang.String str12 = accountRole3.getRoleName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",,10.0" + "'", str10, ",,10.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",,10.0" + "'", str11, ",,10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        accountRole3.setRoleName("hi!");
        accountRole3.setId("hi!");
        java.lang.String str11 = accountRole3.getId();
        java.lang.String str12 = accountRole3.toString();
        java.lang.String str13 = accountRole3.getRoleName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!,,0.0", ",,-1.0", (java.lang.Double) 100.0d);
        accountRole3.setId(",,-1.0");
        java.lang.String str6 = accountRole3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!,,0.0" + "'", str6, "hi!,,0.0");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",hi!,,0.0,-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid CSV row for AccountRole: ,hi!,,0.0,-1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        accountRole3.setRoleName("hi!");
        java.lang.String str9 = accountRole3.getId();
        accountRole3.setHourlyRate((java.lang.Double) 10.0d);
        accountRole3.setRoleName(",,10.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        accountRole3.setId(",,10.0");
        java.lang.String str10 = accountRole3.getId();
        accountRole3.setId("null,null,null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",,10.0" + "'", str10, ",,10.0");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        accountRole3.setRoleName("hi!,,0.0");
        java.lang.String str7 = accountRole3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        accountRole3.setId(",,10.0");
        java.lang.String str10 = accountRole3.getId();
        java.lang.String str11 = accountRole3.getId();
        java.lang.String str12 = accountRole3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",,10.0" + "'", str10, ",,10.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",,10.0" + "'", str11, ",,10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,100.0");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        accountRole3.setId(",,10.0");
        java.lang.String str10 = accountRole3.getRoleName();
        accountRole3.setHourlyRate((java.lang.Double) 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        java.lang.String str7 = accountRole3.toCSVRow();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",,10.0" + "'", str7, ",,10.0");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole(",hi!,,0.0,10.0", ",hi!,10.0", (java.lang.Double) 100.0d);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,10.0");
        java.lang.String str2 = accountRole1.getId();
        accountRole1.setRoleName("hi!");
        java.lang.Double double5 = accountRole1.getHourlyRate();
        java.lang.String str6 = accountRole1.getRoleName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        java.lang.Double double8 = accountRole3.getHourlyRate();
        java.lang.String str9 = accountRole3.toCSVRow();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",,10.0" + "'", str9, ",,10.0");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toString();
        accountRole3.setRoleName("hi!,,0.0");
        java.lang.String str7 = accountRole3.getRoleName();
        java.lang.String str8 = accountRole3.toCSVRow();
        java.lang.Double double9 = accountRole3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!,,0.0" + "'", str7, "hi!,,0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",hi!,,0.0,10.0" + "'", str8, ",hi!,,0.0,10.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", ",,10.0", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        accountRole3.setId(",,10.0");
        java.lang.String str10 = accountRole3.getId();
        java.lang.String str11 = accountRole3.getId();
        accountRole3.setHourlyRate((java.lang.Double) 100.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",,10.0" + "'", str10, ",,10.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",,10.0" + "'", str11, ",,10.0");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getId();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        accountRole3.setId(",,10.0");
        java.lang.String str7 = accountRole3.getRoleName();
        accountRole3.setHourlyRate((java.lang.Double) 1.0d);
        accountRole3.setId(",hi!,10.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        accountRole3.setId(",,10.0");
        java.lang.String str7 = accountRole3.toCSVRow();
        java.lang.String str8 = accountRole3.toCSVRow();
        accountRole3.setRoleName(",hi!,10.0");
        java.lang.Class<?> wildcardClass11 = accountRole3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",,10.0,,10.0" + "'", str7, ",,10.0,,10.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",,10.0,,10.0" + "'", str8, ",,10.0,,10.0");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        accountRole3.setRoleName("hi!");
        java.lang.String str9 = accountRole3.getId();
        java.lang.String str10 = accountRole3.getRoleName();
        accountRole3.setHourlyRate((java.lang.Double) 0.0d);
        accountRole3.setRoleName(",hi!,,0.0,10.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        accountRole3.setId(",,10.0");
        java.lang.String str7 = accountRole3.toCSVRow();
        java.lang.String str8 = accountRole3.toCSVRow();
        accountRole3.setRoleName(",hi!,10.0");
        java.lang.String str11 = accountRole3.toCSVRow();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",,10.0,,10.0" + "'", str7, ",,10.0,,10.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",,10.0,,10.0" + "'", str8, ",,10.0,,10.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",,10.0,,hi!,10.0,10.0" + "'", str11, ",,10.0,,hi!,10.0,10.0");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        accountRole3.setHourlyRate((java.lang.Double) (-1.0d));
        java.lang.String str7 = accountRole3.toCSVRow();
        accountRole3.setHourlyRate((java.lang.Double) 100.0d);
        java.lang.String str10 = accountRole3.toString();
        java.lang.String str11 = accountRole3.toCSVRow();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",,-1.0" + "'", str7, ",,-1.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",,100.0" + "'", str11, ",,100.0");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        accountRole3.setRoleName("hi!");
        java.lang.String str9 = accountRole3.getId();
        accountRole3.setRoleName("null,null,null");
        java.lang.String str12 = accountRole3.toString();
        java.lang.String str13 = accountRole3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null,null,null" + "'", str12, "null,null,null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null,null,null" + "'", str13, "null,null,null");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole(",hi!,,0.0,-1.0", ",,10.0", (java.lang.Double) 1.0d);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        accountRole3.setId(",,10.0");
        java.lang.String str7 = accountRole3.toCSVRow();
        java.lang.Double double8 = accountRole3.getHourlyRate();
        java.lang.Double double9 = accountRole3.getHourlyRate();
        java.lang.String str10 = accountRole3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",,10.0,,10.0" + "'", str7, ",,10.0,,10.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        accountRole3.setId(",,10.0");
        java.lang.String str7 = accountRole3.toCSVRow();
        java.lang.Double double8 = accountRole3.getHourlyRate();
        accountRole3.setId("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",,10.0,,10.0" + "'", str7, ",,10.0,,10.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!,,0.0", "", (java.lang.Double) (-1.0d));
        java.lang.Double double4 = accountRole3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,10.0,,,10.0,10.0", ",,100.0", (java.lang.Double) 100.0d);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getId();
        java.lang.String str5 = accountRole3.getId();
        java.lang.String str6 = accountRole3.toCSVRow();
        java.lang.String str7 = accountRole3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",hi!,10.0" + "'", str6, ",hi!,10.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!,,0.0", "hi!,,0.0", (java.lang.Double) 10.0d);
        java.lang.Double double4 = accountRole3.getHourlyRate();
        accountRole3.setId("hi!");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        java.lang.String str7 = accountRole3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        accountRole3.setRoleName("");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole0 = new org.openjfx.EECS_3311_Project.model.AccountRole();
        accountRole0.setRoleName("hi!,,,10.0,10.0");
        java.lang.String str3 = accountRole0.getRoleName();
        java.lang.String str4 = accountRole0.getRoleName();
        accountRole0.setRoleName("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!,,,10.0,10.0" + "'", str3, "hi!,,,10.0,10.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!,,,10.0,10.0" + "'", str4, "hi!,,,10.0,10.0");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        accountRole3.setId(",,10.0");
        java.lang.String str10 = accountRole3.getId();
        java.lang.String str11 = accountRole3.getId();
        java.lang.Double double12 = accountRole3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",,10.0" + "'", str10, ",,10.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",,10.0" + "'", str11, ",,10.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!,,,10.0,10.0", ",,100.0", (java.lang.Double) 1.0d);
        java.lang.String str4 = accountRole3.toString();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!,,,10.0,10.0" + "'", str4, "hi!,,,10.0,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",hi!,10.0" + "'", str4, ",hi!,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole(",hi!,,0.0,-1.0", ",,10.0", (java.lang.Double) 100.0d);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,10.0", ",,10.0", (java.lang.Double) 10.0d);
        java.lang.Double double4 = accountRole3.getHourlyRate();
        java.lang.Class<?> wildcardClass5 = accountRole3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "hi!", (java.lang.Double) 0.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        accountRole3.setId("hi!,,0.0");
        accountRole3.setRoleName(",,10.0,,,10.0,10.0");
        java.lang.Double double9 = accountRole3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!,,0.0" + "'", str4, "hi!,,0.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "hi!", (java.lang.Double) 0.0d);
        accountRole3.setHourlyRate((java.lang.Double) 100.0d);
        java.lang.String str6 = accountRole3.toCSVRow();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!,,100.0" + "'", str6, "hi!,,100.0");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        accountRole3.setId(",,10.0");
        java.lang.String str10 = accountRole3.getId();
        java.lang.String str11 = accountRole3.getId();
        java.lang.Class<?> wildcardClass12 = accountRole3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",,10.0" + "'", str10, ",,10.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",,10.0" + "'", str11, ",,10.0");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!,,0.0", "hi!,,0.0", (java.lang.Double) 10.0d);
        accountRole3.setHourlyRate((java.lang.Double) 0.0d);
        java.lang.String str6 = accountRole3.getRoleName();
        java.lang.String str7 = accountRole3.getId();
        java.lang.Class<?> wildcardClass8 = accountRole3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!,,0.0" + "'", str6, "hi!,,0.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!,,0.0" + "'", str7, "hi!,,0.0");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getId();
        java.lang.String str5 = accountRole3.toString();
        java.lang.String str6 = accountRole3.getId();
        java.lang.Class<?> wildcardClass7 = accountRole3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toString();
        accountRole3.setRoleName("hi!,,0.0");
        java.lang.Double double7 = accountRole3.getHourlyRate();
        java.lang.Double double8 = accountRole3.getHourlyRate();
        accountRole3.setId("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        java.lang.String str6 = accountRole3.getId();
        java.lang.String str7 = accountRole3.toCSVRow();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",,10.0" + "'", str7, ",,10.0");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        java.lang.String str8 = accountRole3.getRoleName();
        java.lang.String str9 = accountRole3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,10.0");
        accountRole1.setId("");
        java.lang.String str4 = accountRole1.toString();
        java.lang.String str5 = accountRole1.getId();
        accountRole1.setRoleName(",,-1.0,hi!,,0.0,hi!,,0.0,10.0,10.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,10.0");
        java.lang.String str2 = accountRole1.getId();
        java.lang.Double double3 = accountRole1.getHourlyRate();
        accountRole1.setHourlyRate((java.lang.Double) (-1.0d));
        java.lang.Double double6 = accountRole1.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",hi!,10.0");
        accountRole1.setId(",,10.0,,hi!,10.0,10.0");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        accountRole3.setRoleName("hi!");
        java.lang.String str9 = accountRole3.getId();
        java.lang.String str10 = accountRole3.getRoleName();
        accountRole3.setHourlyRate((java.lang.Double) 0.0d);
        java.lang.String str13 = accountRole3.toCSVRow();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ",hi!,0.0" + "'", str13, ",hi!,0.0");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        java.lang.String str8 = accountRole3.toCSVRow();
        accountRole3.setHourlyRate((java.lang.Double) (-1.0d));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",,10.0" + "'", str8, ",,10.0");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        accountRole3.setHourlyRate((java.lang.Double) (-1.0d));
        java.lang.String str10 = accountRole3.getRoleName();
        java.lang.Class<?> wildcardClass11 = accountRole3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,10.0,,hi!,10.0,10.0", ",,100.0", (java.lang.Double) 10.0d);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        accountRole3.setHourlyRate((java.lang.Double) 100.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",hi!,10.0" + "'", str4, ",hi!,10.0");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        java.lang.String str7 = accountRole3.getId();
        java.lang.String str8 = accountRole3.toString();
        java.lang.String str9 = accountRole3.getRoleName();
        java.lang.String str10 = accountRole3.toCSVRow();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",,10.0" + "'", str10, ",,10.0");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!,,0.0", ",,-1.0", (java.lang.Double) 100.0d);
        accountRole3.setId(",,-1.0");
        java.lang.Class<?> wildcardClass6 = accountRole3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,10.0");
        accountRole1.setId("");
        java.lang.String str4 = accountRole1.toString();
        accountRole1.setHourlyRate((java.lang.Double) 100.0d);
        java.lang.String str7 = accountRole1.toCSVRow();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",,100.0" + "'", str7, ",,100.0");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        java.lang.String str7 = accountRole3.toString();
        java.lang.String str8 = accountRole3.toCSVRow();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",,10.0" + "'", str8, ",,10.0");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        accountRole3.setHourlyRate((java.lang.Double) (-1.0d));
        java.lang.String str10 = accountRole3.getId();
        java.lang.String str11 = accountRole3.toString();
        java.lang.String str12 = accountRole3.getRoleName();
        java.lang.String str13 = accountRole3.getId();
        java.lang.String str14 = accountRole3.toString();
        java.lang.String str15 = accountRole3.toCSVRow();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",,-1.0" + "'", str15, ",,-1.0");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", ",hi!,10.0", (java.lang.Double) 0.0d);
        java.lang.String str4 = accountRole3.toString();
        java.lang.String str5 = accountRole3.toCSVRow();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",hi!,10.0,,0.0" + "'", str5, ",hi!,10.0,,0.0");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,10.0");
        java.lang.String str2 = accountRole1.getId();
        java.lang.Double double3 = accountRole1.getHourlyRate();
        accountRole1.setHourlyRate((java.lang.Double) (-1.0d));
        java.lang.String str6 = accountRole1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toString();
        accountRole3.setRoleName("hi!,,0.0");
        accountRole3.setHourlyRate((java.lang.Double) (-1.0d));
        java.lang.String str9 = accountRole3.getRoleName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,,0.0" + "'", str9, "hi!,,0.0");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        java.lang.String str5 = accountRole3.getRoleName();
        java.lang.String str6 = accountRole3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        java.lang.String str5 = accountRole3.getId();
        java.lang.String str6 = accountRole3.getRoleName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,10.0");
        java.lang.String str2 = accountRole1.getId();
        accountRole1.setRoleName("hi!");
        java.lang.Double double5 = accountRole1.getHourlyRate();
        java.lang.String str6 = accountRole1.getId();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toString();
        java.lang.Class<?> wildcardClass5 = accountRole3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        accountRole3.setHourlyRate((java.lang.Double) 0.0d);
        accountRole3.setHourlyRate((java.lang.Double) 100.0d);
        java.lang.String str9 = accountRole3.toCSVRow();
        java.lang.String str10 = accountRole3.getId();
        accountRole3.setHourlyRate((java.lang.Double) 100.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",,100.0" + "'", str9, ",,100.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!", ",,10.0", (java.lang.Double) 100.0d);
        accountRole3.setRoleName("hi!,,0.0");
        java.lang.String str6 = accountRole3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!,,0.0" + "'", str6, "hi!,,0.0");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        accountRole3.setRoleName("hi!");
        java.lang.String str7 = accountRole3.toString();
        java.lang.String str8 = accountRole3.toCSVRow();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",hi!,10.0" + "'", str8, ",hi!,10.0");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        accountRole3.setRoleName("hi!");
        java.lang.String str9 = accountRole3.getId();
        accountRole3.setRoleName("null,null,null");
        java.lang.String str12 = accountRole3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "hi!", (java.lang.Double) 0.0d);
        java.lang.String str4 = accountRole3.getId();
        accountRole3.setRoleName("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", ",,10.0", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getId();
        accountRole3.setHourlyRate((java.lang.Double) (-1.0d));
        java.lang.Class<?> wildcardClass7 = accountRole3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", ",,10.0", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getId();
        accountRole3.setHourlyRate((java.lang.Double) (-1.0d));
        java.lang.String str7 = accountRole3.toCSVRow();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",,10.0,,-1.0" + "'", str7, ",,10.0,,-1.0");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!,,0.0,hi!,,0.0,10.0", "", (java.lang.Double) 0.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",hi!,,0.0,hi!,,0.0,10.0,0.0" + "'", str4, ",hi!,,0.0,hi!,,0.0,10.0,0.0");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        accountRole3.setHourlyRate((java.lang.Double) (-1.0d));
        java.lang.String str10 = accountRole3.getId();
        accountRole3.setHourlyRate((java.lang.Double) 10.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        java.lang.String str8 = accountRole3.getRoleName();
        java.lang.String str9 = accountRole3.getRoleName();
        java.lang.Double double10 = accountRole3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,100.0", ",hi!,,0.0,-1.0", (java.lang.Double) (-1.0d));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "hi!", (java.lang.Double) 0.0d);
        java.lang.String str4 = accountRole3.getId();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setId(",,10.0,,10.0");
        accountRole3.setId("hi!,,100.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "hi!", (java.lang.Double) 0.0d);
        java.lang.String str4 = accountRole3.getId();
        java.lang.String str5 = accountRole3.getRoleName();
        java.lang.String str6 = accountRole3.toString();
        java.lang.String str7 = accountRole3.toCSVRow();
        java.lang.String str8 = accountRole3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!,,0.0" + "'", str7, "hi!,,0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!,,0.0", "hi!,,0.0", (java.lang.Double) 10.0d);
        accountRole3.setHourlyRate((java.lang.Double) 0.0d);
        java.lang.String str6 = accountRole3.getRoleName();
        java.lang.Double double7 = accountRole3.getHourlyRate();
        java.lang.String str8 = accountRole3.getRoleName();
        java.lang.String str9 = accountRole3.getRoleName();
        java.lang.String str10 = accountRole3.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!,,0.0" + "'", str6, "hi!,,0.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!,,0.0" + "'", str8, "hi!,,0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,,0.0" + "'", str9, "hi!,,0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!,,0.0" + "'", str10, "hi!,,0.0");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        accountRole3.setHourlyRate((java.lang.Double) (-1.0d));
        java.lang.String str7 = accountRole3.toCSVRow();
        java.lang.String str8 = accountRole3.toCSVRow();
        java.lang.String str9 = accountRole3.toString();
        accountRole3.setRoleName("null,hi!,,,10.0,10.0,null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",,-1.0" + "'", str7, ",,-1.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",,-1.0" + "'", str8, ",,-1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,100.0", "hi!", (java.lang.Double) 10.0d);
        accountRole3.setId(",hi!,10.0,,0.0");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",hi!,10.0");
        accountRole1.setId(",hi!,10.0,,0.0");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("null,hi!,,,10.0,10.0,null", ",hi!,0.0", (java.lang.Double) 10.0d);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        accountRole3.setHourlyRate((java.lang.Double) (-1.0d));
        java.lang.String str10 = accountRole3.getId();
        java.lang.String str11 = accountRole3.toString();
        java.lang.String str12 = accountRole3.getRoleName();
        java.lang.String str13 = accountRole3.getRoleName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        java.lang.String str8 = accountRole3.toCSVRow();
        accountRole3.setHourlyRate((java.lang.Double) 0.0d);
        java.lang.String str11 = accountRole3.toString();
        java.lang.Class<?> wildcardClass12 = accountRole3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",,10.0" + "'", str8, ",,10.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        accountRole3.setHourlyRate((java.lang.Double) (-1.0d));
        java.lang.String str7 = accountRole3.toCSVRow();
        accountRole3.setHourlyRate((java.lang.Double) 100.0d);
        java.lang.String str10 = accountRole3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",,-1.0" + "'", str7, ",,-1.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!", "hi!,,0.0", (java.lang.Double) 100.0d);
        accountRole3.setRoleName("hi!,,0.0");
        java.lang.String str6 = accountRole3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!,,0.0" + "'", str6, "hi!,,0.0");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        accountRole3.setHourlyRate((java.lang.Double) (-1.0d));
        java.lang.String str7 = accountRole3.toCSVRow();
        java.lang.String str8 = accountRole3.toString();
        java.lang.String str9 = accountRole3.getId();
        accountRole3.setHourlyRate((java.lang.Double) 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",,-1.0" + "'", str7, ",,-1.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        java.lang.String str8 = accountRole3.toCSVRow();
        accountRole3.setHourlyRate((java.lang.Double) 0.0d);
        accountRole3.setHourlyRate((java.lang.Double) 10.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",,10.0" + "'", str8, ",,10.0");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        accountRole3.setId(",,10.0");
        java.lang.String str7 = accountRole3.getRoleName();
        java.lang.String str8 = accountRole3.getRoleName();
        java.lang.String str9 = accountRole3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",,10.0" + "'", str9, ",,10.0");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        accountRole3.setRoleName("hi!");
        accountRole3.setRoleName(",,10.0,,10.0");
        accountRole3.setRoleName("hi!,,0.0");
        java.lang.Double double13 = accountRole3.getHourlyRate();
        java.lang.Double double14 = accountRole3.getHourlyRate();
        accountRole3.setId("hi!,,0.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole0 = new org.openjfx.EECS_3311_Project.model.AccountRole();
        accountRole0.setRoleName("hi!,,,10.0,10.0");
        java.lang.String str3 = accountRole0.getRoleName();
        java.lang.String str4 = accountRole0.getRoleName();
        java.lang.String str5 = accountRole0.getRoleName();
        accountRole0.setHourlyRate((java.lang.Double) 1.0d);
        accountRole0.setRoleName(",,10.0,,-1.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!,,,10.0,10.0" + "'", str3, "hi!,,,10.0,10.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!,,,10.0,10.0" + "'", str4, "hi!,,,10.0,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!,,,10.0,10.0" + "'", str5, "hi!,,,10.0,10.0");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        java.lang.String str8 = accountRole3.toCSVRow();
        accountRole3.setHourlyRate((java.lang.Double) 0.0d);
        java.lang.String str11 = accountRole3.toString();
        java.lang.String str12 = accountRole3.getId();
        java.lang.String str13 = accountRole3.getId();
        java.lang.String str14 = accountRole3.getRoleName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",,10.0" + "'", str8, ",,10.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole0 = new org.openjfx.EECS_3311_Project.model.AccountRole();
        accountRole0.setRoleName("hi!,,,10.0,10.0");
        java.lang.String str3 = accountRole0.getRoleName();
        java.lang.String str4 = accountRole0.getRoleName();
        java.lang.Double double5 = accountRole0.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!,,,10.0,10.0" + "'", str3, "hi!,,,10.0,10.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!,,,10.0,10.0" + "'", str4, "hi!,,,10.0,10.0");
        org.junit.Assert.assertNull(double5);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        accountRole3.setHourlyRate((java.lang.Double) (-1.0d));
        java.lang.String str7 = accountRole3.toCSVRow();
        java.lang.String str8 = accountRole3.toString();
        java.lang.Double double9 = accountRole3.getHourlyRate();
        accountRole3.setRoleName(",hi!,0.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",,-1.0" + "'", str7, ",,-1.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,100.0", "", (java.lang.Double) 10.0d);
        java.lang.Double double4 = accountRole3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getId();
        java.lang.String str5 = accountRole3.getId();
        java.lang.String str6 = accountRole3.toCSVRow();
        java.lang.String str7 = accountRole3.toString();
        java.lang.String str8 = accountRole3.toCSVRow();
        java.lang.String str9 = accountRole3.toCSVRow();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",hi!,10.0" + "'", str6, ",hi!,10.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",hi!,10.0" + "'", str8, ",hi!,10.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",hi!,10.0" + "'", str9, ",hi!,10.0");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!,,0.0", "hi!,,0.0", (java.lang.Double) 10.0d);
        accountRole3.setHourlyRate((java.lang.Double) 0.0d);
        java.lang.String str6 = accountRole3.getRoleName();
        java.lang.String str7 = accountRole3.getRoleName();
        java.lang.String str8 = accountRole3.toString();
        java.lang.String str9 = accountRole3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!,,0.0" + "'", str6, "hi!,,0.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!,,0.0" + "'", str7, "hi!,,0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!,,0.0" + "'", str8, "hi!,,0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,,0.0" + "'", str9, "hi!,,0.0");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!,,0.0", "hi!,,0.0", (java.lang.Double) 10.0d);
        accountRole3.setHourlyRate((java.lang.Double) 0.0d);
        java.lang.String str6 = accountRole3.getRoleName();
        java.lang.Double double7 = accountRole3.getHourlyRate();
        java.lang.String str8 = accountRole3.getRoleName();
        java.lang.String str9 = accountRole3.getRoleName();
        java.lang.String str10 = accountRole3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!,,0.0" + "'", str6, "hi!,,0.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!,,0.0" + "'", str8, "hi!,,0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,,0.0" + "'", str9, "hi!,,0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!,,0.0" + "'", str10, "hi!,,0.0");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        java.lang.String str7 = accountRole3.getRoleName();
        accountRole3.setId("hi!,,0.0,hi!,,0.0,10.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        java.lang.String str8 = accountRole3.getRoleName();
        accountRole3.setRoleName("null,null,null");
        java.lang.String str11 = accountRole3.getRoleName();
        java.lang.String str12 = accountRole3.toCSVRow();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null,null,null" + "'", str11, "null,null,null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null,null,null,10.0" + "'", str12, ",null,null,null,10.0");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toString();
        accountRole3.setRoleName("hi!,,0.0");
        accountRole3.setId(",,10.0,,hi!,10.0,10.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        accountRole3.setHourlyRate((java.lang.Double) (-1.0d));
        java.lang.String str7 = accountRole3.toCSVRow();
        java.lang.String str8 = accountRole3.toString();
        accountRole3.setRoleName(",,100.0");
        accountRole3.setHourlyRate((java.lang.Double) 0.0d);
        java.lang.Class<?> wildcardClass13 = accountRole3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",,-1.0" + "'", str7, ",,-1.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        accountRole3.setHourlyRate((java.lang.Double) (-1.0d));
        java.lang.Double double10 = accountRole3.getHourlyRate();
        java.lang.String str11 = accountRole3.toCSVRow();
        accountRole3.setRoleName("");
        accountRole3.setRoleName(",hi!,10.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",,-1.0" + "'", str11, ",,-1.0");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,10.0");
        accountRole1.setId("");
        java.lang.String str4 = accountRole1.toString();
        accountRole1.setHourlyRate((java.lang.Double) 100.0d);
        java.lang.String str7 = accountRole1.toString();
        accountRole1.setId(",null,null,null,10.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,100.0", ",null,null,null,10.0", (java.lang.Double) 0.0d);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,-1.0,hi!,,0.0,hi!,,0.0,10.0,10.0", ",,100.0", (java.lang.Double) (-1.0d));
        java.lang.Double double4 = accountRole3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getId();
        java.lang.String str5 = accountRole3.toString();
        java.lang.String str6 = accountRole3.getId();
        accountRole3.setRoleName(",,10.0");
        java.lang.String str9 = accountRole3.toString();
        java.lang.String str10 = accountRole3.toCSVRow();
        java.lang.String str11 = accountRole3.toCSVRow();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",,10.0" + "'", str9, ",,10.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",,,10.0,10.0" + "'", str10, ",,,10.0,10.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",,,10.0,10.0" + "'", str11, ",,,10.0,10.0");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        accountRole3.setId("");
        accountRole3.setHourlyRate((java.lang.Double) 1.0d);
        accountRole3.setRoleName(",hi!,,0.0,-1.0");
        java.lang.String str13 = accountRole3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",hi!,10.0");
        java.lang.String str2 = accountRole1.toString();
        java.lang.Class<?> wildcardClass3 = accountRole1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        accountRole3.setHourlyRate((java.lang.Double) 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        accountRole3.setRoleName("hi!");
        java.lang.String str9 = accountRole3.getId();
        java.lang.String str10 = accountRole3.getRoleName();
        java.lang.String str11 = accountRole3.getRoleName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        accountRole3.setRoleName("hi!");
        java.lang.String str9 = accountRole3.getId();
        accountRole3.setRoleName(",,-1.0");
        java.lang.String str12 = accountRole3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        accountRole3.setRoleName("hi!");
        java.lang.String str7 = accountRole3.getRoleName();
        accountRole3.setId("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toString();
        accountRole3.setRoleName("hi!,,0.0");
        java.lang.Double double7 = accountRole3.getHourlyRate();
        java.lang.Double double8 = accountRole3.getHourlyRate();
        java.lang.String str9 = accountRole3.getRoleName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,,0.0" + "'", str9, "hi!,,0.0");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.getRoleName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        accountRole3.setRoleName("hi!");
        accountRole3.setRoleName(",,10.0,,10.0");
        accountRole3.setRoleName(",,10.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        accountRole3.setHourlyRate((java.lang.Double) 0.0d);
        accountRole3.setHourlyRate((java.lang.Double) 100.0d);
        java.lang.String str9 = accountRole3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,-1.0", ",,-1.0,hi!,,0.0,hi!,,0.0,10.0,10.0", (java.lang.Double) 10.0d);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole0 = new org.openjfx.EECS_3311_Project.model.AccountRole();
        accountRole0.setRoleName("hi!,,,10.0,10.0");
        java.lang.String str3 = accountRole0.toString();
        accountRole0.setId(",,-1.0,hi!,,0.0,hi!,,0.0,10.0,10.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!,,,10.0,10.0" + "'", str3, "hi!,,,10.0,10.0");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole0 = new org.openjfx.EECS_3311_Project.model.AccountRole();
        accountRole0.setRoleName("hi!,,,10.0,10.0");
        java.lang.String str3 = accountRole0.getRoleName();
        java.lang.String str4 = accountRole0.getRoleName();
        java.lang.String str5 = accountRole0.getRoleName();
        accountRole0.setId(",hi!,,0.0,10.0");
        java.lang.String str8 = accountRole0.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!,,,10.0,10.0" + "'", str3, "hi!,,,10.0,10.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!,,,10.0,10.0" + "'", str4, "hi!,,,10.0,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!,,,10.0,10.0" + "'", str5, "hi!,,,10.0,10.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",hi!,,0.0,10.0" + "'", str8, ",hi!,,0.0,10.0");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!", ",,10.0", (java.lang.Double) 100.0d);
        accountRole3.setRoleName("hi!,,0.0");
        accountRole3.setId(",hi!,10.0,,0.0");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        // The following exception was thrown during execution in test generation
        try {
            org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,10.0,,-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid CSV row for AccountRole: ,,10.0,,-1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,10.0,,10.0", ",,10.0", (java.lang.Double) 100.0d);
        java.lang.String str4 = accountRole3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0,,10.0" + "'", str4, ",,10.0,,10.0");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole0 = new org.openjfx.EECS_3311_Project.model.AccountRole();
        accountRole0.setRoleName("hi!,,,10.0,10.0");
        java.lang.String str3 = accountRole0.toString();
        accountRole0.setHourlyRate((java.lang.Double) 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!,,,10.0,10.0" + "'", str3, "hi!,,,10.0,10.0");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,-1.0");
        java.lang.Double double2 = accountRole1.getHourlyRate();
        java.lang.Class<?> wildcardClass3 = accountRole1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!,,0.0", "hi!,,0.0", (java.lang.Double) 10.0d);
        accountRole3.setHourlyRate((java.lang.Double) 0.0d);
        java.lang.String str6 = accountRole3.getRoleName();
        java.lang.Double double7 = accountRole3.getHourlyRate();
        java.lang.String str8 = accountRole3.getRoleName();
        java.lang.String str9 = accountRole3.getRoleName();
        java.lang.Class<?> wildcardClass10 = accountRole3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!,,0.0" + "'", str6, "hi!,,0.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!,,0.0" + "'", str8, "hi!,,0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,,0.0" + "'", str9, "hi!,,0.0");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        java.lang.String str8 = accountRole3.toCSVRow();
        accountRole3.setHourlyRate((java.lang.Double) 0.0d);
        java.lang.String str11 = accountRole3.toString();
        accountRole3.setHourlyRate((java.lang.Double) (-1.0d));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",,10.0" + "'", str8, ",,10.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,10.0");
        accountRole1.setId("");
        java.lang.String str4 = accountRole1.toString();
        accountRole1.setHourlyRate((java.lang.Double) 100.0d);
        java.lang.String str7 = accountRole1.toString();
        java.lang.String str8 = accountRole1.getId();
        accountRole1.setRoleName(",,-1.0,hi!,,0.0,hi!,,0.0,10.0,10.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        accountRole3.setHourlyRate((java.lang.Double) (-1.0d));
        java.lang.String str7 = accountRole3.toCSVRow();
        java.lang.String str8 = accountRole3.toCSVRow();
        java.lang.String str9 = accountRole3.getRoleName();
        accountRole3.setHourlyRate((java.lang.Double) 10.0d);
        java.lang.String str12 = accountRole3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",,-1.0" + "'", str7, ",,-1.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",,-1.0" + "'", str8, ",,-1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!", "hi!,,0.0", (java.lang.Double) 1.0d);
        java.lang.Class<?> wildcardClass4 = accountRole3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!", "hi!", (java.lang.Double) 0.0d);
        accountRole3.setHourlyRate((java.lang.Double) 0.0d);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!,,0.0", "", (java.lang.Double) (-1.0d));
        accountRole3.setId(",hi!,10.0");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        accountRole3.setHourlyRate((java.lang.Double) (-1.0d));
        java.lang.String str7 = accountRole3.toCSVRow();
        java.lang.String str8 = accountRole3.toString();
        accountRole3.setRoleName(",,100.0");
        java.lang.String str11 = accountRole3.toCSVRow();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",,-1.0" + "'", str7, ",,-1.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",,,100.0,-1.0" + "'", str11, ",,,100.0,-1.0");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "hi!", (java.lang.Double) 0.0d);
        accountRole3.setHourlyRate((java.lang.Double) 100.0d);
        accountRole3.setId(",,10.0,,-1.0");
        accountRole3.setHourlyRate((java.lang.Double) 1.0d);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getId();
        java.lang.String str5 = accountRole3.toString();
        java.lang.String str6 = accountRole3.getId();
        accountRole3.setRoleName(",,10.0");
        java.lang.String str9 = accountRole3.toCSVRow();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",,,10.0,10.0" + "'", str9, ",,,10.0,10.0");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole(",hi!,10.0", "null,null,null", (java.lang.Double) 100.0d);
        accountRole3.setRoleName("");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!,,,10.0,10.0", "hi!,,,10.0,10.0", (java.lang.Double) 0.0d);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        accountRole3.setHourlyRate((java.lang.Double) 0.0d);
        java.lang.String str7 = accountRole3.toCSVRow();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",,0.0" + "'", str7, ",,0.0");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!,,0.0", "hi!,,0.0,hi!,,0.0,10.0", (java.lang.Double) 10.0d);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,10.0,,,10.0,10.0", ",,10.0", (java.lang.Double) 10.0d);
        accountRole3.setHourlyRate((java.lang.Double) 100.0d);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        accountRole3.setRoleName("hi!");
        java.lang.String str9 = accountRole3.getId();
        java.lang.String str10 = accountRole3.getRoleName();
        java.lang.String str11 = accountRole3.toString();
        java.lang.String str12 = accountRole3.toString();
        java.lang.String str13 = accountRole3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!,,0.0", "hi!,,0.0", (java.lang.Double) 10.0d);
        accountRole3.setHourlyRate((java.lang.Double) 0.0d);
        java.lang.String str6 = accountRole3.getRoleName();
        java.lang.String str7 = accountRole3.getId();
        accountRole3.setHourlyRate((java.lang.Double) 0.0d);
        java.lang.String str10 = accountRole3.toCSVRow();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!,,0.0" + "'", str6, "hi!,,0.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!,,0.0" + "'", str7, "hi!,,0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!,,0.0,hi!,,0.0,0.0" + "'", str10, "hi!,,0.0,hi!,,0.0,0.0");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        accountRole3.setId(",,10.0");
        accountRole3.setRoleName(",,10.0,,,10.0,10.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        accountRole3.setRoleName("hi!");
        java.lang.String str9 = accountRole3.getId();
        accountRole3.setRoleName("null,null,null");
        java.lang.String str12 = accountRole3.getRoleName();
        java.lang.String str13 = accountRole3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null,null,null" + "'", str12, "null,null,null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null,null,null" + "'", str13, "null,null,null");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,10.0");
        java.lang.String str2 = accountRole1.toCSVRow();
        java.lang.Double double3 = accountRole1.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ",,10.0" + "'", str2, ",,10.0");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!,,0.0", "hi!,,0.0", (java.lang.Double) 10.0d);
        accountRole3.setHourlyRate((java.lang.Double) 0.0d);
        java.lang.String str6 = accountRole3.toString();
        java.lang.String str7 = accountRole3.getRoleName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!,,0.0" + "'", str6, "hi!,,0.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!,,0.0" + "'", str7, "hi!,,0.0");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        accountRole3.setHourlyRate((java.lang.Double) (-1.0d));
        java.lang.String str7 = accountRole3.toCSVRow();
        java.lang.String str8 = accountRole3.toCSVRow();
        java.lang.String str9 = accountRole3.toString();
        java.lang.String str10 = accountRole3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",,-1.0" + "'", str7, ",,-1.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",,-1.0" + "'", str8, ",,-1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!,,0.0", "hi!,,0.0", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toString();
        accountRole3.setRoleName("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!,,0.0" + "'", str4, "hi!,,0.0");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.Double double6 = accountRole3.getHourlyRate();
        accountRole3.setRoleName("hi!");
        java.lang.String str9 = accountRole3.getId();
        accountRole3.setRoleName("null,null,null");
        java.lang.String str12 = accountRole3.toString();
        accountRole3.setRoleName("hi!,,0.0,hi!,,0.0,10.0");
        accountRole3.setId(",,-1.0");
        accountRole3.setHourlyRate((java.lang.Double) (-1.0d));
        accountRole3.setId("hi!,,0.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null,null,null" + "'", str12, "null,null,null");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        accountRole3.setHourlyRate((java.lang.Double) (-1.0d));
        accountRole3.setHourlyRate((java.lang.Double) 100.0d);
        java.lang.String str12 = accountRole3.toCSVRow();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",,100.0" + "'", str12, ",,100.0");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,10.0");
        accountRole1.setId("");
        java.lang.String str4 = accountRole1.toString();
        java.lang.String str5 = accountRole1.getId();
        java.lang.Double double6 = accountRole1.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getRoleName();
        accountRole3.setHourlyRate((java.lang.Double) (-1.0d));
        java.lang.String str7 = accountRole3.toCSVRow();
        java.lang.String str8 = accountRole3.toString();
        accountRole3.setRoleName(",,100.0");
        java.lang.String str11 = accountRole3.toString();
        accountRole3.setRoleName(",hi!,,0.0,10.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",,-1.0" + "'", str7, ",,-1.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",,100.0" + "'", str11, ",,100.0");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getId();
        java.lang.String str5 = accountRole3.toString();
        java.lang.String str6 = accountRole3.getId();
        accountRole3.setRoleName(",,10.0");
        accountRole3.setId(",,,10.0,10.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", ",,10.0", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getId();
        accountRole3.setRoleName("hi!,,,10.0,10.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("hi!,,0.0", "hi!", (java.lang.Double) 100.0d);
        accountRole3.setId(",,-1.0,hi!,,0.0,hi!,,0.0,10.0,10.0");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.getId();
        java.lang.String str5 = accountRole3.toString();
        accountRole3.setRoleName("");
        java.lang.Class<?> wildcardClass8 = accountRole3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "hi!", (java.lang.Double) 0.0d);
        java.lang.String str4 = accountRole3.getId();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.String str6 = accountRole3.toCSVRow();
        java.lang.String str7 = accountRole3.toString();
        java.lang.Double double8 = accountRole3.getHourlyRate();
        java.lang.Double double9 = accountRole3.getHourlyRate();
        java.lang.String str10 = accountRole3.getRoleName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!,,0.0" + "'", str6, "hi!,,0.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "", (java.lang.Double) 10.0d);
        java.lang.String str4 = accountRole3.toCSVRow();
        accountRole3.setHourlyRate((java.lang.Double) 0.0d);
        accountRole3.setHourlyRate((java.lang.Double) 100.0d);
        java.lang.String str9 = accountRole3.toCSVRow();
        accountRole3.setRoleName("hi!,,0.0,hi!,,0.0,0.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",,10.0" + "'", str4, ",,10.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",,100.0" + "'", str9, ",,100.0");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole(",hi!,0.0", ",,,10.0,10.0", (java.lang.Double) 1.0d);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole1 = new org.openjfx.EECS_3311_Project.model.AccountRole(",,0.0");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole0 = new org.openjfx.EECS_3311_Project.model.AccountRole();
        accountRole0.setRoleName("hi!,,,10.0,10.0");
        java.lang.String str3 = accountRole0.getRoleName();
        java.lang.String str4 = accountRole0.getRoleName();
        java.lang.String str5 = accountRole0.getRoleName();
        accountRole0.setId(",hi!,,0.0,10.0");
        java.lang.String str8 = accountRole0.getRoleName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!,,,10.0,10.0" + "'", str3, "hi!,,,10.0,10.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!,,,10.0,10.0" + "'", str4, "hi!,,,10.0,10.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!,,,10.0,10.0" + "'", str5, "hi!,,,10.0,10.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!,,,10.0,10.0" + "'", str8, "hi!,,,10.0,10.0");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.openjfx.EECS_3311_Project.model.AccountRole accountRole3 = new org.openjfx.EECS_3311_Project.model.AccountRole("", "hi!", (java.lang.Double) 0.0d);
        java.lang.String str4 = accountRole3.getId();
        java.lang.Double double5 = accountRole3.getHourlyRate();
        java.lang.String str6 = accountRole3.toCSVRow();
        java.lang.String str7 = accountRole3.toString();
        java.lang.Double double8 = accountRole3.getHourlyRate();
        accountRole3.setId("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!,,0.0" + "'", str6, "hi!,,0.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }
}

