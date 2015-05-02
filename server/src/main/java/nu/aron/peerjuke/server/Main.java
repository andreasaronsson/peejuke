package nu.aron.peerjuke.server;

import spark.Spark;

/**
 * 
 *
 */
public class Main {
    public static void main(String[] args) {
        Dirlist dirlist = new Dirlist();
        Player player = new Player();
        Spark.get("/ls/:path", (request, response) -> dirlist.dirList(request.params(":path")));
        Spark.get("/play/:path", (request, reponse) -> player.play(request.params(":path")));
    }
}
