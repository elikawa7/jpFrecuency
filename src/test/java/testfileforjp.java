import file.FileForJp;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class testfileforjp {



	 @Test
	 public void testfiles(){
		  //steps
		  /*
		  		1- get tje files
		  		2- merge all of them into 1
		  		3- put the info into the jpWordFrecuency
		  		4- get the frecuency and put it on a human readable file.
		   */
	 	 //try{
			   String path = "C:\\Users\\Rodolfo Elias\\Desktop\\JpMusicLyrics\\";
			   FileForJp jpf = new FileForJp(path);
			   jpf.loadfilesfrompath();
			 //  List<String> listofstring = jpf.readAllFiles();

			  // for (String content : listofstring) {
					//FileForJp.appendtofile(content+"\n", path+"finalarch.txt");
					System.out.println(jpf.countfiles());
			   //}
		  //}catch(IOException e){
	 	 	 //e.printStackTrace();
		  //}

	 }



}
