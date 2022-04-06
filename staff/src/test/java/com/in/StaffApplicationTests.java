package com.in;

import com.in.entity.Staff;
import com.in.repo.StaffRepository;
import com.in.service.StaffServiceImp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class StaffApplicationTests {

	@MockBean
	private StaffRepository staffRepository;


	private StaffServiceImp staffServiceImp;

	@BeforeEach
	void setUp(){
		this.staffServiceImp=new StaffServiceImp(this.staffRepository);
	}


	@Test
	void addStaff() {
		Staff staff=new Staff("1","pg","xyz","abc","ite",8000);
		when(staffRepository.save(staff)).thenReturn(staff);
		assertEquals(staff,staffServiceImp.addStaff(staff));

	}

	@Test
	void getStaff() {
		staffServiceImp.getStaff();
		verify(staffRepository).findAll();
	}

	@Test
	void updateStaff() {
		Staff staff=new Staff("2","pg","xyz","abc","ite",8000);
		when(staffRepository.save(staff)).thenReturn(staff);
		assertEquals(staff,staffServiceImp.updateStaff(staff));
	}

	@Test
	void deleteStaff() {
		String staffId = "03";
		staffServiceImp.deleteStaff(staffId);
		verify(staffRepository,times(1)).deleteById(staffId);
	}
}
