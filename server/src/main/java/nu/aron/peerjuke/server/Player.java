package nu.aron.peerjuke.server;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

public class Player {
    String mplayer = "/usr/bin/mplayer";

    public boolean play(String file) {
        String decodedFile = null;
        try {
            decodedFile = URLDecoder.decode(file, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
            return false;
        }
        List<String> command = new LinkedList<>();
        command.add(mplayer);
        command.add(decodedFile);
        ProcessBuilder pb = new ProcessBuilder(command);
        try {
            pb.start();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

    }
}
