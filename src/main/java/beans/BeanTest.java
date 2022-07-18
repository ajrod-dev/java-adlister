package beans;

import java.util.ArrayList;
import java.util.Date;

public class BeanTest {
    public static void main(String[] args) {
        Artist metallica1 = new Artist(1,"Metallica", true,"english");
        Album album1 = new Album(1, metallica1,"Master of Puppets", new Date(1986), 90, "metal");

        Author fitzgerald = new Author(1, "Francis", "Fitzgerald");
        Quote gatsby = new Quote(1, "It takes two to make an accident.", fitzgerald);

        Author hemingway = new Author(2,"Ernest", "Hemingway");
        Quote ernestH = new Quote(2,"There is nothing to writing. All you do is sit down at a typewriter and bleed.", hemingway);

        Author vonnegut = new Author(3, "Kurt", "Vonnegut");
        Quote kurtV = new Quote(3,"We are what we pretend to be, so we must be careful about what we pretend to be.", vonnegut);

        ArrayList<Quote> quotesList = new ArrayList<>();
        quotesList.add(gatsby);
        quotesList.add(ernestH);
        quotesList.add(kurtV);

        for(Quote quote : quotesList){
            System.out.printf("Quote: " + quote.getContent() + "\nAuthor: " + quote.getAuthor().getFirstName() + " " + quote.getAuthor().getLastName() + "\n\n");
        }

    }


}
