package com.rajesh.bookmarkerapi.api;

import com.rajesh.bookmarkerapi.domain.Bookmark;
import com.rajesh.bookmarkerapi.domain.BookmarkService;
import com.rajesh.bookmarkerapi.domain.BookmarksDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class BookmarkController {
    private final BookmarkService bookmarkService;

    @RequestMapping("/api/bookmarks")
    @GetMapping
    public BookmarksDTO getBookmarks(@RequestParam(name = "page",defaultValue = "1") Integer page){
        return bookmarkService.getBookmarks(page);
    }
}
