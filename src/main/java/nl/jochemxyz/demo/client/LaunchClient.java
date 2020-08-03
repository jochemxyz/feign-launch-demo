package nl.jochemxyz.demo.client;

import nl.jochemxyz.demo.domain.Launches;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "launch-service", url = "https://launchlibrary.net/1.3/launch")
public interface LaunchClient {
    @GetMapping(value = "")
    Launches getRecentLaunches();

    @GetMapping(value = "?id={id}")
    Launches getLaunchesById(@PathVariable("id") String id);
}
