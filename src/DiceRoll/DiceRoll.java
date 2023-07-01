package DiceRoll;
import java.util.Random;

/**
 * Rolls a dice 20 times and stores the results.
 */
public class DiceRoll
{
	private static final int listSize = 20;
	private int[] rollList = new int[listSize];
	public int start, end, count;

	/**
	 * Constructs a DiceRoll object.
	 */
	public DiceRoll()
	{
		Random rand = new Random();
		for(int i=0; i<DiceRoll.listSize; i++)
		{
			this.rollList[i] = rand.nextInt(6) + 1;
		}
	}
	
	/**
	 * Prints out the dice roll sequence formatting the longest run.
	 * @return String containing formatted roll sequence.
	 */
	public String printRollSequence()
	{
		this.findRun();
		String rollSequence = "";
		for(int i=0; i<DiceRoll.listSize; i++)
		{
			if(i == this.start & count > 1)
				rollSequence += "(" + this.rollList[i] + " ";
			else if(i == this.end & count > 1)
				rollSequence += this.rollList[i] + ") ";
			else if(i == listSize-1)
				rollSequence += this.rollList[i];
			else
				rollSequence += this.rollList[i] + " ";
		}
		return rollSequence;
	}
	
	/**
	 * Finds the location of the longest consecutive run in the array.
	 */
	private void findRun()
	{
		int runStart = 0;
		int runEnd = 0;
		int runCount = 1;
		int start = 0;
		int end = 0;
		int count = 1;
		for(int i=0; i<DiceRoll.listSize-1; i++)
		{
			if(this.rollList[i] == this.rollList[i+1])
			{
				runCount++;
				runEnd++;
			}
			else
			{
				if(runCount > count)
				{
					start = runStart;
					end = runEnd;
					count = runCount;
				}
				else
				{
					runStart = i+1;
					runEnd = i+1;
					runCount = 1;
				}
			}
		}
		this.start = start;
		this.end = end;
		this.count = count;
	}
}