package com.hao.bookmark;

import com.hao.bookmark.model.Bookmark;
import com.hao.bookmark.model.entity.BookmarkEntity;
import com.hao.bookmark.repository.BookmarkRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/bookmarks")
public class BookmarkController {

    private final BookmarkRepository bookmarkRepository;

    public BookmarkController(BookmarkRepository bookmarkRepository) {
        this.bookmarkRepository = bookmarkRepository;
    }

    @CrossOrigin(origins = "http://localhost:5000")
    @GetMapping
    public List<Bookmark> getBookmarkList() {

        List<BookmarkEntity> bookmarkEntityList = bookmarkRepository.findAll();

        if (bookmarkEntityList.size() < 1) {
            return Collections.emptyList();
        }

        List<Bookmark> bookmarkList = bookmarkEntityList.stream()
                .map(it -> new Bookmark(it.getName(), it.getUrl()))
                .toList();

        return bookmarkList;
    }
}
