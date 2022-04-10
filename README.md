# JpKanjiFrecuency

This library allows you to do a simple Kanji frecuency list. 




## Badges

Add badges from somewhere like: [shields.io](https://shields.io/)

[![MIT License](https://img.shields.io/apm/l/atomic-design-ui.svg?)](https://github.com/tterb/atomic-design-ui/blob/master/LICENSEs)



## Usage/Examples

```java

		  JpKanjiFrecuency jp = new JpKanjiFrecuency(); 
		  jp.addKanjiFromString("「ねぇねぇ。なにブツブツ言ってるのー？」"+	
      "「ねぇねぇ。なにブツブツ 言[い]ってるのー？」"+
      "		Hey what are you mumbling about?	[sound:MAY_0000.mp3]		1	？？？	Mayuri?"); //you can add a string with kanjis, english, whatever, 
//it will filter out the kana and kanjis only 
		  jp.doFrecuency();
		  jp.doSorting();
		  List<KanjiFrecuency> kanjiFrecuencies = jp.getKanjiFrecuencyList();
	 	 
	 	 //do stuff with the kanjis
```


## Authors

- [@elikawa7 (https://www.github.com/elikawa7)

