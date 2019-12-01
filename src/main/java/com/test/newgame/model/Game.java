package com.test.newgame.model;

public class Game {
    private Cover cover;

    private String popularity;

    private String name;

    private String id;

    private String category;

    private String[] platforms;

    public Cover getCover ()
    {
        return cover;
    }

    public void setCover (Cover cover)
    {
        this.cover = cover;
    }

    public String getPopularity ()
    {
        return popularity;
    }

    public void setPopularity (String popularity)
    {
        this.popularity = popularity;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getCategory ()
    {
        return category;
    }

    public void setCategory (String category)
    {
        this.category = category;
    }

    public String[] getPlatforms ()
    {
        return platforms;
    }

    public void setPlatforms (String[] platforms)
    {
        this.platforms = platforms;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [cover = "+cover+", popularity = "+popularity+", name = "+name+", id = "+id+", category = "+category+", platforms = "+platforms+"]";
    }
}