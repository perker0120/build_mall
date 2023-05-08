package buildmall.domain;

import buildmall.domain.*;
import buildmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long orderId;
    private Long productId;
    private Long userId;
    private Object price;
    private Integer amount;
    private String address;
    private String productName;
}
