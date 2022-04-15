import JpWording.JpToken;
import JpWording.JpWordFrecuency;
import file.FileForJp;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Jpfrecuencytest {



	 @Test
	 public void puttingalltogether()
	 {
	 	 String nounfilter = "名詞"; //noun
	 	 String verbsfilter = "動詞";//verb
		  String particlefilter = "助詞";

		  String path = "C:\\Users\\Rodolfo Elias\\Desktop\\jpwordsource\\";
		  String path_out = "C:\\Users\\Rodolfo Elias\\Desktop\\";
		  FileForJp jpf = new FileForJp(path);
		  jpf.loadfilesfrompath();
		  int limit = jpf.countfiles();
		  List<String> jpsentences = jpf.readAllFiles(limit);
		  JpWordFrecuency jpWordFrecuency = new JpWordFrecuency();
		  for(String sentences_file: jpsentences) {
			   jpWordFrecuency.addJpString(sentences_file);
		  }
		  jpWordFrecuency.tokenizeAddedWords();
		  jpWordFrecuency.doJpWordFrecuency();
		  jpWordFrecuency.doSorting();
		  List<JpToken> finaltokens = jpWordFrecuency.getFrecuencyTokens();
		  List<JpToken> nouns = new ArrayList<>();
		  List<JpToken> verbs = new ArrayList<>();
		  List<JpToken> particles = new ArrayList<>();
		  int counter = 1;

		  //we iterate the finaltokens to separate the words
		  for(JpToken jp : finaltokens) {
		  	 //we separete into different lists
			   if (jp.getToken().getPartOfSpeechLevel1().equals(nounfilter)) {
					nouns.add(jp);
			   }else if (jp.getToken().getPartOfSpeechLevel1().equals(verbsfilter)){
			   	    verbs.add(jp);
			   }else if (jp.getToken().getPartOfSpeechLevel1().equals(particlefilter)){
			   	 particles.add(jp);
			   }
			   System.out.println(counter + ": "+jp.getWord() + " == "+jp.getFrecuency()+ " ; = "+jp.getToken().getAllFeatures());
			   counter++;
		  }
		  System.out.println("Total words : " + finaltokens.size());
		  System.out.println("dumping on file verbs and nouns and particles :3");
		  try{
		  	 dumpOnfile(nouns, path_out+"frecuencyNounslits.txt", "This is a noun list extracted from the jpmusic playlist from spotify");
		  	 dumpOnfile(verbs, path_out+"frecuencyVerbslists.txt", "this is verb frecuency list extracted from the jpmusic playlist ");
		  	 dumpOnfile(particles, path_out+"frecuencyparticlelist.txt", "this is particle frecuency list extracted from the jpmusic playlist");
		  }catch (IOException e){
		  	 e.printStackTrace();
		  }

	 }

		  private String getEnlishword(String jp){

	 	 	if(jp.equals("名詞")){
	 	 		 return "noun";
			}else if(jp.equals("動詞")){
	 	 		return "verb";
			}else if(jp.equals("助詞")){
	 	 		 return "particle";
			}

			return "No match";

		  }


		  private void dumpOnfile(List<JpToken> list, String path_Filename, String title ) throws IOException{

	 	 		Iterator<JpToken> it = list.iterator();
	 	 		StringBuilder sb = new StringBuilder();
	 	 		sb.append(title).append("\n");
			   int count = 1;
	 	 		while(it.hasNext()){
			   	 	JpToken jp = it.next();
	 	 			 sb.append(count).append("-> ").append(jp.getWord()).append(" = ").
							 append(jp.getFrecuency()).append("; ").
							 append(getEnlishword(jp.getToken().getPartOfSpeechLevel1())).append("\n");
	 	 			 count++;
				}

				FileForJp.dumpAllOnFile(sb.toString(),path_Filename);

		  }


}
