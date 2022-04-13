# JpFrecuency

This library allows you to do a simple Kanji/han frecuency list and Word Frecuency. 
by the way, I'm just a novice, and i'm learning on the fly so if you can point out where i'm making mistakes and how can i improve the code. it will be well received. 
This is a personal project to solve my needs in my learning process of the japanese language. And improve my coding skills at the same time. 


## To do list
    -Make the code works -- DONE
    -Learn pattern designs and good practices -- In process
    -Improve the code -- Not yet

## License
[![MIT License](https://img.shields.io/apm/l/atomic-design-ui.svg?)](https://github.com/tterb/atomic-design-ui/blob/master/LICENSEs)



## Usage/Examples

```java

//for kanji frecuency
JpKanjiFrecuency jp = new JpKanjiFrecuency(); 
jp.addKanjiFromString("「ねぇねぇ。なにブツブツ言ってるのー？」"+	
      "「ねぇねぇ。なにブツブツ 言[い]ってるのー？」"+
      "		Hey what are you mumbling about?	[sound:MAY_0000.mp3]		1	？？？	Mayuri?"); //you can add a string with kanjis, english, whatever, 
//it will filter out the kana and kanjis only 
jp.doFrecuency();
jp.doSorting();
List<KanjiFrecuency> kanjiFrecuencies = jp.getKanjiFrecuencyList();
	 	 /*result expected:
         		 	言 == 2 
                 */
----------------------------------------------------------------------------------------------------------------------------------------------------------------------
JpWordFrecuency jpWordFrecuency = new JpWordFrecuency();
jpWordFrecuency.addJpString("ウクライナ軍ぐんは11日にち、「ロシア軍ぐんがマリウポリで兵士へいしや市民しみんに毒どくが入はいった物質ぶっしつを使つかった。息いきが苦くるしくなっている人ひとがいる」などとインターネットに書かきました。\n" +
         				 "\n" +
         				 "ロシアの通信社つうしんしゃは11日にち、ウクライナでロシアと一緒いっしょに戦たたかっているグループが「鉄てつを作つくる工場こうじょうにウクライナの兵士へいしが4000人にんぐらいいる。化学かがく兵器へいきを使つかう軍ぐんがウクライナの兵士へいしたちを外そとに出だす方法ほうほうを見みつけるだろう」と言いって、化学かがく兵器へいきを使つかう可能性かのうせいについて話はなしたと伝つたえました。\n" +
         				 "\n" +
         				 "マリウポリの市長しちょうは「市民しみんが2万まん人にん以上いじょう亡なくなりました。今いまも10万まん人にんぐらいが逃にげることができないで残のこっています。ロシア軍ぐんは、市しの外そとに向むかうバスや車くるまに戻もどるように命令めいれいして、逃にげることができないようにしています」と言いいました。");

//For japanese word frecuency 
jpWordFrecuency.tokenizeAddedWords();
jpWordFrecuency.doJpWordFrecuency();
jpWordFrecuency.doSorting();
List<JpToken> jpTokens = jpWordFrecuency.getFrecuencyTokens();
for(JpToken jp : jpTokens){
        System.out.println(jp.getWord() + " == "+jp.getFrecuency());
} 

/*
     result expected: 
          に == 11
          が == 9
          た == 7
          。 == 7
          と == 7
          し == 6
          を == 6
          の == 6
          、 == 5
          へ == 5
          て == 5
          ん == 5
          ウクライナ == 4
          軍 == 4
          ロシア == 4
          は == 4
          いる == 4
          人 == 4
          まし == 4
          「 == 3
          で == 3
          兵士 == 3
          いし == 3
          使 == 3
          いき == 3
          」 == 3
          い == 3
          ぐんは == 2
          11 == 2
          日にち == 2
          ぐんが == 2
          マリウポリ == 2
          や == 2
          市民 == 2
          みん == 2
 */

		 
		 
		 
		 
		 
```


## Authors

- [@elikawa7] (https://www.github.com/elikawa7)


