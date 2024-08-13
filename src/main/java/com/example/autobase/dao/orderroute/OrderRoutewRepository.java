package com.example.autobase.dao.orderroute;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.example.autobase.model.OrderRoute;

import java.util.List;

@Repository
@Transactional
public interface OrderRoutewRepository extends JpaRepository<OrderRoute,Long> {
    List<OrderRoute> findByIdLike(Long id);
}
