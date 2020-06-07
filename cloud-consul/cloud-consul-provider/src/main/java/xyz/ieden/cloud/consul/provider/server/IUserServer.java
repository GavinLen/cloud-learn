package xyz.ieden.cloud.consul.provider.server;


import xyz.ieden.cloud.base.provider.api.dto.UserDTO;

/**
 * IUserServer
 *
 * @author gavin
 * @version 1.0
 * @datetime 2020/5/23 14:39
 */
public interface IUserServer {

    /**
     * 通过 id 获取 user
     *
     * @param userId
     * @return
     * @throws Exception
     */
    UserDTO getUserById(Long userId) throws Exception;

}
