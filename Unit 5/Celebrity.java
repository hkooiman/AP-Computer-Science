/**
 * Celebrity base class for the Celebrity game.
 * @author cody.henrichsen
 * @version 1.4 17/09/2018
 */
public class Celebrity
{
	/**
	 * The clue to determine the celebrity
	 */
	private String clue;
	private String help;
	private static int clueNumber;
	/**
	 * The answer or name of the celebrity.
	 */
	private String answer;

	/**
	 * Creates a Celebrity instance with the supplied answer and clue
	 * @param answer
	 * @param clue
	 */
	public Celebrity(String gAnswer, String gClue, String ghelp)
	{
        clue = gClue;
        answer = gAnswer;
		help = ghelp;

	}

	/**
	 * Supplies the clue for the celebrity
	 * @return
	 */
	public String getClue()
	{
		clueNumber++;

		if (clueNumber == 1)
		return clue;
		else 
		return help;

	
	}

	public Celebrity chooseCelebrity()
	{
		int chooser = (int) Math.random() * 7
		if (chooser > 3)
		return c1;
		else
		return c2;
	}

	/**
	 * Supplies the answer for the celebrity.
	 * @return
	 */
	public String getAnswer()
	{
		return answer;
	}


	/**
	 * Updates the clue to the provided String.
	 * @param clue The new clue.
	 */
	public void setClue(String newClue)
	{
		clue = newClue;
	}

	/**
	 * Updates the answer to the provided String.
	 * @param answer The new answer.
	 */
	public void setAnswer(String newAnswer)
	{
		answer = newAnswer;
	}
	
	/**
	 * Provides a String representation of the Celebrity.
	 */
	@Override
	public String toString()
	{
		return "Celebrity: " + answer + ". Clue: " + clue;
	}
	
}

class TesterClass
{
    public static void main(String[] args)
    {
		Celebrity c1 = new Celebrity("Anne Hathaway", "Starred in the Princess Diaries.", "This actress was the lead in Devil Wears Prada.");
		Celebrity c2 = new Celebrity("Dwayne Johnson", "An actor that has starred in MANY action movies", "nick-named 'The Rock'");
		System.out.println(c1);
		System.out.println(c1.getAnswer());
		System.out.println(c1.getClue());
		System.out.println(c1.getClue());
	}
}