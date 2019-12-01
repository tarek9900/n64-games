package com.test.newgame.model;

public class Cover
{
    private String game;

    private String alpha_channel;

    private String width;

    private String animated;

    private String id;

    private String image_id;

    private String url;

    private String height;

    public String getGame ()
    {
        return game;
    }

    public void setGame (String game)
    {
        this.game = game;
    }

    public String getAlpha_channel ()
    {
        return alpha_channel;
    }

    public void setAlpha_channel (String alpha_channel)
    {
        this.alpha_channel = alpha_channel;
    }

    public String getWidth ()
    {
        return width;
    }

    public void setWidth (String width)
    {
        this.width = width;
    }

    public String getAnimated ()
    {
        return animated;
    }

    public void setAnimated (String animated)
    {
        this.animated = animated;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getImage_id ()
    {
        return image_id;
    }

    public void setImage_id (String image_id)
    {
        this.image_id = image_id;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    public String getHeight ()
    {
        return height;
    }

    public void setHeight (String height)
    {
        this.height = height;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [game = "+game+", alpha_channel = "+alpha_channel+", width = "+width+", animated = "+animated+", id = "+id+", image_id = "+image_id+", url = "+url+", height = "+height+"]";
    }
}