package class23;

public class WebDriver {

    public void startBrowser(){
        System.out.println("starting the browser");
    }
    public  void openURL(){
        System.out.println("opening a url");
    }
    public void testLoginPage(){
        System.out.println("checking if login page works");
    }
    public  void closeBrowser(){
        System.out.println("closing the browser");
    }
}

class Chrome extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting Google Chrome");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the url in Google Chrome");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google Chrome");
    }
}
class Safari extends WebDriver{

    @Override
    public void startBrowser() {
        System.out.println("Opening Safari");
    }

    @Override
    public void openURL() {
        System.out.println("Opening url in Safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing in Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Safari");
    }
}

class FireFox extends WebDriver{

    @Override
    public void startBrowser() {
        System.out.println("Opening the FireFox");
    }

    @Override
    public void openURL() {
        System.out.println("Opening url in FireFox");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing in FireFox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the FireFox");
    }
}