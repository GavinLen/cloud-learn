package xyz.ieden.cloud.zookeeper.consumer.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import xyz.ieden.cloud.base.provider.api.dto.UserDTO;

import java.util.Date;

/**
 * OrderVO
 *
 * @author gavin
 * @version 1.0
 * @datetime 2020/5/23 15:26
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderVO {

    private String orderId;
    private Date orderCreateTime;
    private UserDTO userDTO;
}
