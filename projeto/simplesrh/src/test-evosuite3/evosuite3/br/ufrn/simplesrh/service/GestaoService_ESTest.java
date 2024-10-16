/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 15 22:16:17 GMT 2024
 */

package evosuite3.br.ufrn.simplesrh.service;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import br.ufrn.simplesrh.dao.FuncionarioDAO;
import br.ufrn.simplesrh.model.Funcionario;
import br.ufrn.simplesrh.service.GestaoService;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GestaoService_ESTest extends GestaoService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GestaoService gestaoService0 = new GestaoService((FuncionarioDAO) null);
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(1298);
      LocalDate localDate0 = MockLocalDate.now((ZoneId) zoneOffset0);
      Funcionario funcionario0 = new Funcionario("desempenho: ", "desempenho: ", 1298, localDate0, 1298);
      double double0 = gestaoService0.calcularBonusPorDesempenho(funcionario0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GestaoService gestaoService0 = new GestaoService((FuncionarioDAO) null);
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(1298);
      LocalDate localDate0 = MockLocalDate.now((ZoneId) zoneOffset0);
      Funcionario funcionario0 = new Funcionario("O funcion\u00E1rio %s (%s) tem menos de um ano de empresa. Nenhum reajuste aplicado.%n", "Q,NS+T6!m", (-477L), localDate0, 70);
      double double0 = gestaoService0.calcularBonusPorDesempenho(funcionario0);
      assertEquals((-71.55), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FuncionarioDAO funcionarioDAO0 = mock(FuncionarioDAO.class, new ViolatedAssumptionAnswer());
      GestaoService gestaoService0 = new GestaoService(funcionarioDAO0);
      LocalDate localDate0 = MockLocalDate.ofEpochDay((-1391L));
      Funcionario funcionario0 = new Funcionario("", "Erro ao carregar o arquivo JSON: ", (-262L), localDate0, 50);
      double double0 = gestaoService0.calcularBonusPorDesempenho(funcionario0);
      assertEquals((-26.200000000000003), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FuncionarioDAO funcionarioDAO0 = mock(FuncionarioDAO.class, new ViolatedAssumptionAnswer());
      GestaoService gestaoService0 = new GestaoService(funcionarioDAO0);
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      LocalDate localDate0 = MockLocalDate.now((ZoneId) zoneOffset0);
      Funcionario funcionario0 = new Funcionario("=Ei+qkD", "=Ei+qkD", (-1748), localDate0, 49);
      double double0 = gestaoService0.calcularBonusPorDesempenho(funcionario0);
      assertEquals((-87.4), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FuncionarioDAO funcionarioDAO0 = mock(FuncionarioDAO.class, new ViolatedAssumptionAnswer());
      GestaoService gestaoService0 = new GestaoService(funcionarioDAO0);
      LocalDate localDate0 = MockLocalDate.ofEpochDay((-262L));
      Funcionario funcionario0 = new Funcionario((String) null, "", 0.1, localDate0, 90);
      funcionario0.setSalario(0.0);
      double double0 = gestaoService0.calcularReajusteSalarial(funcionario0, (-2305.877837));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FuncionarioDAO funcionarioDAO0 = mock(FuncionarioDAO.class, new ViolatedAssumptionAnswer());
      GestaoService gestaoService0 = new GestaoService(funcionarioDAO0);
      LocalDate localDate0 = MockLocalDate.ofEpochDay((-262L));
      Funcionario funcionario0 = new Funcionario("", "", 4394.4627899, localDate0, (-1));
      double double0 = gestaoService0.calcularReajusteSalarial(funcionario0, -0.0);
      assertEquals(4394.4627899, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FuncionarioDAO funcionarioDAO0 = mock(FuncionarioDAO.class, new ViolatedAssumptionAnswer());
      GestaoService gestaoService0 = new GestaoService(funcionarioDAO0);
      LocalDate localDate0 = MockLocalDate.ofEpochDay((-262L));
      Funcionario funcionario0 = new Funcionario("", "", 4394.4627899, localDate0, (-1));
      double double0 = gestaoService0.calcularReajusteSalarial(funcionario0, (-213.505621));
      assertEquals((-4987.96227928992), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GestaoService gestaoService0 = new GestaoService((FuncionarioDAO) null);
      // Undeclared exception!
      try { 
        gestaoService0.reajustarSalarioPorCargo("O9NGxar", (-477L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.ufrn.simplesrh.service.GestaoService", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GestaoService gestaoService0 = new GestaoService((FuncionarioDAO) null);
      // Undeclared exception!
      try { 
        gestaoService0.calcularBonusPorDesempenho((Funcionario) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.ufrn.simplesrh.service.GestaoService", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<Funcionario> linkedList0 = new LinkedList<Funcionario>();
      FuncionarioDAO funcionarioDAO0 = mock(FuncionarioDAO.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0).when(funcionarioDAO0).todos();
      GestaoService gestaoService0 = new GestaoService(funcionarioDAO0);
      LocalDate localDate0 = MockLocalDate.ofEpochDay((-262L));
      Funcionario funcionario0 = new Funcionario("", "", 4394.4627899, localDate0, (-1));
      linkedList0.add(funcionario0);
      System.setCurrentTimeMillis((-1397L));
      gestaoService0.reajustarSalarioPorCargo("", 890.3364013);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<Funcionario> linkedList0 = new LinkedList<Funcionario>();
      FuncionarioDAO funcionarioDAO0 = mock(FuncionarioDAO.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0).when(funcionarioDAO0).todos();
      GestaoService gestaoService0 = new GestaoService(funcionarioDAO0);
      LocalDate localDate0 = MockLocalDate.ofEpochDay((-262L));
      Funcionario funcionario0 = new Funcionario("", "", 4394.4627899, localDate0, (-1));
      linkedList0.add(funcionario0);
      gestaoService0.reajustarSalarioPorCargo("6@?({Dk[q&up", (-1));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<Funcionario> linkedList0 = new LinkedList<Funcionario>();
      FuncionarioDAO funcionarioDAO0 = mock(FuncionarioDAO.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0).when(funcionarioDAO0).todos();
      GestaoService gestaoService0 = new GestaoService(funcionarioDAO0);
      LocalDate localDate0 = MockLocalDate.ofEpochDay((-262L));
      Funcionario funcionario0 = new Funcionario("", "", 4394.4627899, localDate0, (-1));
      linkedList0.add(funcionario0);
      gestaoService0.reajustarSalarioPorCargo("", 1.0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      FuncionarioDAO funcionarioDAO0 = mock(FuncionarioDAO.class, new ViolatedAssumptionAnswer());
      GestaoService gestaoService0 = new GestaoService(funcionarioDAO0);
      Funcionario funcionario0 = new Funcionario((String) null, "N>0mL0I9ZM@fH", 90, localDate0, 90);
      double double0 = gestaoService0.calcularBonusPorDesempenho(funcionario0);
      assertEquals(18.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.ofEpochDay((-221L));
      FuncionarioDAO funcionarioDAO0 = mock(FuncionarioDAO.class, new ViolatedAssumptionAnswer());
      GestaoService gestaoService0 = new GestaoService(funcionarioDAO0);
      Funcionario funcionario0 = new Funcionario("Nome: H, Cargo: :2i6i_vt72g0, Sal\u00E1rio: 100.0, Admissao: 2014-02-14, Desempenho: 0", " vr7c wu", (-325.8064269), localDate0, 100);
      double double0 = gestaoService0.calcularBonusPorDesempenho(funcionario0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FuncionarioDAO funcionarioDAO0 = mock(FuncionarioDAO.class, new ViolatedAssumptionAnswer());
      GestaoService gestaoService0 = new GestaoService(funcionarioDAO0);
      Funcionario funcionario0 = new Funcionario("m<J009@So", "n", 1.0, (LocalDate) null, 69);
      double double0 = gestaoService0.calcularBonusPorDesempenho(funcionario0);
      assertEquals(0.1, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GestaoService gestaoService0 = new GestaoService((FuncionarioDAO) null);
      Funcionario funcionario0 = new Funcionario("desempenho: ", "jei%o7m[>i.)%m", (-1.0), (-739));
      double double0 = gestaoService0.calcularBonusPorDesempenho(funcionario0);
      assertEquals((-0.05), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      FuncionarioDAO funcionarioDAO0 = mock(FuncionarioDAO.class, new ViolatedAssumptionAnswer());
      GestaoService gestaoService0 = new GestaoService(funcionarioDAO0);
      Funcionario funcionario0 = new Funcionario("O funcion\u00E1rio %s (%s) tem menos de um ano de empresa. Nenhum reajuste aplicado.%n", "O funcion\u00E1rio %s (%s) tem menos de um ano de empresa. Nenhum reajuste aplicado.%n", 0.0, localDate0, 89);
      double double0 = gestaoService0.calcularBonusPorDesempenho(funcionario0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GestaoService gestaoService0 = new GestaoService((FuncionarioDAO) null);
      // Undeclared exception!
      try { 
        gestaoService0.calcularReajusteSalarial((Funcionario) null, (-357.6));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("br.ufrn.simplesrh.service.GestaoService", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FuncionarioDAO funcionarioDAO0 = mock(FuncionarioDAO.class, new ViolatedAssumptionAnswer());
      GestaoService gestaoService0 = new GestaoService(funcionarioDAO0);
      LocalDate localDate0 = MockLocalDate.ofEpochDay((-262L));
      Funcionario funcionario0 = new Funcionario("", "", 4394.4627899, localDate0, (-1));
      double double0 = gestaoService0.calcularBonusPorDesempenho(funcionario0);
      assertEquals(0.0, double0, 0.01);
  }
}
