package com.example.admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service

public class AdminService{
	@Autowired
	private AdminRepository adminRepository;
	public List<Admin> getAllAdmins(){
	return adminRepository.findAll();
	}
	public Admin getAdminById(Long id) {
	return adminRepository.findById(id).orElse(null);
	}
	public Admin addAdmin(Admin admin) {
	return adminRepository.save(admin);
	}
	public Admin updateAdmin(Long id, Admin adminDetails) {
	Admin admin = adminRepository.findById(id).orElse(null);
	if (admin != null) {
	admin.setName(adminDetails.getName());
	admin.setAddress(adminDetails.getAddress());
	admin.setCity(adminDetails.getCity());
	admin.setState(adminDetails.getState());
	return adminRepository.save(admin);
	}
	return null;
	}
	public void deleteCollege(Long id) {
	adminRepository.deleteById(id);
	}	
}
