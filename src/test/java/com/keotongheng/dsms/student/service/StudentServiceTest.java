package com.keotongheng.dsms.student.service;

import com.keotongheng.dsms.student.model.Student;
import com.keotongheng.dsms.student.repository.StudentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class StudentServiceTest {

    @Mock
    private StudentRepository studentRepository;

    @InjectMocks
    private StudentService studentService;

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
        when(studentRepository.findAll()).thenReturn(List.of(student));

        List<Student> result = studentService.getAllStudents();

        assertEquals(1, result.size());
        assertEquals("STU001", result.get(0).getStudentCode());
        verify(studentRepository).findAll();
    }

    @Test
    void shouldGetStudentById() {
        when(studentRepository.findById(1L))
                .thenReturn(Optional.of(student));

        Student result = studentService.getStudentById(1L);

        assertEquals("Dara", result.getFirstName());
        verify(studentRepository).findById(1L);
    }

    @Test
    void shouldCreateStudent() {
        when(studentRepository.save(student)).thenReturn(student);

        Student result = studentService.createStudent(student);

        assertNotNull(result);
        assertEquals("STU001", result.getStudentCode());
        verify(studentRepository).save(student);
    }

    @Test
    void shouldDeleteStudent() {
        when(studentRepository.findById(1L))
                .thenReturn(Optional.of(student));

        studentService.deleteStudent(1L);

        verify(studentRepository).findById(1L);
        verify(studentRepository).delete(student);
    }

@Test
void shouldUpdateStudent() {
    Student updated = new Student();
    updated.setStudentCode("STU001");
    updated.setFirstName("Dara Updated");
    updated.setLastName("Sok");
    updated.setEmail("updated@example.com");
    updated.setDepartment("Computer Science");

    when(studentRepository.findById(1L))
            .thenReturn(Optional.of(student));
    when(studentRepository.save(student))
            .thenReturn(student);

    Student result = studentService.updateStudent(1L, updated);

    assertEquals("Dara Updated", result.getFirstName());
    assertEquals("Computer Science", result.getDepartment());

    verify(studentRepository).findById(1L);
    verify(studentRepository).save(student);
}

@Test
void shouldThrowExceptionWhenStudentNotFound() {
    when(studentRepository.findById(99L))
            .thenReturn(Optional.empty());

    RuntimeException exception = assertThrows(
            RuntimeException.class,
            () -> studentService.getStudentById(99L)
    );

    assertEquals("Student not found: 99", exception.getMessage());
}
}