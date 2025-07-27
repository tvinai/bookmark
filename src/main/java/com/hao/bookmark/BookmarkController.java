package com.hao.bookmark;

import com.hao.bookmark.model.Bookmark;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bookmarks")
public class BookmarkController {

    @CrossOrigin(origins = "http://localhost:5000")
    @GetMapping
    public List<Bookmark> getBookmarkList() {

        Bookmark google = new Bookmark("google", "http://www.google.com");
        Bookmark youtube = new Bookmark("youtube", "http://www.youtube.com");

        return List.of(google, youtube);
    }
}
