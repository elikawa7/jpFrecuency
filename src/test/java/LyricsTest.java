import eliasjp.JpLyrics;
import eliasjp.Playlist_CSV;
import eliasjp.jpLyricsService;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class LyricsTest {


	 @Test
	 public void testingreadingcsv(){
	 	 String playlist = "C:\\Users\\Rodolfo Elias\\Desktop\\jpmusic.csv";
		  Playlist_CSV pl = new Playlist_CSV(playlist);
		  List<JpLyrics> artists =  pl.parseFromFiletoJpLyrics();
		  System.out.println(artists.size());
		  for (JpLyrics jp: artists){
			   System.out.println(jp.toString());
		  }

	 }
	 @Test
	 public void testingserviceLyrics(){
		  String playlist = "C:\\Users\\Rodolfo Elias\\Desktop\\jpmusic.csv";
		  String root = "C:\\Users\\Rodolfo Elias\\Desktop\\";
		  Playlist_CSV pl = new Playlist_CSV(playlist);
		  List<JpLyrics> artists =  pl.parseFromFiletoJpLyrics();
		 /* jpLyricsService service = new jpLyricsService();
		  try {
			   service.saveOnFile(artists, root + "lyrcissave.txt");
			   List<JpLyrics> newList = service.getJpLyrycsfromSaverFile(root+"lyrcissave.txt");
			   for (JpLyrics jp: newList){
					System.out.println(jp.toString());
			   }
		  }catch (IOException e){
		  	 e.printStackTrace();
		  }
*/
	 }



}
