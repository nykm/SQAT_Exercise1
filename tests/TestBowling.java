import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void verifyFrameIsSpare_True() {
		Frame frame = new Frame(5, 5);
		assertTrue(frame.isSpare());
	}
	
	@Test
	public void verifyFrameIsStrike_True() {
		
	}
}
