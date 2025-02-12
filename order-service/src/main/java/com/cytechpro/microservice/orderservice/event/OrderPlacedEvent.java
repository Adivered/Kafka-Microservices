package com.cytechpro.microservice.orderservice.event;


import com.cytechpro.microservice.orderservice.dto.OrderLineItemsDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderPlacedEvent {

    private String orderNumber;
//    private List<OrderLineItemsDto> orderLineItemsDtoList;
}
