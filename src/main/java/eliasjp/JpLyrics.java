package eliasjp;

public class JpLyrics {

	 private String songName;
	 private String AlbumName;
	 private String artistName;

	 public String getSongName() {
		  return songName;
	 }

	 public void setSongName(String songName) {
		  this.songName = songName;
	 }

	 public String getAlbumName() {
		  return AlbumName;
	 }

	 public void setAlbumName(String albumName) {
		  AlbumName = albumName;
	 }

	 public String getArtistName() {
		  return artistName;
	 }

	 public void setArtistName(String artistName) {
		  this.artistName = artistName;
	 }


	 public String toString(){
	 	 return " songname:  "+this.songName + "  albumname : " + this.AlbumName + "   artistname: "+ this.artistName;
	 }
}
