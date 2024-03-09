package travel.events.subscribe;

import lombok.*;
import travel.events.publish.AbstractEvent;

@Data
@EqualsAndHashCode(callSuper=false)
@ToString
public class PaymentRefundFailed extends AbstractEvent {
    
    private Long id;
    private Long charge;
    private Long userId;
    private Long reservationId;
    private String name;
    private String impUid;
    private String status;
}