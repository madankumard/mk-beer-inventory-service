package mk.springframework.mkbeerinventoryservice.web.mappers;

import mk.springframework.mkbeerinventoryservice.domain.BeerInventory;
import mk.springframework.mkbeerinventoryservice.web.model.BeerInventoryDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
