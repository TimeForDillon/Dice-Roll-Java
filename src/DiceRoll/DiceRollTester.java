package DiceRoll;
/**
 * A class to test the DiceRoll class.
 */
public class DiceRollTester
{
	public static void main(String[] args)
	{
		DiceRoll myRoll = new DiceRoll();
		System.out.println(myRoll.printRollSequence());
	}
}

/*
 * Output: 4 3 (1 1 1) 5 4 6 2 3 5 3 6 1 5 5 4 5 4 5
 * Expected: 4 3 (1 1 1) 5 4 6 2 3 5 3 6 1 5 5 4 5 4 5
 * 
 * Output: (4 4) 2 5 6 3 5 2 5 5 1 3 1 4 3 5 3 2 2 6
 * Expected: (4 4) 2 5 6 3 5 2 5 5 1 3 1 4 3 5 3 2 2 6
 * 
 * Output: 1 6 3 4 6 (2 2 2 2) 3 4 5 2 1 5 4 2 2 6 6
 * Expected: 1 6 3 4 6 (2 2 2 2) 3 4 5 2 1 5 4 2 2 6 6
 */