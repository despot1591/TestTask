package com.app.weather.repository;


import com.app.weather.entity.WeatherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WeatherRepository extends JpaRepository<WeatherEntity, Long> {
    WeatherEntity findFirstByOrderByCreatedAtDesc();
}
