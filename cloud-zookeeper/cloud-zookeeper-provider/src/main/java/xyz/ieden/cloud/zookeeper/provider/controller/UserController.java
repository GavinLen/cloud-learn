package xyz.ieden.cloud.zookeeper.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.ieden.cloud.base.common.result.ResultSet;
import xyz.ieden.cloud.base.common.result.ResultSetUtils;
import xyz.ieden.cloud.base.provider.api.dto.UserDTO;
import xyz.ieden.cloud.zookeeper.provider.server.IUserServer;

import javax.annotation.Resource;

/**
 * UserController
 *
 * @author gavin
 * @version 1.0
 * @datetime 2020/5/23 14:37
 */
@RestController
@RequestMapping(value = "user")
@Slf4j
public class UserController {
    
    @Resource
    private IUserServer userServer;

    @GetMapping(value = "{id}")
    public ResultSet<UserDTO> getUserById(@PathVariable(value = "id") Long userId) throws Exception {
        log.info("Request Get User By Id [{}].", userId);
        UserDTO userDTO = userServer.getUserById(userId);
        return ResultSetUtils.getResult(userDTO);
    }


}
