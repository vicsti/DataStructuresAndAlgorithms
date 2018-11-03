package astroid;

class Asteroid {
	  public final int mass;
	  public final int direction;
	  public Asteroid(int mass, int direction) {
	    this.mass = mass;
	    this.direction = direction;
	  }

	  public int getMass() {
	    return this.mass;
	  }

	  public int getDirection() {
	    return this.direction;
	  }

	  public String toString() {
	    return "Asteroid(" + mass + ", " + direction + ")";
	  }
	}
