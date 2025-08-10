package com.example.userms.feign;

import com.example.userms.dto.UserActionDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "notificationms")
public interface NotificationClient {
    @PostMapping("/notify")
    void sendNotification(@RequestBody UserActionDTO dto);
}
