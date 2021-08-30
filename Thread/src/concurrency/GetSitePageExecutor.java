package concurrency;

import jdk.jshell.execution.Util;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;

public class GetSitePageExecutor implements Callable<String> {
    private String url;

    public GetSitePageExecutor(String url) {
        super();
        this.url = url;
    }

    @Override
    public String call() throws Exception {
        try {
            URL url = new URL(getUrl());

            URLConnection connection = url.openConnection();

            InputStream inputStream = connection.getInputStream();

//            return Utils.getString(inputStream);

        }catch (MalformedURLException error){
            error.printStackTrace();
        }catch (IOException error){
            error.printStackTrace();
        }

        return null;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
