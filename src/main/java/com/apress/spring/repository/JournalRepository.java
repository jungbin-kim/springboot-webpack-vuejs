package com.apress.spring.repository;
/*
 * Created by jungbin on 2018. 5. 9.
 */

import org.springframework.data.jpa.repository.JpaRepository;
import com.apress.spring.domain.Journal;

public interface JournalRepository extends JpaRepository<Journal, Long> {

}
