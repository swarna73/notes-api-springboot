package com.swarnalatha.notes_api.repository;

import com.swarnalatha.notes_api.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findByTag(String tag);
    List<Note> findByContentContainingIgnoreCase(String keyword);
}