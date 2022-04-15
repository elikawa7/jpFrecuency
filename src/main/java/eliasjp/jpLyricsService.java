package eliasjp;

import file.FileForJp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class jpLyricsService {

	 public List<JpLyrics> getJpLyrycsfromSaverFile(String saver_loc)throws IOException {
		  List<JpLyrics> jpLyricsList = new ArrayList<>();
		  BufferedReader br = new BufferedReader(new FileReader(saver_loc));
		  String line;
		  while ((line = br.readLine()) != null) {
			   jpLyricsList.add(getJplyricsFromString(line));
		  }

		  return jpLyricsList;
	 }
	 public void saveOnFile(List<JpLyrics> listlyrics, String saver_loc) throws IOException {
		  Iterator<JpLyrics> it = listlyrics.iterator();
		  StringBuilder builder = new StringBuilder();
		  while(it.hasNext()){
			   JpLyrics jp = it.next();
			   builder.append(getStringFromJplyrics(jp));
			   builder.append("\n");
		  }
		  FileForJp.dumpAllOnFile(builder.toString(), saver_loc);

	 }

	 private String getStringFromJplyrics(JpLyrics jp){
		  return jp.getSongName()+","+jp.getAlbumName()+","+jp.getArtistName();
	 }
	 private JpLyrics getJplyricsFromString(String line){
		  String[] parts = line.split(",");
		  JpLyrics newJp = new JpLyrics();
		  newJp.setSongName(parts[0]);
		  newJp.setAlbumName(parts[1]);
		  newJp.setArtistName(parts[2]);
		  return newJp;
	 }
}
