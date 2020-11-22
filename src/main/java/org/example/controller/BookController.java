package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.repository.entity.ClassRoom;
import org.example.service.BookService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class BookController {
    private final BookService service;

    @GetMapping(path = "/api/user")
    public ResponseEntity <ClassRoom>findByNumber(@RequestParam int number){
        final ClassRoom classRoom = service.findByNumber(number);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("EXAMPLE_HEADER", "DUMMY_VALUE");
        return new ResponseEntity<>(classRoom,httpHeaders,HttpStatus.ACCEPTED);
    }

    @PostMapping(path ="/api/user")
    @ResponseStatus(code= HttpStatus.CREATED)
public void createClassroom(@RequestBody ClassRoom classRoom){
        service.save(classRoom);

}


}
