package com.hao.bookmark.mapper;

import com.hao.bookmark.model.Bookmark;
import com.hao.bookmark.model.entity.BookmarkEntity;
import com.hao.bookmark.model.request.SaveBookmarkRequest;

import java.util.UUID;

public class BookmarkEntityMapper {

    private BookmarkEntityMapper() {

    }

    public static BookmarkEntity from(SaveBookmarkRequest saveBookmarkRequest) {

        return BookmarkEntity.builder()
                .id(UUID.randomUUID().toString())
                .name(saveBookmarkRequest.getName())
                .url(saveBookmarkRequest.getUrl())
                .build();
    }

    public static Bookmark from(BookmarkEntity bookmarkEntity) {
        return Bookmark.builder()
                .id(bookmarkEntity.getId())
                .name(bookmarkEntity.getName())
                .url(bookmarkEntity.getUrl())
                .build();
    }

}
