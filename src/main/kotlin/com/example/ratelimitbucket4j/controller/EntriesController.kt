package com.example.ratelimitbucket4j.controller

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/entries")
class EntriesController {

    @GetMapping
    fun getEntry(): String = "Get Entry..."

    @PostMapping
    fun createEntry(): String = "Create Entry..."

    @PutMapping
    fun updateEntry(): String = "Update Entry..."

    @DeleteMapping
    fun deleteEntry(): String = "Delete Entry..."
}