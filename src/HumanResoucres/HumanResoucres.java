package HumanResoucres;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* là class chứa luồng chính của chương trình */
public class HumanResoucres {
	private static final Staff hieu = null;
	static List<Staff> list = new ArrayList<Staff>();
	public static void main(String[] args) {
		list.add(new Employee("1","1", "Nghia", 24, 50000000.0, 22, "Project", 5, 22));
		list.add(new Employee("2","2", "Hieu", 27, 50000000.0, 22, "Tech", 5, 25));
		ArrayList<Department> depList = new ArrayList<Department>();
		depList.add(new Department("1", "Proeject", 0));
		depList.add(new Department("2", "Tech", 0));
		depList.add(new Department("3", "Business", 0));
		
		Scanner consoleNum = new Scanner(System.in);
		Scanner consoleText = new Scanner(System.in);
		int luaChon;
		do {
			
		System.out.println("1.Hiển thị thông tin nhân viên");
		System.out.println("2.Hiển thị các bộ phận trong công ty");
		System.out.println("3.Hiển thị các nhân viên theo từng bộ phận");
		System.out.println("4.Thêm nhân viên mới vào công ty");
		System.out.println("5.Hiển thị nhân viên theo lương");
		System.out.println("6.Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên");
		System.out.println("0,Thoát");
		
		System.out.println("Mời các bạn nhập chức năng từ 1 đến 8: ");
		luaChon = consoleNum.nextInt();
		switch (luaChon) {
		case 1: {
			System.out.println("1.Hiển thị thông tin nhân viên");
			/*1. Hiển thị danh sách nhân viên hiện có trong công ty */
			for (Staff staff : list) {
				staff.displayInformation();
			}
			break;
		}
		case 2: {
			System.out.println("2.Hiển thị các bộ phận trong công ty");
			/*Sử dụng vòng lặp duyệt mảng Department*/
			for (Department dep : depList) {
				int count = 0;
				String idDepartment = dep.getIdDepartment();
				/*Sử dụng vòng lặp duyệt mảng Empoyee*/
				for (Staff staff : list) {
					String idDepartmentEmployee = staff.getIdDepartment();
					// lấy id so sánh nó có trùng nhau 
					if(idDepartmentEmployee.equals(idDepartment)) {
						/*dùng phương thức displayInformation() để hiển thị thông tin..*/
						count++;
					}
				}
				dep.setCurrentNumberOfEmployees(count);
			}
			for (Department deps : depList) {
				System.out.println(deps.toString());
			}
			break;
		}
		case 3: {
			System.out.println("3.Hiển thị các nhân viên theo từng bộ phận");
			/*Sử dụng vòng lặp duyệt mảng Department*/
			for (Department dep : depList) {
				String idDepartment = dep.getIdDepartment();
				/*Sử dụng vòng lặp duyệt mảng Empoyee*/
				for (Staff staff : list) {
					String idDepartmentEmployee = staff.getIdDepartment();
					// lấy id so sánh nó có trùng nhau 
					if(idDepartmentEmployee.equals(idDepartment)) {
						/*dùng phương thức displayInformation() để hiển thị thông tin..*/
						staff.displayInformation();
					}
				}
			}
			break;
		}
		case 4: {
			System.out.println("4.Thêm nhân viên mới vào công ty");
			//chức năng thêm nhân viên, quản lí 
			String result = "No";
			do {
				System.out.println("Bạn là nhân viên hay quản lí(chọn 1 là nhân viên, chọn 2 là quản li)");
				int id = consoleNum.nextInt();
				if (id == 1) {
					//gọi tới input() trong class Employee thêm nhân viên
					System.out.println("Tôi là nhân viên");
					Employee a1 = new Employee();
					a1.input();
					a1.displayInformation();
				} else if (id == 2) {
					//gọi tới input() trong class Manager thêm quản lí
					System.out.println("Tôi là quản lí");
					Manager a2 = new Manager();
					a2.input();
					a2.displayInformation();
				} else {
					System.out.println("Bạn là nhân viên hay quản lí");
				}
			} while (result.equals("yes") || result.equals("y"));
			break;
		}
		case 5: {
			System.out.println("5.Hiển thị nhân viên theo lương");
			for (Staff staff : list) {
				staff.displayInformation();
				System.out.println(staff.getSalary());
			}
			break;
		}
		case 6: {
			System.out.println("6.Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên");
			//yêu cầu người nhập mã nhân viên
			System.out.println("Nhập số id của nhân viên");
			String codeEmployeeSearch = consoleText.nextLine();
			//Duyệt vòng for qua nhân viên
			for (Staff emp : list) {
				//Lấy thuoc tinh cua ma nhan vien trong danh sach
				String code = emp.getIdEmployee();
				if(code.equals(codeEmployeeSearch)) {
					emp.displayInformation();
				}
			}
			break;
		}
		case 0: {
			System.out.println("Tạm biệt");
			break;
		}
		default:
			System.out.println("Mời các bạn nhập lại: ");
		}
	  } while (luaChon != 0);
	}
}
