package eliasjp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Playlist_CSV {

	 private String location;
	 public Playlist_CSV(String location){
	 	 this.location = location;
	 }

	 //parse from csv coming from exportify
	 public List<JpLyrics> parseFromFiletoJpLyrics(){
		  String line = "";
		  String splitBy = ",";
		  List<JpLyrics> list = new ArrayList<>();
		  try {
			   BufferedReader br = new BufferedReader(new FileReader(location));
			   JpLyrics jp ;
			   int count = 1;
			   while ((line = br.readLine()) != null) {
			   	 if(count == 1) {
			   	 	  count++;
					  continue;
				 }
					String[] data = line.split(splitBy);
					jp = new JpLyrics();
					jp.setSongName(data[2]);
					jp.setAlbumName(data[3]);
					jp.setArtistName(data[4]);
					list.add(jp);
			   }
		  }catch (IOException io){
		  	 io.printStackTrace();
		  }
		  return list;
	 }



}
