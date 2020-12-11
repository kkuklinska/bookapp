package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.controller.dto.ClassroomRequest;
import org.example.controller.dto.ClassroomResponse;
import org.example.service.ClassroomService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ClassroomController {
    private final ClassroomService service;

    @GetMapping(path = "/api/user")
    public ResponseEntity <ClassroomResponse>findByNumber(@RequestParam int number){
        final ClassroomResponse classroom = service.findResponseByNumber(number);
        final HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("EXAMPLE_HEADER", "EXAMPLE_VALUE");
        return new ResponseEntity<>(classroom,httpHeaders,HttpStatus.ACCEPTED);
    }

    @PostMapping(path ="/api/user")
    @ResponseStatus(code= HttpStatus.CREATED)  // 2 sposob
    public void createClassroom(@RequestBody ClassroomRequest classroomRequest){
        service.save(classroomRequest);

}


}
