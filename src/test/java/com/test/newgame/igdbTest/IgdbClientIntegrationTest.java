package com.test.newgame.igdbTest;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.test.newgame.helper.FileLoader;
import com.test.newgame.igdbclient.IgdbClient;
import com.test.newgame.igdbclient.IgdbResponse;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.Assert.assertNotNull;
import static org.springframework.http.HttpHeaders.CONTENT_TYPE;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IgdbClientIntegrationTest {

    @Autowired
    private IgdbClient subject;

    @Rule
    public WireMockRule wireMockRule = new WireMockRule(8089);

    @Test
    public void shouldCallIgdbService() throws Exception {



        wireMockRule.stubFor(get(urlPathEqualTo("localhost:8089/games"))
                .willReturn(aResponse()
                        .withBody(FileLoader.read("classpath:igdbApiResponse.json"))
                        .withHeader(CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                        .withStatus(200)));

        Optional<IgdbResponse> resp = subject.sendRequest();

          assertNotNull(resp);
    }

}
