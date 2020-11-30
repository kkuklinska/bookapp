package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.repository.entity.Classroom;
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
    public ResponseEntity <Classroom>findByNumber(@RequestParam int number){
        final Classroom classroom = service.findByNumber(number);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("EXAMPLE_HEADER", "EXAMPLE_VALUE");
        return new ResponseEntity<>(classroom,httpHeaders,HttpStatus.ACCEPTED);
    }

    @PostMapping(path ="/api/user")
    @ResponseStatus(code= HttpStatus.CREATED)  // 2 sposob
    public void createClassroom(@RequestBody Classroom classroom){
        service.save(classroom);

}


}
