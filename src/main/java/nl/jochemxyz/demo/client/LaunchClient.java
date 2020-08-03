package nl.jochemxyz.demo.client;

import nl.jochemxyz.demo.domain.Launches;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "launch-service", url = "https://launchlibrary.net/1.3/launch")
public interface LaunchClient {
    @RequestMapping(value = "", method = RequestMethod.GET)
    Launches getRecentLaunches();

    @RequestMapping(value = "?id={id}", method = RequestMethod.GET)
    Launches getLaunchesById(@PathVariable("id") String id);
}
