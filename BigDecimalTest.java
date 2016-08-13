package numberStudy;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class BigDecimalTest {

	@Test
	public void testOfBigDecimal() {
		// Rounds to the next highest number
		BigDecimal decimal1 = new BigDecimal("1.222").setScale(2, BigDecimal.ROUND_CEILING);
		BigDecimal decimal2 = new BigDecimal("-1.222").setScale(2, BigDecimal.ROUND_CEILING);
		// Rounds in the direction of zero
		BigDecimal decimal3 = new BigDecimal("1.222").setScale(2, BigDecimal.ROUND_DOWN);
		BigDecimal decimal4 = new BigDecimal("-1.222").setScale(2, BigDecimal.ROUND_DOWN);
		// Rounds to the next lowest number
		BigDecimal decimal5 = new BigDecimal("1.222").setScale(2, BigDecimal.ROUND_FLOOR);
		BigDecimal decimal6 = new BigDecimal("-1.222").setScale(2, BigDecimal.ROUND_FLOOR);
		// Rounds up if the decimal is >=5
		BigDecimal decimal7 = new BigDecimal("1.225").setScale(2, BigDecimal.ROUND_HALF_UP);
		BigDecimal decimal8 = new BigDecimal("1.224").setScale(2, BigDecimal.ROUND_HALF_UP);
		BigDecimal decimal9 = new BigDecimal("-1.224").setScale(2, BigDecimal.ROUND_HALF_UP);
		BigDecimal decimal10 = new BigDecimal("-1.225").setScale(2, BigDecimal.ROUND_HALF_UP);
		// Rounds down if the decimal is <=5
		BigDecimal decimal11 = new BigDecimal("1.226").setScale(2, BigDecimal.ROUND_HALF_DOWN);
		BigDecimal decimal12 = new BigDecimal("1.225").setScale(2, BigDecimal.ROUND_HALF_DOWN);
		BigDecimal decimal13 = new BigDecimal("-1.225").setScale(2, BigDecimal.ROUND_HALF_DOWN);
		BigDecimal decimal14 = new BigDecimal("-1.226").setScale(2, BigDecimal.ROUND_HALF_DOWN);
		// Round up if the decimal is >=1
		BigDecimal decimal15 = new BigDecimal("1.221").setScale(2, BigDecimal.ROUND_UP);
		BigDecimal decimal16 = new BigDecimal("1.225").setScale(2, BigDecimal.ROUND_UP);
		BigDecimal decimal17 = new BigDecimal("-1.221").setScale(2, BigDecimal.ROUND_UP);
		BigDecimal decimal18 = new BigDecimal("-1.225").setScale(2, BigDecimal.ROUND_UP);
		
		// ROUND_CEILING
		assertEquals(new BigDecimal("1.23"), decimal1);
		assertEquals(new BigDecimal("-1.22"), decimal2);
		// ROUND_DOWN
		assertEquals(new BigDecimal("1.22"), decimal3);
		assertEquals(new BigDecimal("-1.22"), decimal4);
		// ROUND_FLOOR
		assertEquals(new BigDecimal("1.22"), decimal5);
		assertEquals(new BigDecimal("-1.23"), decimal6);
		// ROUND_HALF_UP
		assertEquals(new BigDecimal("1.23"), decimal7);
		assertEquals(new BigDecimal("1.22"), decimal8);
		assertEquals(new BigDecimal("-1.22"), decimal9);
		assertEquals(new BigDecimal("-1.23"), decimal10);
		// ROUND_HALF_DOWN
		assertEquals(new BigDecimal("1.23"), decimal11);
		assertEquals(new BigDecimal("1.22"), decimal12);
		assertEquals(new BigDecimal("-1.22"), decimal13);
		assertEquals(new BigDecimal("-1.23"), decimal14);
		// ROUND_UP
		assertEquals(new BigDecimal("1.23"), decimal15);
		assertEquals(new BigDecimal("1.23"), decimal16);
		assertEquals(new BigDecimal("-1.23"), decimal17);
		assertEquals(new BigDecimal("-1.23"), decimal18);
		
	}
	
}
