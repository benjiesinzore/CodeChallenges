package CodingChallenges;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class JavaAgeCounting {

    public static String getAge(String strURL){
        String returnValue = "";



        try {
            URL url = new URL(strURL);
            try {
                URLConnection connection = url.openConnection();
                InputStream inputStream = connection.getInputStream();
                returnValue = inputStream.toString();
            } catch (IOException ee){
                ee.printStackTrace();
            }
        } catch (IOException ee) {
            ee.printStackTrace();
        }

        return returnValue;
    }

    public static void main(String[] arg){
        String url = "https://coderbyte.com/api/challenges/json/age-counting";
        System.out.println(getAge(url));
    }
}
