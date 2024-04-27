package Poketmon;

import java.util.List;
import java.util.List;

public class Place {
	public String where;
	public List<Pokemon> Pokemons;
	public List<Player> Players;
	public int numOfPokemons;
	public int numOfPlayers;
	
	public void createPokemon(Pokemon pm) {
		Pokemons.add(pm);
		numOfPokemons++;
	} // 장소에 포켓몬 생성하는 메서드
	
	public void createPlayer(Player p) {
		Players.add(p);
		numOfPlayers++;
	}; // 장소에 플레이어 생성하는 메서드
	
	public void removePokemon(int index) { // 배열의 특성 인덱스의 포켓몬 삭제 -> 삭제 후 빈 곳 없게 
		Pokemons.remove(index);
		numOfPokemons--;
	}
	
	public void removePlayer(int index) {  // 배열의 특성 인덱스의 플레이어 삭제 -> 삭제 후 빈 곳 없게 
		Players.remove(index);
		numOfPlayers--;
	}
}
