package xyz.ieden.cloud.consul.consumer.server.impl;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import xyz.ieden.cloud.base.common.result.ResultSet;
import xyz.ieden.cloud.base.provider.api.dto.UserDTO;
import xyz.ieden.cloud.consul.consumer.server.IOrderServer;
import xyz.ieden.cloud.consul.consumer.vo.OrderVO;

import javax.annotation.Resource;
import java.util.Date;
import java.util.UUID;

/**
 * OrderServerImpl
 *
 * @author gavin
 * @version 1.0
 * @datetime 2020/5/23 15:21
 */
@Service
@Slf4j
public class OrderServerImpl implements IOrderServer {

    private static final String INVOKE_URL = "http://consul-provider/";

    @Resource
    private RestTemplate restTemplate;

    @Override
    public OrderVO getOrderById(Long userId) throws Exception {
        String requestURL = INVOKE_URL + "provider/user/{userId}";

        ParameterizedTypeReference<ResultSet<UserDTO>> typeRef = new ParameterizedTypeReference<ResultSet<UserDTO>>() {
        };

        ResponseEntity<ResultSet<UserDTO>> responseEntity = restTemplate.exchange(requestURL, HttpMethod.GET, null, typeRef, userId);
        ResultSet<UserDTO> resultSet = responseEntity.getBody();
        log.info("Get Id [{}] Result: Code: [{}], Msg: [{}].", userId, resultSet.getCode(), resultSet.getMsg());

        UserDTO userDTO = resultSet.getData();
        OrderVO orderVO = new OrderVO();
        orderVO.setOrderId(UUID.randomUUID().toString());
        orderVO.setOrderCreateTime(new Date());
        orderVO.setUserDTO(userDTO);
        log.info("OrderInfo: {}.", ToStringBuilder.reflectionToString(orderVO, ToStringStyle.JSON_STYLE));
        return orderVO;
    }
}
