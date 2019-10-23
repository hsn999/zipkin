package app2.remote;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "hello-remote", url = "http://localhost:9000", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @RequestMapping(value = "/api")
    String printDate(@RequestParam(name = "username", required = false) String username);

}
