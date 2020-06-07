package xyz.ieden.cloud.base.provider.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * UserDTO
 *
 * @author gavin
 * @version 1.0
 * @datetime 2020/5/23 14:30
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO implements Serializable {

    private Long userId;
    private String userName;
    private String phoneNumber;
    private String address;

}
