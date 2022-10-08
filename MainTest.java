import static org.junit.Assert.*;




import org.junit.Test;


public class MainTest {

	
	
	@Test
	public void testAddition() {
		String result = Main.toDoTheOperation(Main.recognize("10+10+10"));
		assertEquals("30.0", result);
		result = Main.toDoTheOperation(Main.recognize("0+0"));
		assertEquals("0.0", result);
		result = Main.toDoTheOperation(Main.recognize("10+10+10+20"));
		assertEquals("50.0", result);
		result = Main.toDoTheOperation(Main.recognize("1+1"));
		assertEquals("2.0", result);
		result = Main.toDoTheOperation(Main.recognize("10+10+10+10+10+10+10+10+10+10"));
		assertEquals("100.0", result);
		result = Main.toDoTheOperation(Main.recognize("25+25+25"));
		assertEquals("75.0", result);
		result = Main.toDoTheOperation(Main.recognize("10+1"));
		assertEquals("11.0", result);
		
	}
	
	@Test
	public void testSubtraction() {
		String result = Main.toDoTheOperation(Main.recognize("10-10-10-10"));
		assertEquals("-20.0", result);
		result = Main.toDoTheOperation(Main.recognize("0-0"));
		assertEquals("0.0", result);
		result = Main.toDoTheOperation(Main.recognize("10-10-10-20"));
		assertEquals("-30.0", result);
		result = Main.toDoTheOperation(Main.recognize("1-1"));
		assertEquals("0.0", result);
		result = Main.toDoTheOperation(Main.recognize("10-10-10-10-10-10-10-10-10-10-10-10"));
		assertEquals("-100.0", result);
		result = Main.toDoTheOperation(Main.recognize("0-25-25-25"));
		assertEquals("-75.0", result);
	}
	
	@Test
	public void testMultiplication() {
		String result = Main.toDoTheOperation(Main.recognize("10*10"));
		assertEquals("100.0", result);
		result = Main.toDoTheOperation(Main.recognize("0*0"));
		assertEquals("0.0", result);
		result = Main.toDoTheOperation(Main.recognize("10*10*10"));
		assertEquals("1000.0", result);
		result = Main.toDoTheOperation(Main.recognize("1*1"));
		assertEquals("1.0", result);
		result = Main.toDoTheOperation(Main.recognize("8*7"));
		assertEquals("56.0", result);
		result = Main.toDoTheOperation(Main.recognize("1*2*3"));
		assertEquals("6.0", result);
		result = Main.toDoTheOperation(Main.recognize("10*9*8*7*6*5*4*3*2*1"));
		assertEquals("3628800.0", result);
	}
	
	@Test
	public void mix() {
		String result = Main.toDoTheOperation(Main.recognize("10*10-14+6"));
		assertEquals("92.0", result);
		result = Main.toDoTheOperation(Main.recognize("556-555*634-633"));
		assertEquals("-351947.0", result);
		result = Main.toDoTheOperation(Main.recognize("10*10*10+1000-46+98*63"));
		assertEquals("8128.0", result);
		result = Main.toDoTheOperation(Main.recognize("1*1-1000+10001"));
		assertEquals("9002.0", result);
		result = Main.toDoTheOperation(Main.recognize("8*7-56"));
		assertEquals("0.0", result);
		result = Main.toDoTheOperation(Main.recognize("1*2*3+1+2+3*1*2*3*3*2*1-3-2-1"));
		assertEquals("111.0", result);
		result = Main.toDoTheOperation(Main.recognize("10*9*8*7*6*5*4*3*2*1"));
		assertEquals("3628800.0", result);
		result = Main.toDoTheOperation(Main.recognize("0*0+0-0"));
		assertEquals("0.0", result);
		result = Main.toDoTheOperation(Main.recognize("666-1000*99+56"));
		assertEquals("-98278.0", result);
		result = Main.toDoTheOperation(Main.recognize("999-998-4*5*46"));
		assertEquals("-919.0", result);
		result = Main.toDoTheOperation(Main.recognize("89*89-89-89"));
		assertEquals("7743.0", result);
		result = Main.toDoTheOperation(Main.recognize("12345+34569-12345*10+50"));
		assertEquals("-76486.0", result);
		result = Main.toDoTheOperation(Main.recognize("3578*35-3456-356*6"));		
		assertEquals("119638.0", result);
		result = Main.toDoTheOperation(Main.recognize("123456789*123456789-123456789*123456789"));
		assertEquals("0.0", result);
		result = Main.toDoTheOperation(Main.recognize("10*10*10-10-10-10*10"));
		assertEquals("880.0", result);
		result = Main.toDoTheOperation(Main.recognize("1*1"));
		assertEquals("1.0", result);
		result = Main.toDoTheOperation(Main.recognize("92*386-71+2"));
		assertEquals("35443.0", result);
		result = Main.toDoTheOperation(Main.recognize("1*2*3"));
		assertEquals("6.0", result);
		result = Main.toDoTheOperation(Main.recognize("10*9*8*7*6*5*4*3*2*1-19999"));
		assertEquals("3608801.0", result);
		result = Main.toDoTheOperation(Main.recognize("0*0-0-0-0-0-0-0-0-0"));
		assertEquals("0.0", result);
		result = Main.toDoTheOperation(Main.recognize("45*45-45"));
		assertEquals("1980.0", result);
		result = Main.toDoTheOperation(Main.recognize("89-89*89"));
		assertEquals("-7832.0", result);
		result = Main.toDoTheOperation(Main.recognize("8*7-56-56"));
		assertEquals("-56.0", result);
		result = Main.toDoTheOperation(Main.recognize("99*100-99*100+99*100"));
		assertEquals("9900.0", result);
		result = Main.toDoTheOperation(Main.recognize("789-987*2"));
		assertEquals("-1185.0", result);
		result = Main.toDoTheOperation(Main.recognize("87*78-1000"));
		assertEquals("5786.0", result);
		result = Main.toDoTheOperation(Main.recognize("56*56-3136"));
		assertEquals("0.0", result);
		result = Main.toDoTheOperation(Main.recognize("98-65*2"));
		assertEquals("-32.0", result);
		
	}
	
	

}
