package nl.jochemxyz.demo.controller;

import nl.jochemxyz.demo.client.LaunchClient;
import nl.jochemxyz.demo.domain.Launches;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/launch")
public class LaunchController {
    private final RestTemplate restTemplate = new RestTemplate();

    private final LaunchClient launchClient;

    public LaunchController(LaunchClient launchClient) {
        this.launchClient = launchClient;
    }

    @GetMapping("")
    public Launches getRecentLaunches() {
//        var recentLaunches = restTemplate.getForEntity("https://launchlibrary.net/1.3/launch", Launches.class);
//        return recentLaunches.getBody();

        return launchClient.getRecentLaunches();
    }

    @GetMapping("/{id}")
    public Launches getLaunchesById(@PathVariable("id") String id) {
//        var launch = restTemplate.getForEntity("https://launchlibrary.net/1.3/launch?id=" + id, Launches.class);
//        return launch.getBody();

        return launchClient.getLaunchesById(id);
    }
}
