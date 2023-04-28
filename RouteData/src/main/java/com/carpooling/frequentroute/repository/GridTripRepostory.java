package com.carpooling.frequentroute.repository;

import com.carpooling.frequentroute.entity.GridTrip;
import com.carpooling.frequentroute.entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Repository
public interface GridTripRepostory extends JpaRepository<GridTrip, UUID> {

    @Query(value = "select * from grid_trip where account_id = ?1", nativeQuery = true)
    List<GridTrip> findAllByAccount_id(String account_id);

    @Query(value = "select * from grid_trip where account_id = ?1 and date = ?2", nativeQuery = true)
    List<GridTrip> findAllByAccount_idAnDate(String account_id, Date date);

    @Query(value = "select * from grid_trip where trip_id = ?1", nativeQuery = true)
    List<GridTrip> findAllByTrip_id(UUID trip_id);

    @Query(value = "select * from grid_trip where account_id = ?1 and trip_id = ?2", nativeQuery = true)
    List<GridTrip> findAllByAccount_idAndTrip_id(String account_id, UUID trip_id);

    @Query(value = "select count(*) from grid_trip where trip_id = ?1", nativeQuery = true)
    long countGridTrip(UUID trip_id);

}
