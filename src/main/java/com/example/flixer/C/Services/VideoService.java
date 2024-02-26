package com.example.flixer.C.Services;

import com.example.flixer.C.Entities.Video;
import com.example.flixer.C.Repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VideoService {
    private final VideoRepository videoRepository;

    @Autowired
    public VideoService(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    public List<Video> getVideos() {
        return videoRepository.findAll();
    }

    public void addNewVideo(Video video) {
        videoRepository.save(video);
    }

    public Optional<Video> getVideoById(Long id) {
        Optional<Video> videoOptional = videoRepository.getVideoById(id);
        if (videoOptional.isPresent()) {
            return videoRepository.getVideoById(id);
        }
        else {
            throw new IllegalStateException("video does not exist");
        }
    }
}
