import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class Ex7 {

	@SuppressWarnings("null")
	@Test
	void testforEx7() {
		String str = null;

	    assertThrows(NullPointerException.class, () -> {str.toUpperCase();});
	}

}
