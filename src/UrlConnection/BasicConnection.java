package UrlConnection;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Dylan on 17/02/2015.
 */
public class BasicConnection {

    public URLConnection connectToWebAddress(String address) {
        URLConnection myURLConnection = null;
        try {
            URL myURL = new URL(address);
            myURLConnection = myURL.openConnection();
            myURLConnection.connect();
        }
        catch (MalformedURLException e) {
            System.out.println(e);
        }
        catch (IOException e) {
            System.out.println(e);
        }
        return myURLConnection;
    }

}
