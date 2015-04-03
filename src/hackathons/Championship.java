package hackathons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Championship {
  	ArrayList<Player> players = new ArrayList<Player>();

	public Championship(ArrayList<List> data) {
		// TODO Auto-generated constructor stub
		
		for(int i = 0 ; i < data.size() ; i++){
			Player p = new Player(data.get(i));
			players.add(p);
		}
	}

	public void  start(){
  		int totalMatch = players.size() - 1;
  		for(int i = 0 ; i < totalMatch -1  ;i++){ 
  			for(int j = i+1; j < totalMatch ; j++){ 
  				Match match = new Match(players.get(i),players.get(j));
  				match.start();
  			}
  		}
  	}
	
	public void  printInfo(){
  		int totalMatch = players.size() ;
  		
  		 
		Collections.sort(players, new Comparator<Player>() {
		    public int compare(Player player1, Player player2) {
		        return player2.getWinMatch() - player1.getWinMatch();
		    }
		});
  		for(int i = 0 ; i < totalMatch   ;i++){ 
  			System.out.println(players.get(i).getName()+": "+ players.get(i).getWinMatch());
  		}
  		System.out.println("---------------------------------------------------");
  		System.out.println("Champion: "+players.get(0).getName());
  	}

}
