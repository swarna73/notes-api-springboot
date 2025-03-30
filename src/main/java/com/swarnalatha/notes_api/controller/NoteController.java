
	package com.swarnalatha.notes_api.controller;

	import com.swarnalatha.notes_api.model.Note;
	import com.swarnalatha.notes_api.repository.NoteRepository;
	import org.springframework.web.bind.annotation.*;

	import java.util.List;

	@RestController
	@RequestMapping("/api/notes")
	public class NoteController {

	    private final NoteRepository noteRepository;

	    public NoteController(NoteRepository noteRepository) {
	        this.noteRepository = noteRepository;
	    }

	    @GetMapping
	    public List<Note> getAllNotes() {
	        return noteRepository.findAll();
	    }

	    @PostMapping
	    public Note createNote(@RequestBody Note note) {
	        return noteRepository.save(note);
	    }

	    @PutMapping("/{id}")
	    public Note updateNote(@PathVariable Long id, @RequestBody Note updatedNote) {
	        return noteRepository.findById(id)
	            .map(note -> {
	                note.setTitle(updatedNote.getTitle());
	                note.setContent(updatedNote.getContent());
	                note.setTag(updatedNote.getTag());
	                return noteRepository.save(note);
	            })
	            .orElseThrow();
	    }

	    @DeleteMapping("/{id}")
	    public void deleteNote(@PathVariable Long id) {
	        noteRepository.deleteById(id);
	    }

	    @GetMapping("/search")
	    public List<Note> searchNotes(@RequestParam String keyword) {
	        return noteRepository.findByContentContainingIgnoreCase(keyword);
	    }

	    @GetMapping("/tag/{tag}")
	    public List<Note> getNotesByTag(@PathVariable String tag) {
	        return noteRepository.findByTag(tag);
	    }
}
