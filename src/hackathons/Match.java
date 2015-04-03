package hackathons;

public class Match {
	Player player1;
	Player player2;
	
	int roundId = 1;
	public Match(Player player1, Player player2) {
		// TODO Auto-generated constructor stub
		this.player1 = player1;
		this.player2 = player2;
		this.player1.setHealth(this.player1.getMaxHealth());
		this.player2.setHealth(this.player2.getMaxHealth());
		player1.printInfo();
		player2.printInfo();

	}
	public void start(){
		System.out.println("----------------------match start--------------------");
		while(player1.getHealth() >=0 && player2.getHealth() >=0){
			Round round = new Round(player1,player2,roundId);
			round.start();
			roundId ++;
		}
	}

}
