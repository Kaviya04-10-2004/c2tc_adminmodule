package com.example.admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController

class AdminController {
	@Autowired
	private AdminService adminService;
	@GetMapping("/admin")
	public List<Admin> getAllAdmins() {
	return adminService.getAllAdmins();
	}
	@GetMapping("/admin/{id}")
	public Admin getAdminById(@PathVariable Long id) {
	return adminService.getAdminById(id);
	}
	@PostMapping("/admin")
	public Admin addAdmin(@RequestBody Admin admin) {
		return adminService.addAdmin(admin);
		}
		@PutMapping("/admin/{id}")
		public Admin updateAdmin(@PathVariable Long id, @RequestBody Admin admin) {
		return adminService.updateAdmin(id, admin);
		}

}
