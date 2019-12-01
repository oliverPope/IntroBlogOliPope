public class App {

    public static void main(String []args)
    {
        DevIntern oli = new OliObj();
        IOHandler io = new IOHandler();
        UIHandler ui = new UIHandler(oli,io);
        ui.startBlog();
    }
}
