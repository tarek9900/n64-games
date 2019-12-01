package com.test.newgame.igdbTest;

import com.test.newgame.helper.FileLoader;
import com.test.newgame.igdbclient.IgdbResponse;
import org.json.JSONArray;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;

import static org.junit.Assert.assertNotNull;

public class IgdbResponseTest {

    @Autowired
    ResourceLoader resourceLoader;

    @Test
    public void shouldDeserializeJson() throws Exception {

        String jsonResponse = FileLoader.read("classpath:igdbApiResponse.json");
        JSONArray jsonArray = new JSONArray(jsonResponse);
        IgdbResponse expectedResponse = new IgdbResponse(jsonArray);
        assertNotNull(expectedResponse);

    }
}