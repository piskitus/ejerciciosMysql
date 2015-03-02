package edu.upc.eetac.dsa.marc.ejercicioDAO;

import edu.upc.eetac.dsa.marc.ejercicioDAO.Student;
import edu.upc.eetac.dsa.marc.ejercicioDAO.StudentDao;

public class Principal {
	   public static void main(String[] args) {
	      StudentDao studentDao = new StudentDao();

	      //muestra todos los estudiants
	      for (Student student : studentDao.getAllStudents()) {
	         System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
	      }


	      //actualiza los estudiantes
	      Student student = studentDao.getAllStudents().get(0);
	      student.setName("Michael");
	      studentDao.updateStudent(student);

	      //obtiene los estudiantes
	      studentDao.getStudent(0);
	      System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");		
	   }
	}
