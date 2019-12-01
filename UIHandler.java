
public class UIHandler {
    private DevIntern oli;
    private IOHandler io;

    public UIHandler(DevIntern inOli, IOHandler inIO)
    {
        this.oli = inOli;
        this.io = inIO;
    }

    public void initialMenu() throws InterruptedException
    {
        int choice = -1;
        while(choice != 6)
        {
            outputMenu();
            choice = io.validateInput(1,6);

            switch(choice)
            {
                case 1:
                    basicInformation();
                    break;
                case 2:
                    whereImFrom();
                    break;
                case 3:
                    funFacts();
                    break;
                case 4:
                    interests();
                    break;
                case 5:
                    attlassian();
                    break;
                case 6:
                    printEffect1();
                    System.out.println("\n|--------Thanks for running my blog app :D --------|");
            }
        }
    }

    public void startBlog()
    {
        try
        {
            initialMenu();
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void output(String outputStr)
    {
        try
        {
            for(int i = 0; i < outputStr.length(); i++)
            {
                System.out.print(outputStr.charAt(i));
                Thread.sleep(50);
            }
            Thread.sleep(800);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }


    public void basicInformation() throws InterruptedException
    {
        System.out.println("\n\n|--------------------Basic Information:");
        output("\nMy name: " + oli.getName());
        output("\nMy age: " + oli.getAge());
        output("\nHometown: " + oli.getHometown());
    }

    public void funFacts() throws InterruptedException
    {
        System.out.print("\n\n|--------------------Fun Facts:");
        for(String fact: oli.getFactList())
        {
            output("\n" + fact);
        }
    }

    public void whereImFrom() throws InterruptedException
    {
        System.out.print("\n\n|--------------------Where im from:");
        output(oli.getLocationInDepth());
    }

    public void interests() throws InterruptedException
    {
        System.out.print("\n\n|--------------------Interests:");
        for(String interest: oli.getInterestList())
        {
            output("\n" + interest);
        }
    }

    public void attlassian() throws InterruptedException
    {
        System.out.println("\n\n|--------------------Atlassian Internship:");
        output("\nMy team: " + oli.getTeam());
        output("\nMy building: " + oli.getBuilding());
        output("\nMy floor: " + oli.getFloor());
        output("\nThis is my first internship experience in the tech industry so admittedly this first week has been overwhelming, super interesting and really fun at the same time.");
        output("\nEveryone is great to work with and seemingly understanding when they ask me a question and they just get a '...uhhh' in response");
        output("\nVery keen to get stuck into more learning over the next couple of months");
    }

    //I love print statements XD
    public void printEffect1() throws InterruptedException
    {
        System.out.println("-*-");
        Thread.sleep(50);
        System.out.println("    *");
        Thread.sleep(50);
        System.out.println("        -*-");
        Thread.sleep(50);
        System.out.println("            *");
        Thread.sleep(50);
        System.out.println("        -*-");
        Thread.sleep(50);
        System.out.println("    *");
        Thread.sleep(50);
        System.out.println("-*-");
        Thread.sleep(50);
        System.out.println("            *");
        Thread.sleep(50);
        System.out.println("        -*-");
        Thread.sleep(50);
        System.out.println("    *");
        Thread.sleep(50);
        System.out.println("-*-");
        Thread.sleep(50);
        System.out.println("    *");
        Thread.sleep(50);
        System.out.println("        -*-");
        Thread.sleep(50);
        System.out.println("            *");
    }

    public void outputMenu()throws InterruptedException
    {
        System.out.println("\n\n\n|-------------------- Oli's Blog :) --------------------|");
        Thread.sleep(100);
        System.out.println("\nPlease choose one of the following options:");
        Thread.sleep(25);
        System.out.println("(1) Basic Information");
        Thread.sleep(25);
        System.out.println("(2) Where Im From");
        Thread.sleep(25);
        System.out.println("(3) Fun Facts") ;
        Thread.sleep(25);
        System.out.println("(4) My Interests");
        Thread.sleep(25);
        System.out.println("(5) Atlassian");
        Thread.sleep(25);
        System.out.println("(6) Exit");
        System.out.println("\n|-------------------------------------------------------|");
    }
}


