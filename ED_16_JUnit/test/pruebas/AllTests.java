package pruebas;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;


import pruebas.JugadorTest;
import pruebas.SoldadoTest;

@Suite
@SelectClasses({
	JugadorTest.class,
	SoldadoTest.class,
	AllTests.class
})
public class AllTests {

}
