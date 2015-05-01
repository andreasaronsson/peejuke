package nu.aron.peerjuke.server;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import spark.Spark;

/**
 * 
 *
 */
public class Main {
    public static void main(String[] args) {
        Spark.get("/ls/:path", (request, response) -> dirList(request.params(":path")));
    }

    static List<String> dirList(String path) {
        try {
            return Files.list(Paths.get(path.replaceAll("%2F", "/"))).map(p -> p.toString()).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}
