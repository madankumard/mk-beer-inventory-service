package mk.springframework.mkbeerinventoryservice.services;

import mk.springframework.brewery.model.BeerOrderDto;

public interface AllocationService {
    Boolean allocateOrder(BeerOrderDto beerOrderDto);
}
