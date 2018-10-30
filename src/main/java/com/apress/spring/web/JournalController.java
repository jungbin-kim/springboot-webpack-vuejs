package com.apress.spring.web;
/*
 * Created by jungbin on 2018. 5. 9.
 */

import com.apress.spring.domain.Journal;
import com.apress.spring.repository.JournalRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class JournalController {

    @Autowired
    JournalRepository repo;

    @ApiOperation("Journal 들의 목록을 반환합니다")
    @GetMapping(value = "/", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public @ResponseBody List<Journal> index() {
        return repo.findAll();
    }
}
