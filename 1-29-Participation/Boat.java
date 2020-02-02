
class Boat {
	int num_goats ;
	int num_wolves;

	Boat() { num_goats=0;num_wolves = 0;};
	public synchronized void board_goat() {
 	  num_goats++;
	}
	public synchronized void board_wolf() {
 	  num_wolves++;
	}
}


