package com.example.suniapunya;

public class Model {
    int image;
    String player_name, player_desc;
    public Model(int image, String player_name, String player_desc) {
        this.image = image;
        this.player_name = player_name;
        this.player_desc = player_desc;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public String getPlayer_desc() {
        return player_desc;
    }

    public void setPlayer_desc(String player_desc) {
        this.player_desc = player_desc;
    }
}