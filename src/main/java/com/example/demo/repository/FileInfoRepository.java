package com.example.demo.repository;

import com.example.demo.domain.FileInfo;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface FileInfoRepository extends ReactiveCrudRepository<FileInfo, Long> {

    Flux<FileInfo> findByFileName(String name);
}
