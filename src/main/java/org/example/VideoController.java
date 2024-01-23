package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.springframework.core.io.Resource;
import reactor.core.publisher.Mono;
@SpringBootApplication
@RestController
public class VideoController {

    @Autowired
    private VideoPlayer videoPlayer;
    @GetMapping(value="movies/{title}",produces="movies/mp4")
    public Mono<Resource> getVideos(@PathVariable String title) {
        return videoPlayer.getVideo(title);
    }
}
