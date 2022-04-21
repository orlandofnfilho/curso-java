package exec21.entities;

public class Candidate implements Comparable<Candidate> {

	private String name;
	private Integer totalVotes;

	public Candidate() {

	}

	public Candidate(String name, Integer votes) {
		this.name = name;
		this.totalVotes = votes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getVotes() {
		return totalVotes;
	}

	public void setVotes(Integer votes) {
		this.totalVotes = votes;
	}

	@Override
	public int compareTo(Candidate other) {
		return -totalVotes.compareTo(other.getVotes());
	}

}
