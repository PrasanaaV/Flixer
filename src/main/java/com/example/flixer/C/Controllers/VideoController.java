package com.example.flixer.C.Controllers;

import com.example.flixer.C.Entities.Video;
import com.example.flixer.C.Services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/video")
public class VideoController {
    private final VideoService videoService;

    @Autowired
    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping
    public List<Video> getVideos(){
        return videoService.getVideos();
    }

    @PostMapping
    public void addVideo(@RequestBody Video video){
        videoService.addNewVideo(video);
    }

    @GetMapping(path = "{videoId}")
    public <Optional> java.util.Optional<Video> getVideoById(@PathVariable("videoId") Long id) {
        return videoService.getVideoById(id);
    }
}
