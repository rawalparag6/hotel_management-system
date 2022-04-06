//package com.in.service;
//
//import com.in.entity.Staff;
//import com.in.repo.StaffRepository;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//@ExtendWith(MockitoExtension.class)
//class StaffServiceImpTest {
//    @Mock
//    private StaffRepository staffRepository;
//
//    private StaffServiceImp staffServiceImp;
//
//    @BeforeEach
//    void setUp(){
//        this.staffServiceImp=new StaffServiceImp(this.staffRepository);
//    }
//
//
//    @Test
//    @Order(1)
//    void addStaff() {
//        Staff staff=new Staff("1","pg","xyz","abc","ite",8000);
//        when(staffRepository.save(staff)).thenReturn(staff);
//        assertEquals(staff,staffServiceImp.addStaff(staff));
//
//    }
//
//    @Test
//    @Order(2)
//    void getStaff() {
//        staffServiceImp.getStaff();
//        verify(staffRepository).findAll();
//    }
//
//    @Test
//    @Order(3)
//    void updateStaff() {
//        Staff staff=new Staff("2","pg","xyz","abc","ite",8000);
//        when(staffRepository.save(staff)).thenReturn(staff);
//        assertEquals(staff,staffServiceImp.updateStaff(staff));
//    }
//
//    @Test
//    @Order(4)
//    void deleteStaff() {
//        String staffId = "03";
//        staffServiceImp.deleteStaff(staffId);
//        verify(staffRepository,times(1)).deleteById(staffId);
//    }
//
//}