package com.hao.bookmark;

import com.hao.bookmark.mapper.BookmarkEntityMapper;
import com.hao.bookmark.model.Bookmark;
import com.hao.bookmark.model.entity.BookmarkEntity;
import com.hao.bookmark.model.request.SaveBookmarkRequest;
import com.hao.bookmark.repository.BookmarkRepository;
import org.springframework.web.bind.annotation.*;

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
                .map(it -> new Bookmark(it.getId(), it.getName(), it.getUrl()))
                .toList();

        return bookmarkList;
    }

    @CrossOrigin(origins = "http://localhost:5000")
    @PostMapping
    public void saveBookmark(@RequestBody SaveBookmarkRequest request) {

        BookmarkEntity bookmarkEntity = BookmarkEntityMapper.from(request);
        bookmarkRepository.save(bookmarkEntity);
    }

    @CrossOrigin(origins = "http://localhost:5000")
    @DeleteMapping("{bookmarkId}")
    public void deleteBookmark(@PathVariable String bookmarkId) {
        bookmarkRepository.deleteById(bookmarkId);
    }

}
