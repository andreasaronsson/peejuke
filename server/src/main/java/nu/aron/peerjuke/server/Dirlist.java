package nu.aron.peerjuke.server;

import static java.util.stream.Collectors.toList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

class Dirlist {
    List<String> dirList(String path) {
        try {
            return Files.list(Paths.get(path.replaceAll("%2F", "/"))).map(p -> p.toString()).collect(toList());
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}
