import java.util.ArrayList;
import java.util.List;

//Finish time:
//ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame) throws BowlingException{
		if (frames.size() >= 10)
			throw new BowlingException();
		
		frames.add(frame);
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) throws BowlingException {
		if (frames.size() != 10)
			throw new BowlingException();
		
		bonus = new Frame(firstThrow, secondThrow);
	}
	
	// Returns the game score
	public int score(){
		int score = 0;
		
		for (int i = 0; i < frames.size(); i++) {
			Frame frame = frames.get(i);
			score += frame.getScore();
			
			if ((i == frames.size() - 1) && (frame.isSpare() && frame.isStrike())) {
				if (bonus != null) score += bonus.score();
				
			} else if (i + 1 < frames.size()) {
				Frame nextFrame = frames.get(i + 1);
				score += nextFrame.getFirstThrow();
				
			} else if (frame.isStrike()) {
				Frame nextFrame = frames.get(i + 1);
				score += nextFrame.getFirstThrow() + nextFrame.getSecondThrow();
			}
		}
		
		return score;
	}
}
