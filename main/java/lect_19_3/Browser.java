package lect_19_3;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

public class Browser
{
    public Optional<URL> back()
    {
        Optional<URL> back;
        //simulate: fetch last URL from Stack
        try{
            back = Math.random() < 0.5 ? Optional.of(new URL("http://google.de")) : Optional.empty();
        }
        catch(MalformedURLException e){
            back = Optional.empty();
        }
        return back;
    }
    public String retrieveSite(URL url)
    {
//simulate download site:
        return url.toString();
    }
    public static void main(String[] args)
    {
        System.out.println("Normal back");
        Browser browser = new Browser();
        Optional<URL> back = browser.back();
        String url;
        if(back.isPresent()){
            url = browser.retrieveSite(back.get());
            System.out.println(url);
        }
    }
}
