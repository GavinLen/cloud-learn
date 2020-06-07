package xyz.ieden.cloud.consul.consumer.server;


import xyz.ieden.cloud.consul.consumer.vo.OrderVO;

/**
 * IOrderServer
 *
 * @author gavin
 * @version 1.0
 * @datetime 2020/5/23 15:20
 */
public interface IOrderServer {

    /**
     * 通过 userId 获取 Order
     *
     * @param userId
     * @return
     * @throws Exception
     */
    OrderVO getOrderById(Long userId) throws Exception;

}
