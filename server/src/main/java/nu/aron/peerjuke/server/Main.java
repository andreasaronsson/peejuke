package nu.aron.peerjuke.server;

import spark.Spark;

/**
 * 
 *
 */
public class Main {
    public static void main(String[] args) {
        Dirlist dirlist = new Dirlist();
        Spark.get("/ls/:path", (request, response) -> dirlist.dirList(request.params(":path")));
    }
}
