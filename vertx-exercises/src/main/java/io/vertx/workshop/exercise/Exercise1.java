package io.vertx.workshop.exercise;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;

/**
 * * Create the Vert.x instance
 * * Create a HTTP server
 */
public class Exercise1 {

    public static void main(String[] args) {
        // 1 - Create the Vert.x instance using Vertx.vertx (use io.vertx.core.Vertx)
        Vertx vertx = Vertx.vertx();
        // 2 - Create a HTTP server using the `createHttpServer` method. Set a request handler doing:
        // `req.response().end("hello")`
        // Call the listen method with `8080` as parameter.
        // TODO
        HttpServer server = vertx.createHttpServer();
        server.requestHandler(req -> {
            req.response().end("Hello World !");
        }).listen(8080);

    }

}
