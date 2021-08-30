package concurrency;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class GetSitePage extends Thread {
    private String url;
    private String content;


    public GetSitePage(String url){
        super();
        this.url = url;
    }
    @Override
    public void run() {
        try {
            URL url = new URL(getUrl());
            URLConnection connection = url.openConnection();

            InputStream inputStream = connection.getInputStream();
        }catch (MalformedURLException error){
            error.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public String getContent() {
        return content;
    }
}
