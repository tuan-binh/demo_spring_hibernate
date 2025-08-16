package ra.spring_hibernate_orm.models.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CartItemId implements Serializable {
    private Long userId;
    private Long productId;

    public CartItemId() {
    }

    public CartItemId(Long userId, Long productId) {
        this.userId = userId;
        this.productId = productId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
