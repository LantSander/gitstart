package com.utopa.mdos.mgmt.check.svr.rest;

import com.alibaba.fastjson.JSON;
import com.uaopa.mdos.component.dto.rest.MessageResponse;
import com.utopa.mdos.component.mq.annotation.MQSubscribe;
import com.utopa.mdos.component.mq.api.IMessageProcessor;
import com.utopa.mdos.component.mq.vo.MqMessageVo;
import org.springframework.stereotype.Component;


@MQSubscribe(topic = "MDOS_COMMON_TOPIC", tag = "MDOS_COMMON_TAG", comsumer = "")
@Component
public class DemoProcess implements IMessageProcessor<MqMessageVo> {

    @Override
    public MessageResponse process(MqMessageVo s) {
        System.out.println(JSON.toJSONString(s));
        return null;
    }
}
