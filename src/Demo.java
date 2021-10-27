import java.io.IOException;
import java.util.List;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Whitelist;
import org.jsoup.select.Elements;

import javax.print.Doc;
import javax.swing.text.html.parser.DocumentParser;

public class Demo {
	public static void main(String[] args) throws IOException {
		Document.OutputSettings outputSettings = new Document.OutputSettings();
		outputSettings.prettyPrint(false);
	//	jsoupDoc.outputSettings(outputSettings);
		//jsoupDoc.select("br").before("\\n");
	//	jsoupDoc.select("p").before("\\n");

//		String html = "<html><head><title>First parse</title></head>"
//				+ "<body><p>Parsed HTML into a doc.</p></body></html>";
		OutputSettings settings = new OutputSettings();
		settings.prettyPrint(false);	 
		Document doc = Jsoup.connect("https://ais.usvisa-info.com/en-ar/niv/information/faqs").get();		
		List<String> doc1 = doc.getAllElements().eachText();	
	//	List<String> doc1 = doc.getAllElements().eachText();	
	for (String element : doc1) {
		    System.out.println(element);
		}
	}
}
////		//System.out.println(doc1);		
//	//	System.out.println(doc.getAllElements().text());	
//		//System.out.println(doc.getElementsByTag("title").text());
//		Document doc = Jsoup.connect("https://ais.usvisa-info.com/en-ar/niv/information/faqs").get();
//	
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
		//	Elements element = doc.select(cssQuery:"div.card faq-group general-questions");
		//	Element elements = doc.select("div.card faq-group general-questions").first();
			
