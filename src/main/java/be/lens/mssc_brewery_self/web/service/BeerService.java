package be.lens.mssc_brewery_self.web.service;

import be.lens.mssc_brewery_self.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);
}
