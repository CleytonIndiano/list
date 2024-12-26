package com.listname.list.listRepository;

import com.listname.list.listEntity.ListName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListRepository extends JpaRepository<ListName, Long> {

}
