package com.springframework.spring5restdocsexample.web.mappers;

import com.springframework.spring5restdocsexample.domain.Beer;
import com.springframework.spring5restdocsexample.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
