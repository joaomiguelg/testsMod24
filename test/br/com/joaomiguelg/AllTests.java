package br.com.joaomiguelg;

import br.com.joaomiguelg.service.ContratoService;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ClienteServiceTeste.class, ContratoServiceTeste.class})
public class AllTests {
}
