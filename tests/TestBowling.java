import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test(expected=BowlingException.class)
	public void verifyBowlingGame_TooManyFrames() throws BowlingException {
		BowlingGame game = new BowlingGame();

		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(0,0));

		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(0,0));
		game.addFrame(new Frame(0,0));

		game.addFrame(new Frame(0,0));
	}

	@Test
	public void verifyBowlingGame_FirstFrame_Score_5() {
		BowlingGame game = new BowlingGame();
		
		Frame frame = new Frame(1, 4);
		game.addFrame(frame);
		assertEquals(game.score(), 5);
		assertTrue(frame.isSpare());
	}
	
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
		Frame frame = new Frame(9, 1);
		assertFalse(frame.isStrike());
	}
}
