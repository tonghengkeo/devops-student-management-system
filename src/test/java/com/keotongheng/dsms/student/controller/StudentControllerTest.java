package com.keotongheng.dsms.student.controller;

import com.keotongheng.dsms.student.model.Student;
import com.keotongheng.dsms.student.service.StudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class StudentControllerTest {

    @Mock
    private StudentService studentService;

    @InjectMocks
    private StudentController studentController;

    private Student student;

    @BeforeEach
    void setUp() {
        student = new Student();
        student.setId(1L);
        student.setStudentCode("STU001");
        student.setFirstName("Dara");
        student.setLastName("Sok");
        student.setEmail("dara@example.com");
        student.setDepartment("Information Technology");
    }

    @Test
    void shouldGetAllStudents() {
        when(studentService.getAllStudents())
                .thenReturn(List.of(student));

        List<Student> result = studentController.getAllStudents();

        assertEquals(1, result.size());
        assertEquals("STU001", result.get(0).getStudentCode());

        verify(studentService).getAllStudents();
    }

    @Test
    void shouldGetStudentById() {
        when(studentService.getStudentById(1L))
                .thenReturn(student);

        Student result = studentController.getStudentById(1L);

        assertEquals(1L, result.getId());
        assertEquals("Dara", result.getFirstName());

        verify(studentService).getStudentById(1L);
    }

    @Test
    void shouldCreateStudent() {
        when(studentService.createStudent(student))
                .thenReturn(student);

        ResponseEntity<Student> response =
                studentController.createStudent(student);

        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertNotNull(response.getBody());
        assertEquals("STU001", response.getBody().getStudentCode());

        verify(studentService).createStudent(student);
    }

    @Test
    void shouldUpdateStudent() {
        when(studentService.updateStudent(1L, student))
                .thenReturn(student);

        Student result =
                studentController.updateStudent(1L, student);

        assertEquals("STU001", result.getStudentCode());

        verify(studentService).updateStudent(1L, student);
    }

    @Test
    void shouldDeleteStudent() {
        ResponseEntity<Void> response =
                studentController.deleteStudent(1L);

        assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());

        verify(studentService).deleteStudent(1L);
    }
}