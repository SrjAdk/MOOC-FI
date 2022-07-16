
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        
        if (!(compared instanceof Song)){
            return false;
        }
        
        
        Song compared1 = (Song) compared;
        if((this.artist.equals(compared1.artist)&&this.name.equals(compared1.name)&&this.durationInSeconds==(compared1.durationInSeconds))){
            return true;
        }
        
        return false;
        
    }
            
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
