import java.util.ArrayList;
import java.util.List;

public class OliObj extends DevIntern {
    private String name;
    private int age;
    private String hometown;
    private List<String> factList;
    private List<String> interestList;


    public OliObj()
    {
        this.name = "Oliver Pope (just call me Oli!)";
        this.age = 22;
        this.hometown = "Perth";
        this.factList = new ArrayList<>();
        this.interestList = new ArrayList<>();
        intialiseFactList();
        intialiseInterestList();
    }

    public void intialiseFactList()
    {
        factList.add("Fact1: When I attended primary school at Moorine Rock there was roughly 40 kids total at the school.");
        factList.add("Fact2: My bus commute was just under an hour and was about a 60km trip one way.");
        factList.add("Fact3: From years 3 through to years 7, I was actually the only student in my year group... (the first few days of boarding school in Perth were a bit of a shock)");
        factList.add("Fact4: During my time at boarding school I walked the Bibbulmun track, which is a 1003km hiking trail from Perth -> Albany");
        factList.add("Fact5: I was a snare drummer in a Pipe band for a couple of years.");
        factList.add("Fact6: One of my dogs at the farm got sick and appeared to have been bitten by a snake, " +
                "so I started driving him to the nearest vet (Murdoch Vet 400km away) at 9pm at night, hit a kangaroo and subsequently " +
                "totalled my car, had to run 1km to the top of a hill to get 1 bar of phone signal (reception isnt great in country WA) to call the neighbour to come pick me up. " +
                "When we got back to the farm the dog was fine (i.e clearly wasn't bitten by a snake) and the next day the insurance company " +
                "told me my car was a write off :D");
    }

    public void intialiseInterestList()
    {
        interestList.add("Interest 1: The technology evolving within the agriculture sector is pretty cool there's lots of potential for automation and big data applications.");
        interestList.add("Interest 2: I enjoy my gaming; " +
                                "\n-COD" +
                                "\n-Minecraft" +
                                "\n-Cheeky League of Legends (though im probably the bottom 100 in the world unlike Intern Tony)" +
                                "\n-Crash Bandicoot" +
                                "\nand I also enjoy watching people play games, shout out to Doctor Disrespect");
        interestList.add("Interest 3: I also enjoy my music. My Dad is a big rock and roll fan so most of the classic artists from the 80s are ingrained into my brain." +
                "The long car rides to and from Perth also meant plenty of So-Fresh Compilations being played (hopefully that means something to a few of you)." +
                " My Mum used to play the bagpipes so every now and then she would slip the Hottest Pipeband hits from Edinburgh Tattoo into the mix, " +
                "and my Grandad used to play in the WA Symphony Orchestra. " +
                "This evidently led to me having a pretty broad taste in music, so live gigs and festivals are always on my to do list");

    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHometown(){
        return hometown;
    }

    public List<String> getFactList(){
        return factList;
    }

    public List<String> getInterestList(){
        return interestList;
    }

    public String getLocationInDepth()
    {
        return  "\nI grew up on my Parents mixed livestock-cropping farm which is south of the really really small town Moorine rock in Western Australia (maybe look it up on google maps)." +
                "\n-Livestock: around 3000 Merino sheep (for wool and meat)" +
                "\n-Cropping: Wheat, Barley, Oats, Canola." +
                "\nIts about 400ish km east of Perth, which is around a 4 hour drive (about the same time it takes to fly from Perth to Sydney)." +
                "\nMoorine Rock as a town is tiny... basically only a primary school, tennis club, pub and a post office and a few random local houses.";
    }
}
