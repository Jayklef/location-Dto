package com.jayklef.locationdto.repository;

import com.jayklef.locationdto.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
