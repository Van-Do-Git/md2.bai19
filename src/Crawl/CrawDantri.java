package Crawl;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawDantri {
    public static void main(String[] args)  {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            content = content.replaceAll("\n*", "");
            scanner.close();
            Pattern pattern = Pattern.compile("<a data-utm=\"(.*?)\">(.*?)</a>");
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()) {
                System.out.println(matcher.group(2));
            }
        }catch (Exception e){
            System.out.println("Hong tim thay");
        }
    }
}
