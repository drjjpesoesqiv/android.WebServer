package com.peso.j.webserver;
import java.io.IOException;


import fi.iki.elonen.NanoHTTPD;

/**
 * Created by James on 10/8/2017.
 */

public class WebServer extends NanoHTTPD {

    static int defaultPort = 8080;

    public WebServer() throws IOException {
        super(defaultPort);

        start(NanoHTTPD.SOCKET_READ_TIMEOUT, false);
        System.out.println("\nRunning on port " + defaultPort + " \n");
    }

    @Override
    public Response serve(IHTTPSession session) {
        String msg = "<html><body><h1>WebServer</h1></body></html>\n";
        return newFixedLengthResponse(msg);
    }
}
