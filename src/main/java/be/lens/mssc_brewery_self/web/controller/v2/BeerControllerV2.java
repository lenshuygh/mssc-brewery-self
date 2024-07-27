package be.lens.mssc_brewery_self.web.controller.v2;

import be.lens.mssc_brewery_self.web.model.v2.BeerDtoV2;
import be.lens.mssc_brewery_self.web.service.v2.BeerServiceV2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.UnknownHostException;
import java.util.UUID;

@RequestMapping("/api/v2/beer")
@RestController
public class BeerControllerV2 {
    private final BeerServiceV2 beerServiceV2;

    public BeerControllerV2(BeerServiceV2 beerServiceV2) {
        this.beerServiceV2 = beerServiceV2;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDtoV2> getBeer(@PathVariable("beerId") UUID beerId) {

        return new ResponseEntity<>(beerServiceV2.getById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody BeerDtoV2 beerDto) throws UnknownHostException {
        BeerDtoV2 savedBeerdto = beerServiceV2.saveNewBeer(beerDto);
        HttpHeaders httpHeaders = new HttpHeaders();
        // todo: add hostname to url
        httpHeaders.add("Location", "/api/v2/beer/" + savedBeerdto.getId().toString());

        return new ResponseEntity(httpHeaders, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity handleUpdate(@PathVariable UUID beerId, @RequestBody BeerDtoV2 beerDto) {
        beerServiceV2.updateBeer(beerId, beerDto);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleDelete(@PathVariable UUID beerId) {
        beerServiceV2.deleteBeer(beerId);
    }
}
