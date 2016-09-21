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
	public void verifyBowlingGame_Frames_1_Score_5() throws BowlingException {
		BowlingGame game = new BowlingGame();
		
		game.addFrame(new Frame(1, 4));
		
		assertEquals(game.score(), 5);
	}

	@Test
	public void verifyBowlingGame_Frames_2_Score_14() throws BowlingException {
		BowlingGame game = new BowlingGame();

		game.addFrame(new Frame(1, 4));
		game.addFrame(new Frame(4, 5));
		
		assertEquals(game.score(), 14);
	}

	@Test
	public void verifyBowlingGame_Frames_3_Spare3_Score_34() throws BowlingException {
		BowlingGame game = new BowlingGame();

		game.addFrame(new Frame(1, 4));
		game.addFrame(new Frame(4, 5));
		game.addFrame(new Frame(6, 4));
		game.addFrame(new Frame(5, 0));
		
		assertEquals(game.score(), 34);
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
