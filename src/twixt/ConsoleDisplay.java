package twixt;
/* @(#)ConsoleDisplay.java
 */
/**
 *
 *
 * @author <a href="mailto:lemaguer@">Sébastien Le Maguer</a>
 */

public class ConsoleDisplay implements Display
{
  
	/**
	 *  Method called before AI execution
	 *
	 */
	public void prepareAICall()
	{
	}

	
	/**
	 *  Method called after AI execution
	 *
	 */
	public void finishAICall()
	{
	}

	/**
	 *  Method to display the adding tower
	 *
	 *  @param p the tower's coordinates
	 */
	public void addPoint(int[] p)
	{
		System.out.println("Ajout du point (" + p[0] + ", " + p[1] + ")");
	}

	/**
	 *  Method to display a win message
	 *
	 *  @param player the id of the winning player
	 */
	public void wonMessage(int playerIndex, Player player)
	{
		
		System.out.println("==> " + player.getName() + " (player " + playerIndex + ") wins!");
	}

	/**
	 *  Method to display a draw message
	 *
	 */
	public void drawMessage()
	{
		System.out.println("==> Draw game.\n");
	}
}
