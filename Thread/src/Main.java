import concurrency.GetSitePage;
import concurrency.GetSitePageExecutor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Main m = new Main();
//        m.concurrency();

//        Thread thread1 = new Thread(new RunnableThread());
//        thread1.start();

        m.concurrencyExecutor();
    }

    private void concurrencyExecutor() throws InterruptedException, ExecutionException {
        List<Callable<String>> sites = new ArrayList<Callable<String>>();
        sites.add(new GetSitePageExecutor("www.paoloprete.it"));

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        List<Future<String>> output = executorService.invokeAll(sites);

        for (Future<String> future : output){
            System.out.println(future.get());
        }

        executorService.shutdown();
    }


    private void concurrency() throws InterruptedException {
        GetSitePage getSitePage = new GetSitePage("www.paolopreite.it");
        GetSitePage getSitePageGoogle = new GetSitePage("www.google.it");

        getSitePage.start();
        getSitePageGoogle.start();

        getSitePage.join();
        getSitePageGoogle.join();

        System.out.println("Output paolopreite");
        System.out.println(getSitePage.getContent());


    }

    private void multythread(){
        ThreadExample thread = new ThreadExample();
        thread.setName("Thread 1");
        ThreadExample thread2 = new ThreadExample();
        thread2.setName("Thread 2");
        ThreadExample thread3 = new ThreadExample();
        thread3.setName("Thread 3");
        ThreadExample thread4 = new ThreadExample();
        thread4.setName("Thread 4");
        ThreadExample thread5 = new ThreadExample();
        thread5.setName("Thread 5");

        thread.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }
}
