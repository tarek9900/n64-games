package com.test.newgame.igdbclient;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.newgame.model.Game;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

public class IgdbResponse {

    private JSONArray resp;

    public IgdbResponse(JSONArray resp){
        this.resp = resp;
    }

    public String fetchGames() {

            ObjectMapper mapper = new ObjectMapper();
            JSONArray jsonArray = new JSONArray();

            for (int i = 0 ; i < resp.length() ; i++){
                try {
                    Game game;
                    game =  mapper.readValue(resp.get(i).toString(), Game.class);
                    JSONObject jsonObj = new JSONObject(game);
                    jsonArray.put(jsonObj);
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        return jsonArray.toString();
    }

}
