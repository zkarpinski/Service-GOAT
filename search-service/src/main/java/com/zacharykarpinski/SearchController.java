package com.zacharykarpinski;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import org.elasticsearch.client.RestHighLevelClient;

@Controller("/search")
public class SearchController {

    private final RestHighLevelClient client;

    public SearchController(RestHighLevelClient client) {
        this.client = client;
    }

    @Get("/")
    public HttpResponse search(String query) {

        return HttpResponse.ok(query);
    }
}
