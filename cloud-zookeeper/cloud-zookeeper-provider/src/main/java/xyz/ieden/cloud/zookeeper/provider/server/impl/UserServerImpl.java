package xyz.ieden.cloud.zookeeper.provider.server.impl;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.stereotype.Service;
import xyz.ieden.cloud.base.provider.api.dto.UserDTO;
import xyz.ieden.cloud.zookeeper.provider.server.IUserServer;

/**
 * UserServer
 *
 * @author gavin
 * @version 1.0
 * @datetime 2020/5/23 14:40
 */
@Service
@Slf4j
public class UserServerImpl implements IUserServer {
    @Override
    public UserDTO getUserById(Long userId) throws Exception {
        UserDTO userDTO = new UserDTO(userId, "tom_" + userId, "18999999999", "北京市朝阳区");
        log.info("UserInfo:{}.", ToStringBuilder.reflectionToString(userDTO, ToStringStyle.JSON_STYLE));
        return userDTO;
    }
}
