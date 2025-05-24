package com.devsuperior.dslist.mapper;

import com.devsuperior.dslist.entites.Game;
import com.devsuperior.dslist.entites.dto.GameMinDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class GameMapper {

    public static final GameMapper INSTANCE = Mappers.getMapper(GameMapper.class);
    public abstract GameMinDTO toGameDTO(Game game);
}
