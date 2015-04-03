package hackathons;

public class Round {
	    private int attackTime;  
	    private int roundId;
	    Player firsttAttacker;
	    Player secondAttacker;
	
	    private void printInfo(){
	    	System.out.println("Round :"+roundId);
	    }

	    public Round(Player player1, Player player2, int roundId) {
			// TODO Auto-generated constructor stub
	    	this.roundId = roundId;
			printInfo();
			roll(player1,player2);
	    	
		}

		public void start(){

	    	while(firsttAttacker.getAttack() > attackTime || secondAttacker.getAttack() > attackTime){ 
	    		if(firsttAttacker.getAttack() > attackTime){
	    			firsttAttacker.attack(secondAttacker);
	    			if(secondAttacker.getHealth() < 0){
	    				break;
	    			}
	    		}
	    		if(secondAttacker.getAttack() > attackTime){
	    			secondAttacker.attack(firsttAttacker);
	    			if(firsttAttacker.getHealth() < 0){
	    				break;
	    			}
	    		}
	    		attackTime ++;
	    	}
	    }

		private void  roll(Player player1, Player player2){
			int roll1 = player1.roll();
			int roll2 = player2.roll();
			
			if(roll1 > roll2){
	    	  	firsttAttacker = player1;
	    	  	secondAttacker = player2;
	    	 } else {
	    	 	firsttAttacker = player2;
	    	 	secondAttacker = player1;
	    	 }
			System.out.println("Candidate :"+firsttAttacker.getName()+" is randomly selected to go first");
		}
}
