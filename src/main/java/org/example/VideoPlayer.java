package org.example;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.springframework.core.io.Resource;
import reactor.core.publisher.Mono;
@Service
public class VideoPlayer {

    private ResourceLoader resourceLoader;
    private static final String Format="classpath:/movies/%s.mp4";
    public Mono<Resource> getVideo(String title) {
        System.out.println(title);
        return Mono.fromSupplier(()->resourceLoader.getResource(String.format(Format,title)));

    }
}