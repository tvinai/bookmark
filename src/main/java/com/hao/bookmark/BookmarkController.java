package com.hao.bookmark;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bookmarks")
public class BookmarkController {

    @GetMapping
    public List<String> getBookmarkList() {
        return List.of("google", "youtube");
    }
}
