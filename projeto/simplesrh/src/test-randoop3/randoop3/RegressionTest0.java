package randoop3;

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
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.FuncionarioService funcionarioService1 = new br.ufrn.simplesrh.service.FuncionarioService(funcionarioDAO0);
        java.lang.Class<?> wildcardClass2 = funcionarioService1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.FuncionarioService funcionarioService1 = new br.ufrn.simplesrh.service.FuncionarioService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<br.ufrn.simplesrh.model.Funcionario> funcionarioList2 = funcionarioService1.todos();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.FuncionarioService funcionarioService1 = new br.ufrn.simplesrh.service.FuncionarioService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            funcionarioService1.listar();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.FuncionarioService funcionarioService1 = new br.ufrn.simplesrh.service.FuncionarioService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            funcionarioService1.remover("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.FuncionarioService funcionarioService1 = new br.ufrn.simplesrh.service.FuncionarioService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<br.ufrn.simplesrh.model.Funcionario> funcionarioOptional3 = funcionarioService1.buscarPorNome("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.FuncionarioService funcionarioService1 = new br.ufrn.simplesrh.service.FuncionarioService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            funcionarioService1.adicionar(funcionario2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = gestaoService1.calcularBonusPorDesempenho(funcionario2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.FuncionarioService funcionarioService1 = new br.ufrn.simplesrh.service.FuncionarioService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<br.ufrn.simplesrh.model.Funcionario> funcionarioOptional3 = funcionarioService1.buscarPorNome("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.FuncionarioService funcionarioService1 = new br.ufrn.simplesrh.service.FuncionarioService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            funcionarioService1.remover("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        java.lang.Class<?> wildcardClass2 = gestaoService1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        br.ufrn.simplesrh.model.Funcionario funcionario2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = gestaoService1.calcularReajusteSalarial(funcionario2, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("", (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        br.ufrn.simplesrh.dao.FuncionarioDAO funcionarioDAO0 = null;
        br.ufrn.simplesrh.service.GestaoService gestaoService1 = new br.ufrn.simplesrh.service.GestaoService(funcionarioDAO0);
        // The following exception was thrown during execution in test generation
        try {
            gestaoService1.reajustarSalarioPorCargo("hi!", (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

