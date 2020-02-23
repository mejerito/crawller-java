/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webscrapping;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/**
 *
 * @author jesus
 */
public class Webscrapping {
 //public Ui tela = new Ui();
    /**
     * @param args the command line arguments
     */
    public void principal() {
      try {
       // Here we create a document object and use JSoup to fetch the website
       Document doc = Jsoup.connect("https://www.codetriage.com/?language=Java").get();

       // With the document fetched, we use JSoup's title() method to fetch the title
       System.out.printf("Title: %s\n", doc.title());
       //tela.setResposta("Title: ");

     // In case of any IO errors, we want the messages written to the console
     } catch (IOException e) {
       e.printStackTrace();
     
      

     // In case of any IO errors, we want the messages written to the console
     
     }
    }
    
}
