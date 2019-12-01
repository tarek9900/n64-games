package com.test.newgame.igdbTest;

import com.test.newgame.igdbclient.IgdbClient;
import com.test.newgame.igdbclient.IgdbResponse;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.MockitoAnnotations.initMocks;

@RunWith(SpringRunner.class)
public class IgdbClientTest {

    private IgdbClient subject;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
        subject = new IgdbClient( "https://api-v3.igdb.com/games", "120fb5d41d96e5d827209cd30b53e367");
    }

    @Test
    public void shouldCallIgdbService() throws Exception {

        Optional<IgdbResponse> actualResponse = subject.sendRequest();
        assertThat(actualResponse.isPresent(), is(true));
    }

}