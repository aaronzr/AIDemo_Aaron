package com.example.aidemo.controller;

import com.example.aidemo.service.DataLoaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/docs")
public class DocsLoaderController {
    @Autowired
    private DataLoaderService docsLoaderService;

    @GetMapping("/load")
    public String loadDocuments() {
        docsLoaderService.load();
        return "Documents loaded successfully";
    }
}