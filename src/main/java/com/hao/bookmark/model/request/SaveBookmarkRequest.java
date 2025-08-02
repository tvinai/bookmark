package com.hao.bookmark.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SaveBookmarkRequest {

    private String name;
    private String url;

}
