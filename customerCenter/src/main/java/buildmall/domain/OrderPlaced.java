package buildmall.domain;

import buildmall.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class OrderPlaced extends AbstractEvent {

    private Long orderId;
    private Long productId;
    private Long userId;
    private Integer amount;
    private String address;
    private String productName;
    private Integer price;
}
