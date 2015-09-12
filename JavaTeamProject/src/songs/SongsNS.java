package songs;

public class SongsNS {
	
	private String artist;
	private String name;
	private int duration;
	
	public String getArtist(){
		return this.artist;
	}
	
	public void setArtist(String newartist){
		this.artist = newartist;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String newname){
		this.name = newname;
	}
	
	public int getDuration(){
		return this.duration;
	}
	
	public void setDuration(int newduration){
		this.duration = newduration;
	}
}


//"Artist": "Sting",
//"Name": "Space",
//"Duration": "241"