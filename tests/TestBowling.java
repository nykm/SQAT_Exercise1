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
	public void verifyBowlingGame_Frames_3_Score_24() throws BowlingException {
		BowlingGame game = new BowlingGame();

		game.addFrame(new Frame(1, 4));
		game.addFrame(new Frame(4, 5));
		game.addFrame(new Frame(6, 4));
		
		assertEquals(game.score(), 24);
	}

	@Test
	public void verifyBowlingGame_Frames_4_Score_39() throws BowlingException {
		BowlingGame game = new BowlingGame();

		game.addFrame(new Frame(1, 4));
		game.addFrame(new Frame(4, 5));
		game.addFrame(new Frame(6, 4));
		game.addFrame(new Frame(5, 5));
		
		assertEquals(game.score(), 39);
	}

	@Test
	public void verifyBowlingGame_Frames_5_Score_59() throws BowlingException {
		BowlingGame game = new BowlingGame();

		game.addFrame(new Frame(1, 4));
		game.addFrame(new Frame(4, 5));
		game.addFrame(new Frame(6, 4));
		game.addFrame(new Frame(5, 5));
		game.addFrame(new Frame(10, 0));
		
		assertEquals(game.score(), 59);
	}

	@Test
	public void verifyBowlingGame_Frames_6_Score_61() throws BowlingException {
		BowlingGame game = new BowlingGame();

		game.addFrame(new Frame(1, 4));
		game.addFrame(new Frame(4, 5));
		game.addFrame(new Frame(6, 4));
		game.addFrame(new Frame(5, 5));
		game.addFrame(new Frame(10, 0));
		game.addFrame(new Frame(0, 1));
		
		assertEquals(game.score(), 61);
	}

	@Test
	public void verifyBowlingGame_Frames_7_Score_71() throws BowlingException {
		BowlingGame game = new BowlingGame();

		game.addFrame(new Frame(1, 4));
		game.addFrame(new Frame(4, 5));
		game.addFrame(new Frame(6, 4));
		game.addFrame(new Frame(5, 5));
		game.addFrame(new Frame(10, 0));
		game.addFrame(new Frame(0, 1));
		game.addFrame(new Frame(7, 3));
		
		assertEquals(game.score(), 71);
	}

	@Test
	public void verifyBowlingGame_Frames_8_Score_87() throws BowlingException {
		BowlingGame game = new BowlingGame();

		game.addFrame(new Frame(1, 4));
		game.addFrame(new Frame(4, 5));
		game.addFrame(new Frame(6, 4));
		game.addFrame(new Frame(5, 5));
		game.addFrame(new Frame(10, 0));
		game.addFrame(new Frame(0, 1));
		game.addFrame(new Frame(7, 3));
		game.addFrame(new Frame(6, 4));
		
		assertEquals(game.score(), 87);
	}
	
	@Test
	public void verifyBowlingGame_Frames_10_Score_133() throws BowlingException {
		BowlingGame game = new BowlingGame();

		game.addFrame(new Frame(1, 4));
		game.addFrame(new Frame(4, 5));
		game.addFrame(new Frame(6, 4));
		game.addFrame(new Frame(5, 5));
		game.addFrame(new Frame(10, 0));
		game.addFrame(new Frame(0, 1));
		game.addFrame(new Frame(7, 3));
		game.addFrame(new Frame(6, 4));
		game.addFrame(new Frame(10, 0));
		game.addFrame(new Frame(2, 8));
		
		game.setBonus(6, 0);
		
		assertEquals(game.score(), 133);
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
