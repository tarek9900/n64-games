package com.test.newgame.igdbclient;


import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;

import java.util.Optional;

@Component
public class IgdbClient {

    private final String igdbUrl;
    private final String igdbApiKey;

    @Autowired
    public IgdbClient(@Value("${igdb.url}") final String url, @Value("${igdb.key}") final String key) {
        this.igdbUrl = url;
        this.igdbApiKey = key;
    }


    public Optional<IgdbResponse> sendRequest() {
        HttpResponse<JsonNode> jsonResponse = Unirest.post(igdbUrl)
                .header("user-key", igdbApiKey)
                .header("Accept", "application/json")
                .body("fields name,popularity,platforms,category,cover.* ;sort popularity desc;limit 10;")
                .asJson();

        try {

            if (jsonResponse.getStatus() == 200) {
                return Optional.of(new IgdbResponse(jsonResponse.getBody().getArray()));
            }else{
                //TODO handle errors !!
                return Optional.empty();
            }

        } catch (RestClientException e) {
            return Optional.empty();
        }
    }
}
