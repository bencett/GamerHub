package Entities;
import java.time.LocalDate;

public class Player implements IEntity{
	private int playerId;
	private String nationalityId;
	private String playerFirstName;
	private String playerLastName;
	private LocalDate dateOfBirth;
	
	public Player() {
		
	}
	
	public Player(int playerId, String nationalityId, String playerFirstName, String playerLastName,LocalDate dateOfBirth) {
		this.playerId = playerId;
		this.nationalityId = nationalityId;
		this.playerFirstName = playerFirstName;
		this.playerLastName = playerLastName;
		this.dateOfBirth = dateOfBirth;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getPlayerFirstName() {
		return playerFirstName;
	}

	public void setPlayerFirstName(String playerFirstName) {
		this.playerFirstName = playerFirstName;
	}

	public String getPlayerLastName() {
		return playerLastName;
	}

	public void setPlayerLastName(String playerLastName) {
		this.playerLastName = playerLastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
