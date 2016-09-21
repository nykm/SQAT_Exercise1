import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void verifyFrameIsSpare_True() {
		Frame frame = new Frame(5, 5);
		assertTrue(frame.isSpare());
	}
	@Test
	public void verifyFrameIsSpare_False() {
		Frame frame = new Frame(5, 4);
		assertFalse(frame.isSpare());
	}
	
	@Test
	public void verifyFrameIsStrike_True() {
		Frame frame = new Frame(10, 0);
		assertTrue(frame.isStrike());
	}
	
	@Test
	public void verifyFrameIsStrike_False() {
		Frame frame = new Frame(9, 0);
		assertFalse(frame.isStrike());
	}
}
