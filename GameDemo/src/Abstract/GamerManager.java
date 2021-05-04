package Abstract;

import Entities.Gamer;

public interface GamerManager {
	
	void save(Gamer gamer);
	void delete(Gamer gamer);
	void update(Gamer gamer);

}
