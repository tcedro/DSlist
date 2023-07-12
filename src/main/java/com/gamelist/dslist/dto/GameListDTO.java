package com.gamelist.dslist.dto;

import com.gamelist.dslist.entities.GameList;

public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO() {}

    public GameListDTO(GameList entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
