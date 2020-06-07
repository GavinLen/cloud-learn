package xyz.ieden.cloud.zookeeper.consumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.ieden.cloud.base.common.result.ResultSet;
import xyz.ieden.cloud.base.common.result.ResultSetUtils;
import xyz.ieden.cloud.zookeeper.consumer.server.IOrderServer;
import xyz.ieden.cloud.zookeeper.consumer.vo.OrderVO;

import javax.annotation.Resource;

/**
 * OrderController
 *
 * @author gavin
 * @version 1.0
 * @datetime 2020/5/23 15:13
 */
@RestController
@RequestMapping(value = "order")
@Slf4j
public class OrderController {

    @Resource
    private IOrderServer orderServer;

    @GetMapping(value = "{id}")
    public ResultSet<OrderVO> getOrderInfo(@PathVariable(value = "id") Long userId) throws Exception {
        log.info("Request Get Order Info By Id [{}].", userId);
        OrderVO orderVO = orderServer.getOrderById(userId);
        return ResultSetUtils.getResult(orderVO);
    }

}
