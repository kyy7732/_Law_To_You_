package com.example.demo.freeboard.repository;

import com.example.demo.freeboard.entity.Freeboard;

import java.util.List;

public interface FreeboardRepositoryCustom {

    List<Freeboard> findByContent(String content);


}
