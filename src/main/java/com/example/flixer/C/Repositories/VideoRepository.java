package com.example.flixer.C.Repositories;

import com.example.flixer.C.Entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VideoRepository extends
        JpaRepository <Video, Long> {

    /*@Query(value = "SELECT * FROM video WHERE video.publish_date LIKE '%' "; nativeQuery = true)*/
    Optional<List<Video>> findVideoByTitle(String title);

    Optional <Video> getVideoById(Long id);


}

