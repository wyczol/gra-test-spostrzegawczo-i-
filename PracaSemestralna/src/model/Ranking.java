package model;

public class Ranking {
	
	private Integer nrWRankingu;
	private String nick;
	private Integer result;
	private Integer liczbaTestow;
	private Integer time;
	private Integer liczbaBledow;
	private Integer data;
	
	
	
	
	
	public Ranking (Integer nrWRankingu, String nick, Integer result, Integer liczbaTestow, Integer time, Integer liczbaBledow,
			Integer data){
		this.nrWRankingu = nrWRankingu;
		this.nick = nick;
		this.result = result;
	
		this.liczbaTestow = liczbaTestow;
		this.time = time;
		this.liczbaBledow = liczbaBledow;
	}



	public Integer getNrWRankingu() {
		return nrWRankingu;
	}



	public void setNrWRankingu(Integer nrWRankingu) {
		this.nrWRankingu = nrWRankingu;
	}



	public String getNick() {
		return nick;
	}



	public void setNick(String nick) {
		this.nick = nick;
	}



	public Integer getResult() {
		return result;
	}



	public void setResult(Integer result) {
		this.result = result;
	}



	public Integer getLiczbaTestow() {
		return liczbaTestow;
	}



	public void setLiczbaTestow(Integer liczbaTestow) {
		this.liczbaTestow = liczbaTestow;
	}



	public Integer getTime() {
		return time;
	}



	public void setTime(Integer time) {
		this.time = time;
	}



	public Integer getLiczbaBledow() {
		return liczbaBledow;
	}



	public void setLiczbaBledow(Integer liczbaBledow) {
		this.liczbaBledow = liczbaBledow;
	}



	public Integer getData() {
		return data;
	}



	public void setData(Integer data) {
		this.data = data;
	}

}
