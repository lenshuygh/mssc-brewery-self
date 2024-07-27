package be.lens.mssc_brewery_self.web.service.v2;

import be.lens.mssc_brewery_self.web.model.BeerDto;
import be.lens.mssc_brewery_self.web.model.v2.BeerDtoV2;
import be.lens.mssc_brewery_self.web.model.v2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getById(UUID beerId) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyleEnum.ALE)
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        // todo add update logic
    }

    @Override
    public void deleteBeer(UUID beerId) {
        // todo add delete logic
        log.info("deleting a beer ...");
    }
}
